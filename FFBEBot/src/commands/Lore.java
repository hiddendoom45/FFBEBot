package commands;

import java.io.IOException;

import global.record.SaveSystem;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import util.Lib;
import util.unit.UnitInfo;
import util.unit.UnitOverview;

public class Lore extends UnitSelection{

	@Override
	public void help(MessageReceivedEvent event) {
		String s=SaveSystem.getPrefix(event)+"lore [unitname][rarity]\n"
				+ "\tGets lore of a unit\n"
				+ "\t[unitname] unit to get lore for(doesn't have to be the full name)\n"
				+ "\t[rarity] gets lore for specified rarity, otherwise the general lore";
		Lib.sendMessage(event, s);
	}
	public void sendLore(UnitInfo info,MessageReceivedEvent event,int rarity){
		if(rarity<info.minRarity||rarity>=info.maxRarity)rarity=info.maxRarity;
		EmbedBuilder embed = new EmbedBuilder();
		embed.addField("Lore of "+info.unitName+" at "+rarity+"★",info.background.quotes[rarity-info.minRarity].quote,false);
		Lib.sendEmbed(event, embed);
		//Lib.sendMessage(event, ":pencil:Lore of:"+info.unitName+" at "+rarity+":star:\n"+info.background.quotes[rarity-info.minRarity].quote);
	}

	@Override
	public void onePossible(UnitOverview Ounit, int rarity, MessageReceivedEvent event) throws IOException {
		if(Ounit.getData(0).isNew){
			Lib.sendMessage(event, "The wiki page for "+Ounit.getData(0).name+" has not been created yet");
		}
		else{
			sendLore(SaveSystem.getExviusUnit(Ounit.getData(0).name),event,rarity);
		}
	}


	@Override
	public void manyPossible(UnitOverview Ounit, int selection, int rarity, MessageReceivedEvent event)
			throws IOException {
		if(Ounit.getData(selection).isNew){
			Lib.sendMessage(event, "The wiki page for "+Ounit.getData(selection).name+" has not been created yet");
		}
		else{
			sendLore(SaveSystem.getExviusUnit(Ounit.getData(selection).name),event,rarity);
		}
	}
}