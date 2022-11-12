package goblintext4;
public class forest {
    public class forestclass{
        String name="name";int[] stage;
        public forestclass(String name, int[] stage){
            this.name=name;
            this.stage=stage;
        }
        public String name(){return name;}
        public int[] stage(){return stage;}
    }
    forestclass for1,for2,for3,for4,for5;
    public void insertgoblinvalue(){
        int[] val1={1,3,3,2,3,2};
        int[] val2={1,2,3,2,4,4};
        int[] val3={1,2,3,2,3,5};
        int[] val4={1,6,6,6,6,7};
        int[] val5={6,6,6,6,7,8};
        this.for1 = new forestclass("Bienris Waters",val1);
        this.for2 = new forestclass("Ganary Slopes",val2);
        this.for3 = new forestclass("Norstead Woods",val3);
        this.for4 = new forestclass("The Serene Ocean",val4);
        this.for5 = new forestclass("Dorbiens Hollow",val5);
    }
    public static void cat(){
        
    }
}

