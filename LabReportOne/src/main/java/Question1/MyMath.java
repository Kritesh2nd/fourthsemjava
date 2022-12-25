package Question1;
public class MyMath {
    public int add(int a, int b ){
        return (a+b);
    }
    public int add(int a, int b, int c){
        return (a+b+c);
    }
    public int add(int a, int b, int c,int d){
        return (a+b+c+d);
    }
    public static void main(String[] args) {
        MyMath m= new MyMath();
        System.out.println("First addition is "+ m.add(1, 2));
        System.out.println("Second addition is "+ m.add(1, 2, 3));
        System.out.println("Third Addition is" + m.add(1, 2, 3, 4));
    }
}