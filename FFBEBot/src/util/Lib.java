package util;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import Library.ElementFilter;
import global.record.Log;
import global.record.SaveSystem;
import global.record.Settings;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageEmbed;
import net.dv8tion.jda.core.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
/**
 * Library of various useful methods that are used all over the place
 * @author Allen
 *
 */
public class Lib {
	//methods sending data
	/**
	 * message data for help menu
	 * @param event
	 */
	public static void printHelp(MessageReceivedEvent event){
		String msg="__***Help List***__\n"
				+ "Use "+SaveSystem.getPrefix(event)+"help [command] to get more info on a specific command, i.e.: "+SaveSystem.getPrefix(event)+"help ping\n\n"
				+ "__**Modules**__\n"
				+ "**Core** - `ping` `invite` `info` `servers` `bugreport`\n"
				+ "Core commands for bot\n\n"
				+ "**Exvius** - `awaken` `equipment` `lore` `skill` `unitart` `unit`\n"
				+ "Commands to extract info from Exvicus wiki(best for GL players)\n\n"
				+ "**Reddit** - `rawaken` `requipment` `rskill` `runit`\n"
				+ "Commands to extract info from Reddit wiki(best for JP players or GL players looking for future info)\n\n"
				+ "**Salt** - `summon` `salty` `waifu` `husbando` `maintenance` `gsummon`\n"
				+ "Commands that may or may not help in dealing with or evoking salt\n\n"
				+ "**Simulation** - `dailies` `lapis` `give`  `banner` `pull` `unitinventory` `dailypull` `11pull` `gpull` `unitsell` `unitawaken`\n"
				+ "Commands that are used to attempt to simulate FFBE to some degree\n\n"
				+ "**WIP** - none\n"
				+ "Commands that are work in progress currently unimplemented\n\n"
				+ "Don't include the example brackets when using commands!\n"
				+ "To view mod commands, use "+SaveSystem.getModPrefix(event)+"help";
		Lib.sendMessage(event, msg);
	}
	
	/**
	 * message data for mod help menu
	 * @param event
	 */
	public static void printModHelp(MessageReceivedEvent event){
		String prefix=SaveSystem.getModPrefix(event);
		String msg="Mod Help List\n"
				+ "The following commands are to help with control the bot on your server\n"
				+ prefix+"prefix - changes prefix used for the bo\nt"
				+ prefix+"modprefix - changes the mod prefix used for the bot\n"
				+ prefix+"toggle - toggle join messages if you don't already have a bot doing it, by default false\n"
				+ prefix+"glmodules - disable/enable a module of the bot across the server\n"
				+ prefix+"modules - disable/enable a modules on a specific channel(where you used it), will override the global setting\n"
				+ "";
		Lib.sendMessage(event, msg);
	}
	public static Message editMessage(Message message,String msg){
		return message.editMessage(msg).complete();
	}
	public static Message sendEmbed(MessageReceivedEvent event,EmbedBuilder embed){
		return sendEmbed(event,embed.build());
	}
	public static Message sendEmbed(MessageReceivedEvent event,MessageEmbed embed){
		return event.getChannel().sendMessage(embed).complete();
	}
	public static Message sendFile(MessageReceivedEvent event, Message msg, File file){
			return event.getChannel().sendFile(file, msg).complete();
	}
	public static Message sendFile(MessageReceivedEvent event, String msg, File file){
		Message build=null;
		if(!(msg==null||msg.equals("null"))){
			build=new MessageBuilder().append(msg).build();
		}
		return sendFile(event,build,file);
	}
	/**
	 * Sends a message which will be deleted after a period of time
	 * @param event message recieved
	 * @param msg message to send in response
	 * @param timeout time in seconds after which the message will be deleted
	 */
	public static void sendTempMessage(MessageReceivedEvent event, String msg,long timeout){
		final MessageReceivedEvent FEvent=event;
		final String FMsg=msg;
		final long FTimeout=timeout;
		Settings.executor.execute(new Runnable(){
			public void run(){
				try {
					String id=sendMessageFormated(FEvent, FMsg).getId();
					TimeUnit.SECONDS.sleep(FTimeout);
					FEvent.getChannel().deleteMessageById(id).complete();
				} catch (Exception e) {
					Log.log("ERROR", "error sending delayed message");
					Log.logShortError(e, 5);
				}
				
			}
		});
	}
	/**
	 * 
	 * Formats the message <br/>
	 * Special formatting <br/> 
	 * %userMention% mentions the user that sent the message <br/>
	 * %userName% prints name of user that sent the message <br/>
	 * %selfMention% mentions the bot<br/>
	 * %mentionMention% mentions the first mentioned user in message<br/>
	 * %mentionName% name of the first mentioned user in the message<br/>
	 * @param event message received
	 * @param msg message to send in response
	 * @return message that was sent
	 */
	public static Message sendMessageFormated(MessageReceivedEvent event,String msg){
		return Lib.sendMessage(event,Lib.FormatMessage(event,msg));
	}
	/**
	 * 
	 * Adds custom emotes to message <br/>
	 * %lapis%<br/>
	 * %SC%<br/>
	 * @param event message received
	 * @param msg message to send in response
	 * @return message that was sent
	 */
	public static Message sendMessageEmoted(MessageReceivedEvent event, String msg){
		return Lib.sendMessage(event, Lib.EmoteMessage(event, msg));
	}
	/**
	 * Formats the message <br/>
	 * Special formatting <br/> 
	 * %userMention% mentions the user that sent the message <br/>
	 * %userName% prints name of user that sent the message <br/>
	 * %selfMention% mentions the bot<br/>
	 * %mentionMention% mentions the first mentioned user in message<br/>
	 * %mentionName% name of the first mentioned user in the message<br/>
	 * <br/>
	 * Adds custom emotes to message <br/>
	 * %lapis%<br/>
	 * %SC%<br/>
	 *  @param event message received
	 * @param msg message to send in response
	 * @return message that was sent
	 */
	public static Message sendMessageWithSpecials(MessageReceivedEvent event, String msg){
		return Lib.sendMessage(event, Lib.EmoteMessage(event, Lib.FormatMessage(event, msg)));
	}
	/**
	 * generic send message, will have wrappers to fix some issues and errors in relation to sending messages
	 * @param event message received
	 * @param msg message to send someone
	 * @return message that was sent
	 */
	public static Message sendMessage(MessageReceivedEvent event,String msg){
		if(msg.length()>2000){
			Vector<String> toSend=splitMessage(msg);
			for(String s:toSend){
				sendPrivate(event,s);
			}
			if(!event.isFromType(ChannelType.PRIVATE)){
				sendMessage(event,"Message was too long. Check your DMs for response");
			}
			return null;
		}
		Message message=event.getChannel().sendMessage(msg).complete();
		return message;
}
	/**
	 * generic send message, will have wrappers to fix some issues and errors in relation to sending messages
	 * @param event message received
	 * @param msg message to send someone
	 * @return message that was sent
	 */
	public static Message sendMessage(MessageReceivedEvent event, Message msg) {
		Message message=event.getChannel().sendMessage(msg).complete();
		return message;
	}
	public static Message sendPrivate(MessageReceivedEvent event, String msg){
		event.getAuthor().openPrivateChannel().complete();//open private if it's not open
		Message message=event.getAuthor().openPrivateChannel().complete().sendMessage(msg).complete();
		return message;
	}
	private static Vector<String> splitMessage(String msg){
		Vector<String> splitMsg=new Vector<String>();
		String[] lines=msg.split("\n");
		int length=0;
		String prep="";
		for(String s:lines){
			if(s.length()>2000){
				if(!prep.equals("")){
					splitMsg.add(prep);
					prep="";
					length=0;
				}
				splitMsg.add(s.substring(0, 2000));
				splitMsg.addAll(splitMessage(s.substring(2000)));
			}
			else{
				if(s.length()+length<2000){
					prep+="\n"+s;
					length+=s.length()+1;
				}
				else{
					splitMsg.add(prep);
					prep=s;
					length=s.length();
				}
			}
		}
		splitMsg.add(prep);
		return splitMsg;
	}
	/**
	 * Formats the message <br/>
	 * Special formatting <br/> 
	 * %userMention% mentions the user that sent the message <br/>
	 * %userName% prints name of user that sent the message <br/>
	 * %selfMention% mentions the bot<br/>
	 * %mentionMention% mentions the first mentioned user in message<br/>
	 * %mentionName% name of the first mentioned user in the message<br/>
	 * @param event message received
	 * @param msg message to send in response
	 * @return string of formatted message to send
	 */
	public static String FormatMessage(MessageReceivedEvent event,String msg){
		return msg.replace("%userMention%", event.getAuthor().getAsMention()).
				replace("%userName%", event.getAuthor().getName()).
				replace("%selfMention%", event.getJDA().getSelfUser().getAsMention()).
				replace("%mentionMention%", event.getMessage().getMentionedUsers().size()>0?event.getMessage().getMentionedUsers().get(0).getAsMention():event.getAuthor().getAsMention()).
				replace("%mentionName%",event.getMessage().getMentionedUsers().size()>0?event.getMessage().getMentionedUsers().get(0).getName():event.getAuthor().getName());
	}
	/**
	 * Adds custom emotes to message <br/>
	 * %lapis%<br/>
	 * %SC%<br/>
	 * @param event
	 * @param msg
	 * @return
	 */
	public static String EmoteMessage(MessageReceivedEvent event, String msg){
		if(SaveSystem.hasPermission(event, Permission.MESSAGE_EXT_EMOJI)){
			return msg.replace("%lapis%","<:Lapis:506460064471842827>")
					.replace("%gil%", "<:Gil:506939159756144641>")
					.replace("%sacredCrystal%", "<:Sacred_Crystal:332715887570190336>")
					.replace("%beastMeat%", "<:Beast_Meat:506512314778910720>")
					.replace("%pearlOfWisdom%", "<:Pearl_of_Wisdom:506512405485060112>")
					.replace("%allurePowder%", "<:Allure_Powder:506512682329833487>")
					.replace("%litrock%", "<:Litrock:506512815360835587>")
					.replace("%seedOfLife%", "<:Seed_of_Life:506513333843787796>")
					.replace("%crimsonTear%", "<:Crimson_Tear:506513700455186432>")
					.replace("%mysticOre%", "<:Mystic_Ore:506513786405126144>")
					.replace("%aquaPearl%", "<:Aqua_Pearl:506520400814014464>")
					.replace("%luminousHorn%", "<:Luminous_Horn:506520497010245642>")
					.replace("%qualityParts%", "<:Quality_Parts:506520518787203082>")
					.replace("%rainbowNeedle%", "<:Rainbow_Needle:506520546578792488>")
					.replace("%goldenEgg%", "<:Golden_Egg:506520569106137088>")
					.replace("%bookOfRuin%", "<:Book_of_Ruin:506520596067254293>")
					.replace("%earthsCore%", "<:Earths_Core:506520701222518794>")
					.replace("%heavensAsh%","<:Heavens_Ash:506520735980978176>")
					.replace("%deepseaBloom%", "<:Deepsea_Bloom:506520779551408159>")
					.replace("%scriptureOfTime%", "<:Scripture_of_Time:506520806550011927>")
					.replace("%farplaneDew%", "<:Farplane_Dew:506520836279369748>")
					.replace("%spiritsand%", "<:Spiritsand:506520858135887893>")
					.replace("%godsReliquary%", "<:Gods_Reliquary:506520887093231648>")
					.replace("%dragonHeart%", "<:Dragon_Heart:506521715648495637>")
					.replace("%espersTear%", "<:Espers_Tear:506521753330253836>")
					.replace("%talmoniteOfLife%", "<:Talmonite_of_Life:506521793620869120>")
					.replace("%esperShard%", "<:Esper_Shard:506521840139894794>")
					.replace("%esperCryst%", "<:Esper_Cryst:506521868317097984>")
					.replace("%holyCrystal%", "<:Holy_Crystal:506521948042297345>")
					.replace("%fairiesWrit%", "<:Fairies_Writ:506521983857459211>")
					.replace("%rainbowBloom%", "<:Rainbow_Bloom:506522062588739592>")
					.replace("%calamityGem%", "<:Calamity_Gem:506522111855296512>")
					.replace("%prismaticHorn%", "<:Prismatic_Horn:506522154024566814>")
					.replace("%calamityWrit%", "<:Calamity_Writ:506522187143053333>")
					.replace("%divineCrystal%", "<:Divine_Crystal:506522219317559309>")
					.replace("%hardRock%", "<:Hard_Rock:506522851428270081>")
					.replace("%furySeed%", "<:Fury_Seed:506522889378463756>")
					.replace("%wickedDrop%", "<:Wicked_Drop:506522932802224129>")
					.replace("%brilliantRay%", "<:Brilliant_Ray:506522964351778847>")
					.replace("%luckySeedling%", "<:Lucky_Seedling:506523017258467349>")
					.replace("%bizarreBox%", "<:Bizarre_Box:506523060187430932>")
					.replace("%unitPrism%", "<:Unit_Prism:506853792214679564>");
		}
		else{
			return msg.replace("%lapis%", "lapis")
					.replace("%gil%", "Gil")
					.replace("%sacredCrystal%", "Sacred Crystal")
					.replace("%beastMeat%", "Beast Meat")
					.replace("%pearlOfWisdom%", "Pearl of Wisdom")
					.replace("%allurePowder%", "Allure Powder")
					.replace("%litrock%", "Litrock")
					.replace("%seedOfLife%", "Seed of Life")
					.replace("%crimsonTear%", "Crimson Tear")
					.replace("%mysticOre%", "Mystic Ore")
					.replace("%aquaPearl%", "Aqua Pearl")
					.replace("%luminousHorn%", "Luminous Horn")
					.replace("%qualityParts%", "Quality Parts")
					.replace("%rainbowNeedle%", "Rainbow Needle")
					.replace("%goldenEgg%", "Golden Egg")
					.replace("%bookOfRuin%", "Book of Ruin")
					.replace("%earthsCore%", "Earth's Core")
					.replace("%heavensAsh%", "Heaven's Ash")
					.replace("%deepseaBloom%", "Deepsea Bloom")
					.replace("%scriptureOfTime%", "Scripture of Time")
					.replace("%farplaneDew%", "Farplane Dew")
					.replace("%spiritsand%", "Spiritsand")
					.replace("%godsReliquary%", "God's Reliquary")
					.replace("%dragonHeart%", "Dragon Heart")
					.replace("%espersTear%", "Esper's Tear")
					.replace("%talmoniteOfLife", "Talmonite of Life")
					.replace("%esperShard%", "Esper Shard")
					.replace("%esperCryst%", "Esper Cryst")
					.replace("%holyCrystal%", "Holy Crystal")
					.replace("%fairiesWrit%", "Fairies Writ")
					.replace("%rainbowBloom%", "Rainbow Bloom")
					.replace("%calamityGem%", "Calamity Gem")
					.replace("%prismaticHorn%", "Prismatic Horn")
					.replace("%calamityWrit%", "Calamity Writ")
					.replace("%divineCrystal%", "Divine Crystal")
					.replace("%hardRock%", "Hard Rock")
					.replace("%furySeed%", "Fury Seed")
					.replace("%wickedDrop%", "Wicked Drop")
					.replace("%brilliantRay%", "Brilliant Ray")
					.replace("%luckySeedling%", "Lucky Seedling")
					.replace("%bizarreBox%", "Bizarre Box")
					.replace("%unitPrism%", "Unit's Prism");
		}
	}
	/**
	 * Formats and send message for guild member joining <br/>
	 * Special formatting<br/>
	 * %userMention% mentions the user that joined<br/>
	 * %userName% prints name of the user<br/>
	 * %guildName% prints name of the server
	 * @param event user join event
	 * @param msg message to send in response
	 * @return message sent
	 */
	public static Message sendMessageFormated(GuildMemberJoinEvent event,String msg){
		Message message=event.getGuild().getDefaultChannel().sendMessage(Lib.FormatMessage(event,msg)).complete();
		return message; 
	}
	/**
	 * Formats and send message for guild member joining <br/>
	 * Special formatting<br/>
	 * %userMention% mentions the user that joined<br/>
	 * %userName% prints name of the user<br/>
	 * %guildName% prints name of the server
	 * event user join event
	 * @param msg message to send in response
	 * @return string of formatted message to send
	 */
	public static String FormatMessage(GuildMemberJoinEvent event,String msg){
		return msg.replace("%userMention%", event.getMember().getAsMention()).
		replace("%userName%", event.getMember().getNickname()).
		replace("%guildName%",event.getGuild().getName());
	}
	/**
	 * Looks for a user either based on name string or id
	 * @param user 
	 * @param guild
	 * @return
	 */
	public static Member seachUser(String user,Guild guild){
		try{
			Long.parseLong(user);//test for nums
			for(Member m:guild.getMembers()){
				if(m.getUser().getId().equals(user));
				return m;
			}
		}catch(NumberFormatException e){
			for(Member m:guild.getMembers()){
				if(m.getUser().getName().contains(user)||m.getAsMention().contains(user)){
					return m;
				}
			}
		}
		return null;
	}
	/**
	 * General debug to know what user/guild they're from
	 * @param event
	 * @return
	 */
	public static String debugGuildUser(MessageReceivedEvent event){
		return event.getAuthor()+(event.isFromType(ChannelType.PRIVATE)?"":" on "+event.getGuild());
	}
	//stuff for handling elements in a web page
	/**
	 * Gets elements within an element based on tag name
	 * @param element elements to get nestled element
	 * @param tags list of tags to get the nestled element for, going right to left, i.e. ["first","second"] gets &lt;second/&gt; in &lt;first&gt;&lt;second/&gt;&lt;/first&gt; 
	 * @return list of elements that match the parameters
	 */
	public static Elements getNestedDeep(Elements element,String[] tags){
		Elements ele=element;
		for(String s:tags){
			ele=Lib.getNested(ele, s);
		}
		return ele;
	}
	/**
	 * Gets elements within an element based on tagname
	 * @param element elements to get nestled element
	 * @param tag tag to get within the main element
	 * @return list of elements that match the parameters
	 */
	public static Elements getNested(Elements element, String tag){
		Elements ele=new Elements();
		if(element==null){
			return new Elements();
		}
		for(Element eles:element){
			ele.addAll(eles.getElementsByTag(tag));
		}
		return ele;
	}
	/**
	 * 
	 * Gets elements within an element based on tagname
	 * @param element elements to get nestled element
	 * @param index index of the element in the list of elements that match parameter for each specific element in given list
	 * @param tag tag to get within the main element
	 * @return list of elements that match the parameters
	 */
	public static Elements getNestedItem(Elements element,int index,String tag){
		Elements ele=new Elements();
		for(Element eles:element){
			try{
				ele.add(eles.getElementsByTag(tag).get(index));
			}catch(Exception e){};
		}
		return ele;
	}
	/**
	 * Gets elements after what matches element filter
	 * @param elements element list for which you want get the element after for
	 * @param after filter containing parameters for the element
	 * @return elements after any element matching element filter
	 */
	public static Elements getElesAfter(Elements elements, ElementFilter after){
		Elements afters=new Elements();
		boolean found=false;
		for(Element e:elements){
			if(found){
				afters.add(e);
				found=false;
			}
			else{
				if(after.filtered(e)){
					found=true;
				}
			}
		}
		return afters;
	}
	/**
	 * Gets elements after what matches element filter
	 * @param elements element list for which you want get the element after for
	 * @param after filter containing parameters for the element
	 * @return elements after any element matching element filter
	 */
	public static Element getEleAfter(Elements elements,ElementFilter after){
		Elements e=getElesAfter(elements,after);
		if(!(e==null)&&e.size()>0){
			return e.first();
		}
		return null;
		
	}
	/**
	 * gets table rows in a table
	 * @param table table element &lt;tbody&gt;
	 * @return number of rows, does not include &lt;thead&gt;
	 */
	public static int getTRCount(Element table){
		Elements tr=table.getElementsByTag("tr");
		return tr.size();
	}
	/**
	 * Gets columns in the row
	 * @param table table element &lt;tbody&gt;
	 * @param row row #
	 * @return number of columns
	 */
	public static int getTDCount(Element table,int row){
		Elements td=table.getElementsByTag("tr").get(row).getElementsByTag("td");
		return td.size();
	}
	/**
	 * gets a specific cell in a table
	 * @param row row #
	 * @param col column #
	 * @param table table element &lt;tbody&gt;
	 * @return element representing the specific cell
	 */
	public static Element getCell(int row, int col,Element table){
		if(!table.tagName().equals("tbody")){
			table=table.getElementsByTag("tbody").first();
		}
		return table.select(":root > tr").size()>row?
					(table.select(":root > tr").get(row).getElementsByTag("td").size()>0? 
					table.select(":root > tr").get(row).getElementsByTag("td").get(col)
					:null)
				:null;
	}
	/**
	 * get specific row
	 * @param row row #
	 * @param table table element &lt;tbody&gt;
	 * @return element representing the specific header row
	 */
	public static Element getHeader(int row, Element table){
		return table.getElementsByTag("tr").get(row).getElementsByTag("th").get(0);
	}
	/**
	 * gets link in element
	 * @param ele element to get link from
	 * @return String
	 */
	public static String getLink(Element ele){
		Elements links = ele.getElementsByTag("a");
		for (Element link : links) {
			return link.attr("abs:href");
		}
		return "";
	}
	/**
	 * Parses text to appear similar to how it would be displayed, mainly just converts <br>
	 * to \n
	 * @param ele Element to parse the text for
	 * @return String representing the text, similar to .text() 
	 */
	public static String parseText(Element ele){
		String s = "";
		for(Node n:ele.childNodes()){
			if(n instanceof TextNode){
				s+=((TextNode) n).text();
			}
			else if (n instanceof Element){
				Element e = (Element) n;
				if(e.tagName().equals("br")){
					s+="\n";
				}
				else if(e.tagName().equals("code")){
					s+="\n"+e.text();
				}
				else if(e.tagName().equals("p")){
					//on p start new line and parse stuff inside same as otherwise
					s+="\n"+parseText(e);
				}
				else{//parse for nestled elements
					s+=parseText(e);
				}
			}
		}
		return s;
	}
	//reading stuff for custom XML class
	/**
	 * A wrapper for getting an array for an element easily
	 * @param ele element to search for array
	 * @param tagname name of the element whose text is the array
	 * @return
	 */
	public static String[] textArray(XML.Elements ele,String tagname){
		String[] out=new String[ele.getChilds(tagname).size()];
		int i=0;
		for(XML.Elements e:ele.getChilds(tagname)){
			out[i]=e.getText();
			i++;
		}
		return out;
	}
	public static XML.Elements[] elementArray(XML.Elements ele,String tagname){
		XML.Elements[] out=new XML.Elements[ele.getChilds(tagname).size()];
		int i=0;
		for(XML.Elements e:ele.getChilds(tagname)){
			out[i]=e;
			i++;
		}
		return out;
	}
	/**
	 * A wrapper to get String value for element without crashing process if it doesn't exist
	 * @param root Element you want to search for the element
	 * @param tagname name of element you want to get
	 * @return
	 */
	public static String getString(XML.Elements root,String tagname){
		try{
			return root.getChilds(tagname).get(0).getText();
		}
		catch(IndexOutOfBoundsException e){
			Log.logError(e);
			return "";
		}
	}
	/**
	 * A wrapper to get the boolean value for an element without crashing process if it doesn't exist
	 * @param normal default value if boolean value is not found
	 * @param ele Element you want to search for the element
	 * @param tagname name of element you want to get
	 * @return
	 */
	public static boolean getBooleanSetting(boolean normal,XML.Elements ele,String tagname){
		if(ele.getChilds(tagname).size()<=0){
			return normal;
		}
		if(normal){
			return ele.getChilds(tagname).get(0).getText().trim().equals("false")?false:true;
		}
		else{
			return ele.getChilds(tagname).get(0).getText().trim().equals("true")?true:false;
		}
	}
	/**
	 * A wrapper to get int value for element without crashing process if it doesn't exist
	 * @param ele element within which you want to search for
	 * @param tagname name of element
	 * @return number -1 if invalid
	 */
	public static int getNumber(XML.Elements ele, String tagname){
		try{
			return Integer.parseInt(ele.getChilds(tagname).get(0).getText());
		}catch(Exception e){
			Log.log("ERROR", "Invalid for element"+tagname);
			Log.logShortError(e, 5);
		}
		return -1;
	}
	/**
	 * A wrapper to get long value for element without crashing process if it doesn't exist
	 * @param ele element within which you want to search for
	 * @param tagname name of element
	 * @return number -1 if invalid
	 */
	public static long getLong(XML.Elements ele, String tagname){
		try{
			return Long.parseLong(ele.getChilds(tagname).get(0).getText());
		}catch(Exception e){
			Log.log("ERROR", "Invalid for element"+tagname);
			Log.logShortError(e, 5);
		}
		return -1L;
	}
	//random utilities
	/**
	 * makes sure that string is at least x length, padding it w/ spaces
	 * @param s string to pad
	 * @param pad minimum length of string
	 * @return padded string
	 */
	public static String pad(String s, int pad){
		for(int i=s.length();i<pad;i++){
			s=s+" ";
		}
		return s;
	}
	/**
	 * if s trimmed and split is part of Character.isDigit 
	 * @param s string to check if it's a number
	 * @return if s is all numbers or not
	 */
	public static boolean isNumber(String s){
		boolean negativeStartFlag=true;
		boolean dotFlag=true;
		for(char c:s.trim().toCharArray()){
			if(!Character.isDigit(c)){
				if(!(c=='-'&&negativeStartFlag||c=='.'&&dotFlag)){
					return false;
				}
				if(c=='.'&&dotFlag){
					dotFlag=false;
				}
			}
			negativeStartFlag=false;
		}
		if(s.length()>0){
		return true;
		}
		else return false;
	}
	/**
	 * gets only number chars from a string
	 * @param s string to extract number from
	 * @return number with non digit characters removed, -1 if no number found
	 */
	public static int extractNumber(String s){
		return extractNumber(s,-1);
	}
	/**
	 * gets only number chars from a string
	 * @param s string to extract number from
	 * @param defaultNum number to use if NaN
	 * @return number with non digit characters removed, -1 if no number found
	 */
	public static int extractNumber(String s,int defaultNum){
		String i="";
		for(char c:s.trim().toCharArray()){
			if(Character.isDigit(c)){
				i+=c;
			}
		}
		if(i.equals("")){
			i=""+defaultNum;
		}
		return Integer.parseInt(i);
	}
	/**
	 * gets numbers(integers) from string
	 * @param s string to get numbers from
	 * @return array of all the numbers in the string
	 */
	public static int[] extractNumbers(String s){
		String i="";
		boolean number=false;//if currently indexing a number
		boolean dot=false;//decimal place
		for(char c:s.trim().toCharArray()){
			if(number){
				if(Character.isDigit(c)||(dot?false:c=='.')){
					if(c=='.'){
						dot=true;
					}
					i+=c;
				}
				else{
					i+=",";
					number=false;
					dot=false;
				}
			}
			else{
				if(Character.isDigit(c)){
					i+=c;
					number=true;
				}
			}
		}
		if(i.endsWith(",")){
			i=i.substring(0, i.length()-1);
		}
		String[] nums=i.split(",");
		int[] ints=new int[nums.length];
		for(int d=0;d<nums.length;d++){
			ints[d]=Integer.parseInt(nums[d]);
		}
		return ints;
	}
	/**
	 * if x array contains obj
	 * @param obj object if it contains
	 * @param os array of objects
	 * @return if os contains obj
	 */
	public static boolean contains(Object obj,Object[] os){
		for(Object o:os){
			if(o.equals(obj)){
				return true;
			}
		}
		return false;
	}
	/**
	 * Adds up all the numbers in array
	 * @param numbers int array to add all the numbers for
	 * @return
	 */
	public static int Summation(int[] numbers){
		int sum=0;
		for(int i:numbers){
			sum+=i;
		}
		return sum;
	}
	/**
	 * converts a string array to 
	 * @param args
	 * @return
	 */
	public static String extract(String[] args){
		String out="";
		for(String s:args){
			out+=" "+s;
		}
		return out.substring(1);
	}
	public static <T> T[] concat(T[] first, T[] second) {
		  T[] result = Arrays.copyOf(first, first.length + second.length);
		  System.arraycopy(second, 0, result, first.length, second.length);
		  return result;
	}
	// https://stackoverflow.com/questions/4596447/check-if-file-exists-on-remote-server-using-its-url
	public static boolean exists(String URLName) {
		try {
			HttpURLConnection.setFollowRedirects(false);
			// note : you may also need
			// HttpURLConnection.setInstanceFollowRedirects(false)
			HttpURLConnection con = (HttpURLConnection) new URL(URLName).openConnection();
			con.setRequestMethod("HEAD");
			return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
		} catch (Exception e) {
			return false;
		}
	}
	//synchronization to avoid 2 samename files trying to get newname at the same time
	/**
	 * Gets a filename that is not currently used
	 * @param filename base filename
	 * @return filename that is not used
	 */
	public static synchronized String newFileName(String filename){
		int num=0;
		if(new File(filename).exists()){
			while(new File(filename+num).exists()){
				num++;
			}
			return filename+num;
		}
		else return filename;
	}
	
}
