package goblintext2;

import static goblintext2.itemname.in;
import java.io.IOException;

public class displaytext extends Main{
    static displaytext dis = new displaytext();
    public void locked(){
        System.out.println("This option is locked.");
    }
    public void invalid(){
        System.out.println("This choice is Invalid.");
    }
    public void nosilver(){
        System.out.println("You don't have enough "+in.coin.name+".");
    }
    public void youchose(int n){
        System.out.println("\nYou chose option 1~"+n+" : ");
    }
    public void nextline(){
        System.out.println("");
    }
    public void enter(){
        System.out.println("\nenter to continue...");
        try{System.in.read();}
        catch(IOException e){}
    }
    public void line_(){
        System.out.println("---------------------------");
    }
    public void line__(){
        System.out.println("===========================");
    }
    public void name(int n){
        switch (n) {
            case 0 -> System.out.println(Main.name+",");
            case 1-> System.out.println(in.nun.name+" ["+in.nun.title+"],");
            case 2-> System.out.println(in.innkeeper.name+" ["+in.innkeeper.title+"],");
            case 3-> System.out.println(in.mayor.name+" ["+in.mayor.title+"],");
            case 4-> System.out.println(in.sorcerer.name+" ["+in.sorcerer.title+"],");
            case 5-> System.out.println(in.blacksmith.name+" ["+in.blacksmith.title+"],");
            default -> System.out.println("No Person"+",");
        }
    }
    public void towntext(int n){
        String[] text = {
            "You finally reached "+in.townname.name+".",
            "After talking to townsfolk, you found that this town was recently attacked by the goblins.",
            "You talked to the innkeeper and found out the Mayor is hiring people.",
            "Maybe you should visit him."
        };
        if(n>=0&&n<text.length){System.out.println(text[n]);}
    }
    public void templetext(int m, int n){
        int a,smalldonation=10,bigdonation=100;
        String[][] text = {
            {
                "Do you want to pray in this temple?",
                "Pray [Donate "+smalldonation+" silver]",
                "Pray [Donate "+bigdonation+" silver]",
                "No thankyou.",
//                Stage 1 Option result
//                Option 1 & 2
                "May god hear your prayers.",
                "Your hp is increased +1 hp."
            },
            {
            //Gets Radiant Shield after donating 2000 silver
                "I stumbled upon this item which I thought was lost.",
                "Maybe it's fate. You should take this item with you.",
                "You acquired an item. +1 Radiant Shield."
            }  
        };
        for(a=0;a<text.length;a++){if(m==a&&n>=0&&n<text[a].length){System.out.println(text[m][n]);}}
    }
    public void inntext(int m,int n){
        int a,staycost=50;
        String[][] text = {
            {
                "Do you want to rest in this inn?",
                "Yes, I will rest. [Cost "+staycost+" silver]",
                "No, I am good.",
//                Stage 1 Option 1 result
                "Enjoy your stay.",
                "You recovered your full hp."
            },
            {
                //Gets map after staying in inn for 10 times
                "A customer left this tattered map.",
                "Maybe you can find a use for it.",
                "You acquired an item. +1 Map of "+in.goblincave.name

            }
        };
        for(a=0;a<text.length;a++){if(m==a&&n>=0&&n<text[a].length){System.out.println(text[m][n]);}}
    }
    public void mayortext(int m, int n){
        int a,maxwood=5,maxstone=5,yourwood=5,yourstone=5,firstreward=40,secondreward=20;
        if(Main.wood<=maxwood){yourwood=Main.wood;}
        if(Main.stone<=maxstone){yourstone=Main.stone;}
        String[][] text={
            {
                "I heard you are hiring people.",
                "Yes, I am in need of wood and stone for house repair.",
                "As you see "+in.townname.name+" is filled with goblins.",
                "Can you bring me 10 wood and 10 stones from Whispering Forest?",
                "I will reward you accordingly."
            },
            {
                "Did you bring wood and stone?",
                "Yes I brought wood and stone.",
                "[wood ("+yourwood+"/"+maxwood+"), stone ("+yourstone+"/"+maxstone+")]",
                "No I did not.",
//                Stage 2 Option 1 result
                "Thank you adventurer. Here's your reward +"+firstreward+" silver.",
                "You should visit the Sorcerer, he is looking for people to go in the Whispering Forest.",
                "You don't have enough wood and stone.",
//                Stage 2 Option 2 result
                "Come to me when you have collected enough wood and stone."
            },
            {
                "Did you bring wood and stone?",
                "Yes I brought wood and stone.",
                "[wood ("+yourwood+"/"+maxwood+"), stone ("+yourstone+"/"+maxstone+")]",
                "No I did not.",
//                Stage 3 Option 1 result
                "Thank you adventurer. Here's your reward +"+secondreward+" silver.",
                "You don't have enough wood and stone.",
//                Stage 3 Option 2 result
                "Come to me when you have collected enough wood and stone."
            }
        };
        for(a=0;a<text.length;a++){if(m==a&&n>=0&&n<text[a].length){System.out.println(text[m][n]);}}
        
    }
    public void sorcerertext(int m, int n){
        int a=0,firstherb=30,secondherb=15,maxherb=3,yourherb=3,maxcore=2,yourcore=2,corereward=200;
        String title1 = in.potion.title; // Potion
        String title2 = in.ring.title; // Ring
        String name1 = in.potion.name; // Ayelet
        String name2 = in.ring.name; // Enid
        String desc1 = in.potion.desc; // Water of Life
        String desc2 = in.ring.desc; // The Flower of Soul
        int cost1=500,cost2=1400;
        
        String[][] text={
            {
                "Are you looking for people to go to the "+in.forestname.name+"?",
                "Yes, I need a core of powerful goblin warriors.",
                "But you should know that "+in.forestname.name+" is filled with goblins.",
                "Yes I'm aware that this "+in.forestname.name+" is filled with danger.",
                "Then, if you are really strong, first bring me 3 "+in.herb.name+" from the "+in.forestname.name+".",
                "I will reward you accordingly.",
                "Ok I'll bring the "+in.herb.name+"."
            },
            {
                "Did you bring the "+in.herb.name+"?",
                "Yes I brought the "+in.herb.name+". ("+yourherb+"/"+maxherb+")",
                "No I did not.",
                "Shop",
//                Stage 2 Option 1 result
                "I see you are a strong adventurer. Here's your reward +"+firstherb+" silver.",
                "Bring me 3 cores of the strong goblin warrior. I will let you buy magic items from my shop.",
                "And I heard a nearby blacksmith is looking for you.",
                "You don't have enough herbs.",
//                Stage 2 Option 2 result
                "Come to me when you have collected enough "+in.herb.name+"."
//                Stage 2 Option 3 result
//                Go to shop
//                This option is locked
            },
            {
                "Did you defeat the goblin warrior?",
                "Yes I was able to defeat the goblin warrior.",
                "Did you get the core?",
                "Yes I got the core. ("+yourcore+"/"+maxcore+")",                
                "No I did not.",
                "Shop",
//                Stage 3 Option 1 result
                "Finally now I will be able to continue my experiment in "+in.ring.name+".",
                "Here is your reward +"+corereward+" "+in.coin.name+".",
                "You don't have enough core.",
//                Stage 3 Option 2 result
                "Come to me when you defeat the goblin warrior"
//                Stage 3 Option 3 result                    
//                  goto shop
            },
            {
                "By any chance do you have more "+in.herb.name+"?",
                "Yes I some more "+in.herb.name+". ("+yourherb+"/"+maxherb+")",
                "No I did not.",
                "Shop",
//                Stage 4 Option 1 result
                "Here's your reward for the "+in.herb.name+" +"+secondherb+" "+in.coin.name+".",
                "You don't have enough "+in.herb.name+".",
//                Stage 4 Option 2 result
                "You can bring me some more "+in.herb.name+". I will pay you accordingly."
            },
            {   
//                If sorcerer shop is open
//                title1 = Potion, title2 = Ring
//                name1 = Ayelet, name2 = Enid
//                desc1 = Water of Life , desc2 = The Flower of Soul
                "Here is my shop",
                "---------------------------------------------------",
                "|SN| Type    | Name   | Description        | Cost |",
                "|-------------------------------------------------|",
                "|1 | "+title1+"  | "+name1+" | "+desc1+"      | "+cost1+"  |",
                "|2 | "+title2+"    | "+name2+"   | "+desc2+" | "+cost2+" |",
                "---------------------------------------------------",
                name1+" [Cost : "+cost1+"]",
                name2+" [Cost : "+cost2+"]",
                "I will come later",
//                Stage 5 option 1 result 51
                "You gained +1 "+name1+" ["+title1+"]",
//                Stage 5 option 2 result 52
                "You gained +1 "+name2+" ["+title2+"]",
//                Stage 5 option 3 result 53
                "Shop function is locked",
//                when silver is not enough 54
                "You dont have enough silver"
            }               
        };
        for(a=0;a<text.length;a++){if(m==a&&n>=0&&n<text[a].length){System.out.println(text[m][n]);}}
    }
    public void balcksmithtext(int m, int n){
        int a,yourcoal=5,maxcoal=5,coalreward=50,yourmagicstone=2,maxmagicstone=2;
        if(Main.coal<=maxcoal){yourcoal=Main.coal;}
        if(Main.magicstone<=maxmagicstone){yourmagicstone=Main.magicstone;}
        String title1 = in.sword.title; // sword
        String title2 = in.armor.title; // Armor
        String name1 = in.sword.name; // Starshatterer
        String name2 = in.armor.name; // Malevolent
        String desc1 = in.sword.desc; // Executioner of Frost
        String desc2 = in.armor.desc; // Aquycrase Chestpiece
        int cost1=1100,cost2=1200;
        String[][] text ={
            {
//                1
                in.sorcerer.name+" told me you were looking for me.",
                "Yeah, I was told you were a brave warrior.",
                "I am in need of some coal but because of goblins running in the "+in.forestname.name+".",
                "I am not able to do mine. If you bring me 5 coal I will reward you.",
                "Ok, I'll bring the coal."
            },
            {
//                2
                "Did you bring the coal?",
                "Yes I brought the coal. ("+yourcoal+"/"+maxcoal+")",
                "No I did not.",
                "Shop",
//                Stage 2 Option 1 result 211
                "You were really brave as I heard.",
                "Here's your reward +1 Iron Armor.",
                "There is a magical stone called "+in.magicstone.name+" that appears once in a 100 year in "+in.southsea.name,
                "But there are goblin warriors on the path to "+in.southsea.name+".",
                "If you bring me 2 "+in.magicstone.name+" I will make you two new equipment.",
//                212
                "You don't have enough coal.",
//                Stage 2 Option 2 result 22
                "Come to me when you have collected enough coal."
            },
            {
//                3
                "Were you able to get the "+in.magicstone.name+"?",
                "Yes I brought the "+in.magicstone.name+". ("+yourmagicstone+"/"+maxmagicstone+")",
                "No I did not.",
                "Shop",
//                Stage 3 Option 1 result 311
                "You know of no fear. You were really able to get the "+in.magicstone.name+".",
                "As promised I will make you two new equipment.",
                "But it's going to be expensive, rare materials are expensive.",
                "Come to me after a week.",
//                312
                "You don't have enough "+in.magicstone.name+"?",
//                Stage 3 Option 2 result 32
                "Come to me when you get the "+in.magicstone.name+"."
            },
            {
//                4
                "By any chance do you have more coal?",
                "If you have more coal, I will buy it from you.",
                "Yes I have some more coal. ("+yourcoal+"/"+maxcoal+")",
                "No, I don't have more coal.",
                "Shop",
//                Stage 4 Option 1 result 411
                "Here's your reward for the coal +"+coalreward+" "+in.coin.name+".",
//                412
                "You don't have enough coal.",
//                Stage 4 Option 2 result 42
                "You can bring me some more coal. I will pay you accordingly."
            },
            {
//                If blacksmith shop is open
//                title1 = sword
//                title2 = Armor
//                name1 = Starshatterer
//                name2 = Malevolent
//                desc1 = Executioner of Frost
//                desc2 = Aquycrase Chestpiece
//                5
                "Here is my shop.",
                "----------------------------------------------------------",
                "|SN| Type  | Name          | Description          | Cost |",
                "|--------------------------------------------------------|",
                "|1 | "+title1+" | "+name1+" | "+desc1+" | "+cost1+" |",
                "|2 | "+title2+" | "+name2+"    | "+desc2+" | "+cost2+" |",
                "----------------------------------------------------------",
                name1+" [Cost : "+cost1+"]",
                name2+" [Cost : "+cost2+"]",
                "I will come later",
//                Stage 5 option 1 result 51
                "You gained +1 "+name1+" ["+title1+"]",
//                Stage 5 option 2 result 52
                "You gained +1 "+name2+" ["+title2+"]",
//                Stage 5 option 3 result 53             
                "Shop function is locked",
//                when silver is not enough 54
                "You dont have enough silver"
            }
        };
        for(a=0;a<text.length;a++){if(m==a&&n>=0&&n<text[a].length){System.out.println(text[m][n]);}}
    }
    
    public static void main(String[] args) {
        
        
    }
}
