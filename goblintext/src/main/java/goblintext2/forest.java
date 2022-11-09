package goblintext2;

import static goblintext2.displaytext.dis;
import static goblintext2.enemy.eny;

public class forest extends Main{
    static forest forest = new forest();
    static int northstage=1;
    public void forestoption(int opt){
        switch (opt){
            case 1 -> northmountain(1);
        }
    }
    public void northmountain(int stage){
        if(stage==1){
            forest.goblinfight(1,1);        
        }
    }
    
    public void goblinfight(int enemy,int res){
        if(enemy==1){
//            int fightval = forest.fightwithgoblin(Main.hp,Main.def,Main.atka,Main.hp,Main.def,Main.atkb,eny.goblin[0].hp,
//                    eny.goblin[0].atk1,eny.goblin[0].atk2,eny.goblin[0].atk3,eny.goblin[0].def);
        }
    }
    
    public int fightwithgoblin(int hp1, int atka1, int atkb1,int def1, int hp2, int atk2, int atk3, int atk4,int def2){
        int win=0,turn=1;
        while(hp1>0 || hp2>0){
            System.out.println("hp1 = "+hp1+", hp2 = "+hp2);
            if(turn==1){
                hp2=hp2-(atka1-def2);
                turn=2;
                dis.enter();
            }
            else if(turn==2){
                hp1=hp1-(atk2-def1);
                turn=1;
                dis.enter();
            }
        }
        return win;
    }
    public static void main(String[] args) {
        forest.forestoption(1);
    }
}
