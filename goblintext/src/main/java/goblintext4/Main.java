package goblintext4;
//test package for fight with goblins
import static goblintext4.displaytext.dt;
import java.util.Scanner;
public class Main {
    static goblintext3.Main main = new goblintext3.Main();
    static Scanner sc = new Scanner(System.in);
    static String name="Kritesh";
    static int hp=100,maxhp=100,minatk=30,maxatk=35,def=5,coin=0;
    boolean isword=false,iarmour=false,mring=false,msword=false,marmour=false,mshield=false;
    static int wood=3,stone=22,coal=12,herb=7,magicstone=2,core=1,potion=1;
    static int opt=0;
    public void equipment(){
        Main.hp=100;Main.maxhp=100;Main.minatk=30;Main.maxatk=35;Main.def=15;
        if(isword){Main.minatk+=20;Main.maxatk+=25;}
        if(iarmour){Main.def+=5;}
        if(mring){Main.maxhp+=70;Main.hp=Main.maxhp;}
        if(msword){Main.minatk+=70;Main.maxatk+=80;}
        if(marmour){Main.def+=10;}
        if(mshield){Main.maxhp+=30;Main.hp=Main.maxhp;Main.def+=10;}
    }
    public static void optionmethod(){
        dt.mainoption();
        System.out.println("");
        System.out.println("Choose a option ");
        opt=sc.nextInt();
        switch(opt){
            case 1 -> System.out.println("");
            default -> System.out.println("");
        }
    }
    public static void main(String[] args) {
        optionmethod();
        
    }
}
