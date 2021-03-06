package util;

import java.util.Map;
import java.util.Map.Entry;

import commands.Command;

/**
 * node for single direction linked list holding the history of the bot's commands that were used
 * @author Allen
 *
 */
public class HistoryLLNode{
	private HistoryLLNode next;
	private String command;
	private String[] meta;
	private int messagesSince=0;
	private long time;
	private long expires = -1;//-1 = default ignore
	
	public HistoryLLNode(String command, Map<String,String> metadata){
		this.command = command;
		meta = new String[metadata.size()*2];
		int i = 0;
		for(Entry<String,String> ent:metadata.entrySet()){
			meta[i*2] = ent.getKey();
			meta[i*2+1] = ent.getValue();
			i++;
		}
		this.time = System.currentTimeMillis();
	}
	public HistoryLLNode(String command, Map<String,String> metadata, long expire){
		this(command, metadata);
		this.expires = expire;
	}
	public HistoryLLNode(String command, String[] metadata){
		this.command = command;
		if(metadata.length%2!=0){
			throw new IllegalArgumentException("Meta data array incorrect");
		}
		this.meta = metadata;
		this.time = System.currentTimeMillis();
	}
	public HistoryLLNode(String command, String[] metadata, long time, long expire){
		this(command,metadata);
		this.expires = expire;
		this.time = time;
	}
	public String getCommandName(){
		return command;
	}
	public HistoryLLNode getNext(){
		//lazy prune
		while(!(next==null)&&next.isExpired()){
			removeNext();
		}
		return next;
	}
	public boolean isExpired(){
		return expires!=-1&&expires<System.currentTimeMillis();
	}
	public long getTimeRecorded(){
		return time;
	}
	public void remove(HistoryLLNode previous){
		previous.next = next;
		if(!(next==null)){
			next.messagesSince+=messagesSince;
		}
	}
	public void removeNext(){
		next.remove(this);
	}
	public HistoryLLNode append(HistoryLLNode item){
		item.next=this;
		return item;
	}
	public int getMessagesSince(){
		return messagesSince;
	}
	public String getValue(String name){
		for(int i = 0; i < meta.length/2; i++){
			if(meta[i*2].equals(name)){
				return meta[i*2+1];
			}
		}
		return null;
	}
	public boolean cmdEquals(Command cmd){
		return Lib.extractCmdName(cmd).equals(command);
	}
	public void msgRec(){
		messagesSince++;
	}
	
	
}
