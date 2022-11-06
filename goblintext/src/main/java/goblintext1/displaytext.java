package goblintext1;
public class displaytext extends Main{
    static displaytext dis = new displaytext();
    public void printlocked(){
        System.out.println("This option is locked.");
    }
    public static void main(String[] args) {
        dis.printlocked();
    }
    public void printinvalid(){
        System.out.println("This choice is Invalid.");
    }
    public void printnosilver(){
        System.out.println("You don't have enough silver.");
    }
    public void printyouchose(){
        System.out.println("\nYou chose option");
    }
    public void printnextline(){
        System.out.println("");
    }
    public void printmayorquest(int n){
        switch (n) {
            case 1 -> {
                System.out.println("You want to go to the next vilage?");
                System.out.println("Unfortunatly the bridge has been");
                System.out.println("destroyed by the goblins.");
                dis.printenter();
                System.out.println("I would had bridge repaired but,");
                System.out.println("I am busy with all these house repairs.\n");
                System.out.println("I would be glad if you bring some");
                System.out.println("woods and stone for house repair.");
                dis.printenter();
                System.out.println("You agreed to bring wood and stone.");
            }
            case 2 -> System.out.println("Did you bring 10 woods and 10 stones?");
            case 3 -> System.out.println("Here's your wood and stone.");
            case 4 -> System.out.println("No I haven't.");
            case 5 -> {
                System.out.println("You gave 10 wood and 10 stone.");
                System.out.println("You gained 40 silver.");
            }
            case 6 -> {
                System.out.println("I am still busy with house repairs.");
                System.out.println("You should visit the sorcerer in mean time.");
            }
            case 7 -> {
                System.out.println("You killed the goblin shama. (Surprised!!!)");
                System.out.println("Now our houses won't be destroyed by goblins");
                System.out.println("I will build the bridge for you.");
            }
            case 8 -> System.out.println("I am still busy with house repairs.");
            case 9 -> System.out.println("Mayor,");
            case 10 -> System.out.println("About bridge...");
            case 11 -> System.out.println("You gained Iron Sword +1, Axe +1, Pick axe+1.");
            case 12 -> System.out.println("Did you bring more woods and stones?");
            case 13 -> System.out.println("Why are you here?");
            default -> {
            }
        }
        
    }
    public void printsorcererquest(int n){
        if(n==1){
            System.out.println("Sorcerer,");
        }
        else if(n==2){
            System.out.println("Mayor told you to visit me???");
            System.out.println("Oh yes, I nearly forgot about it.");
            dis.printenter();
            System.out.println("I am currently working on a very");
            System.out.println("important expirement. If you get");
            System.out.println("me 3 herbs I will reward you.");
        }
        else if(n==3){
            System.out.println("Did you bring the herb?");
        }
        else if(n==4){
            System.out.println("Yes I brought the herb.");
        }
        else if(n==5){
            System.out.println("No I haven't.");
        }
        else if(n==6){
            System.out.println("I need goblin core for a very important");
            System.out.println("expirement. I heard it's very hard");
            System.out.println("to get a goblin core.");
            System.out.println("But,");
            dis.printenter();
            System.out.println("If you get me 4 goblin core,");
            System.out.println("I will reward you and let you");
            System.out.println("buy my magic item.");
        }
        else if(n==7){
            System.out.println("Did you bring the goblin core?");
        }
        else if(n==8){
            System.out.println("Yes I brought 4 goblin core.");
        }
        else if(n==9){
            System.out.println("Thank you for the herb.");
            System.out.println("Here's your reward 150 silver.");
        }
        else if(n==10){
            System.out.println("Finally I will be able to create");
            System.out.println("blood orb that I have been");
            System.out.println("researching for decade.");
            dis.printenter();
            System.out.println("Here's your reward 400 silver.");
            System.out.println("Now, you can buy from my shop.");
        }
        else if(n==11){
            System.out.println("You can still bring me herb.");
            System.out.println("I will pay you accordingly.");
            System.out.println("And,");
            dis.printenter();
            System.out.println("Blacksmit is looking for you.");
            System.out.println("You should go visit him");
        }
        
    }
    public void printsorcereopt(int n){
        if(n==1){System.out.println("Blood portion [heals 70% hp] [Cost 200 silver]");}
        else if(n==2){System.out.println("Blood orb [permanently increase hp] [Cost 600 silver]");}
        else if(n==3){System.out.println("Hers your herb.");}
        else if(n==4){System.out.println("Hers your goblin core.");}
    }
    public void printbalcksmitquest(int n){
        if(n==1){
            System.out.println("I heard you are looking for me.");
        }
        else if(n==2){
            System.out.println("Balcksmit,");
        }
        else if(n==3){
            System.out.println("Ohh yeah, because of these goblins I am not");
            System.out.println("able to mine in the mountains. If you bring");
            System.out.println("me 5 coal I will give you this armour.");
        }
        else if(n==4){
            System.out.println("Did you bring the coal?");
        }
        else if(n==5){
            System.out.println("Yes I bought the coal.");
        }
        else if(n==6){
            System.out.println("No i haven't.");
        }
        else if(n==7){
            System.out.println("I heard there's a special stone found in deep");
            System.out.println("ocean. If you bring me that stone I will make");
            System.out.println("your sword and armor stronger.");
        }
        else if(n==8){
            System.out.println("Did you brought the sea stone?");
        }
        else if(n==9){
            System.out.println("Yes, I have bought the sea stone.");
        }
        else if(n==10){
            System.out.println("Thank you for the coal.");
            System.out.println("Here's your reward 100 silver.");
        }
        else if(n==11){
            System.out.println("Here's your Iron Armour.");
            System.out.println("You gained Iron Armour +1.");
        }
        else if(n==12){
            System.out.println("Did you bring coal or sea stone?");
        }
    }
    public void printstatus(int n){
        switch (n){
            case 1 -> System.out.println("case 1");
            case 2 -> System.out.println("Your have "+Main.coin+"Silver");
        }
    }
    public void printenter(){
        System.out.println("\nenter to continue...");
        try{System.in.read();}
        catch(Exception e){e.printStackTrace();}
    }
    public void printline_(){
        System.out.println("---------------------------");
    }
    public void printline__(){
        System.out.println("===========================");
    }
    public void printuname(){
        System.out.println(Main.name+",");
    }
    public void status(){
        String sword="none",armour="none",ring="none";
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("STATUS");
        System.out.println("Health  : "+Main.hp+"/"+Main.maxhp);
        System.out.println("Attack  : "+Main.atk);
        System.out.println("Defence : "+Main.def);
        System.out.println("Silver  : "+Main.coin);
        if(Main.heroarmour>0){armour="Hero Armour";}
        else if(Main.ironarmour>0){armour="Iron Armour";}
        if(Main.herosword>0){armour="Hero Sword";}
        else if(Main.ironsword>0){armour="Iron Sword";}
        if(Main.bloodring>0){ring="Blood Ring";}
        System.out.println("Armour  : "+armour);
        System.out.println("Sword   : "+sword);
        System.out.println("Ring    : "+ring);
        System.out.println("---------------------------");
        System.out.println("ITEMS");
        System.out.println("Wood "+Main.wood+", Stone "+Main.stone+", Coal "+Main.coal);
        System.out.println("Herb "+Main.herb+", Sea Stone "+Main.seastone);
        System.out.println("---------------------------");
    }
}
