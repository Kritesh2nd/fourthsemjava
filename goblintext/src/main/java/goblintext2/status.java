package goblintext2;
import static goblintext2.itemname.in;
public class status extends Main{
    static status st = new status();
    public void status(){
        String weapon="none",armour="none",shield="none",ring="none";
        if(Main.magicsword>0){weapon=in.sword.name;}else if(Main.ironsword>0){weapon="Iron Sword";}
        if(Main.magicarmour>0){armour=in.armor.name;}else if(Main.ironarmour>0){armour="Iron Chestplate";}
        if(Main.magicshield>0){shield=in.shield.name;}
        if(Main.magicring>0){ring=in.ring.name;}
        System.out.println("=========================================");
        System.out.println("STATUS");
        System.out.println("-----------------------------------------");
        System.out.println("Health  : "+Main.hp+"/"+Main.maxhp);
        System.out.println("Attack  : "+Main.atka);
        System.out.println("Defence : "+Main.def);
        System.out.println("Silver  : "+Main.coin);
        System.out.println("Weapon  : "+weapon);
        System.out.println("Armour  : "+armour);
        System.out.println("Shield  : "+shield);
        System.out.println("Ring    : "+ring);
        System.out.println("=========================================");
        System.out.println("ITEMS");
        System.out.println("-----------------------------------------");
        System.out.println("|SN| Name        | Type         | Count |");
        System.out.println("-----------------------------------------");
        System.out.print("|1.| Wood        | resource     | "+Main.wood);
        st.countspacing(String.valueOf(Main.wood).length());
        System.out.print("|2.| Stone       | resource     | "+Main.stone);
        st.countspacing(String.valueOf(Main.stone).length());
        System.out.print("|3.| Coal        | resource     | "+Main.coal);
        st.countspacing(String.valueOf(Main.coal).length());
        System.out.print("|4.| Udi Leaf    | herb         | "+Main.herb);
        st.countspacing(String.valueOf(Main.herb).length());
        System.out.print("|5.| Aquycrase   | magic stone  | "+Main.magicstone);
        st.countspacing(String.valueOf(Main.magicstone).length());
        System.out.print("|6.| Goblin Core | monster core | "+Main.core);
        st.countspacing(String.valueOf(Main.core).length());
        System.out.print("|7.| Ayelet      | portion      | "+Main.potion);
        st.countspacing(String.valueOf(Main.potion).length());
        System.out.println("-----------------------------------------");
        System.out.println("=========================================");
    }
    public void countspacing(int n){for(int a=0;a<5-n;a++){System.out.print(" ");}System.out.println(" |");}
    public void description(){
        System.out.println("=======================================================");
        System.out.println("Equipments description");
        System.out.println("-------------------------------------------------------");
        System.out.println("1. Iron Sword");
        System.out.println("-> Just a normal iron sword");
        System.out.println("2. Iron Armour");
        System.out.println("-> Just a normal iron armor");
        System.out.println("3. Starshatterer");
        System.out.println("-> A powerful sword made by Janumri Runebow");
        System.out.println("-> Aquycrase is used to make this sword");
        System.out.println("4. Malevolent");
        System.out.println("-> A powerful armor made by Janumri Runebow");
        System.out.println("-> Aquycrase is used to make this armor");
        System.out.println("5. Radiant Shield");
        System.out.println("-> A holy item, that protects the user");
        System.out.println("-> Increase defense by 2 point");
        System.out.println("-> Blocks every 4th attack");
        System.out.println("6. Enid");
        System.out.println("-> A magic ring crafted by the Sorcerer Linus");
        System.out.println("-> Permanently increase hp by 10 point");
        System.out.println("");
        System.out.println("=======================================================");
        System.out.println("Items description");
        System.out.println("-------------------------------------------------------");
        System.out.println("1. Wood");
        System.out.println("-> Just a resource from a forest");
        System.out.println("2. Stone");
        System.out.println("-> Just a resource from a mountain");
        System.out.println("3. Coal");
        System.out.println("-> Just a resource from a mine");
        System.out.println("4. Udi Leaf");
        System.out.println("-> Rare leaf used for potion brewing");
        System.out.println("5. Goblin Core");
        System.out.println("-> Monster core found in strong goblin warrior");
        System.out.println("6. Ayelet");
        System.out.println("-> A portion brewed by Linus.");
        System.out.println("-> Heals 40% health when hp drops to 20%");
        System.out.println("-> Helas 50% health when equipped with shield");
        System.out.println("");
        System.out.println("=======================================================");
    }
    public static void main(String[] args) {
        st.status();st.description();
    }
}
