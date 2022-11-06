package goblintext1;
import java.util.Scanner;
import static goblintext1.Town.town;
import static goblintext1.displaytext.dis;

public class Main {
    static Main main = new Main();
    static Scanner sc = new Scanner(System.in);
    static int wood=21,stone=22,coal=12,ironsword=0,herosword=0,ironarmour=0,heroarmour=0,bloodring=0,herb=7,seastone=0;
    static int place=1,coin=215,core=0;
    static int maxhp=20,hp=10,atk=4,def=3;
    static int mayorquest=1,mayorqueststage=1,mayorencounter=0;
    static int magicquest=1,magicqueststage=1;
    static int bsmitquest=1,bsmitqueststage=1;
    static String name="Kritesh";
    public void whichplace(){
        dis.printline__();dis.printline__();
        System.out.println("Choose from 1~9 ");
        int a=0,b=0,len=town.thouses.length,namelen=0;
        for(a=0;a<len;a++){
            namelen=town.thouses[a].name.length();
            if(town.thouses[a].open){
                System.out.println(town.thouses[a].id+". "+town.thouses[a].name);
            }
            else{
                System.out.print(town.thouses[a].id+". ");
                for(b=0;b<namelen;b++){
                    System.out.print("?");
                }
                System.out.println("");
            }
        }
        System.out.println(len+1+". "+"Status");
        dis.printyouchose();
        place=sc.nextInt();
        dis.printnextline();
        switch (place){
            case 1 -> {if(town.thouses[0].open)main.temple();}
            case 2 -> {if(town.thouses[1].open)main.inn();}
            case 3 -> {if(town.thouses[2].open)main.mayor();}
            case 4 -> {if(town.thouses[3].open){main.sorcerer();}else{dis.printlocked();main.whichplace();}}
            case 5 -> {if(town.thouses[4].open){main.temple();}else{dis.printlocked();main.whichplace();}}
            case 6 -> {if(town.thouses[5].open){main.blacksmit();}else{dis.printlocked();main.whichplace();}}
            case 7 -> {if(town.thouses[6].open){main.temple();}else{dis.printlocked();main.whichplace();}}
            case 8 -> {if(town.thouses[7].open){main.temple();}else{dis.printlocked();main.whichplace();}}
            case 9 -> {dis.status();dis.printenter();main.whichplace();}
            default -> {System.out.println("Invalid");main.whichplace();}
        }
    }
    public void temple(){
        int templeopt=0;
        if(Main.bloodring>0){Main.maxhp=30;}
        if(Main.hp<Main.maxhp){
            System.out.println("Donate 10 silver to regain 1 hp.");
            System.out.println("1. Donate 10 silver");
            System.out.println("2. Continu your adventure");
            dis.printyouchose();
            templeopt=sc.nextInt();
            dis.printnextline();
            switch (templeopt) {
                case 1 -> {
                    if(Main.coin>=10){
                        Main.coin=Main.coin-10;Main.hp=Main.hp+1;
                        System.out.println("You gained 1+ hp.");
                        System.out.println("Your current hp is "+Main.hp);
                        dis.printenter();
                        main.whichplace();
                    }
                    else{dis.printnosilver();dis.printenter();main.whichplace();}
                }
                case 2 -> main.whichplace();
                default -> {dis.printinvalid();dis.printenter();main.whichplace();}
            }
        }
        else{
            System.out.println("Your Health is full.");dis.printenter();main.whichplace();
        }
    }
    public void inn(){
        int innopt=0;
        if(Main.bloodring>0){Main.maxhp=30;}
        if(Main.hp<Main.maxhp){
            System.out.println("Pay 200 silver to regain full hp.");
            System.out.println("1. Pay 200 silver");
            System.out.println("2. Continu your adventure");
            dis.printyouchose();
            innopt=sc.nextInt();
            dis.printnextline();
            switch (innopt) {
                case 1 -> {
                    if(Main.coin>=200){
                        Main.coin=Main.coin-200;Main.hp=Main.maxhp;
                        System.out.println("Your hp is full.");
                        System.out.println("Your current hp is "+Main.hp);
                        dis.printenter();
                        main.whichplace();
                    }
                    else{dis.printnosilver();dis.printenter();main.whichplace();}
                }
                case 2 -> main.whichplace();
                default -> {dis.printinvalid();dis.printenter();main.whichplace();}
            }
        }
        else{
            System.out.println("Your Health is full.");dis.printenter();main.whichplace();
        }
    }
    public void mayor(){
        int mayoropt=0;
        if(Main.mayorquest==1&&Main.mayorqueststage==1){
            dis.printmayorquest(1);
            dis.printmayorquest(11);
            Main.ironsword++;
            mayorqueststage++;
            dis.printenter();
            main.whichplace();
        }
        else if(Main.mayorquest==1&&Main.mayorqueststage==2){
            dis.printmayorquest(2);
            if(Main.wood>=10&&stone>=10){
                System.out.print("1. ");dis.printmayorquest(3);
                System.out.print("2. ");dis.printmayorquest(4);
            }
            else{System.out.print("1. ");dis.printmayorquest(4);}
            dis.printyouchose();mayoropt=sc.nextInt();dis.printnextline();
            switch (mayoropt){
                case 1 -> {
                    if(Main.wood>=10&&stone>=10){
                        Main.wood=Main.wood-10;Main.stone=Main.stone-10;Main.coin=Main.coin+40;
                        Main.mayorquest++;Main.mayorqueststage--;
                        town.thouses[3].open=true;
                        dis.printmayorquest(5);dis.printenter();
                        dis.printmayorquest(6);dis.printenter();
                        main.whichplace();
                    }
                    else{main.whichplace();}
                }
                case 2 -> {
                    if(Main.wood>=10&&stone>=10){main.whichplace();}
                    else{dis.printinvalid();dis.printenter();main.whichplace();}
                }
                default -> {dis.printinvalid();dis.printenter();main.whichplace();}
            }
        }
        else if(Main.mayorquest==2&&Main.mayorqueststage==1){
            dis.printmayorquest(12);
            if(Main.wood>=10&&stone>=10){
                System.out.print("1. ");dis.printmayorquest(3);
                System.out.print("2. ");dis.printmayorquest(10);
            }
            else{
                System.out.print("1. ");dis.printmayorquest(10);
            }
            dis.printyouchose();mayoropt=sc.nextInt();dis.printnextline();
            switch (mayoropt){
                case 1 -> {
                    if(Main.wood>=10&&stone>=10){
                        Main.wood=Main.wood-10;Main.stone=Main.stone-10;Main.coin=Main.coin+40;
                        dis.printmayorquest(5);dis.printenter();main.whichplace();
                    }
                    else{
                        dis.printmayorquest(8);dis.printenter();main.whichplace();
                    }
                }
                case 2 -> {
                    if(Main.wood>=10&&stone>=10){dis.printmayorquest(8);dis.printenter();main.whichplace();}
                    else{dis.printinvalid();dis.printenter();main.whichplace();}
                }
                default -> {dis.printinvalid();dis.printenter();main.whichplace();}
            }
        }
    }
    public void sorcerer(){
        int magicopt=0;
        if(Main.magicquest==1&&Main.magicqueststage==1){
            dis.printsorcererquest(2);
            Main.magicqueststage++;
            dis.printenter();
            main.whichplace();
        }
        else if(Main.magicquest==1&&Main.magicqueststage==2){
            dis.printsorcererquest(3);
            if(Main.herb>=3){
                System.out.print("1. ");dis.printsorcererquest(4);
                System.out.print("2. ");dis.printsorcererquest(5);
            }
            else{System.out.print("1. ");dis.printsorcererquest(5);}
            dis.printyouchose();magicopt=sc.nextInt();dis.printnextline();
            switch (magicopt){
                case 1 -> {
                    if(Main.herb>=3){
                        Main.herb=Main.herb-3;Main.coin=Main.coin+150;
                        Main.magicquest++;Main.magicqueststage--;
                        town.thouses[5].open=true;
                        dis.printsorcererquest(9);dis.printsorcererquest(11);
                        dis.printenter();main.whichplace();
                    }
                    else{main.whichplace();}
                }
                case 2 -> {
                    if(Main.herb>=3){main.whichplace();}
                    else{dis.printinvalid();dis.printenter();main.whichplace();}
                }
                default -> {dis.printinvalid();dis.printenter();main.whichplace();}
            }
        }
        else if(Main.magicquest==2&&Main.magicqueststage==1){
            dis.printsorcererquest(3);
            if(Main.herb>=3){
                System.out.print("1. ");dis.printsorcererquest(4);
                System.out.print("2. ");dis.printsorcererquest(5);
            }
            else{System.out.print("1. ");dis.printsorcererquest(5);}
            dis.printyouchose();magicopt=sc.nextInt();dis.printnextline();
            switch (magicopt){
                case 1 -> {
                    if(Main.herb>=3){
                        Main.herb=Main.herb-3;Main.coin=Main.coin+150;
                        dis.printsorcererquest(9);
                        dis.printenter();main.whichplace();
                    }
                    else{main.whichplace();}
                }
                case 2 -> {
                    if(Main.herb>=3){main.whichplace();}
                    else{dis.printinvalid();dis.printenter();main.whichplace();}
                }
                default -> {dis.printinvalid();dis.printenter();main.whichplace();}
            }
        }
    }
    public void blacksmit(){
        int smitopt=0;
        if(bsmitquest==1&&bsmitqueststage==1){
            dis.printuname();
            dis.printbalcksmitquest(1);
            dis.printenter();
            dis.printbalcksmitquest(2);
            dis.printbalcksmitquest(3);
            Main.bsmitqueststage++;
            dis.printenter();
            main.whichplace();
        }
        else if(bsmitquest==1&&bsmitqueststage==2){
            dis.printbalcksmitquest(4);
            if(Main.coal>=5){
                System.out.print("1. ");dis.printbalcksmitquest(5);
                System.out.print("2. ");dis.printbalcksmitquest(6);
            }
            else{System.out.print("1. ");dis.printbalcksmitquest(6);}
            dis.printyouchose();smitopt=sc.nextInt();dis.printnextline();
            switch (smitopt){
                case 1 -> {
                    if(Main.coal>=5){
                        Main.coal=Main.coal-5;Main.coin=Main.coin+100;Main.ironarmour++;
                        Main.bsmitquest++;Main.bsmitqueststage--;
                        town.thouses[6].open=true;
                        dis.printbalcksmitquest(11);dis.printbalcksmitquest(7);
                        dis.printenter();main.whichplace();
                    }
                    else{main.whichplace();}
                }
                case 2 -> {
                    if(Main.coal>=5){main.whichplace();}
                    else{dis.printinvalid();dis.printenter();main.whichplace();}
                }
                default -> {dis.printinvalid();dis.printenter();main.whichplace();}
            }
        }
        else if(bsmitquest==2&&bsmitqueststage==1){
            dis.printbalcksmitquest(12);
            if(Main.coal>=5){
                System.out.print("1. ");dis.printbalcksmitquest(5);
                System.out.print("2. ");dis.printbalcksmitquest(6);
            }
            else{System.out.print("1. ");dis.printbalcksmitquest(6);}
            
        }
    }
    public void town(int x){
        System.out.println("x="+x);
    }
    public static void main(String[] args) {
//        main.whichplace();
        dis.printbalcksmitquest(12);
        System.out.print("1. ");dis.printbalcksmitquest(5);
        System.out.print("2. ");dis.printbalcksmitquest(9);
        System.out.print("3. ");dis.printbalcksmitquest(6);
    }
}
