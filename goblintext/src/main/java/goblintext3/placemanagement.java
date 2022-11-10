package goblintext3;

import java.util.Scanner;

public class placemanagement {
    static placemanagement pm = new placemanagement();
    public void forestentry(){
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,p;
        String[] text = {
           "You are in Whispering Willow Forest",
            "Where do you want to go",
            "1. Ganary Slopes",
            "2. Bienris Waters",
            "3. The Serene Ocean",
            "4. Norstead Woods",
            "5. Dorbiens Hollow",
            "6. Woodpine Rest"
        };
        for(a=0;a<text.length;a++){System.out.println(text[a]);}
        System.out.println("You choose ");
        p=sc.nextInt();
        thisplace(p);
    }
    public void thisplace(int place){
        switch(place){
            case 1 -> northmountain();
            default -> northmountain();
        }
    }
    public void northmountain(){
        String[] text = {
            "You enetered the Ganary Slopes.",
            "You saw a goblin."
        };
    }
    public static void main(String[] args) {
        pm.forestentry();
    }
}
