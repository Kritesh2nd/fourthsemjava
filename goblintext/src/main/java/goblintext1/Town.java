package goblintext1;
public class Town extends Main{
    static Town town = new Town();
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
    townclass thouse1 = new townclass("Temple",1,true);
    townclass thouse2 = new townclass("Inn",2,true);
    townclass thouse3 = new townclass("Mayor",3,true);
    townclass thouse4 = new townclass("Sorcerer",4,true);
    townclass thouse5 = new townclass("Magic Shop",5,false);
    townclass thouse6 = new townclass("Blacksmit",6,true);
    townclass thouse7 = new townclass("Armour Shop",7,false);
    townclass thouse8 = new townclass("Forest",8,false);
    townclass[] thouses = {thouse1,thouse2,thouse3,thouse4,thouse5,thouse6,thouse7,thouse8};
    public class forestclass{
        String name="";
        int id=0;
        boolean open=false;
        public forestclass(String name,int id,boolean open){
            this.name=name;
            this.id=id;
            this.open=open;
        }
        public String name(){return name;}
        public int id(){return id;}
        public boolean open(){return open;}
    }
    public static void main(String[] args) {
        System.out.println("");
        System.out.println(town.thouses[0].name);
    }
}
