package commands.overide;

import java.util.HashMap;

import global.Main;
import global.Main.states;
import global.record.SaveSystem;
import global.record.Settings;
import util.Counter;
import util.Lib;

import net.dv8tion.jda.events.message.MessageReceivedEvent;

public class Reload implements OverrideCommand {

	@Override
	public boolean called(HashMap<String, String[]> args, MessageReceivedEvent event) {
		return true;
	}

	@Override
	public void action(HashMap<String, String[]> args, MessageReceivedEvent event) {
		Settings.executor.execute(new Runnable(){
			public void run(){
				boolean trigger=false;//if any of the arguments are triggered
				if(args.containsKey("r")){
					Counter count=new Counter("Setting up preloader...",event);
					trigger=true;
					Main.setGame(states.Loading);
					SaveSystem.preloadReddit(count);
				}
				if(args.containsKey("e")){
					Counter count=new Counter("Setting up preloader...",event);
					trigger=true;
					Main.setGame(states.Loading);
					SaveSystem.preloadExvicus(count);
				}
				if(args.containsKey("img")){
					Counter count=new Counter("Setting up preloader...",event);
					trigger=true;
					Main.setGame(states.Loading);
					SaveSystem.preloadSummons(count);
				}
				if(!trigger){//reload everything if nothng specified
					Counter count=new Counter("Setting up preloader...",event);
					Main.setGame(states.Loading);
					SaveSystem.preloadReddit(count);
					count=new Counter("Setting up preloader...",event);
					SaveSystem.preloadExvicus(count);
					count=new Counter("Setting up preloader...",event);
					SaveSystem.preloadSummons(count);
				}
				SaveSystem.writeData();//write data to file
				Main.setGame(states.Ready);
				Lib.sendMessage(event, "Data reloaded");
			}
		});
			
	}

	@Override
	public void help(MessageReceivedEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void executed(boolean sucess, MessageReceivedEvent event) {
		

	}

}
