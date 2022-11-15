package AssignmentS;
import java.util.Scanner;
public class Assignment1 {
    public void ArithmeticOperator(int a, int b){
        System.out.println("\nUsing Arithmetic Operator");
        System.out.println("Addition of two number is "+(a+b));
        System.out.println("Substraction of two number is "+(a-b));
        System.out.println("Multiplication of two number is "+(a*b));
        System.out.println("Division of two number is "+(a/b));
        System.out.println("Remainder of two number is "+(a%b));
    }
    public void AssignmentOperatorr(){
        System.out.println("\nUsing Assignment Operator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer ");
        int num = sc.nextInt();
        int a = num, b = num, c = num, d = num;
        a += a;
        b -= b;
        c *= c;
        d /= d;
        System.out.println("Increment (+=) "+a);
        System.out.println("Descremnt (-=) "+b);
        System.out.println("Multiplication (*=) "+c);
        System.out.println("Division (/=) "+d);
    }
    public void Loops(){
        System.out.println("\nUsing for loop");
        int a;
        for(a = 1; a <= 10; a++){
            System.out.print(a+" ");
        }
        System.out.println("\n\nUsing while loop");
        int b = -10;
        while(b <= -1){
            System.out.print(b+" ");
            b++;
        }
        System.out.println("\n\nUsing do..while loop");
        int c = 1;
        do{
            System.out.println(7+" x "+c+" = "+(7*c));
            c++;
        }while(c <= 10);
    }
    public void ContinueAndBreak(){
//      Continue and Break
        System.out.println("\nUsing Continue");
        int a; 
        for(a = 1; a <= 10; a++){
            if(a == 5){
                continue;
            }
            System.out.print(a+" ");
        }
        System.out.println("\nUsing Break");
        int b;
        for(b = 1; b <= 10; b++){
            System.out.print(b+" ");
            if(b == 5){
                break;
            }
        }
    }
    public void Condition(){
//        If, if..else, if...else if... else, switch...case, &&, ||, !
        int num = 5;
        System.out.println("\n\nUsing if..else");
        if(num%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        System.out.println("\nUsing if..else if...else and &&");
        int a = 13, b = 7, c = 12;
        if(a > b && a > b){
            System.out.println("Largest number is "+a);
        }
        else if(b > c){
            System.out.println("Largest number is "+b);
        }
        else{
            System.out.println("Largest number is "+c);
        }
        System.out.println("\nUsing || and !");
        int x = 14, y = 15;
        if(x%2 == 0 || y%2 == 0){
            System.out.println("One of number "+x+" or "+y+" is even");
        }
        if(!(x%2 == 0)){
            System.out.println(x+" is odd");
        }
        else{
            System.out.println(x+" is even");
        }
        System.out.println("\nUsing switch...case");
        int z = 3;
        switch (z){
            case 1:
                System.out.println("Value of z is one");
                break;
            case 2:
                System.out.println("Value of z is two");
                break;
            case 3:
                System.out.println("Value of z is three");
                break;
            default:
                System.out.println("Value of z is more than 3");
        }
    }
    public static void main(String[] args) {
        Assignment1 a1 = new Assignment1();
        a1.ArithmeticOperator(13, 5);
        a1.AssignmentOperatorr();
        a1.Loops();
        a1.ContinueAndBreak();
        a1.Condition();
    }
}