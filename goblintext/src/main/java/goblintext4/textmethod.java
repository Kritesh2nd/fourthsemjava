package goblintext4;
import static goblintext4.displaytext.dis;
import static goblintext4.forest.f;
import static goblintext4.managetext.mt;
import java.util.Scanner;
public class textmethod extends Main{
    static textmethod tm = new textmethod();
    static int westphase=1,northphase=1;
    public int getopt(){
        Scanner scgetopt = new Scanner(System.in);
        int scopt = scgetopt.nextInt();
        return scopt;
    }
    public void town(){
//        mt.town();
        dis.whichplace();
    }
    public void temple(){
        if(Main.templedonation>=3000&&!(Main.mshield)){
            Main.mshield=true;
            mt.temple(2);
            dis.whichplace();
        }
        else{
            mt.temple(1);
            int templeopt=tm.getopt();
            switch(templeopt){
                case 1 -> mt.temple(11);
                case 2 -> mt.temple(12);
                case 3 -> dis.whichplace();
                default -> dis.whichplace();
            }
        }
        
    }
    public void inn(){
        
    }
    public void westlake(){
        int westopt=0,fightresult=0;
        mt.westlake(1);
        mt.westlake(11);
        dis.youchose(2);
        westopt = tm.getopt();
        switch(westopt){
            case 1 -> {
//                calling for fight
                mt.westlake(111);
                fightresult=f.fight(0,1);
                if(fightresult==1){
                    
                }
                else{
                    
                }
            }
            case 2 -> mt.westlake(12);
            default -> {dis.invalid();dis.enter();mt.mainforest();}
        }
    }
    public void fightwon(){
        
    }
    public void fightloss(){
        
    }
    public void forest(){
        System.out.println("forest");
        mt.mainforest();
    }
    public static void main(String[] args) {
//        mt.mainforest();
        tm.westlake();
    }
}
