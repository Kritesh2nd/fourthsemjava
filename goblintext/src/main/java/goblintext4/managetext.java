package goblintext4;
import static goblintext4.displaytext.dis;
import static goblintext4.forest.f;
import static goblintext4.textmethod.tm;
public class managetext extends Main{
    static managetext mt = new managetext();
    public void town(){
        dis.towntext(0);dis.towntext(1);dis.enter();
        dis.towntext(2);dis.towntext(3);dis.enter();
    }
    public void temple(int stage){
        switch (stage) {
            case 1 -> {
                dis.name(1);dis.templetext(0,0);
                System.out.print("1. ");dis.templetext(0,1);
                System.out.print("2. ");dis.templetext(0,2);
                System.out.print("3. ");dis.templetext(0,3);
                dis.youchose(3);}
            case 11 -> {dis.name(1);dis.templetext(0,4);dis.templetext(0,5);}
            case 12 -> {dis.name(1);dis.templetext(0,4);dis.templetext(0,6);}
            case 2 -> {
                dis.name(1);
                dis.templetext(1,0);dis.templetext(1,1);
                dis.nextline();
                dis.templetext(1,2);
                dis.enter();
            }
            default -> {}
        }
    }
    public void inn(int stage){
        if(stage==1){
            dis.name(2);dis.inntext(0,0);
            System.out.print("1. ");dis.inntext(0,1);
            System.out.print("2. ");dis.inntext(0,2);
            dis.youchose(2);
        }
        else if(stage==11){
            dis.name(2);dis.inntext(0,3);dis.inntext(0,4);
            dis.enter();
        }
        else if(stage==12){
            dis.name(2);
            dis.inntext(1,0);dis.inntext(1,1);
            dis.nextline();
            dis.inntext(1,2);//dis.enter();
        }
    }
    public void mayor(int stage){
        if(stage==1){
            dis.name(0);
            dis.mayortext(0,0);
            dis.nextline();
            dis.name(3);
            dis.mayortext(0,1);
            dis.mayortext(0,2);
            dis.mayortext(0,3);
            dis.mayortext(0,4);
            dis.enter();
        }
        else if(stage==2){
            dis.name(3);
            dis.mayortext(1,0);
            dis.nextline();
            dis.name(0);
            System.out.print("1. ");dis.mayortext(1,1);
            System.out.print("   ");dis.mayortext(1,2);
            System.out.print("2. ");dis.mayortext(1,3);
        }
        else if(stage==211){
            dis.name(3);
            dis.mayortext(1,4);
            dis.mayortext(1,5);
            dis.enter();
        }
        else if(stage==212){
            dis.name(3);
            dis.mayortext(1,6);
            dis.enter();
        }
        else if(stage==22){
            dis.name(3);
            dis.mayortext(1,7);
            dis.enter();
        }
        else if(stage==3){
            dis.name(3);
            dis.mayortext(2,0);
            dis.nextline();
            dis.name(0);
            System.out.print("1. ");dis.mayortext(2,1);
            System.out.print("   ");dis.mayortext(2,2);
            System.out.print("2. ");dis.mayortext(2,3);
        }
        else if(stage==311){
            dis.name(3);
            dis.mayortext(2,4);
            dis.enter();
        }
        else if(stage==312){
            dis.name(3);
            dis.mayortext(2,5);
            dis.enter();
        }
        else if(stage==32){
            dis.name(3);
            dis.mayortext(2,6);
            dis.enter();
        }
        else{
            dis.invalid();
            System.out.println("Stage options are 1 2 211 212 22 3 311 312 32");
        }
    }
    public void sorcerer(int stage){
        if(stage==1){
            dis.name(0);
            dis.sorcerertext(0,0);
            dis.enter();
            dis.name(4);
            dis.sorcerertext(0,1);
            dis.sorcerertext(0,2);
            dis.enter();
            dis.name(0);
            dis.sorcerertext(0,3);
            dis.enter();
            dis.name(4);
            dis.sorcerertext(0,4);
            dis.sorcerertext(0,5);
            dis.enter();
            dis.name(0);
            dis.sorcerertext(0,6);
            dis.enter();
        }
        else if(stage==2){
            dis.name(4);
            dis.sorcerertext(1,0);
            dis.nextline();
            System.out.print("1. ");dis.sorcerertext(1,1);
            System.out.print("2. ");dis.sorcerertext(1,2);
            System.out.print("3. ");dis.sorcerertext(1,3);
        }
        else if(stage==211){
            dis.name(4);
            dis.sorcerertext(1,4);
            dis.sorcerertext(1,5);
            dis.sorcerertext(1,6);
            dis.enter();
        }
        else if(stage==212){
            dis.name(4);
            dis.sorcerertext(1,7);
            dis.enter();
        }
        else if(stage==22){
            dis.name(4);
            dis.sorcerertext(1,8);
            dis.enter();
        }
        else if(stage==231){
            mt.sorcerer(5);
//            goto sorcerer shop
        }
        else if(stage==232){
            dis.locked();
            dis.enter();
        }
        else if(stage==30){
            dis.name(4);
            dis.sorcerertext(2,0);
            dis.enter();
            dis.name(0);
            dis.sorcerertext(2,1);
            dis.enter();
            dis.name(4);
            dis.sorcerertext(2,2);
            dis.nextline();
            System.out.print("1. ");dis.sorcerertext(2,3);
            System.out.print("2. ");dis.sorcerertext(2,4);
            System.out.print("3. ");dis.sorcerertext(2,5);
        }
        else if(stage==3){
            dis.name(4);
            dis.sorcerertext(2,2);
            dis.nextline();
            System.out.print("1. ");dis.sorcerertext(2,3);
            System.out.print("2. ");dis.sorcerertext(2,4);
            System.out.print("3. ");dis.sorcerertext(2,5);
        }
        else if(stage==311){
            dis.name(4);
            dis.sorcerertext(2,6);
            dis.sorcerertext(2,7);
            dis.enter();
        }
        else if(stage==312){
            dis.name(4);
            dis.sorcerertext(2,8);
            dis.enter();
        }
        else if(stage==32){
            dis.name(4);
            dis.sorcerertext(2,9);
            dis.enter();
        }
        else if(stage==331){
            mt.sorcerer(5);
//            goto sorcerer shop
        }
        else if(stage==332){
            dis.locked();
            dis.enter();
        }
        else if(stage==4){
            dis.name(4);
            dis.sorcerertext(3,0);
            dis.nextline();
            System.out.print("1. ");dis.sorcerertext(3,1);
            System.out.print("2. ");dis.sorcerertext(3,2);
            System.out.print("3. ");dis.sorcerertext(3,3);
        }
        else if(stage==411){
            dis.name(4);
            System.out.print("3. ");dis.sorcerertext(3,4);
            dis.enter();
        }
        else if(stage==412){
            dis.name(4);
            System.out.print("3. ");dis.sorcerertext(3,5);
            dis.enter();
        }
        else if(stage==42){
            dis.name(4);
            System.out.print("3. ");dis.sorcerertext(3,6);
            dis.enter();
        }
        else if(stage==5){
            dis.name(4);
            dis.sorcerertext(4,0);
            dis.sorcerertext(4,1);
            dis.sorcerertext(4,2);
            dis.sorcerertext(4,3);
            dis.sorcerertext(4,4);
            dis.sorcerertext(4,5);
            dis.sorcerertext(4,6);
            dis.nextline();
            System.out.print("1. ");dis.sorcerertext(4,7);
            System.out.print("2. ");dis.sorcerertext(4,8);
            System.out.print("3. ");dis.sorcerertext(4,9);
        }
        else if(stage==51){
            dis.nextline();
            dis.sorcerertext(4,10);
            dis.enter();
        }
        else if(stage==52){
            dis.nextline();
            dis.sorcerertext(4,11);
            dis.enter();
        }
        else if(stage==53){
            dis.nextline();
            dis.sorcerertext(4,12);
            dis.enter();
        }
        else if(stage==54){
            dis.nextline();
            dis.sorcerertext(4,13);
            dis.enter();
        }
        else{
            dis.invalid();
            System.out.println("Stage options are 1 2 211 212 22 231 232 30 3 311 312 32 331 332 4 411 412 42 5 51 52 53 54");
        } 
    }
    public void balcksmith(int stage){
        if(stage==1){
            dis.name(0);
            dis.balcksmithtext(0,0);
            dis.enter();
            dis.name(5);
            dis.balcksmithtext(0,1);
            dis.balcksmithtext(0,2);
            dis.balcksmithtext(0,3);
            dis.enter();
            dis.name(0);
            dis.balcksmithtext(0,4);
            dis.enter();
        }
        else if(stage==2){
            dis.name(5);
            dis.balcksmithtext(1,0);
            dis.name(0);
            System.out.print("1. ");dis.balcksmithtext(1,1);
            System.out.print("2. ");dis.balcksmithtext(1,2);
            System.out.print("3. ");dis.balcksmithtext(1,3);
        }
        else if(stage==211){
            dis.name(5);
            dis.balcksmithtext(1,4);
            dis.balcksmithtext(1,5);
            dis.balcksmithtext(1,6);
            dis.balcksmithtext(1,7);
            dis.balcksmithtext(1,8);
            dis.enter();
        }
        else if(stage==212){
            dis.balcksmithtext(1,9);
            dis.enter();
        }
        else if(stage==22){
            dis.name(5);
            dis.balcksmithtext(1,10);
            dis.enter();
        }
        else if(stage==231){
            mt.balcksmith(5);
//            goto blacksmith shop
        }
        else if(stage==232){
            dis.locked();
            dis.enter();
        }
        else if(stage==3){
            dis.name(5);
            dis.balcksmithtext(2,0);
            System.out.print("1. ");dis.balcksmithtext(2,1);
            System.out.print("2. ");dis.balcksmithtext(2,2);
            System.out.print("3. ");dis.balcksmithtext(2,3);
        }
        else if(stage==311){
            dis.name(5);
            dis.balcksmithtext(2,4);
            dis.balcksmithtext(2,5);
            dis.balcksmithtext(2,6);
            dis.balcksmithtext(2,7);
            dis.enter();
        }
        else if(stage==312){
            dis.balcksmithtext(2,8);
        }
        else if(stage==32){
            dis.name(5);
            dis.balcksmithtext(2,9);
            dis.enter();
        }
        else if(stage==331){
            mt.balcksmith(5);
//            goto blacksmith shop
        }
        else if(stage==332){
            dis.locked();
            dis.enter();
        }
        else if(stage==4){
            dis.name(5);
            dis.balcksmithtext(3,0);
            System.out.print("1. ");dis.balcksmithtext(3,1);
            System.out.print("2. ");dis.balcksmithtext(3,2);
            System.out.print("3. ");dis.balcksmithtext(3,3);
        }
        else if(stage==411){
            dis.name(5);
            dis.balcksmithtext(3,4);
            dis.balcksmithtext(3,5);
            dis.balcksmithtext(3,6);
            dis.balcksmithtext(3,7);
            dis.enter();
        }
        else if(stage==412){
            dis.balcksmithtext(3,8);
        }
        else if(stage==42){
            dis.name(5);
            dis.balcksmithtext(3,9);
            dis.enter();
        }
        else if(stage==431){
            mt.balcksmith(5);
//            goto blacksmith shop
        }
        else if(stage==432){
            dis.locked();
            dis.enter();
        }
        else if(stage==5){
            dis.name(4);
            dis.balcksmithtext(4,0);
            dis.balcksmithtext(4,1);
            dis.balcksmithtext(4,2);
            dis.balcksmithtext(4,3);
            dis.balcksmithtext(4,4);
            dis.balcksmithtext(4,5);
            dis.balcksmithtext(4,6);
            dis.nextline();
            System.out.print("1. ");dis.balcksmithtext(4,7);
            System.out.print("2. ");dis.balcksmithtext(4,8);
            System.out.print("3. ");dis.balcksmithtext(4,9);
        }
        else if(stage==51){
            dis.nextline();
            dis.balcksmithtext(4,10);
            dis.enter();
        }
        else if(stage==52){
            dis.nextline();
            dis.balcksmithtext(4,11);
            dis.enter();
        }
        else if(stage==53){
            dis.nextline();
            dis.balcksmithtext(4,12);
            dis.enter();
        }
        else if(stage==54){
            
            dis.nextline();
            dis.balcksmithtext(4,13);
            dis.enter();
        }
        else{
            dis.invalid();
            System.out.println("Stage options are 1 2 211 212 22 231 232 3 311 312 32 331 332 4 411 412 42 431 432 5 51 52 53");
        } 
    }
    public void westlake(int stage){
        int westopt=0;
        if(stage==1){
            dis.foresttext(0,0);
            dis.fighttext(0,0);
        }
        else if(stage==11){
            dis.foresttext(1,1);
            dis.foresttext(1,4);
            System.out.print("1. ");dis.foresttext(1,5);
            System.out.print("2. ");dis.foresttext(1,11);
            dis.youchose(2);
            westopt=tm.getopt();
            switch(westopt){
                case 1 -> {/*f.fight(0,1);*/}
                case 2 -> mt.westlake(12);
                default -> {dis.invalid();dis.enter();mt.mainforest();}
            }
        }
        else if(stage==111){
            dis.foresttext(1,6);
        }
        else if(stage==12){
            dis.foresttext(1,13);
            mt.mainforest();
        }
            
    }
    public void northmountain(int stage){}
    public void eastforest(int stage){}
    public void southsea(int stage){}
    public void goblincave(int stage){}
    public void mainforest(){
        int mforestopt=0;
        dis.foresttext(0,0);
            dis.foresttext(1,0);
            dis.nextline();
            System.out.print("1. ");dis.foresttext(2,0);
            System.out.print("2. ");dis.foresttext(2,1);
            System.out.print("3. ");dis.foresttext(2,2);
            System.out.print("4. ");dis.foresttext(2,3);
            System.out.print("5. ");dis.foresttext(2,4);
            System.out.println("6. Status");
            System.out.println("7. Description");
            dis.youchose(7);
            mforestopt=tm.getopt();
            switch(mforestopt){
                case 1 -> tm.westlake();
                case 2 -> mt.northmountain(1);
                case 3 -> mt.eastforest(1);
                case 4 -> mt.southsea(1);
                case 5 -> mt.goblincave(1);
                case 6 -> {dis.status();dis.enter();mt.mainforest();}
                case 7 -> {dis.description();dis.enter();mt.mainforest();}
                default -> {dis.invalid();dis.enter();dis.whichplace();}
            }
    }
    
    public static void main(String[] args) {
        mt.westlake(1);
        dis.nextline();
        mt.westlake(11);
        dis.nextline();
        mt.westlake(111);
    }
}

