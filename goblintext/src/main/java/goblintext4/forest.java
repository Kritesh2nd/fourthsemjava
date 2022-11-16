package goblintext4;
import static goblintext4.displaytext.dis;
import static goblintext4.itemname.in;
public class forest {
    static forest f = new forest();
    public int fight(int eny, int res){
        Main.isword=true;
        dis.equipment();
        int ehp=in.gob[eny].hp,eminatk=in.gob[eny].minatk,emaxatk=in.gob[eny].maxatk,esmlatk=in.gob[eny].smlatk,
                ebigatk=in.gob[eny].bigatk,edef=in.gob[eny].def,ecoin=in.gob[eny].coin,ereward=in.gob[eny].reward;
        int hp=Main.hp,minatk=Main.minatk,maxatk=Main.maxatk,def=Main.def;
        int turn=1,atk=0,eatk=0;
        int fightresult=0;
        int reward = attack(in.reward[eny].mincoin,in.reward[eny].maxcoin);
        atk=attack(minatk,maxatk);
        eatk=attack(eminatk,emaxatk);
        dis.nextline();
        System.out.println("------xxx---XXX---Fight---XXX--xxx-------");
        dis.healthtext(hp,ehp);
        System.out.println("resource = "+res);
        while(hp>0 && ehp>0){
            if(turn==1){
                dis.attacktext();
                ehp-=(atk-edef);
                turn=2;
                System.out.println("You attacked the goblin.");
                System.out.println("You dealt "+(atk-edef)+" damage");
            }
            else if(turn==2){
                hp-=(eatk-def);
                turn=1;
                System.out.println("Goblin attacked with you a dagger.");
                System.out.println("You received "+(eatk-def)+" damage");
                dis.healthtext(hp,ehp);
            }
        }
        if(hp<0){
            hp=0;
            fightresult=0;
            dis.healthtext(hp,ehp);
            System.out.println("You died.");
        }
        else if(ehp<0){
            ehp=0;
            fightresult=1;
            dis.healthtext(hp,ehp);
            System.out.println("Goblin died.");
            Main.coin+=reward;
            System.out.println("You received +"+reward+" silver.");
            f.forestresource(res);
        }
        return fightresult;
    }
    public int attack(int min, int max){
        int atk = (int)(Math.random()*(max-min+1)+min);  
        return atk;
    }
    public void forestresource(int res){
        int res1=attack(2,4),res2=attack(1,2),res3=1;
        switch(res){
            case 1 -> {System.out.println("You got +"+res1+" wood");Main.wood+=res1;}
            case 2 -> {System.out.println("You got +"+res1+" stone");Main.stone+=res1;}
            case 3 -> {System.out.println("You got +"+res2+" coal");Main.coal+=res2;}
            case 4 -> {System.out.println("You got +"+res3+" herb");Main.herb+=res2;}
            case 5 -> {System.out.println("You got +"+res3+" core");Main.core+=res3;}
            case 6 -> {System.out.println("You got +"+res3+" dark start fragment");Main.dstartfrag+=res3;}
            default -> System.out.print("none");
        }
    }
    public static void main(String[] args) {
        f.fight(0,1);
    }
}