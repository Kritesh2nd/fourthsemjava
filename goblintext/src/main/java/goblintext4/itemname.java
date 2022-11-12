package goblintext4;
public class itemname {
    static itemname in = new itemname();
    public class allname{
        String type="type",name="name",title="title",desc="desc";
        int id=0;
        public allname(int id, String type,String name,String title, String desc){
            this.id=id;
            this.type=type;
            this.name=name;
            this.title=title;
            this.desc=desc;
        }
        public int id(){return id;}
        public String type(){return type;}
        public String name(){return name;}
        public String title(){return title;}
        public String desc(){return desc;}
    }
    public class townclass{
        String name="";
        int id=0;
        boolean open=false;
        public townclass(String name,int id,boolean open){
            this.name=name;
            this.id=id;
            this.open=open;
        }
        public String name(){return name;}
        public int id(){return id;}
        public boolean open(){return open;}
    }
    public class goblinclass{
        int hp=0,minatk=0,maxatk=0,smlatk=0,bigatk=0,def=0,coin=0,reward=0;
        public goblinclass(int hp,int minatk,int maxatk,int smlatk,int bigatk,int def,int coin,int reward){
            this.hp=hp;
            this.minatk=minatk;
            this.maxatk=maxatk;
            this.smlatk=smlatk;
            this.bigatk=bigatk;
            this.def=def;
            this.coin=coin;
            this.reward=reward;
        }
        public int hp(){return hp;}
        public int minatk(){return minatk;}
        public int maxatk(){return maxatk;}
        public int smlatk(){return smlatk;}
        public int bigatk(){return bigatk;}
        public int def(){return def;}
        public int coin(){return coin;}
        public int reward(){return reward;}
    }
    allname forestname = new allname(1,"forestname","Whispering Willow Forest","Forest Name","");
    allname townname = new allname(2,"townname","Woodpine Rest","Town Name","");
    allname mayor = new allname(3,"mayor","Brysen","Mayor","");
    allname sorcerer = new allname(4,"sorcerer","Linus","Sorcerer","");
    allname blacksmith = new allname(5,"blacksmith","Janumri","Blacksmith","");
    allname nun = new allname(6,"nun","Adelisa","Nun","");
    allname innkeeper = new allname(7,"innkeeper","Sadie","Innkeeper","");
    allname coin = new allname(8,"coin","Silver","Coin","");
    allname northmountain = new allname(9,"northmountain","Ganary Slopes","North Mountain","");
    allname westlake = new allname(10,"westlake","Bienris Waters","West Lake","");
    allname southsea = new allname(11,"southsea","The Serene Ocean","South Sea","");
    allname eastforest = new allname(12,"eastforest","Norstead Woods","East Forest","");
    allname goblincave = new allname(13,"goblincave","Dorbiens Hollow","Goblin cave","");
    allname sword = new allname(14,"sword","Starshatterer","Sword","Executioner of Frost");
    allname armor = new allname(15,"armor","Malevolent","Armor","Aquycrase Chestpiece");
    allname shield = new allname(16,"shield","Radient Shield","Shield","Protector of Heros");
    allname ring = new allname(17,"ring","Enid","Ring","The Flower of Soul");
    allname potion = new allname(18,"potion","Ayelet","Potion","Water of Life");
    allname herb = new allname(19,"herb","Udi Leaf","Herb","");
    allname magicstone = new allname(20,"magicstone","Aquycrase","Stone","");
    allname[] allnames = {forestname,townname,mayor,sorcerer,blacksmith,nun,innkeeper,coin,northmountain,westlake,southsea,eastforest,goblincave,sword,armor,shield,ring,potion,herb,magicstone,};
    townclass thouse1 = new townclass("Temple",1,true);
    townclass thouse2 = new townclass("Inn",2,true);
    townclass thouse3 = new townclass("Mayor",3,true);
    townclass thouse4 = new townclass("Sorcerer",4,true);
    townclass thouse5 = new townclass("Magic Shop",5,false);
    townclass thouse6 = new townclass("Blacksmit",6,true);
    townclass thouse7 = new townclass("Armour Shop",7,false);
    townclass thouse8 = new townclass("Forest",8,false);
    townclass[] thouses = {thouse1,thouse2,thouse3,thouse4,thouse5,thouse6,thouse7,thouse8};
    goblinclass goblin = new goblinclass(100,30,35,0,0,15,40,0);
    goblinclass spear = new goblinclass(280,30,40,0,0,25,100,1);
    goblinclass shaman = new goblinclass(1600,60,70,115,135,100,500,2);
    goblinclass[] gob={goblin,spear,shaman};
    public static void main(String[] args) {
        System.out.println(in.gob[0].hp);
    }
}
