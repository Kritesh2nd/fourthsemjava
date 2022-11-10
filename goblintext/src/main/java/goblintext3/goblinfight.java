package goblintext3;

import static goblintext3.itemname.in;

public class goblinfight extends Main{
    static goblinfight gf = new goblinfight();
    public void thisfight(int eny, int res){
        main.isword=true;
        main.equipment();
        int ehp=in.gob[eny].hp,eminatk=in.gob[eny].minatk,emaxatk=in.gob[eny].maxatk,esmlatk=in.gob[eny].smlatk,
                ebigatk=in.gob[eny].bigatk,edef=in.gob[eny].def,ecoin=in.gob[eny].coin,ereward=in.gob[eny].reward;
        int hp=Main.hp,minatk=Main.minatk,maxatk=Main.maxatk,def=Main.def;
        int turn=1,atk=0,eatk=0;
        atk=attack(minatk,maxatk);
        eatk=attack(eminatk,emaxatk);
        System.out.println("Starting fight atk="+maxatk);
        while(hp>0 && ehp>0){
            System.out.println("Hp="+hp+", ehp="+ehp+", turn="+turn);
            
            if(turn==1){
                ehp-=(atk-edef);
                turn=2;
                System.out.println("You dealt "+atk+" damage");
            }
            else if(turn==2){
                hp-=(eatk-def);
                turn=1;
                System.out.println("You received "+eatk+" damage");
            }
        }
        if(hp<0){System.out.println("You died.");}
        else if(ehp<0){System.out.println("You killed a gobline");}
        System.out.println("Hp="+hp+", ehp="+ehp);
    }
    public int attack(int min, int max){
        int atk = (int)(Math.random()*(max-min+1)+min);  
        return atk;
    }
    public static void main(String[] args) {
        gf.thisfight(0,1);
    }
}
