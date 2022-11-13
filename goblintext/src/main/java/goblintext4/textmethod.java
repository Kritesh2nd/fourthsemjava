package goblintext4;
import static goblintext4.displaytext.dis;
import static goblintext4.managetext.mt;
import java.util.Scanner;
public class textmethod extends Main{
    static textmethod tm = new textmethod();
    
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
    public void forest(){
        System.out.println("forest");
    }
    public static void main(String[] args) {
        tm.town();
    }
}
