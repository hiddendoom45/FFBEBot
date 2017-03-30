package util.unit;

import java.io.IOException;
import java.util.Vector;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import Library.ElementFilter;
import global.record.Log;
import global.record.Settings;
import util.Lib;

public class UnitInfo {
	public String URL="";
	public String loreOverview="";
	public String unitName="";
	public String imgOverviewURL="";
	public int minRarity=0;
	public int maxRarity=0;
	public String job="";
	public String role="";
	public String origin="";
	public String gender="";
	public String race;
	public int[] No=new int[]{};
	public String trustName="";
	public String trustLink="";
	public unitStats stats;
	public unitStatIncrease statIncrease;
	public String[] weapons=new String[]{};
	public String[] armours=new String[]{};
	public unitAbilities Special;
	public unitAbilities Magic;
	public String[] sprites=new String[]{};
	public String[] awakening=new String[]{};
	public unitQuotes background;
	public unitQuotes fusionQuotes;
	public unitQuotes awakeningQuotes;
	public unitQuotes summonQuotes;
	public unitQuotes TMQuotes;
	public UnitInfo(String page)throws IOException{
		if(page.contains("redlink")){//to avoid all the error recording for nonexistant pages, due to wiki using new page creation, logs all sorts of errors that are irrelvent
			return;
		}
		try{
			Document doc=null;
			for(int i=0;i<4;i++){
				try{
					doc = Jsoup.connect(page).userAgent(Settings.UA).timeout(60000).get();
					if(!(doc==null))break;
				}
				catch(org.jsoup.HttpStatusException e1){
					if(i==3){
						Log.log("ERROR", "page doesn't exist:"+page);
						return;
					}
				}
				catch(Exception e){Log.logError(e);}
			}
			URL=page;
			Element content=doc.getElementById("mw-content-text");
			try{
			loreOverview=content.getElementsByTag("p").first().text();
			}catch(Exception e){
				Log.log("ERROR", "overview lore retrieval failed for page:" +page);
				Log.logShortError(e, 5);
			}
			try{
			Element unitInfo=content.getElementsByTag("tbody").first();
			unitName=Lib.getHeader(0, unitInfo).text();
			imgOverviewURL=Lib.getCell(1, 0, unitInfo).child(0).absUrl("src");
			parseRarities(Lib.getCell(2, 0, unitInfo).text());
			job=Lib.getCell(3, 0, unitInfo).text();
			role=Lib.getCell(4, 0, unitInfo).text();
			origin=Lib.getCell(5, 0, unitInfo).text();
			gender=Lib.getCell(6, 0, unitInfo).text();
			race=Lib.getCell(7, 0, unitInfo).text();
			String[] no=Lib.getCell(8, 0, unitInfo).text().split(",");
			No=new int[no.length];
			for(int i=0;i<no.length;i++){
				try{
					No[i]=Integer.parseInt(no[i].trim());
				}catch(NumberFormatException e){
					No[i]=0;
				}
			}
			trustName=Lib.getCell(9, 0, unitInfo).text();
			trustLink=Lib.getCell(9, 0, unitInfo).absUrl("href");
			}catch(Exception e){
				Log.log("ERROR", "Error parsing overview box for page:" +page);
				Log.logShortError(e, 5);
			}
			try{
			Element stats=Lib.getEleAfter(content.children(), new ElementFilter("h3","Stats [edit | edit source]")).getElementsByTag("tbody").first();
			this.stats=new unitStats(stats);
			}catch(Exception e){
				Log.log("ERROR", "error parsing stats for page:" +page);
				Log.logShortError(e, 5);
			}
			try{
				Element statIncrease=Lib.getEleAfter(content.children(),new ElementFilter("h3","Maximum Stats Increase [edit | edit source]")).getElementsByTag("tbody").first();
				this.statIncrease=new unitStatIncrease(statIncrease);
			}
			catch(Exception e){
				Log.log("ERROR", "error parsing stat increases for page:"+page);
				Log.logShortError(e, 5);
			}
			try{
			Element equipment=Lib.getEleAfter(content.children(), new ElementFilter("h3","Equipment[edit | edit source]"));
			parseWeapons(Lib.getCell(1, 0, equipment));
			parseArmours(Lib.getCell(3, 0, equipment));
			}catch(Exception e){
				Log.log("ERROR", "error parsing equipment for page:" +page);
				Log.logShortError(e, 5);
			}
			try{
			Element special=Lib.getEleAfter(content.children(), new ElementFilter("h3","Special[edit | edit source]"));
			if(!(special==null)){
				Special=new unitAbilities(special.getElementsByTag("tbody").first());
			}
			}catch(Exception e){
				Log.log("ERROR", "error parsing special abilities for page:" +page);
				Log.logShortError(e, 5);
			}
			try{
			Element magic=Lib.getEleAfter(content.children(), new ElementFilter("h3","Magic[edit | edit source]"));
			if(!(magic==null)){
				Magic=new unitAbilities(magic.getElementsByTag("tbody").first());
			}
			}catch(Exception e){
				Log.log("ERROR", "error parsing magic abilities for page:" +page);
				Log.logShortError(e, 5);
			}
			try{
			Element sprites=Lib.getEleAfter(content.children(), new ElementFilter("h2","Sprites[edit | edit source]")).getElementsByTag("tbody").first();
			this.sprites=new String[sprites.children().first().children().size()];
			for(int i=0;i<sprites.children().first().children().size();i++){
				this.sprites[i]=sprites.child(1).child(i).child(0).child(0).absUrl("src");
			}
			}catch(Exception e){
				Log.log("ERROR", "error parsing sprites for page:" +page);
				Log.logShortError(e, 5);
			}
			try{
			Element awaken=Lib.getEleAfter(content.children(), new ElementFilter("h2","Awakening Materials[edit | edit source]"));
			awakening=new String[maxRarity-minRarity];
			for(int i=0;i<awakening.length;i++){
				awakening[i]=awaken.getElementsByTag("tbody").first().getElementsByTag("tr").get(1).getElementsByTag("td").get(i).text();
			}
			}catch(Exception e){
				Log.log("ERROR", "error parsing awakening mats for page:" +page);
				Log.logShortError(e, 5);
			}
			try{
				
				Element quote=Lib.getEleAfter(content.children(), new ElementFilter("h2","Quotes[edit | edit source]"));
				System.out.println(quote);
				Log.log("tes", quote.toString());
				background=new unitQuotes(quote.getElementsByClass("tabbertab").get(0).getElementsByTag("table").first().getElementsByTag("tbody").first());
				fusionQuotes=new unitQuotes(quote.getElementsByClass("tabbertab").get(1).getElementsByTag("table").first().getElementsByTag("tbody").first());
				awakeningQuotes=new unitQuotes(quote.getElementsByClass("tabbertab").get(2).getElementsByTag("table").first().getElementsByTag("tbody").first());
				summonQuotes=new unitQuotes(quote.getElementsByClass("tabbertab").get(3).getElementsByTag("table").first().getElementsByTag("tbody").first());
				TMQuotes=new unitQuotes(quote.getElementsByClass("tabbertab").get(4).getElementsByTag("table").first().getElementsByTag("tbody").first());
			}catch(Exception e){
				Log.log("ERROR", "error parsing unit quotes for page:"+page);
				Log.logShortError(e, 5);
			}
		}catch(Exception e){
			Log.logError(e);
		}
	}
	public void parseRarities(String text){
		int[] rarity=Lib.extractNumbers(text) ;
		minRarity=rarity[0];
		try{
		maxRarity=rarity[1];
		}catch(ArrayIndexOutOfBoundsException e){
			maxRarity=minRarity;
		}
	}
	public void parseWeapons(Element weapons){
		this.weapons=new String[weapons.children().size()];
		for(int i=0;i<weapons.children().size();i++){
			this.weapons[i]=weapons.child(i).attr("title");
		}	
	}
	public void parseArmours(Element armours){
		this.armours=new String[armours.children().size()];
		for(int i=0;i<armours.children().size();i++){
			this.armours[i]=armours.child(i).attr("title");
		}
	}
	public class unitStats{
		public statSet[] stats;
		public unitStats(Element statTable){
			stats=new statSet[statTable.children().size()-1];
			for(int i=1;i<statTable.children().size();i++){
				stats[i-1]=new statSet(statTable.child(i));
			}
		}
		public class statSet{
			public String rarity;
			public String HP;
			public String MP;
			public String ATK;
			public String DEF;
			public String MAG;
			public String SPR;
			public String hits;
			public String DC;
			public String growth;
			public statSet(Element row){
				rarity=""+Lib.extractNumber(row.child(0).text());;
				HP=row.child(1).text();
				MP=row.child(2).text();
				ATK=row.child(3).text();
				DEF=row.child(4).text();
				MAG=row.child(5).text();
				SPR=row.child(6).text();
				hits=row.child(7).text();
				DC=row.child(8).text();
				growth=row.child(9).text();
			}
		}
	}
	public class unitStatIncrease{
		public statSet[] stats;
		public unitStatIncrease(Element statTable){
			stats=new statSet[statTable.children().size()];
			for(int i=1;i<statTable.children().size();i++){
				stats[i-1]=new statSet(statTable.child(i));
			}
		}
		public class statSet{
			public String rarity;
			public String HP;
			public String MP;
			public String ATK;
			public String DEF;
			public String MAG;
			public String SPR;
			public statSet(Element row){
				rarity=""+Lib.extractNumber(row.child(0).text());
				HP=row.child(1).text();
				MP=row.child(2).text();
				ATK=row.child(3).text();
				DEF=row.child(4).text();
				MAG=row.child(5).text();
				SPR=row.child(6).text();
			}
		}
	}
	public class unitAbilities{
		public ability[] abilities;
		public conditional[] conditionals;
		public unitAbilities(Element abilityTable){
			boolean active = true;
			boolean conditional =false;
			Vector<ability> abilities=new Vector<ability>();
			Vector<conditional> conditionals=new Vector<conditional>();
			for(int i=1;i<abilityTable.children().size();i++){
				if(abilityTable.child(i).text().trim().equals("Active")){
					active=true;
					conditional=false;
				}
				else if(abilityTable.child(i).text().trim().equals("Trait")){
					active=false;
					conditional=false;
				}
				else if(abilityTable.child(i).text().trim().equals("Conditional")){
					conditional=true;
				}
				else if(!(abilityTable.child(i).getElementsByTag("th").size()>0)){
					if(conditional){
						conditionals.add(new conditional(abilityTable.child(i)));
					}
					else{
						abilities.add(new ability(abilityTable.child(i),active));
					}
				}
			}
			this.abilities=new ability[abilities.size()];
			for(int i=0;i<abilities.size();i++){
				this.abilities[i]=abilities.get(i);
			}
			this.conditionals=new conditional[conditionals.size()];
			for(int i=0;i<conditionals.size();i++){
				this.conditionals[i]=conditionals.get(i);
			}
			
		}
		public class conditional{
			public String condition;
			public String aIconURL;
			public String name;
			public String effect;
			public String hits;
			public String MP;
			public conditional(Element row){
				condition=row.child(0).text();
				aIconURL=row.child(1).getElementsByTag("img").first().absUrl("src");
				name=row.child(2).text();
				effect=row.child(3).text();
				hits=row.child(4).text();
				MP=row.child(5).text();
			}
		}
		public class ability{
			public boolean active;
			public String rarity;
			public String level;
			public String aIconURL;
			public String name;
			public String link;
			public String effect;
			public String hits;
			public String MP;
			public ability(Element row,boolean active){
				rarity=""+Lib.extractNumber(row.child(0).text());
				level=row.child(1).text();
				aIconURL=row.child(2).getElementsByTag("img").first().absUrl("src");
				name=row.child(3).text();
				link=row.child(3).getElementsByTag("a").first().absUrl("href");
				effect=row.child(4).text();
				if(row.children().size()>6){
				hits=row.child(5).text();
				MP=row.child(6).text();
				}
				else if(active){
					MP=row.child(5).text();
				}
				this.active=active;
			}
		}
	}
	public class unitQuotes{
		public quote[] quotes;
		public unitQuotes (Element quoteTable){
			quotes=new quote[quoteTable.children().size()];
			for(int i=0;i<quoteTable.children().size();i++){
				quotes[i]=new quote(quoteTable.child(i));
			}
		}
		public class quote{
			public String rarity;
			public String quote;
			public quote(Element row){
				if(row.children().size()>1){
				rarity=""+Lib.extractNumber(row.child(0).text());
				quote=row.child(1).text();
				}
				else{
					quote=row.child(0).text();
				}
			}
		}
	}
}
