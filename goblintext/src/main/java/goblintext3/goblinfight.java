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
        int turn=1;
        System.out.println("Starting fight atk="+maxatk);
        while(hp>0 && ehp>0){
            System.out.println("Hp="+hp+", ehp="+ehp+", turn="+turn);
            if(turn==1){
                ehp-=(maxatk-edef);
                turn=2;
            }
            else if(turn==2){
                hp-=(emaxatk-def);
                turn=1;
            }
        }
    }
    public static void main(String[] args) {
        gf.thisfight(0,1);
    }
}
