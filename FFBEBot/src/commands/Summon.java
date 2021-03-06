package commands;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import Library.summon.Unit;
import Library.summon.UnitSpecific;
import Library.summon.banner.Banner;
import commands.sub.SummonGeneric;
import global.Main;
import global.record.Log;
import global.record.SaveSystem;
import global.record.Settings;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import util.CmdHistory;
import util.Counter;
import util.HistoryLLNode;
import util.Lib;
import util.SpamControl;
import util.rng.RandomLibs;
import util.rng.summon.Pull;
import util.rng.summon.SummonImageBuilder;

public class Summon extends CommandGenerics implements Command {
	
	public static HashMap<Long,SummonGeneric> customMap = new HashMap<Long,SummonGeneric>();
	
	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		super.called(args, event);
		return SpamControl.isSpam(event, "summon");
	}
	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		if(args.length>0&&Lib.isNumber(args[0])){
			Settings.executor.execute(new Runnable(){//execute in new thread so that long summon commands don't lock everything else
				public void run(){
					try{
						int num=Integer.parseInt(args[0]);
						if(num>1000){//capped to 1800 units, beyond this it is close to Discord's 8MB file upload size cap//adjusted to lower
							num=1000;
						}
						else if(num<0){
							num = 0;
						}
						Banner pullBanner=getBanner(args.length>1?(args[1]==null?"null":args[1]):"null");
						if(customMap.containsKey(event.getAuthor().getIdLong())){
							List<UnitSpecific> units = customMap.get(event.getAuthor().getIdLong()).doSummon(num, pullBanner);
							logMeta(event, units);
							sendImage(event, units, pullBanner.name);
						}
						else if(num==11){
							List<UnitSpecific> units = Pull.pull11(pullBanner); 
							logMeta(event, units);
							sendImage(event, units, pullBanner.name);
						}
						else if(num==666&&Unit.valueOf("Lucifer")!=null){
							ArrayList<UnitSpecific> units = new ArrayList<UnitSpecific>();
							units.add(
									RandomLibs.SelectRandom(new UnitSpecific[]{
											new UnitSpecific(Unit.valueOf("Lucifer"),5),
											new UnitSpecific(Unit.DRain,5)
											}));
							sendImage(event,units,pullBanner.name);
						}
						else if(num==0){
							ArrayList<UnitSpecific> units=new ArrayList<UnitSpecific>();
							units.add(new UnitSpecific(Unit.Bedile, 3));
							sendImage(event,units,pullBanner.name);
						}
						else{
							List<UnitSpecific> units = Pull.pull(num,pullBanner);
							logMeta(event, units);
							sendImage(event, units, pullBanner.name);
						}
					}
					catch(NumberFormatException e){
						//bedile
						args[0] = "0";
						action(args,event);
					}
					catch(Exception e){
						Log.logError(e);
					}
				}
			});
		}
		else{
			help(event);
		}
	}
	
	public void botSummon(MessageReceivedEvent event, int num, Banner banner){
		String id = Main.jda.getSelfUser().getId();
		if(num==11){
			List<UnitSpecific> units = Pull.pull11(banner); 
			logMeta(event, units, id);
			Lib.sendMessage(event, Main.jda.getSelfUser().getAsMention()+" summoned 11 units from "+banner.name+" rare summon banner");
		}
		else{
			List<UnitSpecific> units = Pull.pull(num,banner);
			logMeta(event, units, id);
			Lib.sendMessage(event, Main.jda.getSelfUser().getAsMention()+" summoned "+num+" units from "+banner.name+" rare summon banner");
		}
	}
	
	@Override
	public void help(MessageReceivedEvent event) {
		Lib.sendMessage(event, SaveSystem.getPrefix(event)+"summon [amount]"
				+ "\n\tsummons [amount] units from the rare summon pool\n"
				+ "Warning: This summon simulator is not longer accurate as it has not been"
				+ "updated for recent mechanics past 2018 (i.e: reduced 5* pool)");
		
	}
	private void logMeta(MessageReceivedEvent event, List<UnitSpecific> units){
		logMeta(event,units,event.getAuthor().getId());
	}
	private void logMeta(MessageReceivedEvent event, List<UnitSpecific> units, String authorID){
		int num5 = 0;
		int num4 = 0;
		int num3 = 0;
		for(UnitSpecific u:units){
			if(u.base==5){
				num5++;
			}
			else if(u.base==4){
				num4++;
			}
			else if(u.base==3){
				num3++;
			}
		}
		long t = System.currentTimeMillis();
		CmdHistory.getHist(event).append(
				new HistoryLLNode(Lib.extractCmdName(this),
							new String[]{"5star",""+num5,
									"4star",""+num4,
									"3star",""+num3,
									"totalCount",""+units.size(),
									"author",authorID},
							t,
							t+TimeUnit.MINUTES.toMillis(6)));
	}
	private Banner getBanner(String s){
		for(Banner b:Banner.values()){
			if(s.toLowerCase().equals(b.name.toLowerCase())||s.toLowerCase().equals(b.toString().toLowerCase())){
				return b;
			}
		}
		return Settings.DefaultBanner;
	}
	public void sendImage(MessageReceivedEvent event, List<UnitSpecific> units,String bannerName){
		Counter count=new Counter("Summoning Units...(%count%/"+units.size()+")",event);
		double factor=1;
		if(units.size()>100){
			factor=0.5;
		}
		BufferedImage build;
		if(units.size()<25){
			build=new SummonImageBuilder(factor).basePlate(3, "/Library/summon/6star.png").addUnit(units).build(event, count);
		}
		else{
			build=new SummonImageBuilder(factor).buildColumnsDynamically()
					.basePlate(3, "/Library/summon/6star.png").addUnit(units).build(event, count);
		}
		try{
			count.setMessage("Uploading...");
			Settings.upload.acquire();
			ImageIO.write(build, "PNG", new File("summons.png"));
			Lib.sendFile(event, Lib.FormatMessage(event, "%userMention% summoned "+units.size()+" units from the "+bannerName+" rare summon banner"), 
					new File("summons.png"));
		}catch(Exception e){
			Log.logError(e);
		}
		try {
			Files.delete(new File("summons.png").toPath());
		} catch (IOException e) {
			Log.logShortError(e, 5);
		}
		count.terminate();
		Settings.upload.release();
	}
}
