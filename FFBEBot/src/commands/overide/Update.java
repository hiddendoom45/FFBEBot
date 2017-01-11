package commands.overide;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.List;

import global.Main;
import global.record.Log;
import net.dv8tion.jda.entities.Message.Attachment;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

public class Update implements OverrideCommand {

	@Override
	public boolean called(HashMap<String, String[]> args, MessageReceivedEvent event) {
		if(event.getMessage().getAttachments().size()>0){
			List<Attachment> atts=event.getMessage().getAttachments();
			for(Attachment a:atts){
				if(a.getFileName().endsWith(".jar")){
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void action(HashMap<String, String[]> args, MessageReceivedEvent event) {
		List<Attachment> atts=event.getMessage().getAttachments();
		for(Attachment a:atts){
			if(a.getFileName().endsWith(".jar")){
				try {
					a.download(new File("FFBEBots.jar"));
					@SuppressWarnings("unused")
					Process p;
					String location=new File("s").getAbsolutePath();
					location=location.substring(0,location.length()-1);
					System.out.println(location);
					Files.move(new File("FFBEBots.jar").toPath(), new File("FFBEBot.jar").toPath(), StandardCopyOption.REPLACE_EXISTING);
					if(System.getProperty("os.name").equals("Mac OS X")){
					 p = Runtime.getRuntime().exec("java -jar FFBEBot.jar");
					}
					else{
						//p=Runtime.getRuntime().exec("sleep 60 && rename "+location+"FFBEBots.jar "+location+"FFBEBot.jar && java -jar FFBEBot.jar");
						p=Runtime.getRuntime().exec("java -jar FFBEBot.jar");
					}
					Files.delete(new File("FFBEBots.jar").toPath());
					Main.quit();
					return;
				} catch (IOException e) {
					Log.logError(e);
				}
				
			}
		}
	}

	@Override
	public void help(MessageReceivedEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void executed(boolean sucess, MessageReceivedEvent event) {
		// TODO Auto-generated method stub

	}

}