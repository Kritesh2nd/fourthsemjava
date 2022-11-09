package goblintext2;
public class enemy {
    static enemy eny = new enemy();
    public class enemyclass{
        String name="goblin",title="title";
        int id=0,hp=0,def=0,atk1=0,atk2=0,atk3,coin=0,reward=0;
        public enemyclass(String name,String title,int id,int hp,int atk1,int atk2,int atk3,int def,int coin,int reward){
            this.name=name;
            this.title=title;
            this.id=id;
            this.hp=hp;
            this.atk1=atk1;
            this.atk2=atk2;
            this.atk3=atk3;
            this.def=def;
            this.coin=coin;
            this.reward=reward;
        }
        public String name(){return name;}
        public String title(){return title;}
        public int id(){return id;}
        public int hp(){return hp;}
        public int atk1(){return atk1;}
        public int atk2(){return atk2;}
        public int atk3(){return atk3;}
        public int def(){return def;}
        public int coin(){return coin;}
        public int reward(){return reward;}
    }
    enemyclass goblin1 = new enemyclass("Goblin","Soldier",1,100,30,35,0,15,40,0);
    enemyclass goblin2 = new enemyclass("Goblin","Soldier",2,280,30,40,0,25,100,1);
    enemyclass goblin3 = new enemyclass("Goblin","Soldier",2,1600,60,70,115,100,500,2);
    enemyclass[] goblin = {goblin1,goblin2,goblin3};
    public static void main(String[] args) {
        System.out.println(eny.goblin[0].hp);
    }
}
