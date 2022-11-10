package goblintext4;
public class displaytext {
    static displaytext dt = new displaytext();
    public void mainoption(){
        int a;
        String[] text = {
            "Temple",
            "Inn",
            "Mayor",
            "Sorcerer",
            "Magic Shop",
            "Blacksmit",
            "Armour Shop",
            "Forest",
            "Status"
        };
        for(a=0;a<text.length;a++){System.out.println((a+1)+". "+text[a]);}
    }
    public static void main(String[] args) {
        dt.mainoption();
    }
}
