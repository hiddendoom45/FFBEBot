package commands;

import java.io.IOException;

import net.dv8tion.jda.events.message.MessageReceivedEvent;
import util.Lib;
import util.unit.RedditOverview;
import util.unit.RedditUnit;

public class REquipment extends RedditSelection {
	public void sendEquipment(RedditUnit info, MessageReceivedEvent event){
		String s=":pencil: Equipment for "+info.title;
		if(info.equipment==null){
			s+="\n-";
		}
		else{
			for(String e:info.equipment.split(",")){
				s+="\n\t"+e;
			}
		}
		Lib.sendMessage(event, s);
		
	}
	@Override
	public void onePossible(RedditOverview Ounit, MessageReceivedEvent event) throws IOException {
		sendEquipment(new RedditUnit(Ounit.getData(0).unitUrl),event);

	}

	@Override
	public void onePossible(RedditOverview Ounit, int rarity, MessageReceivedEvent event) throws IOException {
		onePossible(Ounit,event);

	}

	@Override
	public void manyPossible(RedditOverview Ounit, int selection, MessageReceivedEvent event) throws IOException {
		sendEquipment(new RedditUnit(Ounit.getData(selection).unitUrl),event);

	}

	@Override
	public void manyPossible(RedditOverview Ounit, int selection, int rarity, MessageReceivedEvent event)
			throws IOException {
		manyPossible(Ounit,selection,event);

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