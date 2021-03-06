package Library.summon;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeMap;

import XML.Elements;
import XML.XMLStAXFile;
import global.record.Data;
import global.record.Log;
import global.record.Settings;
import util.Lib;
import util.unit.UnitOverview;
import util.unit.UnitOverview.unitData;
public enum Unit{

	//random
	TM("Trust Moogle",new String[]{"/f/f5/Unit-Trust_Moogle-5.png?version=c8b87cb7532e45a18b442c9fd03b77f0"},5),
	//Story Units(free)
	Rain("Rain",new String[]{"/2/2d/Unit-Rain-2.png?version=c7c52055da59da4e5c1f054bedd7ae41","/d/de/Unit-Rain-3.png?version=5cf5cc155008b5ed22304516001f8c90","/b/b1/Unit-Rain-4.png?version=f3a09472b805b80e7f2db0721923b6f3","/1/1b/Unit-Rain-5.png?version=e668b02cbe29fb9f2aa8ca4685b90082","/6/6b/Unit-Rain-6.png?version=bb27acbbddf9d42159d663c63d27a5a9"},2),
	Lasswell("Lasswell",new String[]{"/a/a5/Unit-Lasswell-2.png?version=806ebaf5d43108f0b32ea09d0ade829c","/f/f2/Unit-Lasswell-3.png?version=7b6211ae8095eeba2e5c3e3061df9e0a","/9/98/Unit-Lasswell-4.png?version=9e0a30c00d5af4630781f61dbc1c42d8","/3/34/Unit-Lasswell-5.png?version=10f7579f4acac94608ca21d9f5ae9c8a","/a/af/Unit-Lasswell-6.png?version=54a2b6139576821e8cb1d6c03b140e25"},2),
	Fina("Fina",new String[]{"/4/4b/Unit-Fina-2.png?version=710a117add2aa1480cfe56009b6758e9","/f/f4/Unit-Fina-3.png?version=bab208fb511a969193d008e19c108b8c","/f/f4/Unit-Fina-4.png?version=33b7c1b8360d9093eb77afd5cbbd9f88","/5/5a/Unit-Fina-5.png?version=e820b480b99c04c9eb66bb0c0f6698fb","/b/b6/Unit-Fina-6.png?version=79cae762b241c9065bd6e4490346f910"},2),
	Lid("Lid",new String[]{"/b/ba/Unit-Lid-3.png?version=2dba34603e04e4d4739e9921fffa4288","/4/4a/Unit-Lid-4.png?version=df605070cdac0cfba533b9697f47dfef","/4/49/Unit-Lid-5.png?version=dd72ffc65d38d228c0ed6d4595f04246"},3),
	Nichol("Nichol",new String[]{"/a/a0/Unit-Nichol-3.png?version=6d955416b50a4611f35ee79219d1384a","/9/90/Unit-Nichol-4.png?version=e163596bac0fee64a976af54ec05f390","/5/59/Unit-Nichol-5.png?version=b1980107db49af19c220dd7ab6286171"},3),
	Jake("Jake",new String[]{"/d/d9/Unit-Jake-3.png?version=12e5d888efaa40a75816527e861d47ed","/c/c2/Unit-Jake-4.png?version=fb01bcccdaab19ac4ac9ed099c6196c6","/1/1d/Unit-Jake-5.png?version=ab35fa8c6bf995077e6ecbab23e0eb3a"},3),
	Sakura("Sakura",new String[]{"/b/bd/Unit-Sakura-3.png?version=8c381797d26204a2106b605ba95f2bf7","/4/4b/Unit-Sakura-4.png?version=f243bc8073e9b00e3e92c3f6287ffc31","/3/3f/Unit-Sakura-5.png?version=44e805b2aa889b8842dbf3ccfc5ec664"},3),
	BlueMageFina("Blue Mage Fina",new String[]{"/8/8b/Unit-Blue_Mage_Fina-5.png?version=3795cbfb1182d40421ae800665ea133e","/d/d7/Unit-Blue_Mage_Fina-6.png?version=81183dc64fd0e92c4e7d1aa44a4cab67"},5),
	//FP units
	Rizer("Rizer",new String[]{"/b/bc/Unit-Rizer-1.png?version=df8e6215528b509af92582436b0c3831","/d/d3/Unit-Rizer-2.png?version=503a012133f39a3c1fdce6312367ff57"},1),
	Leah("Leah",new String[]{"/2/29/Unit-Leah-1.png?version=cac0baf9d1ba1ee8a68cbd50a10e9dc8","/d/de/Unit-Leah-2.png?version=4e025d0b8b59d7d8258a864dd1e1178a"},1),
	Tronn("Tronn",new String[]{"/1/1e/Unit-Tronn-1.png?version=3e4b80dce39309dbdcf6958a9c14b252","/b/bf/Unit-Tronn-2.png?version=7a645e9f782da083aa2f9b6715ccdbd9"},1),
	Eldin("Eldin",new String[]{"/4/48/Unit-Eldin-1.png?version=16de337edc0cb66c74aa07172e3cba96","/4/4c/Unit-Eldin-2.png?version=78b46a192551306fd48448cf0dccf84f"},1),
	Baurg("Baurg",new String[]{"/b/bc/Unit-Baurg-1.png?version=2b6f146538c83856151046abe27146eb","/d/dd/Unit-Baurg-2.png?version=cfbcdf3bad69b812e5239d6780a180d6"},1),
	Gimlee("Gimlee",new String[]{"/2/28/Unit-Gimlee-1.png?version=085baf855c455fc4176619bd3457ff64","/a/a4/Unit-Gimlee-2.png?version=45a83bcc18b487e83ff2f297fe101807"},1),
	Maxell("Maxell",new String[]{"/f/fb/Unit-Maxell-1.png?version=fddcd0bd27a8742a9163cc95cdecb13c","/7/76/Unit-Maxell-2.png?version=be872a73e3157cfa2f4fc300f9d194f4"},1),
	Liza("Liza",new String[]{"/d/d9/Unit-Liza-1.png?version=3caee1a7348aec93e46eb9ed23506cda","/8/84/Unit-Liza-2.png?version=22bf310ad368d392f15bdc0047f48560"},1),
	Wedge("Wedge",new String[]{"/4/4e/Unit-Wedge-2.png?version=62ed203b087f4bdf33214955fe3df97c","/3/34/Unit-Wedge-3.png?version=b88e7bc061a710e28b4cfb6ca24a65ec"},2),
	Biggs("Biggs",new String[]{"/b/bd/Unit-Biggs-2.png?version=168c1930ea8d1992d83611e39dcb26aa","/1/1e/Unit-Biggs-3.png?version=f995edc781840857a3ef7cec7369f676"},2),
	Paul("Paul",new String[]{"/7/74/Unit-Paul-2.png?version=315f1c931a97cec546294a1de164fe6e","/f/f6/Unit-Paul-3.png?version=bf2d20a67438be9d5f33d73ac8040206"},2),
	Anastasis("Anastasis",new String[]{"/d/d5/Unit-Anastasis-2.png?version=1de853a8b4d7305ec9ecb35a014f96ff","/b/be/Unit-Anastasis-3.png?version=8ed17484f84bf9bfb5bae1ef47f4063b"},2),
	Sarah("Sarah",new String[]{"/0/0b/Unit-Sarah-2.png?version=c49c1e0297c64d8b09d2247870735d51","/e/e1/Unit-Sarah-3.png?version=34e5518be1ab9d5d60bde90cdf08ea92"},2),
	KingGiott("King Giott",new String[]{"/b/bb/Unit-King_Giott-2.png?version=b661ce68b4f569c0b57fba0e57105513","/c/c9/Unit-King_Giott-3.png?version=c4ea10f7022fb8099e026e507f6f4ac5"},2),
	Shiki("Shiki",new String[]{"/4/41/Unit-Shiki-2.png?version=b959ed71b74c7022248ad5b021f0b9e0","/9/9f/Unit-Shiki-3.png?version=64106d91bb97173316c9f69c9f3989de"},2),
	Mizell("Mizell",new String[]{"/c/c0/Unit-Mizell-2.png?version=1e75b309f99e4ecbf075b77716fd3752","/4/44/Unit-Mizell-3.png?version=caf8d18638193f0baafc0f6d70decb39"},2),
	Ronaldo("Ronaldo",new String[]{"/b/b6/Unit-Ronaldo-2.png?version=88f81bb4d058245191f740447a2395f2","/5/58/Unit-Ronaldo-3.png?version=d5dab840689236f7a8868f2a98d6d8e2"},2),
	Mel("Mel",new String[]{"/b/b8/Unit-Mel-2.png?version=f665a0ee5c105310ef7211a985574221","/6/68/Unit-Mel-3.png?version=250365a3c97bca79bdf987483a5adba2"},2),
	Sarai("Sarai",new String[]{"/d/d0/Unit-Sarai-1.png?version=a0417a598012493f23090ee44b8faa39","/1/10/Unit-Sarai-2.png?version=b6011a2825df9764e962398562dcfb45"},1),
	Paula("Paula",new String[]{"/4/4b/Unit-Paula-2.png?version=25a19be8507021a42e2f0b3b0ea17e65","/f/f9/Unit-Paula-3.png?version=80fd39028a125bdb23fa2a647259e8fc"},2),
	Kenyu("Kenyu",new String[]{"/4/41/Unit-Kenyu-2.png?version=08a191632771c85503718502cda3d80c","/6/63/Unit-Kenyu-3.png?version=556545e94332bdedca167bdb1d3f4747"},2),
	Ollie("Ollie",new String[]{"/3/36/Unit-Ollie-2.png?version=a0f733d497e6a878a65b82de204eff9e","/f/f4/Unit-Ollie-3.png?version=d1c482dc0b6363ecc5eb08085a6708c3"},2),
	Carrie("Carrie",new String[]{"/e/ea/Unit-Carrie-2.png?version=f2c2b2452e748667d0f981868f5257aa","/d/d3/Unit-Carrie-3.png?version=6228ec5917dbfa9f7f14d9217947c41c"},2),
	Skaha("Skaha",new String[]{"/8/8e/Unit-Skaha-2.png?version=2fa3526b6f0ad13c620f2f7e99eff800","/3/32/Unit-Skaha-3.png?version=5e43c0cf423e858f2ea77e51f5fc960b"},2),
	Montana("Montana",new String[]{"/8/8a/Unit-Montana-2.png?version=fe0b80a36bf74e2fd4a1b8687e360da9","/c/c1/Unit-Montana-3.png?version=744d8f715b1c8bb316046f0ca8f771a9"},2),
	//standard rare summon units
	Vivi("Vivi",new String[]{"/0/0f/Unit-Vivi-3.png?version=419e16782194e8124b2ecf9b568504b1","/d/d3/Unit-Vivi-4.png?version=14266c86c343196eab7eb0a94c0d3d8e",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/9/97/Unit-Vivi-5.png?version=91ea7bb6eea605365f23b57781578c69","/e/e2/Unit-Vivi-6.png?version=78839cf056487da210e4fee732168c9a"});
		}
	},
	Penelo("Penelo",new String[]{"/6/6f/Unit-Penelo-3.png?version=09d9048e8715a55add6b2cad019c4d5d","/5/5a/Unit-Penelo-4.png?version=1bbdf7af4f90ebf23d7d3a5b0c241905",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/f/f0/Unit-Penelo-5.png?version=94bae09170bc335bedbccdf78b7ac588"});
		}
	},
	Maria("Maria",new String[]{"/f/f3/Unit-Maria-3.png?version=de674e91466c8bd8db890d0ebc3cb27b","/2/28/Unit-Maria-4.png?version=9b7198b665b50779c758f3f5488271f3",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/f/f3/Unit-Maria-5.png?version=cce7a91f7019e576d192362e5f3d3a77"});
		}
	},
	Sabin("Sabin",new String[]{"/c/c0/Unit-Sabin-3.png?version=5fc10b9774aa06e1daf672202985ef9f","/e/e3/Unit-Sabin-4.png?version=a0cd46a92b92a1c3ba311389421181a5"},3),
	Shadow("Shadow",new String[]{"/3/3b/Unit-Shadow-3.png?version=6c3201a5e5a65fe513c2e25563ac6cf8","/4/4a/Unit-Shadow-4.png?version=b5539d267f4cdf935dc7c5fdf4e6cb5d"},3),
	Krile("Krile",new String[]{"/d/da/Unit-Krile-3.png?version=350edffb98abe53f234d1c41c4b9941e","/a/a9/Unit-Krile-4.png?version=8d87ebc2be5620f2fbb398b1c67648a3"},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/6/6d/Unit-Krile-5.png?version=a18ad1cd7e3186b70dc07f851f609f12"});
		}
	},
	Kain("Kain",new String[]{"/1/1a/Unit-Kain-3.png?version=9aa1b173e4b30e68f61de81072a0015a","/b/b8/Unit-Kain-4.png?version=6d35291c777c6e8048463b2f2144dcae"},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/7/77/Unit-Kain-5.png?version=151a535c8b5b8d55e0f5ea177cb0dd5e"});
		}
	},
	Edgar("Edgar",new String[]{"/e/e6/Unit-Edgar-3.png?version=50b4ed881b53b0831ce4a2a7d8199366","/a/a8/Unit-Edgar-4.png?version=2201446a3ed9fe2d943f7bb314b48715"},3),
	Fran("Fran",new String[]{"/5/54/Unit-Fran-3.png?version=5d2e1964e694891bcf4e70cde831b9a0","/1/1e/Unit-Fran-4.png?version=814cac1f0080ca8ed82af5d060565bcc"},3),
	Shantotto("Shantotto",new String[]{"/9/9c/Unit-Shantotto-3.png?version=d1914e6129110b81c2b60945e312aee3","/d/d9/Unit-Shantotto-4.png?version=472d99817ea108ad9a26804cc24255eb",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/4/43/Unit-Shantotto-5.png?version=d8d3ec6e02b3741f2b565e0cd1e42100"});
		}
	},
	Rydia("Rydia",new String[]{"/8/89/Unit-Rydia-3.png?version=70f0c17c7b1f490a1cc28d511ee8188f","/5/56/Unit-Rydia-4.png?version=95fbd550e9ca5c68bebf988c82631887"},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/1/15/Unit-Rydia-5.png?version=595ed15ee2acad12005e836699552a22"});
		}
	},
	Cyan("Cyan",new String[]{"/9/9d/Unit-Cyan-3.png?version=b27e4a75087620c2757bc8d3c4b9c6f1","/6/6c/Unit-Cyan-4.png?version=73f65d9124d4130d479aafab820b813d"},3),
	Clyne("Clyne",new String[]{"/f/f0/Unit-Clyne-3.png?version=a1dd1e36c7a3ed5748dca151e34edeb6","/9/99/Unit-Clyne-4.png?version=50b16d2347421a94e70223bfb3835be3"},3),
	Anzelm("Anzelm",new String[]{"/a/a7/Unit-Anzelm-3.png?version=69b764fd27e6beb490a437755ae9bb5a","/0/04/Unit-Anzelm-4.png?version=3d9d68d437b8242a2bbad1faee19750d"},3),
	Luna("Luna",new String[]{"/0/0e/Unit-Luna-3.png?version=f5f88addca1363a9623378ede2a45073","/d/d4/Unit-Luna-4.png?version=160a4398bd2f2e8602e497430fb14204"},3),
	Bedile("Bedile",new String[]{"/9/91/Unit-Bedile-3.png?version=e6e43d2c252f6c64ea98eda1bcef60ae","/f/f8/Unit-Bedile-4.png?version=add5c8b1abe3be03914fe2c1563c31c2"},3),
	Garland("Garland",new String[]{"/d/d5/Unit-Garland-3.png?version=6e31a8405d2c89d766ae5916164f4600","/9/91/Unit-Garland-4.png?version=62b830e2576e34c3f0c0d8a494236b31","/0/08/Unit-Garland-5.png?version=e1dc44eb4c223170810de7e08e63cd82",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/9/90/Unit-Garland-6.png?version=b4efd8f47369222794bedc0af140b81b"});
		}
	},
	Exdeath("Exdeath",new String[]{"/8/8d/Unit-Exdeath-3.png?version=e5922897344416bc550e7b9f65f11ffa","/4/4b/Unit-Exdeath-4.png?version=8456ddf8c06b7b3b41a577d9036f7852","/f/f9/Unit-Exdeath-5.png?version=f9f2cd47a3a5fbccd65f0c8023a1473b",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/8/88/Unit-Exdeath-6.png?version=f5aa3e8216d9f18d0e83ec52b0547db4"});
		}
	},
	Kuja("Kuja",new String[]{"/c/c3/Unit-Kuja-3.png?version=3f1ca21d2e7f8c875465ea7723f6827f","/2/2b/Unit-Kuja-4.png?version=b9f366303e30abdbd4a450b30a95ca34","/4/47/Unit-Kuja-5.png?version=6a46a4dba5e89a4b4ce6469218251d7d",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/a/a6/Unit-Kuja-6.png?version=1bfdd9c19c246ef47c6ab2fdbcbdbe85"});
		}
	},
	CoD("Cloud of Darkness",new String[]{"/b/bf/Unit-Cloud_of_Darkness-3.png?version=848f35057bd6fcff43822cde8a1e8def","/8/8b/Unit-Cloud_of_Darkness-4.png?version=4b091b0d01b167acff33f852fb3c1228","/0/02/Unit-Cloud_of_Darkness-5.png?version=a8e53dc9e1d6ecc16849eac2762c2c35",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/7/7c/Unit-Cloud_of_Darkness-6.png?version=197c779ebb2ee5f3a5e34c6688995b39"});
		}
	},
	Cecil("Cecil",new String[]{"/7/7b/Unit-Cecil-3.png?version=437c947c2db522631b228bed74fcfa01","/3/3b/Unit-Cecil-4.png?version=8275b728c1d0564569ffcfd202a58253","/e/e1/Unit-Cecil-5.png?version=ee583d5773104f251d57f5586fbd2460",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/b/b4/Unit-Cecil-6.png?version=8677055ebae4e1c40f1c79ab673912c4"});
		}
	},
	Terra("Terra",new String[]{"/b/bd/Unit-Terra-3.png?version=111efd65dc8e86253820a988a6e3d91d","/6/66/Unit-Terra-4.png?version=84fd4cf21b204409fae4c3ce198bb0a3","/e/ec/Unit-Terra-5.png?version=931d017cf95b7084c1269dfd784109b7",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/a/af/Unit-Terra-6.png?version=0b8e5a7d79952f9475a629b3ce08a924"});
		}
	},
	Bartz("Bartz",new String[]{"/7/73/Unit-Bartz-3.png?version=20178907a396de7d2bdf46ad741bdcb7","/7/76/Unit-Bartz-4.png?version=2d6895f054aa9a3339a33a87208f20bc","/5/57/Unit-Bartz-5.png?version=4ef7830079568901a1d0c3aab3d39787",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/0/0c/Unit-Bartz-6.png?version=238ab320294a43f664c099b3df90d51f"});
		}
	},
	Firion("Firion",new String[]{"/4/4f/Unit-Firion-3.png?version=f8fe9ed7d587a8da58d4c83111dc0a9d","/3/3e/Unit-Firion-4.png?version=6f490a68f825c011119b1bcd53363bdb","/6/64/Unit-Firion-5.png?version=1a9fb3c1cccefcee0e305e303e32bc2d",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/0/06/Unit-Firion-6.png?version=012717c04454e1e86e9d6479c2615348"});
		}
	},
	Zidane("Zidane",new String[]{"/b/b0/Unit-Zidane-3.png?version=c9cbba2278b212d988fb9f77587456a8","/8/8e/Unit-Zidane-4.png?version=d0d8d6e809fd1cab0085beca7a44234c","/d/de/Unit-Zidane-5.png?version=f19236a9aca8392ba4df8eaeeac96363",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/8/87/Unit-Zidane-6.png?version=bffc8367dffb6fd9d6ecdc284fc44421"});
		}
	},
	Vaan("Vaan",new String[]{"/8/83/Unit-Vaan-3.png?version=82db594c5e1b561a09bfef77a974827f","/f/f6/Unit-Vaan-4.png?version=e379cd52a36cc4dd0bd580bd262caa92","/e/e6/Unit-Vaan-5.png?version=c3e76c21ed20e81f771617ba7dc1d7fd",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/1/10/Unit-Vaan-6.png?version=2932cc71ef0a052cf7b90c269973e08f"});
		}
	},
	Duane("Duane",new String[]{"/6/6d/Unit-Duane-3.png?version=8a69bd78daba7afe970554f3cb26ee19","/7/77/Unit-Duane-4.png?version=5895dc08b8da75d8374940b8ab5907e4","/c/ca/Unit-Duane-5.png?version=e7ababffe9157e036a3d2a57600ffb8d"},3),
	Cerius("Cerius",new String[]{"/8/88/Unit-Cerius-3.png?version=937604c7e1f7de1daa7d9cde84c24959","/4/47/Unit-Cerius-4.png?version=4bed78a7ccd6f4c7f5ea0ae632e771b6","/5/58/Unit-Cerius-5.png?version=07fc63961225f38a9e9829f134ec0f29"},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/0/02/Unit-Cerius-6.png?version=8822b16cf2ff564a82f2d938039fe7c6"});
		}
	},
	Roselia("Roselia",new String[]{"/f/fd/Unit-Roselia-3.png?version=1b634a1a183fdb008cd54ef756c02957","/9/9c/Unit-Roselia-4.png?version=852f06d45d9dd7e7a3bb964b765b7d4c","/c/cf/Unit-Roselia-5.png?version=71beeea0141be646a562d84d88cda6a8",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/3/36/Unit-Roselia-6.png?version=1a6a5d026f02894af8b34fa586da1a74"});
		}
	},
	Medius("Medius",new String[]{"/b/b4/Unit-Medius-3.png?version=44a4b56b58ae66de62f5731e7edd9538","/3/3e/Unit-Medius-4.png?version=618b6b35b7529c950432995d8f49eb70","/d/d5/Unit-Medius-5.png?version=0e6f9667d7937b726c0c39dd96308077"},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/8/89/Unit-Medius-6.png?version=a83fab3622d8262cdc48bf27d17dbf43"});
		}
	},
	Miyuki("Miyuki",new String[]{"/5/5e/Unit-Miyuki-3.png?version=ed9aa10823a009f89ee84c55b2488dc2","/8/8b/Unit-Miyuki-4.png?version=f23b0661931d1b75af3d7a8e743f35e8","/e/ed/Unit-Miyuki-5.png?version=09a84ae46eafc9164133297587d22472",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/2/21/Unit-Miyuki-6.png?version=73f9b5cfda12c96d6cf8dde5437fc973"});
		}
	},
	Russel("Russell",new String[]{"/d/d6/Unit-Russell-3.png?version=f879849b824e4818b7d42e75adfe6434","/0/01/Unit-Russell-4.png?version=3ca9c390ff68fa5adf659c347510ef59"},3),
	Golbez("Golbez",new String[]{"/a/a8/Unit-Golbez-3.png?version=a48ba3ada6fa3fb9031f4c6765fc632e","/3/31/Unit-Golbez-4.png?version=83a882942bab614b54922317bd6f45fe","/f/f2/Unit-Golbez-5.png?version=fb09062c1c02583e1f59cb982da5002d"},3),
	Galuf("Galuf",new String[]{"/b/bf/Unit-Galuf-3.png?version=c4e38de87222b6da8b3a0b6fc9322fac","/8/8f/Unit-Galuf-4.png?version=42e80587e399605681c21aea100d7e1b"},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/0/05/Unit-Galuf-5.png?version=3f90877a3f06cd720b85d72993da337b"});
		}
	},
	Xiao("Xiao",new String[]{"/b/b4/Unit-Xiao-3.png?version=eceed3930c356f795303d925e0ebd53f","/1/13/Unit-Xiao-4.png?version=d4ffb593ba32e0a7f4a7b8dd0056362e","/4/41/Unit-Xiao-5.png?version=a13ed2de278340dd74ec7dcecc39674e",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/7/7a/Unit-Xiao-6.png?version=c144549f75c4ffe48966f6730e503375"});
		}
	},
	Artemios("Artemios",new String[]{"/8/8e/Unit-Artemios-3.png?version=53a3f2772e6bf5a041c7339b47187409","/1/18/Unit-Artemios-4.png?version=90ab67be5ea9ec6fa18b5dd8d0c2a255","/0/02/Unit-Artemios-5.png?version=4de9e5a1d334c74a61adaa83b631c9fb"},3),
	Locke("Locke",new String[]{"/7/7e/Unit-Locke-3.png?version=a5ce114388d09d56cca00d89ba77da01","/e/e8/Unit-Locke-4.png?version=e59fe6ace0e5294c97fda290b834609e","/3/3e/Unit-Locke-5.png?version=10b45340509b2cb416b03c6ecc47ffc7"},3),
	Leo("Leo",new String[]{"/4/46/Unit-Leo-3.png?version=67c0fb1baa63da506a21eda0da0f27a7","/f/f7/Unit-Leo-4.png?version=1aa87219410caec0b639d34f4ffe1c19","/9/95/Unit-Leo-5.png?version=0dadb6623a01f9bce8d952589287ccf4"},3),
	Gilbert("Gilbert",new String[]{"/5/52/Unit-Gilbert-3.png?version=6b4036a5a90372075cd488e55f86ea76","/b/be/Unit-Gilbert-4.png?version=6651a53727df99201827159b9f211260","/3/30/Unit-Gilbert-5.png?version=0baafc0e3ae2e8378240ae297ae1bd78",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/6/63/Unit-Gilbert-6.png?version=9a16f7e366cb2d4e093fa83c0212645d"});
		}
	},
	Celes("Celes",new String[]{"/b/bf/Unit-Celes-3.png?version=2d4778a8f2047b66b6e7f2058bfe83ef","/2/2d/Unit-Celes-4.png?version=8712ac20003c040a218f709a1f0bce38","/0/08/Unit-Celes-5.png?version=f135db28ee63d37b90b61f0acba28ebd"},3),
	Kefka("Kefka",new String[]{"/d/d2/Unit-Kefka-3.png?version=6196198582e6c70fa5bc105469b7481c","/3/31/Unit-Kefka-4.png?version=c8d590eb5d5ec0870338107bb221a349","/b/b4/Unit-Kefka-5.png?version=f0ee9c90e4067e9d3a3aaca934c62065",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/d/d7/Unit-Kefka-6.png?version=102724eeb22c248c64e43424b26b5215"});
		}
	},
	Rakshasa("Rakshasa",new String[]{"/f/f7/Unit-Rakshasa-3.png?version=997409afef91850a477e38f39265cd8c","/a/a1/Unit-Rakshasa-4.png?version=92173f438bc74915b50f2c0be6786990","/0/0b/Unit-Rakshasa-5.png?version=ae2a8a032cd8ca1a0a81e41c4384d6aa"},3),
	Chizuru("Chizuru",new String[]{"/5/50/Unit-Chizuru-4.png?version=1603c575e9c5d247a2d3f9080c762ef3","/4/45/Unit-Chizuru-5.png?version=5c8e5ae912f2302db502f1db08cfa989"},4){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/8/80/Unit-Chizuru-6.png?version=0ce21ec1e6ce66e25a6ad1f73761070b"});
		}
	},
	Hayate("Hayate",new String[]{"/6/64/Unit-Hayate-3.png?version=5f6e6f04ae2b6f58935acdc718c74490","/e/e8/Unit-Hayate-4.png?version=03b5dc0330b58ce2b24d91cdfdd1c1ac","/4/40/Unit-Hayate-5.png?version=2441d7142c3c6f7856442bc83173b2b0",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/b/bc/Unit-Hayate-6.png?version=849c3568f55f0c5c40c06d7af70ef64c"});
		}
	},
	WoL("Warrior of Light",new String[]{"/7/70/Unit-Warrior_of_Light-4.png?version=a082f11294d562e8b1687b15deecff22","/c/c2/Unit-Warrior_of_Light-5.png?version=6eb241f6f628041e0a9f34e730c08faf",},4){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/5/5d/Unit-Warrior_of_Light-6.png?version=551e4316c786f1d55d9ba70068f075ca"});
		}
	},
	Tellah("Tellah",new String[]{"/3/3f/Unit-Tellah-3.png?version=9b56fc089453b07ff34602ec8c8c5503","/c/c4/Unit-Tellah-4.png?version=6bb6a35f7ea92c72cccef37fb4a02e98","/c/c0/Unit-Tellah-5.png?version=78eb3b853f0fa65616138f3c6c948da8"},3),
	Lenna("Lenna",new String[]{"/5/57/Unit-Lenna-3.png?version=5f2df9bf4548eba73a1ab31abd13f864","/7/7d/Unit-Lenna-4.png?version=a4bcd6a62ec852c6dbd8b10208c464b2","/b/ba/Unit-Lenna-5.png?version=ab784a2396211368f34b8575ec1ed5b4"},3),
	Amarant("Amarant",new String[]{"/8/83/Unit-Amarant-3.png?version=7ffb648c9cf44102a3e381b8eb972d99","/0/06/Unit-Amarant-4.png?version=91a73f9fb0b5d2b50f5b7c6bd750b182","/1/12/Unit-Amarant-5.png?version=7dc0b2ad74a0202ae7f747d24d6b4d53"},3),
	Lani("Lani",new String[]{"/a/a8/Unit-Lani-3.png?version=7673aeaccb0b8320fb47fefd4330d12f","/b/ba/Unit-Lani-4.png?version=e62ac0c48f767ef5eff1998509474bbf"},3),
	Garnet("Garnet",new String[]{"/5/53/Unit-Garnet-4.png?version=2346700fe5606dee6821818c492ed133","/f/f3/Unit-Garnet-5.png?version=9becf3a4b588576d48581c5f6168e6da",},4){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/c/ce/Unit-Garnet-6.png?version=53e249fc17b8f770f6e341aa11da8bd9"});
		}
	},
	Freya("Freya",new String[]{"/a/a6/Unit-Freya-3.png?version=5544096799a6956efcc47f97ecf7e036","/2/28/Unit-Freya-4.png?version=3473d752d09d26cd84bb17da573afa44","/f/fc/Unit-Freya-5.png?version=2b065f45a90cee4b66dc9a314b8fbd8b"},3),
	Charlotte("Charlotte",new String[]{"/2/24/Unit-Charlotte-3.png?version=d57be6a671744810f6dbfed20dc1d635","/e/ed/Unit-Charlotte-4.png?version=79cb85d2fb2caa1f9086279fc3ee3f49","/c/c5/Unit-Charlotte-5.png?version=19b73296aba4d6debc821986776a57ef",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/7/78/Unit-Charlotte-6.png?version=2414f9b784f0d63e521619a277562c5b"});
		}
	},
	Ludmille("Ludmille",new String[]{"/3/32/Unit-Ludmille-3.png?version=e4dbb2ee7047f8da68c135876e8ad821","/0/07/Unit-Ludmille-4.png?version=e1faee93d4c63c20ac4160c36d1b51a9","/0/04/Unit-Ludmille-5.png?version=06acb9be35c7c9dbc26fdbf781d3f7c7"},3),
	Lightning("Lightning",new String[]{"/a/ab/Unit-Lightning-5.png?version=76dd27debeb3102d5f83e332ee9fad3d","/2/25/Unit-Lightning-6.png?version=aded6fbaee049aa66dee4fa2acbe278a",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/7/78/Unit-Lightning-7.png?version=b90dfe2fd90b077728bd385848d60032"});
		}
	},
	Deltia("Delita",new String[]{"/b/ba/Unit-Delita-5.png?version=01340646bff4e81219c949623a4be807","/b/be/Unit-Delita-6.png?version=d35b6c90434337f1a00f7e7269b3432f",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/c/c5/Unit-Delita-7.png?version=b8044ddf8aaea0f23bbe2a688f04450f"});
		}
	},
	Alma("Alma",new String[]{"/1/11/Unit-Alma-3.png?version=1a3c96d4ae4e9412916c151e1f8d7057","/0/05/Unit-Alma-4.png?version=2de8696181c054604895e440de36ea52","/3/3f/Unit-Alma-5.png?version=43b078407da42f9bfce167a021b14547"},3),
	Gaffgarion("Gaffgarion",new String[]{"/1/17/Unit-Gaffgarion-4.png?version=571e82b59004a6512495e4d1433bc339","/e/e8/Unit-Gaffgarion-5.png?version=8e2834b219e6d2a62854d2548363d108",},4){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/3/31/Unit-Gaffgarion-6.png?version=a2e95b7ebf75e92f4104bada2eb5cffa"});
		}
	},
	Ramza("Ramza",new String[]{"/1/14/Unit-Ramza-5.png?version=e221e5191bed7c51929dfb820303ce6b","/5/5b/Unit-Ramza-6.png?version=7e077c5eea40bc4accb5a7666c75a662",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/f/fa/Unit-Ramza-7.png?version=4eb7e6558af9248134a27c9cacb60115"});
		}
	},
	Arigas("Agrias",new String[]{"/9/91/Unit-Agrias-4.png?version=1f4bf2300fabf967a3fc1b9efecfaf28","/b/b5/Unit-Agrias-5.png?version=7fadbaea915d40a401f4568993da8185",},4){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/e/ef/Unit-Agrias-6.png?version=96937e8e5fcecad2a8d74353b0758111"});
		}
	},
	Mustadio("Mustadio",new String[]{"/9/94/Unit-Mustadio-3.png?version=636eeda021f8c0dd0c65e16bcf64dcee","/0/0e/Unit-Mustadio-4.png?version=9a6499dd8d3c8c6ea83468dff2affbf2","/f/fd/Unit-Mustadio-5.png?version=60126912028e1ff06fa9b01b37333db6"},3),
	Rosa("Rosa",new String[]{"/2/27/Unit-Rosa-4.png?version=dafe38ce9c827529603bc9edb973b6d6","/b/b9/Unit-Rosa-5.png?version=4b5accd9c1e2602669485611a918c0e8",},4){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/3/31/Unit-Rosa-6.png?version=1e427d785d86b4a972087ece15d979e2"});
		}
	},
	DKC("Dark Knight Cecil",new String[]{"/8/8e/Unit-Dark_Knight_Cecil-5.png?version=53c285a9df669c314ad1d4cb4ed619ad","/1/17/Unit-Dark_Knight_Cecil-6.png?version=e3ae26a12bc287d5e2571b197706f459",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/7/7e/Unit-Dark_Knight_Cecil-7.png?version=b0d9428d70b8e6c2f849447ab4a1b94b"});
		}
	},
	Edge("Edge",new String[]{"/c/cd/Unit-Edge-3.png?version=1022775ffad1d0951c48bbf5313a94c4","/7/75/Unit-Edge-4.png?version=eaee8ec6e7408c600acb9d2236271d56","/a/af/Unit-Edge-5.png?version=bb356da4741db4b340b6f7d237c17398"},3),
	Arc("Arc",new String[]{"/b/b7/Unit-Arc-3.png?version=3e6706b49b0b58767f6e10be8d45e10b","/8/83/Unit-Arc-4.png?version=977ad3afabd8b553973bb1a1f65fc89f","/c/ca/Unit-Arc-5.png?version=7f1a7e4d588f891a4d67b1c297eb3e81"},3),
	Ingus("Ingus",new String[]{"/4/4b/Unit-Ingus-3.png?version=f2f97c828da8b8fe82c31a68f38f9acd","/1/14/Unit-Ingus-4.png?version=622643bbed45b07774c001e241ecdcd2","/7/7c/Unit-Ingus-5.png?version=731ed35bdeb64d7a07cb83cd8c777f35"},3),
	Refia("Refia",new String[]{"/8/8b/Unit-Refia-4.png?version=68bf244267d1808c92903f8ad958fcfb","/4/42/Unit-Refia-5.png?version=18cb362f30848f1889749e7e7f0dbbce","/a/ae/Unit-Refia-6.png?version=6e330f7fb9d476368e422933e4a91dcf"},4),
	Luneth("Luneth",new String[]{"/2/23/Unit-Luneth-5.png?version=8dcad4fd75e8effc305672192cd34096","/e/ef/Unit-Luneth-6.png?version=5ed860182433c1c383365b27ece29c1b",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/2/24/Unit-Luneth-7.png?version=624f186a790dfbc39b4bf52bd7b1b63d"});
		}
	},
	Faris("Faris",new String[]{"/8/8a/Unit-Faris-3.png?version=f0c435764a45bf505d0feb57cfba17b2","/5/54/Unit-Faris-4.png?version=3a8a34a4904a54ac7ec45dfd00b4a190","/2/25/Unit-Faris-5.png?version=9e4e21612897c0a574a832a5432db1c0"},3),
	Greg("Gilgamesh",new String[]{"/b/bb/Unit-Gilgamesh-5.png?version=a0f4779d8071cbe57c0bebca63dfd617","/2/22/Unit-Gilgamesh-6.png?version=55267a2e8a8f10445f82ac8126357529",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/e/e3/Unit-Gilgamesh-7.png?version=ef8af2488995f43bbc279b9a6db94420"});
		}
	},
	Snow("Snow",new String[]{"/8/85/Unit-Snow-4.png?version=ef27fa9364205908686305a3d5082de0","/b/bd/Unit-Snow-5.png?version=480f2ec78df6e99fc71cb53fffaef8c7","/d/d1/Unit-Snow-6.png?version=a64d464259719b9b4a76ba7769576e64"},4),
	Vanille("Vanille",new String[]{"/3/3c/Unit-Vanille-4.png?version=c4bea2367dd2721c665c85c17a6ff975","/5/5d/Unit-Vanille-5.png?version=aa95947586ca873014f523d1ced9b5fc"},4),
	Sazh("Sazh",new String[]{"/f/fa/Unit-Sazh-3.png?version=b18c7a4093b0885b0d63168c71ebf2f7","/0/0b/Unit-Sazh-4.png?version=e2da48b67f2e447d18d1599cdfc6a2b4","/7/7c/Unit-Sazh-5.png?version=e64619a09e3854ac16c230b8ade47c8b"},3),
	Hope("Hope",new String[]{"/3/38/Unit-Hope-4.png?version=69418b9eab2ab27ff238e37e6bd031aa","/b/b8/Unit-Hope-5.png?version=dda45c4d494dd4ed755862536bb9cd13"},4),
	Fang("Fang",new String[]{"/8/86/Unit-Fang-3.png?version=29fdeda683b4d006e676c169476e1d60","/0/07/Unit-Fang-4.png?version=4dd21e3f90d5370778a41a06a15ba6ed","/9/9c/Unit-Fang-5.png?version=dd51e09fe6cec2b95f4dba71e3ece024"},3),
	Mercedes("Mercedes",new String[]{"/7/7d/Unit-Mercedes-4.png?version=b06fa24c9122f4c30d975a430666b4a9","/7/77/Unit-Mercedes-5.png?version=5af6929ee15b4c7998513a911ff67f83","/b/b6/Unit-Mercedes-6.png?version=78dfb7127879161d732cec9f990b311a"},4),
	Noctis("Noctis",new String[]{"/c/c3/Unit-Noctis-5.png?version=51fbc15713914afeb855abf73c34395e","/a/ab/Unit-Noctis-6.png?version=c5f73bf1a2d52441b1c849e3f0c635a5"},5),
	Elle("Elle",new String[]{"/4/43/Unit-Elle-3.png?version=ba5f9f32427a3ba032b0f73dfb11ff8e","/c/c1/Unit-Elle-4.png?version=8ca9ec862b8526813c17dcf6e58ad5f0","/4/4f/Unit-Elle-5.png?version=c2a378b867af3d1c5c666761d9cd2efb"},3),
	Luka("Luka",new String[]{"/3/3e/Unit-Luka-4.png?version=79d65988be50974d084aa40a2c6ad2cd","/7/77/Unit-Luka-5.png?version=b031f9c68e3b82b5d92e5f05a5e3db46","/7/75/Unit-Luka-6.png?version=e43c86a42c1ed05b40e1329ef9901fe1"},4),
	DFina("Dark Fina",new String[]{"/1/1d/Unit-Dark_Fina-5.png?version=2dc04248867f101c2333093da98ea26b","/9/92/Unit-Dark_Fina-6.png?version=2d53e5945a5ff90c1e481cae190125ce",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/2/21/Unit-Dark_Fina-7.png?version=86d90f277bd7d7eba2e53bb806e3eb60"});
		}
	},
	Trey("Trey",new String[]{"/6/6a/Unit-Trey-3.png?version=7127c3e66c681a5385ee0c4db02ea857","/4/49/Unit-Trey-4.png?version=b1fb6c52253daafdc269319baf81cbfb","/3/3a/Unit-Trey-5.png?version=9b17fc1c970ed9182b45efcc6ae6f2c6"},3),
	Jack("Jack",new String[]{"/1/1b/Unit-Jack-3.png?version=442cbc5e5bdefaa0d13a3215c8c3da9f","/b/ba/Unit-Jack-4.png?version=3f54538b155914b6204587bbe75f7335","/0/0e/Unit-Jack-5.png?version=4f365a86d1d0e93b6db64f3335296a5d"},3),
	Seven("Seven",new String[]{"/9/99/Unit-Seven-4.png?version=6545af54be708d95f8f28ca87a937b26","/6/6c/Unit-Seven-5.png?version=c45c5326b879dda21d47e9d4dd103eda","/7/72/Unit-Seven-6.png?version=3b25005027cfbda21216c0029c89581e"},4),
	Ace("Ace",new String[]{"/3/32/Unit-Ace-5.png?version=e847ec4edd7856697597e9c8cc471390","/2/2b/Unit-Ace-6.png?version=1e449b5f5d9075ba605a39c43ac7f077",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/4/4c/Unit-Ace-7.png?version=4c65e8f46d263e196097452996a0b116"});
		}
	},
	Marie("Marie",new String[]{"/1/13/Unit-Marie-5.png?version=c3e43aa082d0fe96c3170a54051982a0","/7/79/Unit-Marie-6.png?version=5aeeff3822657f94253d55d66d5b63ec",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/c/c5/Unit-Marie-7.png?version=d05b750231b8c58ef0c5fcae1cadde58"});
		}
	},
	Guy("Guy",new String[]{"/d/d3/Unit-Guy-3.png?version=cd8bfc62c61c50b2943a75930855e259","/d/d6/Unit-Guy-4.png?version=a73f8ca36a08a4b89a2475d6ebaea0ba","/3/3b/Unit-Guy-5.png?version=5b8cfc7adf640cfe7d90c78dea7b3edb"},3),
	Leon("Leon",new String[]{"/2/29/Unit-Leon-4.png?version=7ff4f65694ef428eae1edf38057623a1","/a/ab/Unit-Leon-5.png?version=a8ba5fc02f0361a2686777cd1fad07c4"},4),
	Emperor("Emperor",new String[]{"/e/e9/Unit-Emperor-5.png?version=b5c36f0f52aa20a987170aa569d8b881","/e/eb/Unit-Emperor-6.png?version=38fa32a0e4ff39ceebc9e3350b1615c7",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/5/57/Unit-Emperor-7.png?version=fc4309fbec1ba4e0d4bd25be0f29d18d"});
		}
	},
	Olive("Olive",new String[]{"/7/7a/Unit-Olive-5.png?version=9ae2b446b7c70df36d43565017628c26","/8/88/Unit-Olive-6.png?version=a3037af8900eced5156b91c671545017",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/5/5c/Unit-Olive-7.png?version=fffcbdbf8b7abdd87fcc7a5ffce67a3a"});
		}
	},
	Shine("Shine",new String[]{"/8/80/Unit-Shine-4.png?version=d5f7c8481e9b2d6ecad508906094c77b","/b/b6/Unit-Shine-5.png?version=e77046618ab6efb84426e2ac306cabee","/3/30/Unit-Shine-6.png?version=5ad309bab23addf3cda10ed6b1851fa7"},4),
	Shera("Shera",new String[]{"/a/ae/Unit-Shera-3.png?version=ff3f045c08286e68e5fb80e9d2f966c9","/9/9d/Unit-Shera-4.png?version=1e833b1c95162126de05372ed7fb7a4c","/5/57/Unit-Shera-5.png?version=244dadc03caae527d4485659d1d0e9f4"},3),
	Queen("Queen",new String[]{"/0/08/Unit-Queen-5.png?version=1172e6e643fbdda3cea58b878829d1e3","/7/76/Unit-Queen-6.png?version=5402e9dbb217d6b9172df4b549e7c3da",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/4/41/Unit-Queen-7.png?version=08a5d8545b59bbdf5f123e6af9688afa"});
		}
	},
	Nine("Nine",new String[]{"/8/85/Unit-Nine-4.png?version=f1199c797fadeb8416e2655881f66172","/c/c9/Unit-Nine-5.png?version=736a4bccf28e95b8f135a1138b0339e0","/c/c5/Unit-Nine-6.png?version=ca3da82b972a9a4859bb00406cd2803f"},4),
	Clinque("Cinque",new String[]{"/7/7c/Unit-Cinque-3.png?version=cb2a63c1ce951b9a19e652c13e4a7369","/c/c9/Unit-Cinque-4.png?version=b583495b70b78258295606127fbbec08","/e/e9/Unit-Cinque-5.png?version=5e58509a8c6e3b1def6797e26a360c64"},3),
	Eight("Eight",new String[]{"/6/66/Unit-Eight-3.png?version=2b1f2ea6f26f2b3c3eca81eaea91a66c","/7/72/Unit-Eight-4.png?version=9bda9c1ae9a33ca72145898909b4401e","/6/65/Unit-Eight-5.png?version=30b32bd862c57e9f101752c59d617b4b"},3),
	Cid("Orlandeau",new String[]{"/e/e6/Unit-Orlandeau-5.png?version=54d5582edcaaf714d7f3bcad639f7850","/d/df/Unit-Orlandeau-6.png?version=fafa898324518b8ce88ee2178b9ead8c",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/2/25/Unit-Orlandeau-7.png?version=079241faeefb53d55f396f45c02b1422"});
		}
	},
	Soleil("Soleil",new String[]{"/c/c0/Unit-Soleil-4.png?version=5f172cef43d574dce137600b775ae4a9","/1/1b/Unit-Soleil-5.png?version=e53a8f7588752ac6e7f7d60e4f42fb28","/3/33/Unit-Soleil-6.png?version=30edaf1c6fd963a3bb18555f95e9dc29"},4),
	Ovelia("Ovelia",new String[]{"/a/ae/Unit-Ovelia-3.png?version=ea47aab0e6fd26b8d4439e953bba35df","/6/6f/Unit-Ovelia-4.png?version=e675329da768d85868d4d86b25656134","/b/b9/Unit-Ovelia-5.png?version=21f95a268a15b2dce9c95ebea9ce0a4d"},3),
	Lawrence("Lawrence",new String[]{"/e/ef/Unit-Lawrence-3.png?version=7af7979f144a159a7fc736e684551488","/4/40/Unit-Lawrence-4.png?version=88dc6dcee1e052e8e8f90f43386214fb","/b/b8/Unit-Lawrence-5.png?version=c85157387fe715e3ad84393cec7b2a31"},3),
	Fryevia("Fryevia",new String[]{"/2/25/Unit-Fryevia-5.png?version=e1ada43309badf983ef5a64332175d47","/3/32/Unit-Fryevia-6.png?version=62a168b7fbffd791f9ca8d88437a7883"},5),
	Xon("Xon",new String[]{"/d/d0/Unit-Xon-4.png?version=ff831f717ce3246a16b88f62722fd714","/b/bf/Unit-Xon-5.png?version=6382d0946ca9981e541ba75fec595860","/8/88/Unit-Xon-6.png?version=23090d736507ee8a13f900fd29151ca5"},4),
	Aiden("Aiden",new String[]{"/7/7f/Unit-Aiden-3.png?version=24c74341419a0d66c2a90a9e02f1898a","/5/59/Unit-Aiden-4.png?version=43b3542e5a6754e7c650c957e7ead651","/8/8f/Unit-Aiden-5.png?version=913c715cb81ff55ca348ec184bb9a52b"},3),
	TTerra("Trance Terra",new String[]{"/f/ff/Unit-Trance_Terra-5.png?version=b7acc24edbc1280874056359a8932d23","/c/c9/Unit-Trance_Terra-6.png?version=d7db59f3069fd7f0654b167e4608abf5",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/7/78/Unit-Trance_Terra-7.png?version=be1760ecbbeb1ffc2255f1a9c3595dd6"});
		}
	},
	Setzer("Setzer",new String[]{"/8/82/Unit-Setzer-4.png?version=2ead8a1e0965a89a4e60d2f4d01f9509","/8/8e/Unit-Setzer-5.png?version=e2d2da84954caae0d909c76ed74c53f1","/5/58/Unit-Setzer-6.png?version=a968706d3c6747c0b853ff01cb19fdec"},4),
	Gau("Gau",new String[]{"/a/ae/Unit-Gau-3.png?version=86a4248518d92f0f337d53e8ac01eeb2","/a/a5/Unit-Gau-4.png?version=dddcb33201be09f9e0834d39a90f34c6","/7/72/Unit-Gau-5.png?version=86f4ffd16da0c69b45c17b61b29821dd"},3),
	Eileen("Aileen",new String[]{"/2/21/Unit-Aileen-5.png?version=9b68174017ea66b64e26e0881e955356","/4/49/Unit-Aileen-6.png?version=3420bebd48cf5e77a2d71515ab551ce3",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/8/87/Unit-Aileen-7.png?version=9f32f036125d336f9cd49bdad09322df"});
		}
	},
	Soze("Sozhe",new String[]{"/e/ee/Unit-Sozhe-4.png?version=8db6e71885c7f7466053db6a98c70696","/d/d4/Unit-Sozhe-5.png?version=11ba5c7a4156cecd2fd7c76b67a0b2a7","/9/94/Unit-Sozhe-6.png?version=2ab7a096496135b2e14aabb6dce439da"},4),
	Heretic("Heltich",new String[]{"/3/36/Unit-Heltich-3.png?version=b9577d4a66090573ad7474a1beef99f1","/6/61/Unit-Heltich-4.png?version=0095dc6e203899b0c12681c1d76deaa5","/2/2b/Unit-Heltich-5.png?version=e9da98267d682e8763fd93db477118df",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/8/8c/Unit-Heltich-6.png?version=b9f14118a5fd56469e8a56c1a8350e19"});
		}
	},
	Ulrica("Ulrica",new String[]{"/7/72/Unit-Ulrica-3.png?version=a5e2cc21b6a44a67253397e1420c2777","/b/b6/Unit-Ulrica-4.png?version=5178cf886205f3100e9b7dfdbde05e27","/1/14/Unit-Ulrica-5.png?version=64271ab140d89f4380352476d5374a51",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/0/0e/Unit-Ulrica-6.png?version=c53e7f43d9e880a0c4336178a51755ee"});
		}
	},
	Zyrus("Zyrus",new String[]{"/c/cd/Unit-Zyrus-4.png?version=96375c21507153a910b399b0cd6e1106","/b/be/Unit-Zyrus-5.png?version=2b97acb9180b93df0329e56720c356cd","/5/5d/Unit-Zyrus-6.png?version=d1e4d3ca07a9996c30121fc07c12d8a9"},4),
	Reberta("Reberta",new String[]{"/c/c7/Unit-Reberta-5.png?version=ad823b4deac00579f52a72c006fb5050","/b/b0/Unit-Reberta-6.png?version=9c3ad117048631838242100b8f479c9d",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/8/85/Unit-Reberta-7.png?version=9867d62e3ac5095b4423738e4dd2430a"});
		}
	},
	Sice("Sice",new String[]{"/4/42/Unit-Sice-3.png?version=6d528642bf94c8af9b6f3d077f10a696","/3/30/Unit-Sice-4.png?version=e003871a530bed2eeb5d6b06bc8f75e9","/6/64/Unit-Sice-5.png?version=3422c4a100dd87d801c5014e02786f90"},3),
	King("King",new String[]{"/7/70/Unit-King-4.png?version=206a7a1fa8287ef83c37ab2386ea9454","/1/13/Unit-King-5.png?version=41f076e40dafce9150099c88da069bb5","/e/e5/Unit-King-6.png?version=030958c77b217bddf56e0492b4dd514f"},4),
	Rem("Rem",new String[]{"/a/a5/Unit-Rem-5.png?version=1285024f32d7a0cfb3b606558eb1d5be","/b/b6/Unit-Rem-6.png?version=78b4aaa81fb7e35238607ea6b0366c5e",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/a/a7/Unit-Rem-7.png?version=b45824299873e6b21538928d7ea8182d"});
		}
	},
	Wilhelm("Wilhelm",new String[]{"/7/76/Unit-Wilhelm-5.png?version=7b75d37764ee05753823efe779b4c0bd","/f/f0/Unit-Wilhelm-6.png?version=bcb94748f8b43efa39514cc5ad525654",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/9/92/Unit-Wilhelm-7.png?version=0f315a47724176e61b21603de78d980f"});
		}
	},
	Grace("Grace",new String[]{"/2/28/Unit-Grace-4.png?version=9ba0fcc216abfb452e8069a5dc34a991","/3/38/Unit-Grace-5.png?version=385c6d33f20a963e199857dcc2f0da87","/8/8c/Unit-Grace-6.png?version=b42e14f3e2bcedc083ccdff734e31aaa"},4),
	Abel("Abel",new String[]{"/8/88/Unit-Abel-3.png?version=b601d10c549c3102df2c00dde3d2d18a","/0/0e/Unit-Abel-4.png?version=c0b20660e52ea56a5bc077829a2fd8a4","/3/35/Unit-Abel-5.png?version=fc406e856cd2610401fb86f254cb9512"},3),
	Jean("Jean",new String[]{"/b/b4/Unit-Jean-3.png?version=338e9add913f87cbf72696f709eb4246","/6/67/Unit-Jean-4.png?version=09c1e48e33c8d6f5d0af07155b870b94","/9/91/Unit-Jean-5.png?version=e0c72c0e5dc193664eb13818287efcf2"},3),
	Camille("Camille",new String[]{"/3/38/Unit-Camille-3.png?version=565d992b9d75093fe10d25413b5ef658","/1/17/Unit-Camille-4.png?version=c93c0bbeba3aa0f3413432ac10b2329b","/e/e4/Unit-Camille-5.png?version=9021a14234fd7bca288d80250b2ee6df",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/4/4f/Unit-Camille-6.png?version=9c90cb283bc56e70ae61a339055f9298"});
		}
	},
	Illus("Ilias",new String[]{"/4/46/Unit-Ilias-4.png?version=808ce3b0bc6a5c94f7744f2eb6a06fe6","/7/78/Unit-Ilias-5.png?version=09c4bd297a6739af367e40d5ee9688fc","/2/2b/Unit-Ilias-6.png?version=26a69ad6ed168c2fbece9f676ad559b3"},4),
	Amelia("Amelia",new String[]{"/3/34/Unit-Amelia-4.png?version=56cbfa4e443cafa0866cda4b34365253","/5/5c/Unit-Amelia-5.png?version=f8e8c056ee3bf3352b712ffa727659c2","/9/9e/Unit-Amelia-6.png?version=e1ce2684e570cf1cfa1ab90cd13707fe"},4),
	Forren("Fohlen",new String[]{"/b/b0/Unit-Fohlen-5.png?version=4d4dfdc2fa291033a931846156dde031","/f/f3/Unit-Fohlen-6.png?version=7e14ec56e7b9a2a96589020ea8d31951"},5),
	SLid("Summer Lid",new String[]{"/3/3c/Unit-Summer_Lid-3.png?version=ba691eab63eafc28216aa7c18640281d","/d/dc/Unit-Summer_Lid-4.png?version=2c38daec84e679a22bfb7d66c413ba75","/e/e5/Unit-Summer_Lid-5.png?version=f1e200191d5aa1c0c1a3381ec92f8278"},3),
	SFina("Beach Time Fina",new String[]{"/3/39/Unit-Beach_Time_Fina-4.png?version=66155dc803cca45a45af2c3b4cfcc604","/3/37/Unit-Beach_Time_Fina-5.png?version=552e7d3c3c9bbf286c000bc1bb0d29e7","/4/46/Unit-Beach_Time_Fina-6.png?version=b4dbd0d01a190987cecfcaa7ece8f769"},4),
	SMF("Seabreeze Dark Fina",new String[]{"/1/19/Unit-Seabreeze_Dark_Fina-5.png?version=37b0ed934679b49fbdb37473ae5bc7c6","/2/28/Unit-Seabreeze_Dark_Fina-6.png?version=ed2e43f73d377d7399e14b5c5e45dabd",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/e/e8/Unit-Seabreeze_Dark_Fina-7.png?version=82a8b0ad4e224cef2d8910f563649463"});
		}
	},
	Wakka("Wakka",new String[]{"/6/6b/Unit-Wakka-3.png?version=efbf4ac7a8e7427c7dd5ab968c3e415e","/a/a2/Unit-Wakka-4.png?version=55c147cc53f7b483bd7086191ff7559a","/6/68/Unit-Wakka-5.png?version=4f3adcb5206dbd9d4f30cbd093945c53","/d/dd/Unit-Wakka-6.png?version=d7a3485812058b6128568f958e601636"},3),
	Rikku("Rikku",new String[]{"/6/65/Unit-Rikku-4.png?version=493d126df582d79cdfd77dab26bbb81d","/b/b4/Unit-Rikku-5.png?version=ada0d1c6290ee5b3fbc5bb0948a83ddc","/e/ee/Unit-Rikku-6.png?version=f55bd1d5197ef124bfbdcc2794d53ed1"},4),
	Tidus("Tidus",new String[]{"/a/ae/Unit-Tidus-5.png?version=ec2110ed3b54fd76e89c9f131f961995","/0/0d/Unit-Tidus-6.png?version=b8550fa5b7561cb33bca90153233f06d",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/b/b9/Unit-Tidus-7.png?version=4fff1fbe4d8edbce9abae6f79148a66a"});
		}
	},
	Ashe("Ashe",new String[]{"/3/37/Unit-Ashe-4.png?version=f69dfba0799de78f34e72b2fd142e1b5","/6/65/Unit-Ashe-5.png?version=2213737478b2807c0a40e76f8d3d2e34","/c/c4/Unit-Ashe-6.png?version=0652057350e5f543ecf914cc71259f1e"},4),
	Rasler("Rasler",new String[]{"/4/43/Unit-Rasler-4.png?version=ca9e6fb6b903a82fbc23ba2da336d99b","/7/7a/Unit-Rasler-5.png?version=c3854833fcde3f9ef799ba4af686f134","/a/a2/Unit-Rasler-6.png?version=a8b6de830db15f87be52c169d4bc0ae2"},4),
	Zargabaath("Zargabaath",new String[]{"/b/b9/Unit-Zargabaath-5.png?version=be421c73a3d136192b43f4f4052900e5","/2/2f/Unit-Zargabaath-6.png?version=06575dc66b59f6f6e410089635a97404",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/f/f7/Unit-Zargabaath-7.png?version=8af68904f00829137383682e4f93bfbf"});
		}
	},
	Lunera("Lunera",new String[]{"/0/0b/Unit-Lunera-5.png?version=9bf19e954174426c43795124b375ec1d","/f/f5/Unit-Lunera-6.png?version=cf1b8d9d18f75d6b2d21dbf48146c98b"},5),
	Bran("Bran",new String[]{"/9/95/Unit-Bran-4.png?version=c98e0c89238ef1df247560d04e28296b","/c/c2/Unit-Bran-5.png?version=8e9fc764a69b4829b48cf9f9367c10d8","/0/0b/Unit-Bran-6.png?version=8b9e78478872c2bd92b57919bd532f73"},4),
	Helena("Helena",new String[]{"/b/bd/Unit-Helena-4.png?version=286743cd201a7cf5cc46bae863dcec99","/0/0c/Unit-Helena-5.png?version=878990ef50e7bb1f40f2cd8ae35c085a","/5/51/Unit-Helena-6.png?version=e14110b62c630107a914aa41de2ac1df"},4),
	Ruggles("Ruggles",new String[]{"/6/6e/Unit-Ruggles-3.png?version=b15b61b10eb0e36a607b5de9da51adeb","/0/0d/Unit-Ruggles-4.png?version=1732fab88eeee95acd9377bf353afdce","/9/98/Unit-Ruggles-5.png?version=7ad87f653152d34de650c8d201321474",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/e/ec/Unit-Ruggles-6.png?version=e187cf14c6125bc9daf7b9c9ea34a714"});
		}
	},
	MercRamza("Mercenary Ramza",new String[]{"/6/61/Unit-Mercenary_Ramza-5.png?version=88ab13a5509a966fe91a34a43c4461a7","/4/45/Unit-Mercenary_Ramza-6.png?version=454aef40268a7370adf7cd981b52d128",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/0/0b/Unit-Mercenary_Ramza-7.png?version=8790a97decbabf72e74b40f47b0e679e"});
		}
	},
	KDeltia("Knight Delita",new String[]{"/d/df/Unit-Knight_Delita-5.png?version=29df964b631ef8f97c083697675a67d5","/e/eb/Unit-Knight_Delita-6.png?version=8ab8fe6795f00c229e2bab6c8e3bef80",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/f/f1/Unit-Knight_Delita-7.png?version=3827f45f41b1216e7e5914563beb7efb"});
		}
	},
	Meliadoul("Meliadoul",new String[]{"/e/e1/Unit-Meliadoul-4.png?version=06d01cc02fae36c8dcd8b13bec10ee12","/6/6b/Unit-Meliadoul-5.png?version=c9931ac259b1f7019ca9ca25f9b60ae1","/d/df/Unit-Meliadoul-6.png?version=4e84d4eeb983d14112e9d321d95c84c7"},4),
	Orran("Orran",new String[]{"/b/bc/Unit-Orran-4.png?version=ad42bded11268de83e7a6f718bb7c5bc","/9/93/Unit-Orran-5.png?version=cde6630b3bed89b3779a163270a428cb","/3/3e/Unit-Orran-6.png?version=5875d540a5e4bd4d3eab87f2ac75e6e9"},4),
	DV("Veritas of the Dark",new String[]{"/7/77/Unit-Veritas_of_the_Dark-5.png?version=8597061a195609b5fb6da6bfdef8bd35","/1/19/Unit-Veritas_of_the_Dark-6.png?version=b145bd8f69b1cea06c5a374c6a99ead8",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/a/a9/Unit-Veritas_of_the_Dark-7.png?version=ac6a7835b7850e6ea3ff5dafa19f944d"});
		}
	},
	FV("Veritas of the Flame",new String[]{"/c/c3/Unit-Veritas_of_the_Flame-5.png?version=257b035fc9488a005363086635f6e59a","/2/25/Unit-Veritas_of_the_Flame-6.png?version=0b448a781d9ecba91b8ace2abfddbc2f",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/2/2d/Unit-Veritas_of_the_Flame-7.png?version=5d8b3102160a43a64401186d1db76bb6"});
		}
	},
	EV("Veritas of the Earth",new String[]{"/e/e1/Unit-Veritas_of_the_Earth-4.png?version=f7b78fbf92722dbdab4c159cec6c92d7","/c/c9/Unit-Veritas_of_the_Earth-5.png?version=e4cda1cd4935f2be5ee5f740ba3f4db0","/e/e0/Unit-Veritas_of_the_Earth-6.png?version=6bd473fde438ff45aeec41ee146b5d59"},4),
	Victoria("Victoria",new String[]{"/7/7a/Unit-Victoria-4.png?version=7ab85a379bcdf5233a7190439d8a6400","/8/80/Unit-Victoria-5.png?version=17fb4bb81c43530db14a4f3ae719d656","/8/85/Unit-Victoria-6.png?version=a259ded545e88adecaf7987bba0994b0"},4),
	Tim("Timothy",new String[]{"/6/6c/Unit-Timothy-3.png?version=d52a0483065a851f7e7f49fbd3dae98e","/5/5d/Unit-Timothy-4.png?version=0ab177388264222de10bc50c63951fae","/1/16/Unit-Timothy-5.png?version=d95bf1675c86748fe2539d9c20036695"},3),
	LV("Veritas of the Light",new String[]{"/7/7c/Unit-Veritas_of_the_Light-5.png?version=a73fe8c4993066b6fbd8651d3837c37f","/c/cd/Unit-Veritas_of_the_Light-6.png?version=c1b6f63e003723b5717295230574bb1a",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/c/c5/Unit-Veritas_of_the_Light-7.png?version=4a62417204a9ebe523cdbbb9ffb07edf"});
		}
	},
	HV("Veritas of the Heavens",new String[]{"/3/38/Unit-Veritas_of_the_Heavens-4.png?version=0bc09107470f32f4fba7236a129778fc","/2/29/Unit-Veritas_of_the_Heavens-5.png?version=a777aef3b2d973f104dcf7d4c66aa49a","/d/d4/Unit-Veritas_of_the_Heavens-6.png?version=5ac94af348d9084663cb72cf0c9a47de"},4),
	WV("Veritas of the Waters",new String[]{"/9/91/Unit-Veritas_of_the_Waters-4.png?version=6ab058473bfd730bdf74aa7354923e2e","/0/04/Unit-Veritas_of_the_Waters-5.png?version=70870a36e9d08bcfd0f4bc72b2efb018","/3/32/Unit-Veritas_of_the_Waters-6.png?version=a67ccca778195d4b438c6c20e346a14e"},4),
	OK("Onion Knight",new String[]{"/0/0f/Unit-Onion_Knight-5.png?version=92d2ad16d8dcdc0f1c9b10954b15ea4b","/6/62/Unit-Onion_Knight-6.png?version=08e7ed660eb10d4799c915e68619df0f",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/9/93/Unit-Onion_Knight-7.png?version=11c2ac79f0b605b52be7e5ee44f591c2"});
		}
	},
	Desch("Desch",new String[]{"/5/5e/Unit-Desch-4.png?version=ca04885d2cf6443fe9d8c506c8b8226d","/1/18/Unit-Desch-5.png?version=0cf714cc19f33687f0804278dbc63a49","/5/5c/Unit-Desch-6.png?version=37e46b6a62c63ca4624f17492b3a8c2c"},4),
	Aria("Aria",new String[]{"/f/f2/Unit-Aria-4.png?version=d62e3ef1ceccdbad0f3ae4b0a36dcf83","/b/b4/Unit-Aria-5.png?version=54ebd4199e31043f364f15275d0d023c","/4/4b/Unit-Aria-6.png?version=86001e84ea0c48563ef86d5a7d980e47"},4),
	Sara("Sara",new String[]{"/8/82/Unit-Sara-3.png?version=99ca5d6674b69ad07cb18e26fabb1240","/8/80/Unit-Sara-4.png?version=0e08f2269873cfb27764934efb36bd91","/8/85/Unit-Sara-5.png?version=6e2512bb1a6d20ba3024cdb676d25112"},3),
	Prishe("Prishe",new String[]{"/2/2b/Unit-Prishe-5.png?version=a937d3cae1940dcfd08bdc5fec2c06d5","/a/a2/Unit-Prishe-6.png?version=a81757cc36945fdf33485076dd0c8466",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/8/81/Unit-Prishe-7.png?version=3dc403f1e961f76cd5c45dcf25ca86b2"});
		}
	},
	Werei("Werei",new String[]{"/6/6e/Unit-Werei-4.png?version=4073ca88512f21f076bb69a3660a94b2","/9/99/Unit-Werei-5.png?version=e766362f25c3bffc1b117c4397cb4591","/8/87/Unit-Werei-6.png?version=e0d7164c990dc86bdd91182d41f5cce1"},4),
	Kupipi("Kupipi",new String[]{"/6/6b/Unit-Kupipi-3.png?version=7c30899671b26b36ed3d412e44e1cc3c","/5/56/Unit-Kupipi-4.png?version=939a06b6c273fafb0314bf33a42fbdd2","/9/9f/Unit-Kupipi-5.png?version=7ee5a75922e954fcde11cf608e00cd6b",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/7/7c/Unit-Kupipi-6.png?version=e15b1ceef517728c3abc7c51d424e0c0"});
		}
	},
	Ayaka("Ayaka",new String[]{"/4/47/Unit-Ayaka-5.png?version=24b2ab33dc6743beeaa905f29adf5f1f","/f/f1/Unit-Ayaka-6.png?version=80c0ac3151fb5d52fff87c53b4764e19",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/2/29/Unit-Ayaka-7.png?version=d5275453c030e8e624f8221f9ba54866"});
		}
	},
	Goken("Goken",new String[]{"/5/50/Unit-Goken-4.png?version=8d7c082ae78bc8376e511d438d94301f","/e/e1/Unit-Goken-5.png?version=70d9b58f94e0bab1c011907224b503db","/d/da/Unit-Goken-6.png?version=66b4ed9443ce998995cd874968ac5629"},4),
	Silvia("Silvia",new String[]{"/3/37/Unit-Silvia-4.png?version=d5394defd1550959ce1460f56def345b","/3/30/Unit-Silvia-5.png?version=2a412969bb3bfebe5b76c4b060938f8e","/d/df/Unit-Silvia-6.png?version=49862a879ebab98e0d600a7f8cacccf6"},4),
	Kamui("Kamui",new String[]{"/d/d6/Unit-Kamui-3.png?version=0b2b808e8212717d8b706ce0157faf96","/c/cc/Unit-Kamui-4.png?version=00881c522d0091bddb4d88670ee32f49","/6/6f/Unit-Kamui-5.png?version=3bdfc51165f992c2739b9b7e4dc7b839"},3),
	Yuri("Yuri",new String[]{"/2/2b/Unit-Yuri-3.png?version=c792cc40f6045c0fee1ef6d472a2e139","/0/0e/Unit-Yuri-4.png?version=8e616e5356a909efbb22e17183e7d9ec","/4/4e/Unit-Yuri-5.png?version=de25657caa2b6683a8ead61781cc1249",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/1/1f/Unit-Yuri-6.png?version=420053f0283c02a07fee10e219f68347"});
		}
	},
	Nyx("Nyx",new String[]{"/f/f6/Unit-Nyx-5.png?version=3fbfcf46cfbd474206ba9d31b237cad4","/c/c6/Unit-Nyx-6.png?version=adfa04c4422268bdabd7fdbe4ceb0764",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/1/12/Unit-Nyx-7.png?version=864c2575360b3cb4cda5a4ad0c7b8afc"});
		}
	},
	Crowe("Crowe",new String[]{"/0/00/Unit-Crowe-4.png?version=bf48dac62746dfa6fa00cbc562726706","/e/e8/Unit-Crowe-5.png?version=97a6df0e8c431f33ed1cb217a7cf1a2d","/4/44/Unit-Crowe-6.png?version=bfad0dc78725d8f8b43163919394b36c"},4),
	Glauca("Glauca",new String[]{"/7/7e/Unit-Glauca-4.png?version=2ba317024212f0c5d88f39927cb576a0","/c/c5/Unit-Glauca-5.png?version=964be36ea6a210aeb47ea2f051e4fc7a","/6/68/Unit-Glauca-6.png?version=5a1e1d2ff6b7a98e837c03e3a952685a"},4),
	Libertus("Libertus",new String[]{"/9/9e/Unit-Libertus-3.png?version=40265bf8be03e70b1ad37b5c5f944d7f","/e/e0/Unit-Libertus-4.png?version=1e1db55425cbb8a94539570d42b6fefc","/0/0f/Unit-Libertus-5.png?version=6b671813738ca6c9ac119273ede7ac08",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/8/87/Unit-Libertus-6.png?version=d57f29272b396dc7eb5932fe0520c65a"});
		}
	},
	Lorraine("Loren",new String[]{"/9/93/Unit-Loren-5.png?version=3701d0eef7b86c1d646eaad54fc6f3c4","/8/8a/Unit-Loren-6.png?version=195c33ea70d6711fd15cff53cd343f8a"},5),
	Chloe("Chloe",new String[]{"/a/a0/Unit-Chloe-4.png?version=460c81214aef9cfd441c1943f911c090","/c/c0/Unit-Chloe-5.png?version=0274b4e4bb73cb0b3a1151592f35ce91","/4/4e/Unit-Chloe-6.png?version=0b5fb106968f1be407721323ab4a0079"},4),
	Amy("Amy",new String[]{"/e/e3/Unit-Amy-3.png?version=c326a865c14d0f08f506a3bdc05ec530","/7/73/Unit-Amy-4.png?version=6e30a655f7c8c73e67c8352bdf199ed0","/a/a2/Unit-Amy-5.png?version=01c04ee4aa4869829d745fec89254b70"},3),
	Barbariccia("Barbariccia",new String[]{"/b/b6/Unit-Barbariccia-5.png?version=67b20b10f73ef0fc27814b99343f62b4","/7/7a/Unit-Barbariccia-6.png?version=d7bda5ae2de8b4459ee55d97b09506d5",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/b/b8/Unit-Barbariccia-7.png?version=04eb401482904b372d4bcac6969bcd0d"});
		}
	},
	Cagnazzo("Cagnazzo",new String[]{"/e/ef/Unit-Cagnazzo-4.png?version=8d65967cd6375f9934384c6fef826e8b","/4/42/Unit-Cagnazzo-5.png?version=4542730da03c56845e15270c13cd4699","/2/29/Unit-Cagnazzo-6.png?version=32d5d513742c867392f3289fc38c6d4a"},4),
	Rubicante("Rubicante",new String[]{"/3/3f/Unit-Rubicante-4.png?version=f7f5179cbef2d1fdab2a517077784fac","/1/16/Unit-Rubicante-5.png?version=8f752d62bdc768de2836f49f09018cdd","/d/d4/Unit-Rubicante-6.png?version=d137e9c176b214589859d40808e52c90"},4),
	Scarmiglione("Scarmiglione",new String[]{"/1/1a/Unit-Scarmiglione-3.png?version=3be95c2daec707d38c0c0e91373fed26","/1/11/Unit-Scarmiglione-4.png?version=f970159ecbdd3d3c5616fb1cbbc873ab","/5/53/Unit-Scarmiglione-5.png?version=cad1351939c877c215912b2854f4d1fe"},3),
	Gladiolus("Gladiolus",new String[]{"/6/60/Unit-Gladiolus-5.png?version=360de4e0d0089e25b12ea938fb43b85d","/6/67/Unit-Gladiolus-6.png?version=95e9c71c5931736e3cf0b3985184fadf"},5),
	Cor("Cor",new String[]{"/a/ac/Unit-Cor-4.png?version=d8f50b348980e38193567f565cb78b2a","/f/fe/Unit-Cor-5.png?version=76dcbe1de67a7521f66e0927cfa74f4c","/6/6a/Unit-Cor-6.png?version=95b0f9c5d3205c2d3516165b651ca300"},4),
	Iris("Iris",new String[]{"/4/4f/Unit-Iris-3.png?version=e3e4face24c2bb4b1311a8b273978c91","/1/1f/Unit-Iris-4.png?version=2c10013c95381c6c9257bb920ac0ec66","/6/6a/Unit-Iris-5.png?version=1b255f85b407d68dfc7b08d1cdfed916",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/d/d4/Unit-Iris-6.png?version=34535923b783cf9013b8b2fb4a63dd66"});
		}
	},
	Duke("Duke",new String[]{"/f/f5/Unit-Duke-5.png?version=f78ae3e6934154531c88be2a572f2af5","/d/d0/Unit-Duke-6.png?version=e2f94c44c6c134b7acacbbfd0f3737b5"},5),
	Olif("Olif",new String[]{"/6/6d/Unit-Olif-4.png?version=0f8f1c63d100f62f575ea490ab9c66a4","/f/f2/Unit-Olif-5.png?version=a1717019dd0c3dc836d2cd51183a7393","/a/aa/Unit-Olif-6.png?version=ec08785c95d8d48df63d3781f424eab9"},4),
	Mystea("Mystea",new String[]{"/1/1b/Unit-Mystea-4.png?version=f103bc5191253a62b78b57a650beadcf","/f/f8/Unit-Mystea-5.png?version=a90f906aac09e6ec433a3f16e31be853","/2/29/Unit-Mystea-6.png?version=e01e8c16dd056ecbb4ba2b02e8bd94c5"},4),
	Charie("Charie",new String[]{"/b/b8/Unit-Charie-3.png?version=c331e5036c6ac09fe21d80eb59acf5e0","/8/81/Unit-Charie-4.png?version=2d9bd952ac9afce97c3ac90ad429be6f","/0/05/Unit-Charie-5.png?version=d3275ca7c21d08dc559ef4109e1248f9","/6/6a/Unit-Charie-6.png?version=e7dcffdb504ac7f9349e5cce65b172a2"},3),
	Ryunan("Ryunan",new String[]{"/8/8c/Unit-Ryunan-3.png?version=20c5b8fca5afebd4039ea61bffccb6a1","/0/06/Unit-Ryunan-4.png?version=fc96dbd58ca281b66b65351eec5a8977","/3/3a/Unit-Ryunan-5.png?version=3e8491fa3e6f53c08543c5abdeff7f6e"},3),
	Roy("Roy",new String[]{"/0/09/Unit-Roy-5.png?version=d7642b795df8493977f0bd25468d53d1","/a/a0/Unit-Roy-6.png?version=4841930fcdc143e51c3555550b2261fe"},5),
	Aura("Aura",new String[]{"/4/49/Unit-Aura-4.png?version=a1be66c77c2f61cf665912f584264f90","/3/3d/Unit-Aura-5.png?version=708a4cd4eb85bc94fcd52f0e776c627a","/2/25/Unit-Aura-6.png?version=af89167c5f0083ec0b5b5f308002c214"},4),
	Guromu("Guromu",new String[]{"/f/f5/Unit-Guromu-3.png?version=512f0363f28c857b7432e438cf7997bf","/c/cb/Unit-Guromu-4.png?version=58f51e4cc55912a01aa88a73b3bae82e","/b/b9/Unit-Guromu-5.png?version=ea738038390cb0377d86038b6e919053"},3),
	Cloud("Cloud",new String[]{"/8/84/Unit-Cloud-5.png?version=8b93580e2f2516b80249a0d365d08731","/9/96/Unit-Cloud-6.png?version=8cc7e0e1cb21c92e08b9753e30ecd491"},5),
	Elfreeda("Elfreeda",new String[]{"/b/b3/Unit-Elfreeda-5.png?version=c7c03c3a8d18b14679531d56944beec6","/d/d2/Unit-Elfreeda-6.png?version=478266e357ae12144bf6dcf7c3c22590"},5),
	William("William",new String[]{"/1/14/Unit-William-4.png?version=fbecdc24ce09bddf0f38d240c79e8a29","/7/74/Unit-William-5.png?version=348fec1f0340076f04d8803b20bae1db","/3/3a/Unit-William-6.png?version=a0629247d1e739780014002cfef101e2"},4),
	Conrad("Conrad",new String[]{"/b/b9/Unit-Conrad-3.png?version=d7f25d39007227d5aa41ba244b6afe57","/d/d6/Unit-Conrad-4.png?version=a6e2332b977718b989d9f372d54a798d","/d/dd/Unit-Conrad-5.png?version=b0226f35ca0d262b6368e3abd0baeeb4"},3),
	CGLasswell("Pyro Glacial Lasswell",new String[]{"/a/a8/Unit-Pyro_Glacial_Lasswell-5.png?version=089b65188a08d97126c05289da37add5","/4/46/Unit-Pyro_Glacial_Lasswell-6.png?version=7e85a819ebf5f2ad606efbd3b94c98dc"},5),
	Jiraiya("Jiraiya",new String[]{"/3/34/Unit-Jiraiya-5.png?version=26dbaeb4fdb643bdf7c284f1af2c9395","/1/15/Unit-Jiraiya-6.png?version=115fb1c23133ba8ab3f7ab2fa0eedf53"},5),
	Kaede("Kaede",new String[]{"/0/0c/Unit-Kaede-4.png?version=3ccd8947762bbc2898c39a650a1d2f57","/5/52/Unit-Kaede-5.png?version=01edfebaed1f46d7b0065e4c82ec5e24","/e/e4/Unit-Kaede-6.png?version=5b3b96839b5a6526d8740e817bb550ab"},4),
	Ohga("Ohga",new String[]{"/5/54/Unit-Ohga-4.png?version=a668ad4f00a892245db17de05ad3aa77","/b/ba/Unit-Ohga-5.png?version=5eb7cb6ec5f677e743002d1ad8a3bfd1","/4/40/Unit-Ohga-6.png?version=b2085878dda82f11f5842fe0d6e7270a"},4),
	Otogiri("Otogiri",new String[]{"/3/31/Unit-Otogiri-3.png?version=8305550cf8e4f0cfac1e29fed87f37da","/f/f2/Unit-Otogiri-4.png?version=e8023ed816904105110280f1d7d19042","/6/6b/Unit-Otogiri-5.png?version=057fa91c96fa559abb8bcd8eec97d9a0"},3),
	Basch("Basch",new String[]{"/e/ea/Unit-Basch-5.png?version=190f04aff0908ff84993d2c4106d77b1","/e/e6/Unit-Basch-6.png?version=17b1d885272fbf810f097bad0d0602db"},5),
	Balthier("Balthier",new String[]{"/7/75/Unit-Balthier-5.png?version=d279d0a59961eea0a07bd63268d462d2","/2/2b/Unit-Balthier-6.png?version=cb5f9f0534f49d48d09775e9888f8705"},5),
	Vayne("Vayne",new String[]{"/1/13/Unit-Vayne-4.png?version=984e076ae97aff63b30e3ecd69216308","/7/78/Unit-Vayne-5.png?version=adcf2a9a9f145d81f107cdef2c50f122","/e/ef/Unit-Vayne-6.png?version=15c4e69f070a29a78b18c0d2f96af596"},4),
	Drace("Drace",new String[]{"/3/38/Unit-Drace-4.png?version=685850337766cb17a58f0685cf66fcfe","/6/6c/Unit-Drace-5.png?version=6d05e2907c82dfbcada7969effc76a11","/d/da/Unit-Drace-6.png?version=3eddfbb71e3005c46ede160375075eec"},4),
	Larsa("Larsa",new String[]{"/d/d7/Unit-Larsa-3.png?version=91317acb8996b2d0ff2e8b52b1a5afeb","/6/64/Unit-Larsa-4.png?version=6006d65987ec6f80555562c91d2e7d7e","/f/f5/Unit-Larsa-5.png?version=4dd6fafd67d26d3c7792c04102dbb3a1"},3),
	CGSakura("Blossom Sage Sakura",new String[]{"/c/c7/Unit-Blossom_Sage_Sakura-5.png?version=8fab3f7085f50246b5be491887a2c75c","/2/27/Unit-Blossom_Sage_Sakura-6.png?version=ca74c800dbdb0050e2c42f247cdbb557"},5),
	Verun("Verun",new String[]{"/a/a3/Unit-Verun-4.png?version=45babbe14bd7ba3a236d576e7b310750","/4/44/Unit-Verun-5.png?version=6ef061f71f3ef386b730e3146b38e125","/b/b9/Unit-Verun-6.png?version=91cc21d27b19886cce62735771996b2c"},4),
	Cedona("Cedona",new String[]{"/c/c3/Unit-Cedona-4.png?version=7b960ebe4f9680203e625a700a9293e7","/d/d7/Unit-Cedona-5.png?version=d8f2b804adcbb1febdd0d05c487a28ad","/b/b9/Unit-Cedona-6.png?version=ce8ef55d707f6d6880c56465ea327ded"},4),
	Aranea("Aranea",new String[]{"/f/f8/Unit-Aranea-5.png?version=d9f5c9ea69d0a6574280e5271f485356","/c/ce/Unit-Aranea-6.png?version=57409387e992e78275fb7668132d1569"},5),
	Prompto("Prompto",new String[]{"/2/20/Unit-Prompto-5.png?version=49909a877a8f301c841e3e81924f5431","/1/1e/Unit-Prompto-6.png?version=1a9d8a096d5c4c02a3ae3569d968791a"},5),
	Beatrix("Beatrix",new String[]{"/f/f4/Unit-Beatrix-5.png?version=06bc311da6b35c7bf61ecbe35c16fa96","/a/ac/Unit-Beatrix-6.png?version=918b2c18cda7538bc08afceb6385262b",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/4/4d/Unit-Beatrix-7.png?version=8822352df36da61885ef340c5232d01f"});
		}
	},
	Eiko("Eiko",new String[]{"/0/0a/Unit-Eiko-5.png?version=4f7ce1abe5b52150aa001ba277a620f9","/e/ec/Unit-Eiko-6.png?version=4c585f07c446ae9d0c0d97dfa6825240",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/f/f9/Unit-Eiko-7.png?version=a08a1580ba47c77d669cb538ff55baf8"});
		}
	},
	Steiner("Steiner",new String[]{"/a/a8/Unit-Steiner-4.png?version=0f4e44ad35e2ae3158e2cb455f4b13d4","/5/58/Unit-Steiner-5.png?version=dafad977cea228187bf221b163323e6b","/e/ee/Unit-Steiner-6.png?version=11d230ab78dd7bfe18bfcf5c8b7692a8"},4),
	BW3("Black Waltz 3",new String[]{"/6/6e/Unit-Black_Waltz_3-3.png?version=90fe6192db8cd90ecf4dee008ff98156","/3/31/Unit-Black_Waltz_3-4.png?version=842d9bbfec7a50eca5f1129d8a219f12","/7/70/Unit-Black_Waltz_3-5.png?version=96a07b1257977b1362da654a5d1bfce6"},3),
	CGFina("Lotus Mage Fina",new String[]{"/e/e8/Unit-Lotus_Mage_Fina-5.png?version=7fc2b6d51be1a937176ac47bd2cf6816","/e/e2/Unit-Lotus_Mage_Fina-6.png?version=3e286664455a248f15678ca9a893171e"},5),
	Kunshira("Kunshira",new String[]{"/e/e1/Unit-Kunshira-5.png?version=0af423eaac704605bae20707c33de49d","/3/3a/Unit-Kunshira-6.png?version=7c21408b6d4691204c27cc71ce1340e0"},5),
	Wadow("Wadow",new String[]{"/3/32/Unit-Wadow-4.png?version=9efeab238954a0ba8c61f64a8053fb35","/e/ef/Unit-Wadow-5.png?version=751751cec7914080611436261ef686ed","/4/4b/Unit-Wadow-6.png?version=b04a534e0f3f7c5bdb03723bb7270acc"},4),
	Erwin("Erwin",new String[]{"/2/2f/Unit-Erwin-3.png?version=6e914817c6271d2dd561d4f9dc04450d","/5/52/Unit-Erwin-4.png?version=7e4e0407f31392a2bab952e7c6089e07","/c/cc/Unit-Erwin-5.png?version=21fad6d5bdebbbfe4c11108ec1af1f1d"},3),
	Yuna("Yuna",new String[]{"/2/27/Unit-Yuna-5.png?version=03dc35a4f72ab97bd155cc3aaf5934b7","/d/d3/Unit-Yuna-6.png?version=4e3258de6090142ae95e720d1ab8eaf8"},5),
	Lulu("Lulu",new String[]{"/c/c4/Unit-Lulu-5.png?version=4bd9566cc8afba4203d2d7dc427904d8","/3/32/Unit-Lulu-6.png?version=e519a3f2ac3e1f2bfc9917becfa9f269"},5),
	Seymour("Seymour",new String[]{"/6/65/Unit-Seymour-4.png?version=dde800cbd6f9fde81889bffe37b5b507","/4/44/Unit-Seymour-5.png?version=ef3150f39e449ab01ba8cbefbd7332da","/a/a6/Unit-Seymour-6.png?version=ba19ef7ec837a3485813dca720347dda"},4),
	CGJake("Nameless Gunner Jake",new String[]{"/9/94/Unit-Nameless_Gunner_Jake-5.png?version=a852b29f4e3a8e552e3f9c027685b66f","/2/20/Unit-Nameless_Gunner_Jake-6.png?version=41f67f1faf761f71c173da428e32c4dd"},5),
	EShera("Emperor Shera",new String[]{"/d/de/Unit-Emperor_Shera-5.png?version=dcc718272a16be37474b481acb05f7f3","/0/09/Unit-Emperor_Shera-6.png?version=bce2ea71ed078e8b7b80d8691d29bddf"},5),
	Ozetta("Ozetta",new String[]{"/1/1e/Unit-Ozetta-4.png?version=e3cdc7434a23b7e3950ddf7d00ff183a","/6/69/Unit-Ozetta-5.png?version=aaa2eb59c33bb2220bf1333ac7a3a04f","/f/f9/Unit-Ozetta-6.png?version=8a82df3daf90189eb5adeb03b0cd3c88"},4),
	Riley("Riley",new String[]{"/a/ae/Unit-Riley-3.png?version=dbafc81073ca8c63ba1cd8bb90d5323f","/5/55/Unit-Riley-4.png?version=c934a3ed86c5185c3e7779aa11c1de6b","/9/91/Unit-Riley-5.png?version=91b156253db2ea804ad58833f7059b20"},3),
	Sephiroth("Sephiroth",new String[]{"/a/a8/Unit-Sephiroth-5.png?version=305aaf8c032ed0401c54d1e1e46c3453","/1/17/Unit-Sephiroth-6.png?version=c7bc677f0390279b77b36538101cae90"},5),
	Lila("Lila",new String[]{"/2/24/Unit-Lila-5.png?version=be61a44181eb6057a619c46d7a9d1d10","/3/36/Unit-Lila-6.png?version=51e62445c7ab729d25401b90f5adb6e3"},5),
	Shylt("Shylt",new String[]{"/8/84/Unit-Shylt-4.png?version=84f4387e0db47bb6d703251e4c2a7fca","/6/6a/Unit-Shylt-5.png?version=042547834110d12bbab8c1144beae1ab","/5/59/Unit-Shylt-6.png?version=2750917c9fbf63c68ded249c4d19ccd0"},4),
	Mim("Mim",new String[]{"/5/51/Unit-Mim-3.png?version=4f1a4af1d00434f149aa7c682406fa29","/c/c7/Unit-Mim-4.png?version=53969747f53c505f5331e45c05991abf","/9/96/Unit-Mim-5.png?version=2f1658dbea92814db5863eebe4ee33e4"},3),
	CGLid("Heavenly Technician Lid",new String[]{"/f/fa/Unit-Heavenly_Technician_Lid-5.png?version=bc813fab82c60bbc204707e720b16323","/0/0a/Unit-Heavenly_Technician_Lid-6.png?version=f0242eb79f0db3347cde1fff273384d3"},5),
	Killian("Killian",new String[]{"/2/2d/Unit-Killian-4.png?version=938232d16cf76774a192626c914b87b6","/f/f3/Unit-Killian-5.png?version=1e11c187fa57b590ca8d962d6aa24bc4","/0/08/Unit-Killian-6.png?version=e60f4e0dc2dcc5ee9177fd826d1f0fdf"},4),
	KRydia("Pure Summoner Rydia",new String[]{"/e/e0/Unit-Pure_Summoner_Rydia-5.png?version=8fb7c285b9999bec48f58e6d621f2f8f","/3/3a/Unit-Pure_Summoner_Rydia-6.png?version=5d808dc60bffcc691616289dea3be6c7"},5),
	HKain("Atoning Dragoon Kain",new String[]{"/0/0d/Unit-Atoning_Dragoon_Kain-5.png?version=8ff78447e609c10a9366d9abe3721846","/0/08/Unit-Atoning_Dragoon_Kain-6.png?version=ce3b741d3b9296d37a6368ea70b6d59b"},5),
	Yang("Yang",new String[]{"/7/73/Unit-Yang-4.png?version=857260b833de7cd3c7da98103c8c5a05","/f/f3/Unit-Yang-5.png?version=69288e6463bd904a114cf123c1f14e77","/7/7e/Unit-Yang-6.png?version=8788342be6116208cd39788ce7b7628f"},4),
	Edward("Edward",new String[]{"/e/ed/Unit-Edward-3.png?version=83e27e2b93b9e4b2a34c1dc5a56d7e65","/d/d4/Unit-Edward-4.png?version=5a3b621e4127dca09eb671ba0f22181d","/7/76/Unit-Edward-5.png?version=69f19047f5e0bf8e54140cad4fff9253"},3),
	CGNichol("Maritime Strategist Nichol",new String[]{"/6/65/Unit-Maritime_Strategist_Nichol-5.png?version=0a22a6266a8ba85a8c101c14be2e5742","/8/89/Unit-Maritime_Strategist_Nichol-6.png?version=357b2bd09a1fdb3d1a0033a8da8bf095"},5),
	Lexa("Lexa",new String[]{"/e/e8/Unit-Lexa-4.png?version=0fd0833348e203690364e84e5f0294b2","/2/25/Unit-Lexa-5.png?version=3f5c1db104939f28bfc3f5189eab0cfa","/4/42/Unit-Lexa-6.png?version=dfad200865c016735174176d824310c6"},4),
	Elbis("Elbis",new String[]{"/f/fa/Unit-Elbis-4.png?version=c6ce6311e089734c05f0e77d109850c4","/2/2a/Unit-Elbis-5.png?version=6cf2b4868fb2e696fecb7485f606019f","/0/0f/Unit-Elbis-6.png?version=06f820a0e0269a6ca0a55c87feeb03a9"},4),
	Merald("Merald",new String[]{"/7/7a/Unit-Merald-3.png?version=accd16d3b60328cb9d434f843d968374","/1/1c/Unit-Merald-4.png?version=8ff1bb6eac19cdf121a1e0693a85c183","/f/f3/Unit-Merald-5.png?version=8b4022cd3677787001b5167250681d1d"},3),
	CGRaegen("Raegen",new String[]{"/f/f0/Unit-Raegen-5.png?version=157cea9f3459cf1a21f48eb82325a6c1","/b/bc/Unit-Raegen-6.png?version=2c6baeea7662e1d78784552f487816c3"},5),
	Ryumynui("Ryumynui",new String[]{"/c/cd/Unit-Ryumynui-4.png?version=edae6ed4bbae387f2718c850ec935d07","/b/bb/Unit-Ryumynui-5.png?version=a69ebe3ae6b1970257cc3c9beb0d3208","/f/ff/Unit-Ryumynui-6.png?version=a4a64f9d7ac3e1c186e6b186486826c4"},4),
	Zile("Zile",new String[]{"/8/82/Unit-Zile-4.png?version=5632f904a2c7597d3f1f87bfbe5ca11a","/d/df/Unit-Zile-5.png?version=135789826b8d8cebd562b8e969fb14f5","/8/82/Unit-Zile-6.png?version=4720d5d74c852b1689a50eb5b616eda6"},4),
	Lucille("Lucille",new String[]{"/9/9c/Unit-Lucille-3.png?version=2bdb6c3a62ad20a0b18ed338a5c9c594","/1/10/Unit-Lucille-4.png?version=cbfcb541007727c306a11b994b427d8b","/d/db/Unit-Lucille-5.png?version=544c20cf94f74eca18559a0391f268f0"},3),
	ARain("Awakened Rain",new String[]{"/5/58/Unit-Awakened_Rain-5.png?version=9be4e2ce9594c8588709be63721e5902","/2/2a/Unit-Awakened_Rain-6.png?version=05ae4b576682d2195a5fec6c559d204c",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/7/78/Unit-Awakened_Rain-7.png?version=d4d18bf90b59711b52bed5cc9ee6bcb3"});
		}
	},
	Mediena("Mediena",new String[]{"/8/8c/Unit-Mediena-5.png?version=72f71ca64e45dcc75302ff7facc1b55d","/8/8c/Unit-Mediena-6.png?version=984dee854a25e3e12b4f3be52c3ec696"},5),
	Squall("Squall",new String[]{"/c/c1/Unit-Squall-5.png?version=a710cbfbcff97c3ce220e836ba7e4c3a","/2/29/Unit-Squall-6.png?version=c35f855fb8280329d6387e6ac830038f","/a/a7/Unit-Squall-7.png?version=ba6a1d2ee896f7831796e0dbffc66542"},5),
	Rinoa("Rinoa",new String[]{"/8/8e/Unit-Rinoa-5.png?version=025e3ab818a4c2f10fa53f230c7cbffb","/4/4b/Unit-Rinoa-6.png?version=57a0d0c378c296a3014a2fe4b2043c81","/5/53/Unit-Rinoa-7.png?version=73e15d21e5b69cb9d1923620d4364e01"},5),
	Zell("Zell",new String[]{"/c/cc/Unit-Zell-4.png?version=a118a284ef42db2c2b13f1abbf1f300e","/4/4d/Unit-Zell-5.png?version=7aad15a0a6cacaa6abd4c179fe23de4e","/a/a3/Unit-Zell-6.png?version=44d7309391ef73dc89f97f20a39ccdfb"},4),
	Ramira("Ramira",new String[]{"/1/16/Unit-Ramira-3.png?version=a0614f0c18eeb590fdbc174b8d0c9cd2","/9/9e/Unit-Ramira-4.png?version=3768e667484d0890883452f30b005e27","/c/ca/Unit-Ramira-5.png?version=8ed83f7e726de38867c83747ecac7c2b"},3),
	Nalu("Nalu",new String[]{"/a/a9/Unit-Nalu-5.png?version=41e744ab8216b09eb18ccd795de1d5fc","/d/df/Unit-Nalu-6.png?version=ed1c6ed4df38a79346d72a23e520dad7","/6/65/Unit-Nalu-7.png?version=1c9334ceada7020cc3f0a6bf01f4d7ba"},5),
	Pecciotta("Pecciotta",new String[]{"/4/4b/Unit-Pecciotta-4.png?version=0bded4f775497f452da6d99a7eaedab2","/b/b0/Unit-Pecciotta-5.png?version=7e9ea931fa485719a0b651137c694326","/8/8b/Unit-Pecciotta-6.png?version=ea08a36f03a8a7a6a948cd7ce8e55eba"},4),
	Shinju("Shinju",new String[]{"/4/47/Unit-Shinju-4.png?version=9a48e73a09ccaddf52f9c7e8ca0116ce","/4/4a/Unit-Shinju-5.png?version=d9b167423edc99126a1a002b35804a8d","/d/dc/Unit-Shinju-6.png?version=803ab04789bb555bb430b7773751e2a5"},4),
	Ryuka("Ryuka",new String[]{"/4/44/Unit-Ryuka-3.png?version=ad5a81a6ace32816c8b39eea96b638db","/3/31/Unit-Ryuka-4.png?version=87c4c6f7f552b7c2467fba8a0fb2fa48","/c/c6/Unit-Ryuka-5.png?version=c3875d153b52d146f144040f205d5c9c"},3),
	RageShantotto("Livid Shantotto",new String[]{"/3/32/Unit-Livid_Shantotto-5.png?version=aa33a9fd9a389ef8052a98451d4a9833","/a/a3/Unit-Livid_Shantotto-6.png?version=8a88b6c3baa6d9ba2f8336389b34086a","/e/e4/Unit-Livid_Shantotto-7.png?version=3aa2f7dd700ba6d9594b5e0100091e27"},5),
	ShadowLord("Shadow Lord",new String[]{"/1/1e/Unit-Shadow_Lord-5.png?version=094e1e1c22355aa904f9882dc3ee4216","/5/5c/Unit-Shadow_Lord-6.png?version=a15703cb90c9ea7db672ae3784341897","/f/f2/Unit-Shadow_Lord-7.png?version=639fc4505c63611e5aaa05b554ee1f5f"},5),
	Joachim("Joachim",new String[]{"/a/ab/Unit-Joachim-4.png?version=69f6210578b754459105c6e1c32659c7","/0/0c/Unit-Joachim-5.png?version=b5eb9b871e7a1f7ffafac7296e4a6d7f","/a/a6/Unit-Joachim-6.png?version=404525e9c3a6f82239a72834761ac3cc"},4),
	Hyoh("Hyoh",new String[]{"/6/67/Unit-Hyoh-5.png?version=60fc33e6585b1d207b50febe4b8f1b22","/b/b9/Unit-Hyoh-6.png?version=2b80d4c1cb0ff3dc7c7a91613a37d08f","/5/59/Unit-Hyoh-7.png?version=f19e5c2ffcfd85654796ce59158019b5"},5),
	Shatal("Shatal",new String[]{"/0/06/Unit-Shatal-4.png?version=17dd48fe8d1b64754903d105f92d8b6d","/8/8b/Unit-Shatal-5.png?version=3bbe4fbd2793690a091fbe76c0f3a2a3","/b/ba/Unit-Shatal-6.png?version=9ab794c47cd0fe7a4f6e81bbe1ea3cae"},4),
	Domino("Domino",new String[]{"/9/92/Unit-Domino-3.png?version=9f30c6a2fcf800421dacc576831a05a2","/1/1d/Unit-Domino-4.png?version=80fdd6fd73a71f8c8a4e3f70af4473de","/6/6e/Unit-Domino-5.png?version=5d4b1402aaa9c2ef87b5a3505bcd34da"},3),
	AlohaLasswell("Aloha Lasswell",new String[]{"/5/59/Unit-Aloha_Lasswell-5.png?version=3e5739a43cc41362063bcd07392ddc98","/6/66/Unit-Aloha_Lasswell-6.png?version=29ff0a93c1e33280bccc7e19d45371e3","/2/24/Unit-Aloha_Lasswell-7.png?version=d650edddcfefd3cd8392ee247797aec1"},5),
	SeaNichol("Seaside Nichol",new String[]{"/1/17/Unit-Seaside_Nichol-5.png?version=8064fe27f07347420e707365cb570e4c","/7/78/Unit-Seaside_Nichol-6.png?version=148f8256dd5afa454bf39b522f1d38a5","/6/6a/Unit-Seaside_Nichol-7.png?version=9844956128702cfb4aaa2f447e3ad40e"},5),
	SummerLuka("Summertime Luka",new String[]{"/d/d9/Unit-Summertime_Luka-4.png?version=c24f310bee58f0ebb073e3d312aa81fb","/d/d9/Unit-Summertime_Luka-5.png?version=5cdd240258914f278bb3508d74450462","/0/06/Unit-Summertime_Luka-6.png?version=37cc36135a3a5d762ed9e48ce03c51bf"},4),
	TideSkaha("Tide Rider Skaha",new String[]{"/f/fb/Unit-Tide_Rider_Skaha-3.png?version=0717e1e4c3f0caeec77a1567300d5f9f","/4/41/Unit-Tide_Rider_Skaha-4.png?version=8482e4fac24f1bd69107688879293eca","/7/78/Unit-Tide_Rider_Skaha-5.png?version=f52ea33662ad37932cdaee8b1da31a0f"},3),
	Malphasie("Malphasie",new String[]{"/3/3b/Unit-Malphasie-5.png?version=7987639bb479505f2ca1c4853c3ed002","/7/7b/Unit-Malphasie-6.png?version=f4c9adde0279f4be1616d6df89963984","/b/bd/Unit-Malphasie-7.png?version=0cc9e7be8879e9f5acac0e4b874c87f6"},5),
	Circe("Circe",new String[]{"/c/ce/Unit-Circe-5.png?version=fd80b0cd90e5d2f8e9a05e7a4d78d925","/c/c8/Unit-Circe-6.png?version=05c5e4ea9b165d503422afe0ec3b6a83","/2/21/Unit-Circe-7.png?version=33daca89a870ec885a1e65c230e75035"},5),
	Ignis("Ignis",new String[]{"/a/a5/Unit-Ignis-5.png?version=da3d1137be7e8e054a28a6f3918b614c","/8/8a/Unit-Ignis-6.png?version=d2bb93e04f27a0ce1ed516cf41fd943e","/d/da/Unit-Ignis-7.png?version=e5953e71f408f6deff0f03362b511eb2"},5),
	Ravus("Ravus",new String[]{"/f/fe/Unit-Ravus-4.png?version=6eb890bfda2c36d1192ec2b691e484b5","/2/2e/Unit-Ravus-5.png?version=b3813957f1fa2c1001461d0c6590aea6","/3/37/Unit-Ravus-6.png?version=9bb6fe9777aafcd00cb4c1696960343f"},4),
	Citra("Citra",new String[]{"/8/8c/Unit-Citra-5.png?version=7649336fa33a38793d89460a5b690b52","/a/a8/Unit-Citra-6.png?version=7945c2c3183a7999cd6ec1b22fa0c1c1","/d/d9/Unit-Citra-7.png?version=b64b0a4ad6b29af44b0690d4485ff5fd"},5),
	Macmedi("Macmedi",new String[]{"/c/ca/Unit-Macmedi-4.png?version=a844912625f0dcdb1e3f50cff5d453a4","/a/a9/Unit-Macmedi-5.png?version=4573b02ae08b6d56d4c1d923c28baa86","/7/78/Unit-Macmedi-6.png?version=a9330039a20c572f07be4f3a1d10dca1"},4),
	Lotti("Lotti",new String[]{"/c/ce/Unit-Lotti-3.png?version=bbc14fa5eca193b2914523771eed44fc","/0/02/Unit-Lotti-4.png?version=08b20b3f677afac4a9f2c980b96d5830","/c/c4/Unit-Lotti-5.png?version=f96e1d09761170373df66b2d4de6a83d"},3),
	Machina("Machina",new String[]{"/0/02/Unit-Machina-5.png?version=873bcc8782c9c1e2d87f3b3be9bd123f","/5/5d/Unit-Machina-6.png?version=09420768dec5fed5d63cdaff4d35a947","/4/4f/Unit-Machina-7.png?version=7cf1ffc2e4304c2473a00ebed9f5ae0b"},5),
	Kurasame("Kurasame",new String[]{"/d/d8/Unit-Kurasame-5.png?version=130116a55e5c8875ab9cc725fbbc00f4","/0/07/Unit-Kurasame-6.png?version=ef5158b4b16d2f979468e1c660d6f6f4","/6/60/Unit-Kurasame-7.png?version=e4027b241026ddb440063fc0e0154f3e"},5),
	Deuce("Deuce",new String[]{"/d/d5/Unit-Deuce-4.png?version=ef4020e37fb2f592e72b0c8699248f48","/3/34/Unit-Deuce-5.png?version=74458fcc859dfe4991e3289cbf380645","/c/cf/Unit-Deuce-6.png?version=f2d63b34bfb4c365b56338f8fd5eb3e7"},4),
	Cater("Cater",new String[]{"/b/b6/Unit-Cater-3.png?version=89b6b695c385113b1e7b063717dc088c","/f/ff/Unit-Cater-4.png?version=13f777b6ad71c6080cc8cd6190f4186a","/b/b5/Unit-Cater-5.png?version=32b7c53be0e3c73b3a87b3ce092d884b"},3),
	Elephim("Elephim",new String[]{"/e/e6/Unit-Elephim-5.png?version=83185e54a81fd852adeb49b3cfb93214","/8/87/Unit-Elephim-6.png?version=8882d02c66c84e3720394b5ec4bc5bd1","/e/ee/Unit-Elephim-7.png?version=b3e084480549e83757afefa5f00ba037"},5),
	Leopold("Leopold",new String[]{"/9/9e/Unit-Leopold-4.png?version=c72cbf7ae2335c00ce423d901204820b","/0/06/Unit-Leopold-5.png?version=cafc60c164eb718d681eaee9bfb1ef2a","/e/e4/Unit-Leopold-6.png?version=d2303e82af184467eb276a5c2707b51b"},4),
	Magna("Magna",new String[]{"/5/55/Unit-Magna-4.png?version=098baf356a8c49cee82536992d7ec097","/c/ca/Unit-Magna-5.png?version=f0dcd0564792b4ab7f00a0c00f4e8b0d","/b/be/Unit-Magna-6.png?version=4e083ff3dc4e59e23c56e92396566509"},4),
	Forelsket("Forelsket",new String[]{"/f/f4/Unit-Forelsket-3.png?version=1f7fe8757e4c97e84dcaaebaad1ec298","/a/ac/Unit-Forelsket-4.png?version=55c8cd0ca68dc9e0193708082a350006","/e/e8/Unit-Forelsket-5.png?version=111f926a193f299a1525a7edc3a13891"},3),
	Beryl("Beryl",new String[]{"/7/77/Unit-Beryl-5.png?version=9ab722f1be021af9239a314319cf1f6e","/b/b5/Unit-Beryl-6.png?version=6ac33464dda697ba1272a167f2debe90","/e/ef/Unit-Beryl-7.png?version=965c7223cc076b9f8331422a76736895"},5),
	Ellesperis("Ellesperis",new String[]{"/7/70/Unit-Ellesperis-5.png?version=24bdeb7f03fca6bf0219a1466f75759e","/d/df/Unit-Ellesperis-6.png?version=e32f41a72ad184ef691dfea411e27c54","/9/96/Unit-Ellesperis-7.png?version=a93482ed7d0d666d9b252f610597a67e"},5),
	Sieghart("Sieghard",new String[]{"/c/c7/Unit-Sieghard-5.png?version=167cacbda6a819219505d91c6c60deec","/e/ee/Unit-Sieghard-6.png?version=402f1fd0f115772d7f84ca688c7386c2","/3/34/Unit-Sieghard-7.png?version=291ff8788c66f061d7b40bc81e2a2966"},5),
	Dietlinde("Dietlinde",new String[]{"/b/be/Unit-Dietlinde-4.png?version=37821c68bdf0b332725c6d963dcccd07","/b/bf/Unit-Dietlinde-5.png?version=ab7e674ea0ce8e2c69d220e461830cbb","/5/58/Unit-Dietlinde-6.png?version=a8a34289d439fc1ce862d944168395f1"},4),
	Theobald("Theobald",new String[]{"/0/0b/Unit-Theobald-4.png?version=d6fcbb77ca94b3944bd6dec9a32d0b6f","/7/75/Unit-Theobald-5.png?version=e714e8899bfd96879aeb10d04d89547a","/9/98/Unit-Theobald-6.png?version=7a025b7b8177ed1c38fb0c190f71d5fc"},4),
	Cannon("Cannon",new String[]{"/7/7c/Unit-Cannon-3.png?version=1d1f5fdcdedcde76bee91016f593fd91","/5/54/Unit-Cannon-4.png?version=c6a06839e23824f5bd926678fd1085ee","/b/b1/Unit-Cannon-5.png?version=f0633bf0c179ccad6d054494700186cb"},3),
	Tifa("Tifa",new String[]{"/0/0f/Unit-Tifa-5.png?version=b9706c7d53c8c9b47ea843b1d039c787","/d/d3/Unit-Tifa-6.png?version=6c86d6a990b031871d15db7cb9b5b8e4","/b/bf/Unit-Tifa-7.png?version=c75df904b6799447f39cef87fa1a7789"},5),
	Vincent("Vincent",new String[]{"/f/f2/Unit-Vincent-5.png?version=0fcf6c3aa1bc1eb9eb9e919994ee2248","/a/af/Unit-Vincent-6.png?version=11f29be01a68a8ea9943ad6d6046850b","/7/77/Unit-Vincent-7.png?version=4957c3063b632ec05ca84153c42c7f1e"},5),
	Barret("Barret",new String[]{"/9/9a/Unit-Barret-4.png?version=e34345fd18345f22c0f28ffd07f00e14","/5/57/Unit-Barret-5.png?version=72a3473a5dd027f4724190314bcec37b","/5/58/Unit-Barret-6.png?version=79528258de1240337f0aff0c81ed6ba4"},4),
	CaitSith("Cait Sith",new String[]{"/c/c3/Unit-Cait_Sith-3.png?version=7634230b831c20424fc9630002dc0c91","/8/82/Unit-Cait_Sith-4.png?version=7af84085d2cad660cde60420d1138a26","/0/04/Unit-Cait_Sith-5.png?version=321caa0333ea7483eb2677b813118a0b"},3),
	Folka("Folka",new String[]{"/4/49/Unit-Folka-5.png?version=28e987550996a41ce4896462da0790fe","/7/72/Unit-Folka-6.png?version=22f8a1d6f09e594832cf581bf8173770","/0/08/Unit-Folka-7.png?version=1d77536c31290158255e03ccc4d69f2e"},5),
	Yubel("Yubel",new String[]{"/6/6e/Unit-Yubel-4.png?version=5b9c77ea7cdc73abbd2357e7b3acb0b9","/9/96/Unit-Yubel-5.png?version=88dca068cc63c968437989fc717a4011","/3/38/Unit-Yubel-6.png?version=06fab050d9227c949e20ea66ab538010"},4),
	Kihana("Kihana",new String[]{"/8/8b/Unit-Kihana-4.png?version=addca15d54f947dbb15a54d040d6fc29","/d/d3/Unit-Kihana-5.png?version=b4ff64c1f227384226d3382511838a93","/c/c5/Unit-Kihana-6.png?version=826db4243547e13a6b6109e4a7b3944f"},4),
	Ichor("Ichor",new String[]{"/d/d3/Unit-Ichor-3.png?version=b7607f8438b7646f20df0ddd15dc481d","/8/8b/Unit-Ichor-4.png?version=2ddf206796e4f0bc960a9d5ed313c612","/a/a3/Unit-Ichor-5.png?version=8559fd0c79f4909e9f54f9330d7ec85b"},3),
	Auron("Auron",new String[]{"/e/e5/Unit-Auron-5.png?version=7c0eb229f9f2e65ee4aebbd85216cf05","/9/94/Unit-Auron-6.png?version=f6f66790bcd24f8a8ac27bbfdbb63d74","/8/8e/Unit-Auron-7.png?version=49fb8663cc01a770c4851cb7dfcf5fb8"},5),
	Jecht("Jecht",new String[]{"/6/6c/Unit-Jecht-5.png?version=27ccc33bb4bf2918920695da0bed2a5b","/7/7e/Unit-Jecht-6.png?version=4fabd3075f7371e36fcd13e86c07f683","/5/53/Unit-Jecht-7.png?version=b15bda0601a4ba211848d0157ff0aee8"},5),
	Belgemine("Belgemine",new String[]{"/4/42/Unit-Belgemine-4.png?version=acc63ca0fe8ad64b5068cb37dbd37172","/1/1a/Unit-Belgemine-5.png?version=528370c0ac1d9f2e7f29e86d79e5a14c","/1/13/Unit-Belgemine-6.png?version=493a88d8af155f12cc9e449fd5e43ca6"},4),
	Brother("Brother",new String[]{"/d/df/Unit-Brother-3.png?version=aa918172c8ae865253d5e460b4293884","/9/95/Unit-Brother-4.png?version=34c242197ae656c0e4b670608a2d9ee0","/e/e2/Unit-Brother-5.png?version=8297efc1ea9e308c68355f360492636b"},3),
	Ignacio("Ignacio",new String[]{"/b/b4/Unit-Ignacio-5.png?version=9453cba14a635e127d336f3fa23f86bc","/6/69/Unit-Ignacio-6.png?version=f9d7c284ceda4c7e3246c746015d65ce","/2/26/Unit-Ignacio-7.png?version=78c6784d152a3549d370ee621cf33309"},5),
	Suzume("Suzume",new String[]{"/7/79/Unit-Suzume-4.png?version=6a99e493ea34c0ddd3560a638608e55f","/d/da/Unit-Suzume-5.png?version=a931cc62123b1024e2537b7efd6ceb7f","/3/38/Unit-Suzume-6.png?version=699421be63cce2675299aa2b658a0255"},4),
	PNK2("PNK-2",new String[]{"/a/a4/Unit-PNK-2-4.png?version=b1357cb2bd9b7ac900b8e59141ffae61","/b/b6/Unit-PNK-2-5.png?version=f647eb82e4deb631351d8a5fb84b9dce","/5/5a/Unit-PNK-2-6.png?version=a19e3a6ba64c9e61f9d3baa01c3b821c"},4),
	Wayhem("Wayhem",new String[]{"/a/a4/Unit-Wayhem-3.png?version=833d679f3da106d9964742169584adf0","/0/0b/Unit-Wayhem-4.png?version=47eb524312718a79d388176657a31d54","/9/96/Unit-Wayhem-5.png?version=1bed063e43e6f27b03ede45589e0e3e7"},3),
	Myra("Myra",new String[]{"/d/d7/Unit-Myra-5.png?version=a7634a3ef1b43b092c91b1a8d69e01fb","/a/a9/Unit-Myra-6.png?version=c5d440d8545e4aee357f7cae72f9eaf7","/6/65/Unit-Myra-7.png?version=f6127828cb5cca6f3d28a9744404a519"},5),
	AFryevia("Aurora Fryevia",new String[]{"/0/0f/Unit-Aurora_Fryevia-5.png?version=c60ddd340885021b8d4cf83f7c57e41d","/b/b7/Unit-Aurora_Fryevia-6.png?version=e29795158c31f976acd69e71c52d123d","/e/ea/Unit-Aurora_Fryevia-7.png?version=4729805f3d71684190f78658e5ffda25"},5),
	OKRefia("Onion Knight Refia",new String[]{"/e/e2/Unit-Onion_Knight_Refia-5.png?version=0765937ef481cc9bc8860f2e89e65b64","/1/17/Unit-Onion_Knight_Refia-6.png?version=42c91b9f9fbe67e51775f1cc950721ec","/9/9a/Unit-Onion_Knight_Refia-7.png?version=f0b848c96e6572087eeff72faa1b70e1"},5),
	DKLuneth("Dark Knight Luneth",new String[]{"/a/ab/Unit-Dark_Knight_Luneth-5.png?version=954fa33a61e9322709fd09ccfe9f1d4c","/2/20/Unit-Dark_Knight_Luneth-6.png?version=9ede4c21c7cc36b91c205e792b0c4d23","/1/1e/Unit-Dark_Knight_Luneth-7.png?version=5c6c1987779c9acf2540cd2138c7fc17"},5),
	Doga("Doga",new String[]{"/3/3c/Unit-Doga-4.png?version=a25aa2f8da7a35bad3cbaeca12286938","/a/a9/Unit-Doga-5.png?version=44cbb955c73b8af8732855af29fc2d72","/4/4d/Unit-Doga-6.png?version=5b44dfbbb046e5581884a8f8d391d206"},4),
	Unei("Unei",new String[]{"/3/3c/Unit-Unei-3.png?version=45f7cf3e40cd2398c8302ec507e42551","/5/50/Unit-Unei-4.png?version=13b45bb15ea86d273062570af73de970","/f/f5/Unit-Unei-5.png?version=fba23d04f072176406576146bd25522e"},3),
	CGCid("Cid",new String[]{"/5/59/Unit-Cid-5.png?version=cb311e423ff656184254adbda586ba54","/f/fe/Unit-Cid-6.png?version=5ad80f30e9f05e64cc651efc30f4fbf2","/2/27/Unit-Cid-7.png?version=1983f104b9177694ea4edeae306c2ede"},5),
	Melete("Melete",new String[]{"/3/31/Unit-Melete-4.png?version=1331f945ff9adb1a8801490e19e9ad0b","/6/63/Unit-Melete-5.png?version=968b3538acb65caac3453513ff641d5e","/2/24/Unit-Melete-6.png?version=dfc5d26e7de6e1970da6ebdf00503f8d"},4),
	Nagflar("Nagflar",new String[]{"/0/0b/Unit-Nagflar-4.png?version=1cf34a52c4f10ae52f87ff63af68ca9f","/a/af/Unit-Nagflar-5.png?version=5528329e32a702124f1337efcc3fcbe8","/f/f5/Unit-Nagflar-6.png?version=62265a5c887f861ef7039d7e6f6fc232"},4),
	Falma("Falma",new String[]{"/3/30/Unit-Falma-3.png?version=4fc2041565007b38ac81daf8468a2c95","/9/9c/Unit-Falma-4.png?version=384517f63387eccae7ed7c7ccf86746d","/3/31/Unit-Falma-5.png?version=1d4764d0f50d5c67de79fd3d96ea3fe3"},3),
	Yuraisha("Yuraisha",new String[]{"/5/5d/Unit-Yuraisha-5.png?version=c60a24cb788c885b687bde44d2156c46","/6/64/Unit-Yuraisha-6.png?version=1b4b97abdba7fbdf1087689063acd7b0","/9/96/Unit-Yuraisha-7.png?version=235a47f7cbaaa19dc1d599212a9cac28"},5),
	Karlette("Karlette",new String[]{"/b/b4/Unit-Karlette-5.png?version=09d0cc318e0b4992ee675f10f84e3e27","/6/6a/Unit-Karlette-6.png?version=0809e4fdb616db7a3bc448890802441b","/1/14/Unit-Karlette-7.png?version=af0c73e713b4aaa6dfbe47dfd14572a6"},5),
	Franis("Franis",new String[]{"/4/4f/Unit-Franis-4.png?version=8c802af139b94cd6ffe7db43a6a857ef","/c/c8/Unit-Franis-5.png?version=82396473775e8ab86737cb6a12564f9f","/a/a1/Unit-Franis-6.png?version=a2a07b8e0ef15d85e6f28c9f4b763cae"},4),
	Ishil("Ishil",new String[]{"/b/b4/Unit-Ishil-3.png?version=b55ecdf961e443fe2845f72b94744784","/f/ff/Unit-Ishil-4.png?version=7225689ecf4e9529c8cd1353b9f688e2","/5/5b/Unit-Ishil-5.png?version=26e8dc8c728444625e355b8463b95d94"},3),
	Ultima("High Seraph Ultima",new String[]{"/6/60/Unit-High_Seraph_Ultima-5.png?version=fbe93caa08788183dfe0286e8dd0c3ba","/e/ef/Unit-High_Seraph_Ultima-6.png?version=1703325149c35566a5f2d56fd75dbed0","/3/3d/Unit-High_Seraph_Ultima-7.png?version=93ac7ac5f1f76bd79a340eac88b54491"},5),
	Beowulf("Beowulf",new String[]{"/d/d6/Unit-Beowulf-5.png?version=6b038121db69a02c510b94b85c2c6acd","/d/d3/Unit-Beowulf-6.png?version=63555ad967bfa501632f797d93a61b06","/b/be/Unit-Beowulf-7.png?version=ab1e8eaeca74b834e62563a3ef23de6b"},5),
	Reis("Reis",new String[]{"/7/7e/Unit-Reis-4.png?version=bc4a5b9d542458bd10d3b96590250c98","/d/d4/Unit-Reis-5.png?version=9b8d6b85d59c30abccb2ce1458e79344","/f/f4/Unit-Reis-6.png?version=6d53540511f3cbae6bdbb3e319ae7a1c"},4),
	Construct8("Construct 8",new String[]{"/c/c9/Unit-Construct_8-3.png?version=3b0e82b99907f55621f46ac7f5796a56","/0/09/Unit-Construct_8-4.png?version=4223f8ca901a5aabbf5c5ef2184c48fa","/d/d9/Unit-Construct_8-5.png?version=7ce68f9242f975a09f327060a3fb4a90"},3),
	Crimson("Crimson",new String[]{"/a/a2/Unit-Crimson-5.png?version=384d8183e308a6213411f914e9b47269","/7/74/Unit-Crimson-6.png?version=1df01418fc5e561956341797f5bf9eb3","/6/63/Unit-Crimson-7.png?version=028547f17a163201e7b16156510848bd"},5),
	Kyanos("Kyanos",new String[]{"/1/18/Unit-Kyanos-4.png?version=f86cfad8737f07f275b154727ae723a5","/a/ae/Unit-Kyanos-5.png?version=acca5f0124f37437d0d3b0db6741eb3b","/0/0f/Unit-Kyanos-6.png?version=f1d3ee45f064d0a4c81ca284704d3c10"},4),
	Mirfas("Mirfas",new String[]{"/c/c2/Unit-Mirfas-3.png?version=ca358537dc83d92f41e358f58a6080e1","/b/b3/Unit-Mirfas-4.png?version=b843c4251bb704601e1a891fcc44b22b","/5/5f/Unit-Mirfas-5.png?version=5789deef15735fa886e6cc109ecbf0b3"},3),
	Esther("Esther",new String[]{"/6/65/Unit-Esther-5.png?version=fa7eaffb497855f4d7f8dad70d42bc8c","/8/82/Unit-Esther-6.png?version=8355711cc7fe46808163c294fbcff3d3","/3/39/Unit-Esther-7.png?version=11785a3a98d669b203a4b387bcdccad1"},5),
	Sylvie("Sylvie",new String[]{"/8/89/Unit-Sylvie-5.png?version=a74be0d3ea58e4bc11d8a48b4d393790","/e/e2/Unit-Sylvie-6.png?version=da13ed77ef063923228fcdcc38fdd78b","/1/15/Unit-Sylvie-7.png?version=9284ba03f17baa91989bbbbf772dabf8"},5),
	BMGolbez("Black Mage Golbez",new String[]{"/9/9c/Unit-Black_Mage_Golbez-5.png?version=6cab278409d61ce40f748d6a9db33322","/2/2c/Unit-Black_Mage_Golbez-6.png?version=b62b164705cbd2844a9a0b3d742c0402","/3/3f/Unit-Black_Mage_Golbez-7.png?version=c9ed366df58baa817df9964e4db86a9d"},5),
	Akstar("Akstar",new String[]{"/2/26/Unit-Akstar-5.png?version=2cff133df029311b3fb741aa0c3b7371","/5/5b/Unit-Akstar-6.png?version=f8c7026abbadc35a2c6992bb112fd42a","/5/58/Unit-Akstar-7.png?version=c19dc02904f20f6a6f8b8e8b730d7481"},5),
	ZenoAkstar("Zeno of the Beta Star",new String[]{"/f/fd/Unit-Zeno_of_the_Beta_Star-5.png?version=7ea0ed11968f655bbf52c7a5def81ef7","/8/82/Unit-Zeno_of_the_Beta_Star-6.png?version=ac3e8543b4cf483c9b25abfe303b848f","/5/55/Unit-Zeno_of_the_Beta_Star-7.png?version=1e8d5dd339994b4a7ac6c396fa31f27b"},5),
	Tomoe("Tomoe",new String[]{"/8/8f/Unit-Tomoe-4.png?version=0154bfa5a837582e799daa0e51cb4950","/6/6f/Unit-Tomoe-5.png?version=26acecd0671f4930bdfef84c5be52ea8","/7/7e/Unit-Tomoe-6.png?version=90fd836f086283f8b386c126d9e8b4ad"},4),
	Gravey("Gravey",new String[]{"/c/cb/Unit-Gravey-4.png?version=d43ff0a76488ed89c0843e098d988f0f","/1/13/Unit-Gravey-5.png?version=55ba41f4053a8d5950d3475af2ab9a8d","/8/81/Unit-Gravey-6.png?version=ca00651be5eaf67ec13929d0a7b58163"},4),
	Majora("Majora",new String[]{"/9/93/Unit-Majora-3.png?version=537f7f0c295d89d69b6d723fd4bf790a","/2/26/Unit-Majora-4.png?version=ac8ebc3044e21a93933cb622b05083a4","/a/af/Unit-Majora-5.png?version=7b68a542045a46a60dfb12f9ae5cd5ef"},3),
	Nagi("Nagi",new String[]{"/3/32/Unit-Nagi-5.png?version=ed5a4b34f4560c3000e45f3466e73c20","/2/25/Unit-Nagi-6.png?version=722e854e70970731d4ca0d6f8b403a44","/7/72/Unit-Nagi-7.png?version=07f57ef013ffa70d1db990a6d56ee1a4"},5),
	Yego("Yego",new String[]{"/0/03/Unit-Yego-5.png?version=f6292e1dc7917accf35e9dd6d8ad7bc9","/6/64/Unit-Yego-6.png?version=eff4e0f0b4fbde3fe82865d4da5bc307","/6/6f/Unit-Yego-7.png?version=c492aee0813b84525a75e0de488e11ee"},5),
	ZoluluDelulu("Zolulu & Delulu",new String[]{"/5/57/Unit-Zolulu_%26_Delulu-4.png?version=b34f357dee2d38413ba9191cdc87ddef","/1/1b/Unit-Zolulu_%26_Delulu-5.png?version=de8f3f9510e2c2656473cd3563b5a5b8","/7/7e/Unit-Zolulu_%26_Delulu-6.png?version=66389c1469eb1863cba6e11fc31891d4"},4),
	Galas("Galas",new String[]{"/8/8a/Unit-Galas-3.png?version=05e23e5fb40d09dc6dcfb0951148bdca","/a/a9/Unit-Galas-4.png?version=0eea84b4b249be288656614f15891506","/e/ee/Unit-Galas-5.png?version=3a597c96a348ca238dc2e6829f2889ac"},3),
	KingEdgar("King Edgar of Figaro",new String[]{"/8/82/Unit-King_Edgar_of_Figaro-5.png?version=de7b08b327d012618fd559d625cd65da","/2/27/Unit-King_Edgar_of_Figaro-6.png?version=b3328893be7b9f1e7747019974706f56","/2/20/Unit-King_Edgar_of_Figaro-7.png?version=0db4282da516ae69048d5788d870dddd"},5),
	FighterSabin("Monk Sabin of Kolts",new String[]{"/5/52/Unit-Monk_Sabin_of_Kolts-5.png?version=196e77810da7e6fd61508d59fe318485","/8/8c/Unit-Monk_Sabin_of_Kolts-6.png?version=9c38ebf9fffedafd6a897e875b7f53e8","/0/0a/Unit-Monk_Sabin_of_Kolts-7.png?version=c6e84a21d52200d975ae2d30a5a81aa6"},5),
	Fid("Summer Fina & Lid",new String[]{"/d/db/Unit-Summer_Fina_%26_Lid-5.png?version=037848ff41d2e498c4daff1c152823da","/0/08/Unit-Summer_Fina_%26_Lid-6.png?version=40fc30d41adbe8e067cbdf459f4400ca","/7/7f/Unit-Summer_Fina_%26_Lid-7.png?version=ef92b24255d848dc5a9da320336a58f5"},5),
	Fitra("Summer Folka & Citra",new String[]{"/e/e5/Unit-Summer_Folka_%26_Citra-5.png?version=ca0bca3ee5f543fe97392ddbce778238","/0/08/Unit-Summer_Folka_%26_Citra-6.png?version=a672c37c8a56d5a3faab163d536a537a","/0/02/Unit-Summer_Folka_%26_Citra-7.png?version=7d46b6d6d28f8eeb7c93b3e7c2fbee57"},5),
	Regina("Regina",new String[]{"/3/38/Unit-Regina-5.png?version=a8baf1aceafe96e82db35c54facc60d1","/0/03/Unit-Regina-6.png?version=72be515cf80f021e551e65f6de82d6f8","/a/a5/Unit-Regina-7.png?version=44da921e2e441bd8430f270253599481"},5),
	Vesvia("Vesvia",new String[]{"/4/4b/Unit-Vesvia-4.png?version=478f12bdfff8035745a3d2cf599e0abb","/3/3a/Unit-Vesvia-5.png?version=7c31d0150e9e150d5c05f232a8102af8","/3/39/Unit-Vesvia-6.png?version=711e26ac50d4af4f15ed81fe530023e1"},4),
	Amber("Amber",new String[]{"/6/6d/Unit-Amber-4.png?version=7bdd47b2bc2ce9e91eaf95a9f131832c","/7/71/Unit-Amber-5.png?version=93f77c5847159f0ced0d832500dad8b7","/d/d9/Unit-Amber-6.png?version=b9b1ce83a69ef7850939e8aab21e7445"},4),
	Krowa("Krowa",new String[]{"/3/38/Unit-Krowa-3.png?version=b3b7642f721c7a1ef0e09bfbb84a0cd4","/c/ce/Unit-Krowa-4.png?version=9bcc2ca68ae979506304ce6bc508b451","/5/51/Unit-Krowa-5.png?version=cbc4cab0a4a9cb7e64cd8ddfaec7c41a"},3),
	Aerith("Aerith",new String[]{"/8/8d/Unit-Aerith-5.png?version=1ba51ea2e84002a08431b738836d9c94","/3/3f/Unit-Aerith-6.png?version=a8678595b080f53b930fd28670f9e9d6","/a/a4/Unit-Aerith-7.png?version=c1d6c9af7704dde3ac5cec6c45124a6d"},5),
	RedXIII("Red XIII",new String[]{"/b/b6/Unit-Red_XIII-5.png?version=fba05be247e4641c553c53f3ca27ac9d","/a/af/Unit-Red_XIII-6.png?version=d7a705b7f6d63dd74c4d7de8d500cbb2","/f/fb/Unit-Red_XIII-7.png?version=195e9ec5f6cb345571caf7ec1bfda9b9"},5),
	KAyaka("Kimono Ayaka",new String[]{"/e/e1/Unit-Kimono_Ayaka-5.png?version=4b63d1e176b959062eaa3b87dd4ce455","/b/b5/Unit-Kimono_Ayaka-6.png?version=fd46b3c621484ee8c3c78523f521d5df","/e/e1/Unit-Kimono_Ayaka-7.png?version=164c56c2d8c05810c9f75203efc8105b"},5),
	DAileen("Dressy Aileen",new String[]{"/e/ea/Unit-Dressy_Aileen-5.png?version=f4a93a46fb9a8d13e6bf16ccd204764e","/9/9f/Unit-Dressy_Aileen-6.png?version=8758aeb3cec6b363e0a1e2029e74dbc1","/2/2e/Unit-Dressy_Aileen-7.png?version=00dd8caa325f17e26e3349915f6d935b"},5),
	SSCharlotte("Sacred Shield Charlotte",new String[]{"/7/78/Unit-Sacred_Shield_Charlotte-5.png?version=fee58b5844304f0738ac2109004a7a8a","/6/63/Unit-Sacred_Shield_Charlotte-6.png?version=ff5d646fea3544e664f058d200455c65","/a/a6/Unit-Sacred_Shield_Charlotte-7.png?version=9c728a7b620bfc5cf0681af3627b2c1e"},5),
	Friese("Friese",new String[]{"/8/8b/Unit-Friese-4.png?version=a2a7a4e03da26def40174e8aafac45c9","/5/58/Unit-Friese-5.png?version=531138aa1c69e9afdde0347ade904f81","/b/b3/Unit-Friese-6.png?version=8120b9000b377248255199b24305f67d"},4),
	Shepard("Shepard",new String[]{"/2/2d/Unit-Shepard-3.png?version=23e6b21f5149f181b4e7e15b2b39102f","/8/84/Unit-Shepard-4.png?version=d7985aa14560d3222bc3aecb9f3bd585","/3/3e/Unit-Shepard-5.png?version=c81c1af4bd77b317653cf496a3b39ef6"},3),
	Zack("Zack",new String[]{"/d/db/Unit-Zack-5.png?version=a255a56421e8330c727cbb1c5f8889e6","/8/85/Unit-Zack-6.png?version=ba7e439fd7f8a0491d5908b7211c04f1","/7/7c/Unit-Zack-7.png?version=35d21910c5f0fa985b00abba1f18839f"},5),
	Yuffie("Yuffie",new String[]{"/f/ff/Unit-Yuffie-5.png?version=7c9ad43dd369bbc438789e63ab29b5d2","/b/b6/Unit-Yuffie-6.png?version=c6f8955e1439c94b20f4c526fe2a195d","/9/90/Unit-Yuffie-7.png?version=67b5742b44e73bd771030223c4f5242d"},5),
	Elena("Elena",new String[]{"/b/b4/Unit-Elena-5.png?version=ea5667f263ff14ad68655d6c5ae22de1","/8/81/Unit-Elena-6.png?version=dfa9e1080d0d6160391cf3356901ff92","/1/15/Unit-Elena-7.png?version=7fe48b8f7700527de2558693c6de0a15"},5),
	Morgana("Morgana",new String[]{"/f/fe/Unit-Morgana-5.png?version=09cc22e09302eaa0d3c2e32db808c6fa","/7/76/Unit-Morgana-6.png?version=f77c76a9279f4386eef3b60a470c00c6","/2/27/Unit-Morgana-7.png?version=bfc7ea69c8791f4e3639fd67d610fc4c"},5),
	Rivera("Rivera",new String[]{"/e/e2/Unit-Rivera-5.png?version=4a9f854a07698f6a387b9a5fb1b6fb00","/7/78/Unit-Rivera-6.png?version=f1bc5c5259283751c6bf4ed4ddc110b0","/2/28/Unit-Rivera-7.png?version=693d185e4a585dad56c25c38743b0cb0"},5),
	CGLightning("Radiant Lightning",new String[]{"/d/de/Unit-Radiant_Lightning-5.png?version=f9ce152249a7b27ae28e8cf4412afb51","/5/5d/Unit-Radiant_Lightning-6.png?version=eac498a7457d47ba9d5bd93334ebfa09","/e/e1/Unit-Radiant_Lightning-7.png?version=ac6295852d4f58d84c044d1412b640b5"},5),
	NeverendingHope("Neverending Hope",new String[]{"/9/9f/Unit-Neverending_Hope-5.png?version=249c890285ef459390ed379c92a0f546","/7/73/Unit-Neverending_Hope-6.png?version=6a0756fbbf778ceffd9a71179ece987f","/4/4f/Unit-Neverending_Hope-7.png?version=c2861e7a46b9543e51cc7ecda365335a"},5),
	Kaito("Kaito", new String[]{"/2/2d/Unit-Kaito-5.png?version=d04216b1cfb8a849966cf44a44489929","/c/c0/Unit-Kaito-6.png?version=7b9266ec265ec44ce3f99bbbde187307","/1/1c/Unit-Kaito-7.png?version=318df4d9c51e68d780fcb980ab097232"},5),
	Tsukiko("Tsukiko", new String[]{"/a/ad/Unit-Tsukiko-5.png?version=6bc643b8a54757d5198efe1c8de9bae2","/9/90/Unit-Tsukiko-6.png?version=f90b86186f1165290c5bd408a1206b01","/b/b0/Unit-Tsukiko-7.png?version=9d406c2413f61f05ea9be1fae4e1883d"},5),
	WoLBartz("Warrior of Light Bartz", new String[]{"/3/3b/Unit-Warrior_of_Light_Bartz-5.png?version=5e7b7201a5853ca527517fa5a3c63196","/9/96/Unit-Warrior_of_Light_Bartz-6.png?version=62bb6d35c6fe28bd2e8d6f196f641900","/b/bf/Unit-Warrior_of_Light_Bartz-7.png?version=0159e4745e31908075dc564f093e4fa5"},5),
	WoLLenna("Warrior of Light Lenna", new String[]{"/d/df/Unit-Warrior_of_Light_Lenna-5.png?version=37cc63592ed45351f824f5bbab33c9dd","/d/db/Unit-Warrior_of_Light_Lenna-6.png?version=67b7a1f81d6a070fb884849a8b691df8","/8/8e/Unit-Warrior_of_Light_Lenna-7.png?version=be09275c16ad938ff95708f2889de8a8"},5),
	Atlie("Atlie", new String[]{"/d/df/Unit-Atlie-4.png?version=ae06fa1672d96fa5afc95b7bfd263382","/e/ea/Unit-Atlie-5.png?version=5c65a5df5026b51d6e1ae4fd8bfb36ad","/6/67/Unit-Atlie-6.png?version=8dbde3eee707139d9e564e75540fe475"},4),
	Tessen("Tessen",new String[]{"/3/34/Unit-Tessen-3.png?version=f50335a4e93342fee8b1268014cfabf2","/a/a9/Unit-Tessen-4.png?version=f505b129dd6a3b65f3d00d5d4c7fecad","/a/ae/Unit-Tessen-5.png?version=2e15aca1ca2d4adfd27cd1c33aeb77c6"},3),
	Sol("Sol",new String[]{"/e/e1/Unit-Sol-5.png?version=0ed67eb79aba3da126970f766e3b2a10","/2/2e/Unit-Sol-6.png?version=374b6cdc73637dc6088963c19e3ef58e","/e/e3/Unit-Sol-7.png?version=664615e5aac88b6cad064ff5d965d7d0"},5),
	Heliarc("Heliarc",new String[]{"/8/8b/Unit-Heliarc-4.png?version=14c438b2d7deff816189497d3f487bc5","/7/7c/Unit-Heliarc-5.png?version=331327fa4d331fa4b06296b1b95ef8d8","/0/0d/Unit-Heliarc-6.png?version=81a03775186f5f3fa6070671a306da6e"},4),
	Eclipsa("Eclipsa",new String[]{"/e/ee/Unit-Eclipsa-4.png?version=f98cbefa47864e9da8bd84c279602cdf","/0/0a/Unit-Eclipsa-5.png?version=b0cba547f2a3c3a824644402542cfdad","/a/ae/Unit-Eclipsa-6.png?version=8e0179fdcb0a4440e67b72aea2600eb7"},4),
	Pertira("Pertira",new String[]{"/5/53/Unit-Pertira-3.png?version=63dcde6a9d4e029e753dd9193918d1c1","/0/0b/Unit-Pertira-4.png?version=003452be41bb28c9310834978c811b92","/d/db/Unit-Pertira-5.png?version=f3a8588438d8525725099da86146719f"},3),
	WRFirion("Wild Rose Firion", new String[]{"/f/f4/Unit-Wild_Rose_Firion-5.png?version=59202385b0e0485a802de929cb91565b","/6/64/Unit-Wild_Rose_Firion-6.png?version=09e44df8336632059c1e0b03bb393195","/d/d4/Unit-Wild_Rose_Firion-7.png?version=0ee37ebc7e92f241248e42079bfa6f7a"},5),
	DKLeon("Dark Knight Leon", new String[]{"/8/87/Unit-Dark_Knight_Leon-5.png?version=3dac02d0a916791a59faa89314dfa7a5","/4/48/Unit-Dark_Knight_Leon-6.png?version=9e7e9cc1e3e5d32d22d90d1277484807","/8/87/Unit-Dark_Knight_Leon-7.png?version=a6f57489bf06218ae621c7166baa401c"},5),
	WLKrile("Warrior of Light Krile",new String[]{"/3/35/Unit-Warrior_of_Light_Krile-5.png?version=c2ce5dd46134c80acde1f84d285e9d4f","/e/e8/Unit-Warrior_of_Light_Krile-6.png?version=b0259c1a004205c79573213bd6a65cc6","/a/a2/Unit-Warrior_of_Light_Krile-7.png?version=76e1d2628bed418621496b41903073ef"},5),
	WLGaluf("Warrior of Dawn Galuf",new String[]{"/e/e0/Unit-Warrior_of_Dawn_Galuf-5.png?version=9d3d425bbb3b06ff40fd0279fff6b126","/9/92/Unit-Warrior_of_Dawn_Galuf-6.png?version=724128a199730503ba93da30bc91c325","/8/8e/Unit-Warrior_of_Dawn_Galuf-7.png?version=80cc5d34808d8fed10c9f9310b88446a"},5),
	DMExdeath("Dark Mage Exdeath",new String[]{"/4/4d/Unit-Dark_Mage_Exdeath-5.png?version=a0c6b28af16701e96963825405324fd5","/e/ea/Unit-Dark_Mage_Exdeath-6.png?version=08d97c39009d5b034f3d8bd9cbeaf9f5","/1/18/Unit-Dark_Mage_Exdeath-7.png?version=ca5250be0c06860ee124cbd83dfb0524"},5),
	AKefka("Archmage Kefka",new String[]{"/8/89/Unit-Archmage_Kefka-5.png?version=32b0848226a12284c372d369b855a07f","/5/5e/Unit-Archmage_Kefka-6.png?version=34e242790da85068dc2c16fbbfafc619","/d/d0/Unit-Archmage_Kefka-7.png?version=ab5f92fbf3eb8cde9aee12120fb25514"},5),
	AShadow("Assassin Shadow",new String[]{"/e/ef/Unit-Assassin_Shadow-5.png?version=fdf67793ba4659b19f88b19c69ae252f","/a/a0/Unit-Assassin_Shadow-6.png?version=9f8e2e235103bc2d4acdaecb1d36e58b","/9/98/Unit-Assassin_Shadow-7.png?version=c6fb2a178af193815472ef4b9beb2d0b"},5),
	AKRain("Aldore King Rain",new String[]{"/b/b0/Unit-Aldore_King_Rain-5.png?version=e7068414cf28f7578c35c2259d66abc3","/a/ab/Unit-Aldore_King_Rain-6.png?version=5e1cde6fd3ab31e475ca8b6386f7469d","/5/5d/Unit-Aldore_King_Rain-7.png?version=a79a49c6dddde64a824bb0115ba30805"},5),
	Diezell("Diezell",new String[]{"/d/dd/Unit-Diezell-4.png?version=1be9991cb724749fc328360b4150b101","/5/5a/Unit-Diezell-5.png?version=214d367896ddcfe927c4c9a105328458","/e/ed/Unit-Diezell-6.png?version=1444d40eaf7508f64c64a88d3476b207"},4),
	Maisie("Maisie",new String[]{"/1/1f/Unit-Maisie-3.png?version=eab86e4e2df89f20344599853662a711","/c/c0/Unit-Maisie-4.png?version=1b13de85dff43922dfab633c183109a1","/0/05/Unit-Maisie-5.png?version=c5a1bcf036683cbabf090519720e6662"},3),
	MTerra("Magitek Warrior Terra",new String[]{"/a/af/Unit-Magitek_Warrior_Terra-5.png?version=197816b282d5b40cf7a7da6b452b7b43","/3/36/Unit-Magitek_Warrior_Terra-6.png?version=04ee3aa8d867a674098388cee9d1411a","/3/3c/Unit-Magitek_Warrior_Terra-7.png?version=93ae1c2186bca2fe26ddda3119b92ebe"},5),
	ALocke("Adventurer Locke",new String[]{"/6/60/Unit-Adventurer_Locke-5.png?version=2f596b555955e5d3f596bbef88f0e9cd","/6/69/Unit-Adventurer_Locke-6.png?version=86ffeaec41aa52a3d10e1ba6e6c95308","/b/bd/Unit-Adventurer_Locke-7.png?version=ea6775de6c3a73901aec9ee6a8c7658c"},5),
	Neisha("Neisha",new String[]{"/6/68/Unit-Neisha-4.png?version=07bee945bfcffe6ded1fe55425d65f81","/b/bf/Unit-Neisha-5.png?version=1f7b874c959008de1b82bb64e203b870","/9/94/Unit-Neisha-6.png?version=cb1cab85b30eced63516170505f3f33d"},4),
	Latyl("Latyl",new String[]{"/a/a4/Unit-Latyl-3.png?version=0ed8f556316a8468ddaf2ca37809452a","/f/f5/Unit-Latyl-4.png?version=952557ce9996876170ce2f67f09341ab","/a/a4/Unit-Latyl-5.png?version=6f83d4ad451ddf81621fc28783752e39"},3),
	AOlive("Agent Olive",new String[]{"/8/8b/Unit-Agent_Olive-5.png?version=bcf7624087e22e319f2a1c6ddd913cc9","/9/9b/Unit-Agent_Olive-6.png?version=7b9079a55871355102e11b548c391efa","/4/46/Unit-Agent_Olive-7.png?version=9f00c2dd755e718e92ae5ed4957d5495"},5),
	MXon("Mastermind Xon",new String[]{"/8/88/Unit-Mastermind_Xon-5.png?version=92e22138c732cc96add89f92b9ba54f2","/4/4e/Unit-Mastermind_Xon-6.png?version=8d277a29c5104104bdd5f0d7b8948ee7","/f/fe/Unit-Mastermind_Xon-7.png?version=2b36c7b680c7388fd8cf7f804c2e1f86"},5),
	DAiden("Doctor Aiden",new String[]{"/a/ab/Unit-Doctor_Aiden-5.png?version=f31e517947703b8d96fbd3d5eea31550","/1/15/Unit-Doctor_Aiden-6.png?version=17a88cc0b8afa06013824c6e40782fe2","/4/4b/Unit-Doctor_Aiden-7.png?version=39d1e196135cde78635ece36ae62ad4e"},5),
	OZyrus("Operative Zyrus",new String[]{"/9/9f/Unit-Operative_Zyrus-5.png?version=732943efa063b74ac66f5e2b0d7e8624","/8/84/Unit-Operative_Zyrus-6.png?version=1cd5c7f4abfa9472e0f4f2c996282514","/3/3b/Unit-Operative_Zyrus-7.png?version=4f36ce68642c98de3b6775253b299673"},5),
	Physalis("Physalis",new String[]{"/8/86/Unit-Physalis-5.png?version=ba6cff659947b60b4a0058fc2e813b46","/1/1d/Unit-Physalis-6.png?version=c14b5d7d40e9f4161cddea1ceda02ddf","/e/ef/Unit-Physalis-7.png?version=f2e9d58e9ce84e3b200232bf0e75d1a6"},5),
	Juraga("Juraga of the Nu Star",new String[]{"/7/76/Unit-Juraga_of_the_Nu_Star-4.png?version=0b421418ad5b9413ad23bbb9f7fd1413","/8/8d/Unit-Juraga_of_the_Nu_Star-5.png?version=ade470fb39082aac116995b5aeb21456","/7/78/Unit-Juraga_of_the_Nu_Star-6.png?version=ea87583ee8d4be8453cd35ef8892342b"},4),
	Gudon("Gudon of the Xi Star",new String[]{"/6/69/Unit-Gudon_of_the_Xi_Star-3.png?version=a258af5c9635b78dbfd851a7ad27a96a","/e/e5/Unit-Gudon_of_the_Xi_Star-4.png?version=42334429d8569513c16995b35ba4b2ac","/e/e1/Unit-Gudon_of_the_Xi_Star-5.png?version=714e18c2d29db132833b95fa987e6f49"},3),
	CrownNoctis("Crown Prince Noctis",new String[]{"/4/43/Unit-Crown_Prince_Noctis-5.png?version=1fbc82ea18449bdb93ff6ed93b5ce10e","/a/a6/Unit-Crown_Prince_Noctis-6.png?version=fb275193c1d763e67b875624876bb87b","/b/b6/Unit-Crown_Prince_Noctis-7.png?version=5b3a3e816517a8621bf33795002a9c53"},5),
	Lunafreya("Lunafreya",new String[]{"/7/78/Unit-Lunafreya-5.png?version=d41c573b1a87228f729f77761e01ea0a","/c/cb/Unit-Lunafreya-6.png?version=65995c1c02e11439bf1c5347c55fb3d5","/a/a5/Unit-Lunafreya-7.png?version=ae6befcfd13af5fc79a5fcab8e6280ec"},5),
	KennyCrow("Kenny Crow",new String[]{"/8/88/Unit-Kenny_Crow-4.png?version=280fa933ee39d18d9bb1adaefaba81da","/f/f9/Unit-Kenny_Crow-5.png?version=8aa1f907ec6a2bef2c37a0e812dff3f7","/0/04/Unit-Kenny_Crow-6.png?version=645ee211e5b9dc0818d037315259358a"},4),
	WLDFina("White Lily Dark Fina",new String[]{"/b/b0/Unit-White_Lily_Dark_Fina-5.png?version=e9c7359a6447a715f093122a13d13da3","/7/78/Unit-White_Lily_Dark_Fina-6.png?version=04b18271e4801f41e70b6be2ddc1d635","/1/1a/Unit-White_Lily_Dark_Fina-7.png?version=c47fc122813c1c8245630b82b015a4e4"},5),
	AWoL("Awakened Warrior of Light",new String[]{"/c/c2/Unit-Awakened_Warrior_of_Light-5.png?version=555875369229525570775a7b5b57c926","/a/a0/Unit-Awakened_Warrior_of_Light-6.png?version=8cae32b34123058f07a11fc51890bd6d","/e/eb/Unit-Awakened_Warrior_of_Light-7.png?version=9e7b8de5283b4fd36fd543af2021ca13"},5),
	IKGarland("Immortal Knight Garland",new String[]{"/3/36/Unit-Immortal_Knight_Garland-5.png?version=96c430a3ccef780fd6e0b802e842375d","/1/18/Unit-Immortal_Knight_Garland-6.png?version=b1f1a560cc4730e43a6548b4f6ffb4ff","/8/88/Unit-Immortal_Knight_Garland-7.png?version=9bcdea58396a4d66b08d8386301bf38e"},5),
	Regis("Regis",new String[]{"/7/7b/Unit-Regis-5.png?version=dee1abc5aceb2b22ec609f26473964b3","/d/dc/Unit-Regis-6.png?version=eabc27ab8a01761e0e9a2226eedeac2d","/0/06/Unit-Regis-7.png?version=aaeb0d837b95d8dc5b2d73e3f73ede8f"},5),
	Ardyn("Ardyn",new String[]{"/7/73/Unit-Ardyn-5.png?version=b20b894b2da7be2c33286742c044dda0","/a/aa/Unit-Ardyn-6.png?version=bfbe223ca18ea23cd00dc657ccdb0a99","/2/2a/Unit-Ardyn-7.png?version=f509624a4e5d537a030a432c08636e6a"},5),
	KingLasswell("Hess King Lasswell",new String[]{"/f/f9/Unit-Hess_King_Lasswell-5.png?version=32fc69b30c96a0723d30f69940b75d63","/2/22/Unit-Hess_King_Lasswell-6.png?version=c0da3a868e1561dd5754ea7f5f00cc9b","/a/a2/Unit-Hess_King_Lasswell-7.png?version=f0629d36a6be1a41b13ff85e91c089e7"},5),
	Scartio("Scartio",new String[]{"/6/67/Unit-Scartio-4.png?version=6d5b5a549a38f24899e8e61850501a9a","/b/b9/Unit-Scartio-5.png?version=b612ac46b3ea6ceb55e561489aa155a8","/9/9b/Unit-Scartio-6.png?version=3c5883f26d9775ece58847ece5553dd4"},4),
	Sister("Sister",new String[]{"/7/75/Unit-Sister-3.png?version=b576c1b5f9ecb03269990a33067b7a26","/7/70/Unit-Sister-4.png?version=7669a447295f0102874940af54409bca","/c/cc/Unit-Sister-5.png?version=1ba32d41e52a95900a757da41235e065"},3),
	PaladinCecil("Paladin Cecil",new String[]{"/3/3c/Unit-Paladin_Cecil-5.png?version=3b9edad16281ddbb515bf056f46b5bfb","/8/83/Unit-Paladin_Cecil-6.png?version=bf35ee8b2bdbdc36e9ec9f92725cbeb5","/a/ac/Unit-Paladin_Cecil-7.png?version=633090554b585cb37185f376ddd1576d"},5),
	PalomPorom("Palom & Porom",new String[]{"/d/d9/Unit-Palom_%26_Porom-5.png?version=57b459ebc03d7c27a48cc21edc88d516","/3/34/Unit-Palom_%26_Porom-6.png?version=07a1c64778a09eeb0af593f628fb5fe4","/7/7f/Unit-Palom_%26_Porom-7.png?version=5f752c4c341e912664a33d4963cb2f48"},5),
	FFIVCid("Cid (FFIV)",new String[]{"/8/83/Unit-Cid_%28FFIV%29-4.png?version=25eb866db87d45083f2fd077f1114804","/5/53/Unit-Cid_%28FFIV%29-5.png?version=1073256479b9a1b5daf1996b1c8b6ced","/5/55/Unit-Cid_%28FFIV%29-6.png?version=57cc35d6e14e6fb93582c493d3a78724"},4),
	
	//Limited Units
	Juggler("Juggler",new String[]{"/c/c2/Unit-Juggler-4.png?version=3a13b03756a5ca2541424e34fc6918fe","/1/1d/Unit-Juggler-5.png?version=b1a7e5acd4738d739069f8d6b4563932"},4),
	Thief("Thief",new String[]{"/8/8e/Unit-Thief-4.png?version=8ce7dae96b88c66b7bead054c9a45995","/d/de/Unit-Thief-5.png?version=fec375ed9ecead999e1d194c03891d02"},4),
	Fencer("Fencer",new String[]{"/d/d8/Unit-Fencer-4.png?version=362f99325ceef8968732a8f49374d9b3","/0/02/Unit-Fencer-5.png?version=1c2b5f69281911ce1464ea31d68ae0a5"},4),
	DRain("Demon Rain",new String[]{"/c/c7/Unit-Demon_Rain-5.png?version=e7d8aca36a2cc4a4cef7c5b48b9af8e3","/3/30/Unit-Demon_Rain-6.png?version=8ef21aebd449a531acc171547ae6fd0f",},5){
	    @Override
	    public void setup(){
	            setUpgrades(new String[]{"/f/fb/Unit-Demon_Rain-7.png?version=3d52af881be0c7e39f2a4de0a2891cba"});
	        }
	    },
	DLasswell("Dracu Lasswell",new String[]{"/a/a5/Unit-Dracu_Lasswell-5.png?version=40b4eb078e787d5f498bcc8b979a97a1","/c/c3/Unit-Dracu_Lasswell-6.png?version=d81994a6cf9357430b970e5bdfd9d9e5",},5){
	        @Override
	        public void setup(){
	                setUpgrades(new String[]{"/8/82/Unit-Dracu_Lasswell-7.png?version=d55b39339b8f53d1b73150f83f9d8103"});
	            }
	        },
	WWF("White Witch Fina",new String[]{"/a/a2/Unit-White_Witch_Fina-4.png?version=aa9d199e9c09952626d6fc08de86c06c","/4/48/Unit-White_Witch_Fina-5.png?version=8c4a1c82b6fedb7dae28c5fd0c62744b","/0/07/Unit-White_Witch_Fina-6.png?version=29640d666b6eec84884727ced377cd73"},4),
	BCLid("Black Cat Lid",new String[]{"/0/08/Unit-Black_Cat_Lid-3.png?version=44bb6ce33351691f6d52ed2a3e6ca0df","/4/40/Unit-Black_Cat_Lid-4.png?version=7ee8d85a278ebb0eabbc051f6b5d9c8a","/1/1c/Unit-Black_Cat_Lid-5.png?version=726eeed33388fdef994e7f27ebce139e",},3){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/4/44/Unit-Black_Cat_Lid-6.png?version=0564fcb97b73534c73bc937237e9d781"});
		}
	},
	Karl("Karl",new String[]{"/2/2b/Unit-Karl-4.png?version=d2b15d925afdd5fbdff81b84e12bff86","/5/5b/Unit-Karl-5.png?version=8ba5221adb55030068f2746f34a7406a"},4),
	Seria("Seria",new String[]{"/f/f2/Unit-Seria-4.png?version=2d93b6612635f16369c82ad891a8b7c4","/2/2a/Unit-Seria-5.png?version=96ce1921392b62033d5854c71da47294"},4),
	Tilith("Tilith",new String[]{"/c/cf/Unit-Tilith-4.png?version=aab39f1eb3af102b0e982a69aeb4d63b","/f/f3/Unit-Tilith-5.png?version=8e2d3d30592b49f36b9f6bf1b5e79872",},4){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/3/37/Unit-Tilith-6.png?version=35f69894f943c672a80518f0df90c3c0"});
		}
	},
	Elza("Elza",new String[]{"/3/39/Unit-Elza-5.png?version=a74a90a66643d03325a5c3d845cb2a42","/0/08/Unit-Elza-6.png?version=ca6f643b429b7fbad0078519310414cb"},5),
	SRoselia("Santa Roselia",new String[]{"/e/e6/Unit-Santa_Roselia-4.png?version=2e794cb3a258f167f8910b2c853a3e57","/5/54/Unit-Santa_Roselia-5.png?version=89b0722a00c2f477d34745d41ca37d74","/9/98/Unit-Santa_Roselia-6.png?version=93011430284da0b21c4f253b357000d9"},4),
	WKN("White Knight Noel",new String[]{"/1/12/Unit-White_Knight_Noel-5.png?version=d1453e13c630264a7ded5841ac542782","/0/0e/Unit-White_Knight_Noel-6.png?version=69e4eba92941d7648b59bf886a3d960a",},5){
	    @Override
	    public void setup(){
	            setUpgrades(new String[]{"/6/6f/Unit-White_Knight_Noel-7.png?version=42210cee23f4403663759bb728c71a84"});
	        }
	    },
	Ling("Ling",new String[]{"/7/73/Unit-Ling-4.png?version=acf76984888d4f98b453746d6b29fae1","/8/8c/Unit-Ling-5.png?version=726755613a586d93384ae7e840c68952","/6/65/Unit-Ling-6.png?version=8155d78b7025d4dea35d9f2a4db7507c"},4),
	Yun("Yun",new String[]{"/d/d6/Unit-Yun-5.png?version=308c597f635a6ce74da33db451060da9","/c/c6/Unit-Yun-6.png?version=e0939eda0ed92d8e296cd2d031850d82",},5){
	    	@Override
	    	public void setup(){
	    		setUpgrades(new String[]{"/a/a3/Unit-Yun-7.png?version=8d2cefa7ec39cea97b462c321bade0db"});
	    	}
	    },
	Popoi("Popoi",new String[]{"/6/6d/Unit-Popoi-3.png?version=aa4d1b9134000aef80fae8487ed0c5ec","/e/eb/Unit-Popoi-4.png?version=ef4ffd5748230c5ef652a8c00a3fbc1b","/8/80/Unit-Popoi-5.png?version=2b6ed30af78a9e00aeac91ca2c00b8c0","/9/9f/Unit-Popoi-6.png?version=23d07e77c7c57a4f3b883b405f9e9737"},3),
	Primm("Primm",new String[]{"/4/42/Unit-Primm-4.png?version=43be8e04f63f03996855ab9535e0d442","/9/99/Unit-Primm-5.png?version=a9fcb36b56eb896166f21f579530ed53","/d/d9/Unit-Primm-6.png?version=af047f2e5a86f34ac5af0fa6893d66e2"},4),
	Randi("Randi",new String[]{"/9/9a/Unit-Randi-5.png?version=36733fb40cf30494c458a867225313fc","/3/33/Unit-Randi-6.png?version=3d07ab50d1790ec233a20b82d9b6dea3",},5){
	    	@Override
	    	public void setup(){
	    		setUpgrades(new String[]{"/0/00/Unit-Randi-7.png?version=fc1b8c7091567a52506bb418b1c5c8a3"});
	    	}
	    },
	CLuna("Cupid Luna",new String[]{"/8/81/Unit-Cupid_Luna-3.png?version=cffd0176f752079d7cf501e68ef7db8f","/c/c9/Unit-Cupid_Luna-4.png?version=2f3f2d87279c98f560ee51a6c7758729","/f/f8/Unit-Cupid_Luna-5.png?version=ed357c1166677164410746f68794f867"},3),
	CArtemois("Cupid Artemios",new String[]{"/9/98/Unit-Cupid_Artemios-4.png?version=7eec6b4e956cb7cd7ffc4b7a3e4f5736","/5/5b/Unit-Cupid_Artemios-5.png?version=59d4ba9606ef3629a2700768f7b8ebdf","/f/f0/Unit-Cupid_Artemios-6.png?version=78521b15b2d1454a4ebc271599f004bd"},4),
	Vargas("Vargas",new String[]{"/f/f6/Unit-Vargas-5.png?version=c992c9e3e45fc51ba4f988bfd43ad36a","/4/49/Unit-Vargas-6.png?version=75436c9535280ae940f9a95fd92202c3"},5),
	N2B("2B",new String[]{"/d/dd/Unit-2B-5.png?version=636791557d0324154fdb07497cee6bca","/4/4f/Unit-2B-6.png?version=d927354d62019f54dc2fb9df22c1cf76"},5),
	N9S("9S",new String[]{"/6/6f/Unit-9S-4.png?version=db380698c0c450106094d2fbd452fb1e","/a/a3/Unit-9S-5.png?version=f4c8ff152bd312f27096ba07486f80e0","/8/8a/Unit-9S-6.png?version=1f2f141a389bb4d5c63d35f4fdc954ce"},4),
	N21O("21O",new String[]{"/6/6a/Unit-21O-3.png?version=773885048ee9db1d74cef32d6aa39e06","/f/f6/Unit-21O-4.png?version=b811a99059f31ba90bae63b01b488da5","/c/c9/Unit-21O-5.png?version=f8ae066d35835eb08644031243a8421a"},3),
	A2("A2",new String[]{"/6/6c/Unit-A2-5.png?version=6cb61c32b76ac430caa67d2f8af4cd11","/6/62/Unit-A2-6.png?version=83419766bc980c3107f78f2157666a8d"},5),
	Eve("Eve",new String[]{"/9/96/Unit-Eve-4.png?version=9d9455b0dda465d2d3a3df092160ddc9","/3/34/Unit-Eve-5.png?version=47f67d92dfee3fc27cb7d44b3b5135e3","/3/39/Unit-Eve-6.png?version=75aebc263ef4b09d6cd26ba1cebc5d55"},4),
	GLSakura("Grim Lord Sakura",new String[]{"/f/fd/Unit-Grim_Lord_Sakura-5.png?version=fbb7c422ad8fd097a90b230281969d58","/1/13/Unit-Grim_Lord_Sakura-6.png?version=959b243630261ff64a8d4754241cfcf5",},5){
	    @Override
	    public void setup(){
	            setUpgrades(new String[]{"/7/78/Unit-Grim_Lord_Sakura-7.png?version=bf128c11a7b6732aa4cee738809abf8a"});
	        }
	    },
	PJake("Pirate Jake",new String[]{"/f/f7/Unit-Pirate_Jake-4.png?version=eacf0b6f5bb7590b1922d80a4c1fff5f","/8/82/Unit-Pirate_Jake-5.png?version=02123503932b43551362c7a35cf12bae","/b/b1/Unit-Pirate_Jake-6.png?version=4932996c6ac0374beb0f48707a8b7afc"},4),
	INichol("Illusionist Nichol",new String[]{"/a/ac/Unit-Illusionist_Nichol-4.png?version=8748f249142698ccc6089374770c93c4","/b/b6/Unit-Illusionist_Nichol-5.png?version=0d54ccdad52fca5f687eb1566e50ae37","/6/6d/Unit-Illusionist_Nichol-6.png?version=3c8db0ffabc8d54fc1b2ccd4a33643e8"},4),
	MaidenSakura("Maiden Sakura",new String[]{"/b/bb/Unit-Maiden_Sakura-4.png?version=69affd1c2fed8fbe71d8be045f42b374","/6/64/Unit-Maiden_Sakura-5.png?version=eac61bc5164c96fe74aae510b4dd6ebf"},4),
	SportAriana("Sportive Ariana",new String[]{"/6/6e/Unit-Sportive_Ariana-4.png?version=fdd6dd51da6b03c9de5210ac373b7a83","/0/07/Unit-Sportive_Ariana-5.png?version=0621490df01300a3d118f188a0b77204","/1/14/Unit-Sportive_Ariana-6.png?version=adc5f60430355cb58fd3a9d93add1ae2"},4),
	KittyAriana("Charming Kitty Ariana",new String[]{"/5/59/Unit-Charming_Kitty_Ariana-5.png?version=9751d745652a89247218d4e7ce08c10a","/a/a1/Unit-Charming_Kitty_Ariana-6.png?version=1699f6103df849a7d573caba5d761265"},5),
	Christine("Christine",new String[]{"/c/c0/Unit-Christine-5.png?version=4143c2b732acd1123a182cae37123920","/3/30/Unit-Christine-6.png?version=dd29cdcc898171ded23a64412a7be9d0",},5){
	    	@Override
	    	public void setup(){
	    		setUpgrades(new String[]{"/c/cd/Unit-Christine-7.png?version=7989b82eba9f35ed96e2f3c93a78c957"});
	    	}
	    },
	Kryla("Kryla",new String[]{"/0/0f/Unit-Kryla-5.png?version=4a5ffa6440df1a42485a68b9c46e8da6","/5/52/Unit-Kryla-6.png?version=2594120bd598bc2bb06693144e0134a7",},5){
	    	@Override
	    	public void setup(){
	    		setUpgrades(new String[]{"/f/f1/Unit-Kryla-7.png?version=4bbf765a63bd2b33d3295eeb51157703"});
	    	}
	    },
	TinkCarrie("Tinkerer Carrie",new String[]{"/b/b3/Unit-Tinkerer_Carrie-4.png?version=4ef725ced8cb3420c95743116de14c6b","/f/ff/Unit-Tinkerer_Carrie-5.png?version=183ddefb8fdd969b50239893e20a4473","/9/9d/Unit-Tinkerer_Carrie-6.png?version=91a56cb97b49e63d402020a63d9be51e"},4),
	RayJack("Ray Jack",new String[]{"/7/7a/Unit-Ray_Jack-5.png?version=acca5a31b52e0b9173f27a776c4ffc10","/c/cb/Unit-Ray_Jack-6.png?version=e5000c74eb5bb1f0155b2935e87eb44f"},5),
	Kaliva("Kaliva",new String[]{"/5/5e/Unit-Kaliva-4.png?version=bc5952cb73bedb55ba9d3a7882d2563f","/e/e4/Unit-Kaliva-5.png?version=9f02b4621e4d3da0db8ba8dfa12d9288","/8/88/Unit-Kaliva-6.png?version=53313d3d3a7d29f91fb67d41580bc015"},4),
	Barusa("Barusa",new String[]{"/4/48/Unit-Barusa-4.png?version=508f69ede8588c40526255c9ece917a6","/b/b0/Unit-Barusa-5.png?version=b1aeeb4a0a1a9cfed2bef70c510b9bb5","/1/1a/Unit-Barusa-6.png?version=ee4136d3598d720c024e77501afb569e"},4),
	Toby("Toby",new String[]{"/a/a1/Unit-Toby-3.png?version=a3d87a1b72be6cc0330103716e11ac94","/d/d7/Unit-Toby-4.png?version=61f605551ec8ddce2ea2f4c9cf7b53ff","/b/b7/Unit-Toby-5.png?version=30b3fecde256c7ae2bd3f22df40bd4c4"},3),
	Chow("Chow",new String[]{"/9/9a/Unit-Chow-5.png?version=913b535b652317714c20a7ffe257e0e2","/8/8e/Unit-Chow-6.png?version=513e098b705d96ac96b8b2765b216cf2",},5){
	    	@Override
	    	public void setup(){
	    		setUpgrades(new String[]{"/4/47/Unit-Chow-7.png?version=5c439643b92ca1559088e8ed7c38fb20"});
	    	}
	    },
	Ang("Ang",new String[]{"/d/dc/Unit-Ang-5.png?version=f18faf254d707eab4638619bd68907ef","/b/bb/Unit-Ang-6.png?version=85fe796b296f61674cacd1e8f047d184",},5){
	    	@Override
	    	public void setup(){
	    		setUpgrades(new String[]{"/1/14/Unit-Ang-7.png?version=0918d470b9f9fd69dab9e9f080271b4d"});
	    	}
	    },
	Yan("Yan",new String[]{"/8/85/Unit-Yan-4.png?version=4cbc34ae615c66e2783d7356f0e2087a","/1/11/Unit-Yan-5.png?version=63ea00dd691f41376ab75b3e2f849544","/3/3e/Unit-Yan-6.png?version=90719eae323b28b580f6cac4b091f0e1"},4),
	PAbel("Pharaoh Abel",new String[]{"/8/8d/Unit-Pharaoh_Abel-3.png?version=7544cd23f241c949aa6563c6be6dc25e","/c/c5/Unit-Pharaoh_Abel-4.png?version=eb1a1dd7dcf4dfc1099db38d2511bfc9","/3/3f/Unit-Pharaoh_Abel-5.png?version=e5b13c70eb45df290d7560c9a6b22911"},3),
	DSoleil("Divine Soleil",new String[]{"/e/ed/Unit-Divine_Soleil-4.png?version=31c38af3dcb0e715af346dc82fdc7b4e","/a/a2/Unit-Divine_Soleil-5.png?version=0bafa6d55235b5cac1209985c3a11be3","/0/06/Unit-Divine_Soleil-6.png?version=95f323d82041ff71eb658135e0a8861e"},4),
	EAileen("Explorer Aileen",new String[]{"/9/93/Unit-Explorer_Aileen-5.png?version=fa7a450d5373a053d2b05190398de70d","/4/49/Unit-Explorer_Aileen-6.png?version=82e009ae5c0e2cddc7854b87801b8332"},5),
	Dragonlord("Dragonlord",new String[]{"/6/60/Unit-Dragonlord-5.png?version=410fa00410bc4899bd33c07e2b36455b","/b/bc/Unit-Dragonlord-6.png?version=62ec8be0aa9399a34ad9da11c44d1707",},5){
		@Override
		public void setup(){
			setUpgrades(new String[]{"/6/6a/Unit-Dragonlord-7.png?version=cea95ab5ee9f8bc20d85a932b2b52a87"});
		}
	},
	Orochi("Orochi",new String[]{"/d/d2/Unit-Orochi-4.png?version=c4dfc244454fb8d6b77f92f938e5c6f4","/c/cf/Unit-Orochi-5.png?version=46df20866d7b333e912a44e3924226f7","/0/00/Unit-Orochi-6.png?version=5bde199922a4583a734cf7071c36a597"},4),
	KillingMachine("Killing Machine",new String[]{"/f/f7/Unit-Killing_Machine-4.png?version=f9c27e6d0c32f4897e46747b2b763e50","/c/c7/Unit-Killing_Machine-5.png?version=3c53f0c4fa28fc2e40f980d4e6533aac"},4),
	LMSlime("Liquid Metal Slime",new String[]{"/c/c0/Unit-Liquid_Metal_Slime-4.png?version=3f41d6603395789f18e195a06a67031e","/1/16/Unit-Liquid_Metal_Slime-5.png?version=80c9a9c1570c4038c3c1826c5b1fbd69"},4),
	Golem("Golem",new String[]{"/8/8e/Unit-Golem-3.png?version=95d78cbb8db57e55cdf4eabd93e444af","/7/72/Unit-Golem-4.png?version=9c8a237a0bba9347e955818aaea5cb05","/2/2a/Unit-Golem-5.png?version=cf403a1fd6a751b7697662b741e45dce"},3),
	RobbinOod("Robbin' 'Ood",new String[]{"/e/e1/Unit-Robbin%27_%27Ood-3.png?version=9431c1e4fb44bb623f036fc0f0f045bf","/3/3b/Unit-Robbin%27_%27Ood-4.png?version=5c1e1fb12448eb8f4f507a6257f13536","/e/eb/Unit-Robbin%27_%27Ood-5.png?version=deaaa7c146b5dc723193a6c157fa8be9"},3),
	RicoRodriguez("Rico Rodriguez",new String[]{"/f/f2/Unit-Rico_Rodriguez-5.png?version=3d5947a6ffd23de9f0d14ae7d9ae1758","/b/be/Unit-Rico_Rodriguez-6.png?version=eb67bb7a0d14d41d48a91bec40ac504d"},5),
	MarioFrigo("Mario Frigo",new String[]{"/9/92/Unit-Mario_Frigo-4.png?version=33ee9040d17e64eedcd1ba4d8bf8db15","/d/df/Unit-Mario_Frigo-5.png?version=ee051816d2bd54521d260e389621ab6a","/a/aa/Unit-Mario_Frigo-6.png?version=8c6008238253044404435729c27d9a79"},4),
	AnnikaSvennson("Annika Svennson",new String[]{"/b/ba/Unit-Annika_Svennson-3.png?version=7b4094f403682c031df8fea1d933504c","/b/bb/Unit-Annika_Svennson-4.png?version=5e9bf5e6d1525c5c3d134be34eac1b14","/7/7d/Unit-Annika_Svennson-5.png?version=82ab2b8009aacb03a03314deff86d046"},3),
	Rena("Rena",new String[]{"/a/a3/Unit-Rena-5.png?version=b25725465cfa1041b48ee0ab7e7583dd","/b/b2/Unit-Rena-6.png?version=ca36425b8554ee6ab66093e7e652ace8"},5),
	Fayt("Fayt",new String[]{"/1/19/Unit-Fayt-5.png?version=3747a89a63bb0f594d9128df03fda1d9","/f/f8/Unit-Fayt-6.png?version=7fa9a21a48a951e659fabff75be18c98"},5),
	Fidel("Fidel",new String[]{"/d/dc/Unit-Fidel-4.png?version=32088cce39d043c803bccdcab55741d2","/1/1f/Unit-Fidel-5.png?version=b6cb60fba2c5080047b6224a5e2ec9f1","/6/6b/Unit-Fidel-6.png?version=83302e677e3bdfdb3d8eb796c423641d"},4),
	Roddick("Roddick",new String[]{"/d/dd/Unit-Roddick-3.png?version=ddc511ca4bbe04a15b5f747cd7d7c41d","/4/44/Unit-Roddick-4.png?version=e0b200f13806695d92bf471121e86a83","/b/b8/Unit-Roddick-5.png?version=f3349750bc4e21bdde558520018e8ade"},3),
	AJensen("Adam Jensen",new String[]{"/0/0e/Unit-Adam_Jensen-5.png?version=21a40a8d84660fa34da42e355131a382","/0/0f/Unit-Adam_Jensen-6.png?version=fa36219757015682271cb90e8b684872","/3/30/Unit-Adam_Jensen-7.png?version=5f6c6d57dca17eb8ac0f741c60b64323"},5),
	VMarchenko("Viktor Marchenko",new String[]{"/d/d1/Unit-Viktor_Marchenko-5.png?version=49b888019f715a1b3abe374ba203c6c9","/d/de/Unit-Viktor_Marchenko-6.png?version=1b6a1129cc0b98e9b1f837c1415ecd34","/c/c5/Unit-Viktor_Marchenko-7.png?version=f8f5dcb2efabd81a6bcf5dd063862d46"},5),
	VKoller("Václav Koller",new String[]{"/9/9e/Unit-V%C3%A1clav_Koller-4.png?version=e0c8a67c25e06cdb5123029a70e49544","/9/90/Unit-V%C3%A1clav_Koller-5.png?version=9044c4b26dc278d346543f540dea0b29","/4/45/Unit-V%C3%A1clav_Koller-6.png?version=16d758f33539beef9826b13e87ab962e"},4),
	FPritchard("Frank Pritchard",new String[]{"/f/f9/Unit-Frank_Pritchard-3.png?version=dcd7e273840b497000bd44a23b3fa35d","/7/79/Unit-Frank_Pritchard-4.png?version=f5876b517bf3b85c9e9141138abf263a","/6/67/Unit-Frank_Pritchard-5.png?version=8afd3f1febbf1107ee605a2d7884ea53"},3),
	Estark("Estark",new String[]{"/6/68/Unit-Estark-5.png?version=bde5f7769eda1d54634d240f30a25f0f","/f/f1/Unit-Estark-6.png?version=b10736dd67e4326ab84ce862a08b02bc","/9/9b/Unit-Estark-7.png?version=86e2742314d1f317b4c01b2814eb6a60"},5),
	ÜberkillingMachine("Überkilling Machine",new String[]{"/c/c6/Unit-%C3%9Cberkilling_Machine-4.png?version=021a78bd63026ba5a2587ca9840a4722","/9/97/Unit-%C3%9Cberkilling_Machine-5.png?version=c834238706625e0e25f131e0ffb90f0a","/d/d7/Unit-%C3%9Cberkilling_Machine-6.png?version=00e377dfd730b6089007afd47f0bc4b2"},4),
	Lilith("Lilith",new String[]{"/d/df/Unit-Lilith-5.png?version=eaf8710a22dc3e2f611a1278094fbd3e","/e/e7/Unit-Lilith-6.png?version=8e97f519922f097d61fb26466b7e528b","/9/97/Unit-Lilith-7.png?version=01acd73639a4a3e110dde839ca51c786"},5),
	Lucifer("Lucius",new String[]{"/8/81/Unit-Lucius-5.png?version=3cc0ac683814742237b69afcf2f5c163","/1/1f/Unit-Lucius-6.png?version=fe60614defc065a4c6e2dac724032438","/2/21/Unit-Lucius-7.png?version=030c49385741c46e6c26879339513149"},5),
	Lenneth("Lenneth",new String[]{"/d/dd/Unit-Lenneth-5.png?version=81f1e9a575136e36f4366a1909d8118b","/2/26/Unit-Lenneth-6.png?version=137d7f6bf2a60f8ebb9a5f8542a3dc4d","/c/cd/Unit-Lenneth-7.png?version=6d357b3d84956e8a04fd475e4c8e9eeb"},5),
	VPFreya("Freya (VP)",new String[]{"/9/9b/Unit-Freya_%28VP%29-5.png?version=25ef9ae759dfc4c7ce3ebcad875cd324","/c/c8/Unit-Freya_%28VP%29-6.png?version=2ddf67c4109494376c9e10af10fb158a","/9/97/Unit-Freya_%28VP%29-7.png?version=49aec6f0886f4b7c6d1c4e4abef40114"},5),
	Arngrim("Arngrim",new String[]{"/9/97/Unit-Arngrim-5.png?version=b9e6e18e84e0f51296d0807bf9844f9f","/c/cc/Unit-Arngrim-6.png?version=3532cccee49cc7fb70c07173bb06af71","/e/e3/Unit-Arngrim-7.png?version=c3f65607b21d0be13fa478fed4baa090"},5),
	Lucian("Lucian",new String[]{"/5/55/Unit-Lucian-4.png?version=9f193f2d836a8e9bd34dbc8dc5a8f606","/1/11/Unit-Lucian-5.png?version=8aefd0a6aef326b5ae47ee8b527a7147","/f/f4/Unit-Lucian-6.png?version=114eb894b268315d87db2d69b54a03a5"},4),
	Jelanda("Jelanda",new String[]{"/2/2a/Unit-Jelanda-3.png?version=4359e6e447c07610d1797e978a8b9142","/3/34/Unit-Jelanda-4.png?version=e947007d984634f490bf667882ae2168","/9/9b/Unit-Jelanda-5.png?version=73cad9b74ee9a07645cc2d865369b14b"},3),
	Tiana("Tiana",new String[]{"/6/63/Unit-Tiana-5.png?version=324bb467e186a8409a8f11828b6b3755","/4/40/Unit-Tiana-6.png?version=f029f350ca81b7e4f00c13b31f8d83d6","/9/94/Unit-Tiana-7.png?version=547dcd1e03870bb6b837f980ef764d9a"},5),
	Felix("Felix",new String[]{"/c/c2/Unit-Felix-5.png?version=cc765839c8fa7cd7ab06795729f38c11","/8/8f/Unit-Felix-6.png?version=7e4b8c417a0862825f2b44be95eba3d0","/c/cb/Unit-Felix-7.png?version=5c603062865b9effeec608918bbd7901"},5),
	Sora("Sora",new String[]{"/1/10/Unit-Sora-5.png?version=d0f987c04346885cb875fcded5bd052b","/6/62/Unit-Sora-6.png?version=d65bd433a0c79268257404bbb351c23e","/b/b6/Unit-Sora-7.png?version=878be75fd95cb758c3126dbcbff2533f"},5),
	KHCloud("Cloud (KH)",new String[]{"/7/71/Unit-Cloud_%28KH%29-5.png?version=7f0c6380d09fdb16fe401a8479709e63","/4/4c/Unit-Cloud_%28KH%29-6.png?version=480b587607275de1e322f537ab6ec497","/0/0c/Unit-Cloud_%28KH%29-7.png?version=ce2443d2cce35d168a429c0fbecb595b"},5),
	Sophia("Sophia",new String[]{"/a/a1/Unit-Sophia-5.png?version=cec35cce8b2cb901f52db019034be965","/9/94/Unit-Sophia-6.png?version=ecf149d340e2db2c6f5052f65c7a5383","/9/99/Unit-Sophia-7.png?version=f35abf78c6faa3fcc88431c7669e3fda"},5),
	Qin("Qin",new String[]{"/0/02/Unit-Qin-5.png?version=2e3f5bc643a9c8b7770ab3b1b576119d","/8/8c/Unit-Qin-6.png?version=3046e4831067ecbd8b0494b3a88e24f0","/8/85/Unit-Qin-7.png?version=9d83cd842dce4dab83144c4b1ae93089"},5),
	BaiHuZhuQue("Bai Hu & Zhu Que",new String[]{"/e/ed/Unit-Bai_Hu_%26_Zhu_Que-5.png?version=8ba99ce22f6e945cbcbcdcb378f1ddc9","/5/59/Unit-Bai_Hu_%26_Zhu_Que-6.png?version=6e0803a0b8c5d0c720a011e58a830cae","/0/0d/Unit-Bai_Hu_%26_Zhu_Que-7.png?version=b4fdb63f04a9b5f9186348be79a8f248"},5),
	Fei("Fei",new String[]{"/e/e1/Unit-Fei-5.png?version=29a627e0c0aff504419096bad2fbc181","/4/49/Unit-Fei-6.png?version=5fbe5c5de40be62e3ac46b7b7d424501","/b/b3/Unit-Fei-7.png?version=27ee94bea3ac487682c36767cf3a8250"},5),
	Elly("Elly",new String[]{"/c/cb/Unit-Elly-5.png?version=1f2f591083a0eb8802cbe54981ea6b16","/7/70/Unit-Elly-6.png?version=51744326eadd8fd0cd38ddd4254851d4","/c/cb/Unit-Elly-7.png?version=24e471525509786d508f4898cb007103"},5),
	Bart("Bart",new String[]{"/0/04/Unit-Bart-5.png?version=9c8884c9e108f8a63f92a88d6abc45dc","/9/9b/Unit-Bart-6.png?version=df3b87dc7edf49a92f2b1905ab51ab6c","/b/b8/Unit-Bart-7.png?version=a33fbb692408b33e0994de830f63ad0f"},5),
	Emeralda("Emeralda",new String[]{"/4/4c/Unit-Emeralda-4.png?version=f1dcc4949ffb524eeba4b56914931f1d","/8/8c/Unit-Emeralda-5.png?version=9791bec331e0bb2c55c319fc4471c5dc","/f/f8/Unit-Emeralda-6.png?version=74af850a43428a45f732b835f1c84b24"},4),
	Rico("Rico",new String[]{"/a/ab/Unit-Rico-3.png?version=c9de32b2bb1206d7137b5ef09881213b","/3/30/Unit-Rico-4.png?version=a8b839bffed299ccd22d321a81da104f","/2/25/Unit-Rico-5.png?version=bfb77d03d20493706cb2d7404091df3b"},3),
	Citan("Citan",new String[]{"/2/2f/Unit-Citan-5.png?version=b1043dc11af7d979a1b22984ad33a5aa","/e/e2/Unit-Citan-6.png?version=47fde8d48f41613db28557b29196f219","/d/d1/Unit-Citan-7.png?version=6e216ef349171d9e8b955a729079858b"},5),
	XenoMaria("Maria (Xenogears)",new String[]{"/d/d5/Unit-Maria_%28Xenogears%29-5.png?version=fbbb88f83e69507c446f152c7a90b33c","/6/6b/Unit-Maria_%28Xenogears%29-6.png?version=df3fd1324284197603096bf3a2615a08","/0/04/Unit-Maria_%28Xenogears%29-7.png?version=7deac8928f65bc67a5f730c7cfe34089"},5),
	Billy("Billy",new String[]{"/7/7c/Unit-Billy-4.png?version=8fa694d461a13d8b6f03e2e87c8ced88","/a/ac/Unit-Billy-5.png?version=2f0326f6a5329344f19eefd989a7140e","/3/32/Unit-Billy-6.png?version=8c4e238a62631dec16df3e2f952fcf8a"},4),
	PKaty("Popstar Katy",new String[]{"/7/7b/Unit-Popstar_Katy-5.png?version=73d15c5e39e6fb64e5f92e0eae63a167","/6/66/Unit-Popstar_Katy-6.png?version=248bde4c53c8f5462313f45f14d9f9be","/9/9e/Unit-Popstar_Katy-7.png?version=42125ff666bfd7748c46d4bfac107f25"},5),
	IFKaty("Immortal Flame Katy",new String[]{"/e/e8/Unit-Immortal_Flame_Katy-5.png?version=04063ae94eb2a4dad74c54d3034bfbc2","/2/21/Unit-Immortal_Flame_Katy-6.png?version=33b6f413f73884131ea870e4241b1c0f","/1/13/Unit-Immortal_Flame_Katy-7.png?version=044f56e27e0ba7db626b5d01529b20e9"},5),
	Flammie("Flammie",new String[]{"/6/6e/Unit-Flammie-5.png?version=3fedd28ebd66f6b0b05f2016e1a3bc5b","/e/eb/Unit-Flammie-6.png?version=347ed35a82ecaa9a7bb1467125ad8309","/e/ec/Unit-Flammie-7.png?version=bb875a9842483738e358e681405191ba"},5),
	Rabite("Rabite",new String[]{"/0/05/Unit-Rabite-3.png?version=990ac57e0431712ed207c22a4274be24","/b/b5/Unit-Rabite-4.png?version=4567987edacb71a58290660ddbec2d20","/f/fa/Unit-Rabite-5.png?version=efd30006fe5de3959c9d55220f1bea98"},3),
	Olberic("Olberic",new String[]{"/7/77/Unit-Olberic-5.png?version=46906ff57b594137a9247cf602d7a89e","/7/7d/Unit-Olberic-6.png?version=48b98442bc9cd4d63827e4dad49dd300","/4/40/Unit-Olberic-7.png?version=edf37b7335413e77ef73138f6b6a4809"},5),
	Primrose("Primrose",new String[]{"/a/a7/Unit-Primrose-5.png?version=b7238d20b7a9c351a28ba0999b4047c5","/5/56/Unit-Primrose-6.png?version=9adb47296fc178ce6b1cc73f13320502","/b/b5/Unit-Primrose-7.png?version=57a5d8140ca9f19a3750328035850613"},5),
	Therion("Therion",new String[]{"/0/0f/Unit-Therion-4.png?version=8e610389c5f93dc60498dc2691709b94","/e/e6/Unit-Therion-5.png?version=d16eb3fd5409c4c43d459d8c2ef09445","/8/88/Unit-Therion-6.png?version=228d44268b477994eac3c565bf171308"},4),
	Tressa("Tressa",new String[]{"/a/a3/Unit-Tressa-3.png?version=20293bd0381ffd506c0ed4e3b46d2b24","/a/a3/Unit-Tressa-4.png?version=08a4a44c2f36ec3b99d2d18877f0f3a5","/8/8b/Unit-Tressa-5.png?version=9f4dbf8faf6e8739e05a0af3d153a8d3"},3),
	AIKaty("A.I. Katy",new String[]{"/3/34/Unit-A.I._Katy-5.png?version=7ece34dfe49f375d0d35407734c3d707","/a/ae/Unit-A.I._Katy-6.png?version=a90bcaf069514855163b33b22c474b1c","/a/ae/Unit-A.I._Katy-7.png?version=46c7a56754dc8496b3bdeccc7dfa5d4e"},5),
	LKaty("Lovely Katy",new String[]{"/6/66/Unit-Lovely_Katy-5.png?version=dc03dabde90e037f9d310a02ff717203","/0/08/Unit-Lovely_Katy-6.png?version=8fd8c42df65c7d48fcec26abc1bd129e","/f/fb/Unit-Lovely_Katy-7.png?version=cfaf36fdc4b8e38ea410b1435f0a1f56"},5),
	Mordegon("Mordegon",new String[]{"/5/5a/Unit-Mordegon-5.png?version=9936ea41148c371b9190a4925bcaa7aa","/f/fe/Unit-Mordegon-6.png?version=c7397611eaeea3d4a55c08ded9c68079","/e/ef/Unit-Mordegon-7.png?version=6442e82e58d02d1ff2d663a497a60912"},5),
	GreatDragon("Great Dragon",new String[]{"/1/1b/Unit-Great_Dragon-4.png?version=e0f0fee00f92c9e4c19406635a16daad","/9/98/Unit-Great_Dragon-5.png?version=9e77c6d96bfe35ddfe7284c34e92cf01","/e/e0/Unit-Great_Dragon-6.png?version=035be6efa6fc5834c13b134f48242762"},4),
	Eleven("Eleven",new String[]{"/9/97/Unit-Eleven-5.png?version=71b7aaf51ec1aaeab0679f2c97e3825e","/b/be/Unit-Eleven-6.png?version=4fad11c7dfc2ab9d3e804500b592cea4","/d/dc/Unit-Eleven-7.png?version=3609fe12a17e3196a88138f7a0b72966"},5),
	Serena("Serena",new String[]{"/2/2e/Unit-Serena-5.png?version=0803cf7f033b8a61622bd2c1ec7b9b57","/4/46/Unit-Serena-6.png?version=624a6423ddb4fea781589eb7e7a2b59c","/8/87/Unit-Serena-7.png?version=6b560070666f7ad2cf8a6243600e25c9"},5),
	Veronica("Veronica",new String[]{"/5/58/Unit-Veronica-5.png?version=1f4a87be78888571aaa486df1bbc4203","/a/af/Unit-Veronica-6.png?version=9bb41f6e4364a8d8cc7db996d684f0ef","/b/bf/Unit-Veronica-7.png?version=bd242e47097dbfa4c2e4bd62bf6c64ef"},5),
	Karten("Karten",new String[]{"/2/26/Unit-Karten-5.png?version=18f4188f257cad38d63dd34e507555b8","/6/65/Unit-Karten-6.png?version=7f88510143641d565c463d54dff92143","/4/44/Unit-Karten-7.png?version=778eff28fc27373e328b1293361ba726"},5),
	Godrea("Godrea",new String[]{"/0/09/Unit-Godrea-5.png?version=6bd3cb09ae935b4542f623be7586128c","/a/a5/Unit-Godrea-6.png?version=693abf81b2ed039aaa1ba023650b276c","/0/05/Unit-Godrea-7.png?version=4716aa6e71736a2caaa7b23d17727478"},5),
	LoS("The Lord of Shadows",new String[]{"/c/ca/Unit-The_Lord_of_Shadows-5.png?version=ae9975da0a3c12b3b31fe2e7538c2864","/a/a5/Unit-The_Lord_of_Shadows-6.png?version=facdb4e31e55baca0cce9edc7974ba49","/6/6a/Unit-The_Lord_of_Shadows-7.png?version=fd106116ff179761b601ef6eae6867d6"},5),
	Jasper("Jasper Unbound",new String[]{"/8/82/Unit-Jasper_Unbound-5.png?version=0d2d3d818dbda4b845406b4238675261","/2/2b/Unit-Jasper_Unbound-6.png?version=2c7c3cd6103f32098c42bbc687751399","/4/48/Unit-Jasper_Unbound-7.png?version=a2ce60e3798515e46069f4a867def3eb"},5),
	Erik("Erik",new String[]{"/f/fe/Unit-Erik-5.png?version=501b65d1a2400159fb6828ee42fd105f","/1/17/Unit-Erik-6.png?version=d8e550b3988d0c24710f45de01528dfc","/b/ba/Unit-Erik-7.png?version=b6f50cfd255a256735b123bde75fb1f3"},5),
	Sylvando("Sylvando",new String[]{"/a/ae/Unit-Sylvando-5.png?version=b58d1e81bbca2e2ff4fdf4aff73b0b70","/7/75/Unit-Sylvando-6.png?version=357d1fd7c775ebd92ddba52f0171a876","/0/09/Unit-Sylvando-7.png?version=689b9b0fca7b50081eff5353e4423727"},5),
	Jade("Jade",new String[]{"/0/09/Unit-Jade-5.png?version=02a4f8acb677b9b0c4be5ea49184b0d6","/c/c7/Unit-Jade-6.png?version=4f7d2037293447d72c13c212b0b9c5f7","/2/20/Unit-Jade-7.png?version=84766aa12d228c152becd0591ade4a12"},5),
	Rab("Rab",new String[]{"/5/53/Unit-Rab-5.png?version=a0ce01c670fc63560102a6a4b9a535e8","/4/44/Unit-Rab-6.png?version=fb604e7f29055161030e6d5816075a16","/9/97/Unit-Rab-7.png?version=bfefd27df58ce48f598535c3cbb6f412"},5),
	HolyAEmilia("Holy Night Amelia & Emilia",new String[]{"/e/ee/Unit-Holy_Night_Amelia_%26_Emilia-5.png?version=7a3e02544239c733fad56d32904842da","/a/a3/Unit-Holy_Night_Amelia_%26_Emilia-6.png?version=12dcc54d6cd798a206b6cea4c6b0e390","/d/df/Unit-Holy_Night_Amelia_%26_Emilia-7.png?version=70767a8a885405ab27c20c051ed2b4ee"},5),
	Levinson("Levinson",new String[]{"/b/b6/Unit-Levinson-5.png?version=72b067690fb5601ca907078615bdb86f","/8/8a/Unit-Levinson-6.png?version=71055a8f11c31abb2a1c5c93e70942a3","/9/98/Unit-Levinson-7.png?version=18f2da3d87867ef87e904b7645f8b06d"},5),
	Lucas("Lucas",new String[]{"/b/b9/Unit-Lucas-5.png?version=7a24ca3dcb57a2c96d7c61020ad241a2","/b/b0/Unit-Lucas-6.png?version=3ebc11a0cc93f280813e53a1eca3da81","/f/f1/Unit-Lucas-7.png?version=74ed128a80bde682353e3083a20ee1b3"},5),
	EmperorFoo("Emperor Foo",new String[]{"/0/09/Unit-Emperor_Foo-5.png?version=7124e5e637507e449ad10fed85c81d5f","/9/94/Unit-Emperor_Foo-6.png?version=e1cc6273416bec27447fb0aad1174ef3","/3/39/Unit-Emperor_Foo-7.png?version=92585a53d90654180f15b1cd51df1628"},5),
	XuanWuQingLong("Xuan Wu & Qing Long",new String[]{"/8/8f/Unit-Xuan_Wu_%26_Qing_Long-5.png?version=681bbf4ca54252b7e92439a4a42df3a2","/f/f8/Unit-Xuan_Wu_%26_Qing_Long-6.png?version=7ca75d2490eb9e28e640fae7688cecee","/6/66/Unit-Xuan_Wu_%26_Qing_Long-7.png?version=d23ea29d98b19051bfc8027f32a66ee1"},5),
	WMRosa("White Mage Rosa",new String[]{"/f/f7/Unit-White_Mage_Rosa-5.png?version=65993f913708f71ae9741c191b77e044","/d/d9/Unit-White_Mage_Rosa-6.png?version=4c037c463bbdab1461c7cb4a0a7866cc","/8/8b/Unit-White_Mage_Rosa-7.png?version=d8f480a1256b69b8a437eaa079b21f81"},5),
	
	//Limited raid units
	MATerra("Magitek Armor Terra",new String[]{"/c/ce/Unit-Magitek_Armor_Terra-3.png?version=737faa3361d4023a571be63a4189cd63","/d/df/Unit-Magitek_Armor_Terra-4.png?version=9dffd213137f704f7ace0b67b948068d"},3),
	Maxwell("Maxwell",new String[]{"/d/d9/Unit-Maxwell-5.png?version=bfe93ec29bc641c661fdf49989b6965c","/7/7f/Unit-Maxwell-6.png?version=43b99a51e0221c9051c70fb7933ec5fe"},5),
	DAriana("Dangerous Ariana",new String[]{"/8/84/Unit-Dangerous_Ariana-4.png?version=a195d6cd36bc8320be834c7ee170032a","/d/d4/Unit-Dangerous_Ariana-5.png?version=3600039718d3811b00f5a288294f127d","/6/60/Unit-Dangerous_Ariana-6.png?version=bf106148b94c9cd3932eb02e420a0ed1"},4),
	Yshtola("Y'shtola",new String[]{"/6/6f/Unit-Y%27shtola-5.png?version=ae9147a485430d6cfc9d37810bb582ea","/2/27/Unit-Y%27shtola-6.png?version=2eff67a408a71f4f2867af6ed89e3a05"},5),
	Minfilia("Minfilia",new String[]{"/3/3e/Unit-Minfilia-4.png?version=11a54b510a5b730d70ecde2972d8a36b","/9/97/Unit-Minfilia-5.png?version=00aea0e103e8bc767a83237015782902","/6/60/Unit-Minfilia-6.png?version=c8ef20d394613b75584aa9a1cdc5835b"},4),
	Thancred("Thancred",new String[]{"/c/c1/Unit-Thancred-3.png?version=455a0d20ce5c6c3604a07bf303568c6e","/2/28/Unit-Thancred-4.png?version=0d867b5a3513e868cb238ed3414aa463","/8/86/Unit-Thancred-5.png?version=ffed64da74a7a21bb3e0358b96d41cec"},3),
	Yda("Yda",new String[]{"/1/12/Unit-Yda-4.png?version=06c8bad362c8e833e17b50cb2a14c770","/2/27/Unit-Yda-5.png?version=ccb4c32ba45dec0a3300e86367325fc1","/8/8d/Unit-Yda-6.png?version=0545501d9af6064f1b8c207b4ef5d207"},4),
	Papalymo("Papalymo",new String[]{"/e/e6/Unit-Papalymo-4.png?version=e846827a1c4db042fd5b6c00bc10ad18","/c/cb/Unit-Papalymo-5.png?version=b7f4517e2b0e10cf421eaadecf188244","/1/18/Unit-Papalymo-6.png?version=2653136096dd44d1daf8e32cb10a5fa2"},4),
	Kelsus("Kelsus",new String[]{"/f/f3/Unit-Kelsus-5.png?version=e08720c21320b78f0b171622ebbe34c7","/7/74/Unit-Kelsus-6.png?version=c83e179d9a28b9e5d0c7ddd7c9782e48"},5),
	Moogle("Moogle",new String[]{"/7/7f/Unit-Moogle-4.png?version=decf2faaf2fd717ac8d6b2cb4bf3deb7","/0/01/Unit-Moogle-5.png?version=8739d56e34fb6871bea4b8dd27d6fe15","/3/35/Unit-Moogle-6.png?version=b4f43ea01541cc27b15613b8c3bada3a"},4),
	ALid("Artisan Lid",new String[]{"/2/27/Unit-Artisan_Lid-4.png?version=2a68a637db7bc6b77d85c1b9df07a600","/2/2b/Unit-Artisan_Lid-5.png?version=30e88ef846e7fda61a388cf2832d2ef1"},4),
	Adam("Adam",new String[]{"/a/ad/Unit-Adam-4.png?version=bd2523c9e1b857a1b591d9e20ba9d82e","/2/25/Unit-Adam-5.png?version=7a2670bc6b76ea2e6bfef395c6818e18","/8/83/Unit-Adam-6.png?version=49177a6335bbd3e2561864a787fc7c19"},4),
	CAriana("Chic Ariana",new String[]{"/b/b8/Unit-Chic_Ariana-4.png?version=bade3c51b6661f436b097ab2b08438be","/9/9f/Unit-Chic_Ariana-5.png?version=f90c89c8c21057366e54d2accf06dcd8","/6/64/Unit-Chic_Ariana-6.png?version=3186434744ffca350f275266dbc41042"},4),
	SLasswell("Swordsman Lasswell",new String[]{"/a/a8/Unit-Swordsman_Lasswell-4.png?version=f0719a90451aaca2909e271a75abceac","/9/93/Unit-Swordsman_Lasswell-5.png?version=a8ecb02cd08df81df1878651a8838133"},4),
	CFina("Cheerleader Fina",new String[]{"/a/a6/Unit-Cheerleader_Fina-4.png?version=6fd7ccca2889ca141419389a9acbf793","/1/1c/Unit-Cheerleader_Fina-5.png?version=3a074f0ba269e9abc0594ddbee1962f6"},4),
	Ashteroze("Ashteroze",new String[]{"/c/ca/Unit-Ashteroze-4.png?version=7e111cbaf9494387ee759d2ecc01efa8","/7/7d/Unit-Ashteroze-5.png?version=968aa055480b12d1f9bac922eafbbae0","/d/db/Unit-Ashteroze-6.png?version=2321d6d4b946b21d781eb637d6aeb356"},4),
	Grinfield("Grinfield",new String[]{"/b/b1/Unit-Grinfield-4.png?version=bd493b1d3ed4c63bc115d8a26da0f845","/a/a1/Unit-Grinfield-5.png?version=206216c40d3bc08e9e5a15e67c1ebc23","/f/f4/Unit-Grinfield-6.png?version=f422b1781f8ea254494c77a25e480b5c"},4),
	Nyalu("Nyalu",new String[]{"/8/8d/Unit-Nyalu-4.png?version=edd776d9f5fd05ee34104a7d81c45e24","/f/fa/Unit-Nyalu-5.png?version=f2fe21778cc9e9c8aab46ecc315023d5","/4/45/Unit-Nyalu-6.png?version=7f3956b32cab23b5939ffbb42d81fd54"},4),
	Kupolkan("Kupolkan",new String[]{"/e/e6/Unit-Kupolkan-4.png?version=70e5a19f35e4854d82880c582006fa46","/3/30/Unit-Kupolkan-5.png?version=2267771b8501196a16fb2468d5fe8829","/e/e9/Unit-Kupolkan-6.png?version=3228d67a8f88ca263772912a4eb7d5ff"},4),
	Sandee("Sandee",new String[]{"/0/0b/Unit-Sandee-4.png?version=d08f17d52f00f1ae3524d7cc4b705307","/b/b1/Unit-Sandee-5.png?version=98223f77f76b0ff7c70f0f358dc5f64a","/a/a6/Unit-Sandee-6.png?version=48483d3a0c1af170aef480e49e333945"},4),
	CJake("Cowboy Jake",new String[]{"/e/e6/Unit-Cowboy_Jake-4.png?version=53a31bf1e94eb03eea992d6f0ed531f0","/c/c1/Unit-Cowboy_Jake-5.png?version=1f37ca272e2aa7b2c17ec30cb403ab68"},4),
	LaraCroft("Lara Croft",new String[]{"/7/78/Unit-Lara_Croft-5.png?version=c74464d8f3d671688bf2a76931a00a0a","/8/8e/Unit-Lara_Croft-6.png?version=109fde35f77e88d85176f0b7f956bcf0"},5),
	Emilia("Emilia",new String[]{"/b/b4/Unit-Emilia-4.png?version=32ae4d818fc9ca8192c17c23235ebcc9","/a/ac/Unit-Emilia-5.png?version=abff369f1b4bd28439c43ea1fd653112","/d/d5/Unit-Emilia-6.png?version=7e79d24f70c3eefcfd480d8634365fdd"},4),
	Ukiyo("Ukiyo",new String[]{"/9/9b/Unit-Ukiyo-5.png?version=50a485c4a99b32eac31e7a1f905f08eb","/4/49/Unit-Ukiyo-6.png?version=fb0abcec53d036dea602e9c122341d2a"},5),
	Teo("Teo",new String[]{"/f/fa/Unit-Teo-3.png?version=5d389ee1d779ff9f63fa5cc0f14d381b","/5/57/Unit-Teo-4.png?version=17b5576e68f276f82404294cc535a63f","/d/d3/Unit-Teo-5.png?version=ef82f9e007cd767636214187b69e07ff"},3),
	Reimi("Reimi",new String[]{"/d/d8/Unit-Reimi-4.png?version=e828aeee8706095a9218d24b3d469159","/b/b1/Unit-Reimi-5.png?version=b4d30f74748795884e13d69f209fd84e","/a/a6/Unit-Reimi-6.png?version=279b5d290c6bd9c8b77a3092c650e075"},4),
	SlimeKnight("Slime Knight",new String[]{"/b/b4/Unit-Slime_Knight-4.png?version=72b23985d1d45c0ad25b6734bd44239f","/7/7d/Unit-Slime_Knight-5.png?version=3d0f0b76df1900c276b29256c99cb4b3","/c/c1/Unit-Slime_Knight-6.png?version=82a178e18f6506b20da43838066d5611"},4),
	MarquisdeLeon("Marquis de Léon",new String[]{"/d/d9/Unit-Marquis_de_L%C3%A9on-5.png?version=9a3b0f3ba2112ff2217ad25e019dcc70","/7/74/Unit-Marquis_de_L%C3%A9on-6.png?version=23f6bdf3b341e20eaa4f1a20663a28f4","/d/db/Unit-Marquis_de_L%C3%A9on-7.png?version=117a90dbe3facf7bf50cf7a75efbcb59"},5),
	Dracky("Dracky",new String[]{"/8/8b/Unit-Dracky-3.png?version=c7af03fa1b45df3be5d303b27e8083fb","/1/1e/Unit-Dracky-4.png?version=42e8da818b1e3d8369d5c697ef518176","/5/52/Unit-Dracky-5.png?version=966b77d108cfcde07dd59a4cece098f8"},3),
	ChuChu("Chu-Chu",new String[]{"/7/74/Unit-Chu-Chu-3.png?version=77cab345050cc3c2a0953a9323d4b013","/0/09/Unit-Chu-Chu-4.png?version=78c358711faca3fa3e98a53c6907588d","/7/76/Unit-Chu-Chu-5.png?version=c134990349b8125f10cdc581333adf5f"},3),
	Gentiana("Gentiana",new String[]{"/9/99/Unit-Gentiana-5.png?version=ddb3a9678fd9772562981900e4df3b3e","/1/12/Unit-Gentiana-6.png?version=0447727db6dc8527ef057f2579004034","/4/46/Unit-Gentiana-7.png?version=9061cfb44c0818cc07c7df7611d180e5"},5),//no idea if actually limited
	
	
	
	Salt3("Salt3",new String[]{"https://media.discordapp.net/attachments/304311860147126282/562269409545289738/3.png"},3),
	Salt4("Salt4",new String[]{"https://media.discordapp.net/attachments/304311860147126282/562269480085094420/4.png"},4),
	Salt5("Salt5",new String[]{"https://cdn.discordapp.com/attachments/304311860147126282/694780716977750086/salt5.png"},5);
	//quick access map for certain things that has unit name but not the Unit object
	public static TreeMap<String,Unit> unitMap = new TreeMap<String,Unit>();
	static{//build map on class load
		for(Unit u:Unit.values()){
			unitMap.put(u.name, u);
		}
	}
	public String name;
	public String[] url;
	public int base;
	public String[] upgradeurl=new String[]{};
	Unit(String name, String[] url,int base){
		this.name=name;
		this.url=url;
		this.base=base;
		setup();
		if(!name.equals("Salt3")&&!name.equals("Salt4")&&!name.equals("Salt5")){
			for(int i=0;i<this.url.length;i++){
				this.url[i]=Settings.ExvicusIMGURL+this.url[i];
			}
		}
	}

	public void setup(){

	}
	public void setUpgrades(String[] upgrades){
		for(int i=0;i<upgrades.length;i++){
			upgrades[i]=Settings.ExvicusIMGURL+upgrades[i];
		}
		upgradeurl=upgrades;
	}
	public String unitName(){
		return name;
	}
	public String[] imgurl() {
		return url;
	}
	public int baseRarity() {
		return base;
	}
	public int maxRarity(){
		return base+url.length-1+upgradeurl.length;
	}
	public String toString(){
		return name;
	}
	public boolean hasRarity(int rarity){
		if(rarity>=base&&rarity<base+url.length){
			return true;
		}
		return false;
	}
	public boolean hasUpgrade(int rarity,int upgrade){
		//upgrade is # of upgrades to consider aka awakenings, currently 1 for 6*/5* awakenings, no unit has gotten 2 yet
		if(rarity>=base+url.length&&rarity<url.length+base+upgrade){
			return true;
		}
		return false;
	}
	public String getRarity(int rarity){
		String rare="";
		if(hasRarity(rarity)){
			rare=url[rarity-base];
		}
		return rare;
	}
	public int getRarityIndex(int rarity){
		if(hasRarity(rarity)){
			return rarity-base;
		}
		return -1;
	}
	public int getUpgradeIndex(int rarity,Awakening[] awakening){
		if(hasUpgrade(rarity,awakening)){
			return rarity-base-url.length;
		}
		return -1;
	}
	public String getUpgrade(int rarity,int upgrade){
		String rare="";
		if(hasUpgrade(rarity,upgrade)){
			rare=upgradeurl[rarity-base-url.length];
		}
		return rare;
	}
	public boolean hasUpgrade(int rarity,Awakening[] awakening){
		if(!(awakening==null)){
			for(Awakening a:awakening){
				for(int i=0;i<a.units.length;i++){
					if(a.units[i].name.equals(name)){
						return hasUpgrade(rarity,a.rarityAwakened[i]);
					}
				}
			}
		}
		return false;
	}
	public File getImageLocation(int rarity){
		return new File("units/"+name+"/"+rarity+".png");
	}
	public static void main(String[] args){
		XMLStAXFile file = new XMLStAXFile(new File(Settings.preloadData));
		file.readXMLFile();
		try{
			Elements preload=file.parseToElements("preload").get(0);
			Data.setData(preload);
		}catch(Exception e){
			e.printStackTrace();
			Log.log("ERROR", "error loading preload data");
		}
		file.endReader();
		UnitOverview overview = new UnitOverview();
		HashSet<String> checked = new HashSet<String>();
		for(unitData data:overview.possibleData){
			for(Unit u:values()){
				if(u.upgradeurl.length==0){
					if(u.url[u.url.length-1].equals(data.imgUrl)){
						if(!u.name.equals(data.name)){
							System.out.println(u.name+"!="+data.name);
						}
						checked.add(u.name);
						break;
					}
				}
				else{
					if(u.upgradeurl[u.upgradeurl.length-1].equals(data.imgUrl)){
						if(!u.name.equals(data.name)){
							System.out.println(u.name+"!="+data.name);
						}
						checked.add(u.name);
						break;
					}
				}
			}
		}
		Arrays.stream(values()).filter(u -> !checked.contains(u.name)).map(u -> u.name).forEach(System.out::println);
	}
	public static Unit[] commons1(){
		return new Unit[]{
				Penelo,
				Sabin,
				Shadow,
				Krile,
				Kain,
				Edgar,
				Fran,
				Shantotto,
				Rydia,
				Cyan,
				Clyne,
				Anzelm,
				Luna,
				Bedile,
				Russel,
				Galuf,
				Maria
		};
	}
	public static Unit[] commons2(){
		return Lib.concat(commons1(), new Unit[]{
				Vivi,
				Lani
		});
	}
	public static Unit[] currentPool(){

		return Lib.concat(Unit.commons2(),new Unit[]{
				Garland,
				Exdeath,
				Kuja,
				CoD,
				Cecil,
				Terra,
				Bartz,
				Firion,
				Zidane,
				Vaan,
				Duane,
				Cerius,
				Roselia,
				Medius,
				Miyuki,
				Russel,
				Golbez,
				Galuf,
				Xiao,
				Artemios,
				Locke,
				Leo,
				Gilbert,
				Celes,
				Kefka,
				Rakshasa,
				Chizuru,
				Hayate,
				WoL,
				Tellah,
				Lenna,
				Amarant,
				Garnet,
				Freya,
				Charlotte,
				Ludmille,
				Lightning,
				Deltia,
				Alma,
				Gaffgarion,
				Ramza,
				Arigas,
				Mustadio,
				Rosa,
				DKC,
				Edge,
				Arc,
				Ingus,
				Refia,
				Luneth,
				Faris,
				Greg,
				Snow,
				Vanille,
				Sazh,
				Hope,
				Fang,
				Mercedes,
				Noctis,
				Elle,
				Luka,
				DFina,
				Trey,
				Jack,
				Seven,
				Ace,
				Marie,
				Guy,
				Leon,
				Emperor,
				Olive,
				Shine,
				Shera,
				Queen,
				Nine,
				Clinque,
				Eight,
				Cid,
				Soleil,
				Ovelia,
				Lawrence,
				Fryevia,
				Xon,
				Aiden,
				TTerra,
				Setzer,
				Gau,
				Eileen,
				Soze,
				Heretic,
				Ulrica,
				Zyrus,
				Reberta,
				Sice,
				King,
				Rem,
				Wilhelm,
				Grace,
				Abel,
				Jean,
				Camille,
				Illus,
				Amelia,
				Forren,
				SLid,
				SFina,
				SMF,
				Wakka,
				Rikku,
				Tidus,
				Ashe,
				Rasler,
				Zargabaath,
				Lunera,
				Bran,
				Helena,
				Ruggles,
				MercRamza,
				KDeltia,
				Meliadoul,
				Orran,
				DV,
				FV,
				EV,
				Victoria,
				Tim,
				LV,
				HV,
				WV,
				OK,
				Desch,
				Aria,
				Sara,
				Prishe,
				Werei,
				Kupipi,
				Ayaka,
				Goken,
				Silvia,
				Kamui,
				Yuri,
				Nyx,
				Crowe,
				Glauca,
				Libertus,
				Lorraine,
				Chloe,
				Amy,
				Barbariccia,
				Rubicante,
				Cagnazzo,
				Scarmiglione,
				Gladiolus,
				Cor,
				Iris,
				Duke,
				Olif,
				Mystea,
				Charie,
				Ryunan,
				Roy,
				Aura,
				Guromu,
				Cloud,
				Elfreeda,
				William,
				Conrad,
				CGLasswell,
				Jiraiya,
				Kaede,
				Ohga,
				Otogiri,
				Basch,
				Balthier,
				Vayne,
				Drace,
				Larsa,
				CGSakura,
				Verun,
				Cedona,
				Aranea,
				Prompto,
				Beatrix,
				Eiko,
				Steiner,
				BW3,
				CGFina,
				Kunshira,
				Wadow,
				Erwin,
				Yuna,
				Lulu,
				Seymour,
				CGJake,
				EShera,
				Ozetta,
				Riley,
				Sephiroth,
				Lila,
				Shylt,
				Mim,
				CGLid,
				Killian,
				KRydia,
				HKain,
				Yang,
				Edward,
				CGNichol,
				Lexa,
				Elbis,
				Merald,
				CGRaegen,
				Ryumynui,
				Zile,
				Lucille,
				ARain,
				Mediena,
				Squall,
				Rinoa,
				Zell,
				Ramira,
				Nalu,
				Pecciotta,
				Shinju,
				Ryuka,
				RageShantotto,
				ShadowLord,
				Joachim,
				Hyoh,
				Shatal,
				Domino,
				AlohaLasswell,
				SeaNichol,
				SummerLuka,
				TideSkaha,
				Malphasie,
				Circe,
				Ignis,
				Ravus,
				Citra,
				Macmedi,
				Lotti,
				Machina,
				Kurasame,
				Deuce,
				Cater,
				Elephim,
				Leopold,
				Magna,
				Forelsket,
				Beryl,
				Ellesperis,
				Sieghart,
				Dietlinde,
				Theobald,
				Cannon,
				Tifa,
				Vincent,
				Barret,
				CaitSith,
				Folka,
				Yubel,
				Kihana,
				Ichor,
				Auron,
				Jecht,
				Belgemine,
				Brother,
				Ignacio,
				Suzume,
				PNK2,
				Wayhem,
				Myra,
				AFryevia,
				OKRefia,
				DKLuneth,
				Doga,
				Unei,
				CGCid,
				Melete,
				Nagflar,
				Falma,
				Yuraisha,
				Karlette,
				Franis,
				Ishil,
				Ultima,
				Beowulf,
				Reis,
				Construct8,
				Crimson,
				Kyanos,
				Mirfas,
				Esther,
				Sylvie,
				BMGolbez,
				Akstar,
				ZenoAkstar,
				Tomoe,
				Gravey,
				Majora,
				Nagi,
				Yego,
				ZoluluDelulu,
				Galas,
				KingEdgar,
				FighterSabin,
				Fid,
				Fitra,
				Regina,
				Vesvia,
				Amber,
				Krowa,
				Aerith,
				RedXIII,
				KAyaka,
				DAileen,
				SSCharlotte,
				Friese,
				Shepard,
				Zack,
				Yuffie,
				Elena,
				Morgana,
				Rivera,
				CGLightning,
				NeverendingHope,
				Kaito,
				Tsukiko,
				WoLBartz,
				WoLLenna,
				Atlie,
				Tessen,
				Sol,
				Heliarc,
				Eclipsa,
				Pertira,
				WRFirion,
				DKLeon,
				WLKrile,
				WLGaluf,
				DMExdeath,
				AKefka,
				AShadow,
				AKRain,
				Diezell,
				Maisie,
				MTerra,
				ALocke,
				Neisha,
				Latyl,
				AOlive,
				MXon,
				DAiden,
				OZyrus,
				Physalis,
				Juraga,
				Gudon,
				CrownNoctis,
				Lunafreya,
				KennyCrow,
				WLDFina,
				AWoL,
				IKGarland,
				Regis,
				Ardyn,
				KingLasswell,
				Scartio,
				Sister,
				PaladinCecil,
				PalomPorom,
				FFIVCid
				
		});
	}
	//Placeholders for attack, mage/tank, support banners, which will be concacted to form current pool
	public static Unit[] attackPool(){
		return new Unit[]{

		};
	}
	public static Unit[] mageTankPool(){
		return new Unit[]{

		};
	}
	public static Unit[] supportPool(){
		return new Unit[]{

		};
	}
	public static Unit[] base3(Unit[] pool){
		ArrayList<Unit> base3=new ArrayList<Unit>();
		for(Unit u:pool){
			if(u.base==3){
				base3.add(u);
			}
		}
		return (Unit[])base3.toArray();
	}
	public static Unit[] base3(){
		return base3(Unit.values());
	}
	public static Unit[] base4(Unit[] pool){
		ArrayList<Unit> base4=new ArrayList<Unit>();
		for(Unit u:pool){
			if(u.base==4){
				base4.add(u);
			}
		}
		return (Unit[])base4.toArray();
	}
	public static Unit[] base4(){
		return base4(Unit.values());
	}
	public static Unit[] base5(Unit[] pool){
		ArrayList<Unit> base5=new ArrayList<Unit>();
		for(Unit u:pool){
			if(u.base==5){
				base5.add(u);
			}
		}
		return (Unit[])base5.toArray();
	}
	public static Unit[] base5(){
		return base5(Unit.values());
	}
}
