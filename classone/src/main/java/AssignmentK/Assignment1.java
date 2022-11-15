package AssignmentK;
import java.util.Scanner;
public class Assignment1 {
    public void operator(int a, int b){
        System.out.println("Two numbers are "+a+" & "+b);
        System.out.println("Addition of two number is "+(a+b));
        System.out.println("Substraction of two number is "+(a-b));
        System.out.println("Multiplication of two number is "+(a*b));
        System.out.println("Division of two number is "+(a/b));
        System.out.println("Remainder of two number is "+(a%b));
    }
    public void loops(int d,int e, int f){
        System.out.println("\nUsing for loop and continue");
        System.out.println("Multiplication of "+d);
        int a,b=1,c=1;
        for(a=1;a<21;a++){
            if(a==11){System.out.println();continue;}
            System.out.print((a*d)+" ");
        }
        System.out.println("\n\nUsing while loop and break");
        System.out.println("Multiplication of "+e);
        while(b<21){
            if(b==11){break;}
            System.out.print((b*e)+" ");
            b++;
        }
        System.out.println("\n\nUsing do while, multiplication of "+f);
        do{
            System.out.print((c*f)+" ");
            c++;
        }while(c<11);
        
    }
    public void condition(int a, int b, int c){
        System.out.println("\n\nUsing if..else and else..if");
        if(a%2==0){System.out.println(a+" is a even");}
        else{System.out.println(a+" is a odd");}
        if(b>0){System.out.println(b+" is a positive number");}
        else if(b<0){System.out.println(b+" is a negative number");}
        else{System.out.println(b+" is zero");}
        System.out.println("\nUsing switch case");
        switch (5){
            case 1-> System.out.println(c+" is a odd number");
            case 2-> System.out.println(c+" is a even number");
            case 3-> System.out.println(c+" is a multiple of 3");
            case 4-> System.out.println(c+" is a multiple of 4");
            case 5-> System.out.println(c+" is a multiple of 5");
            case 6-> System.out.println(c+" is a multiple of 2,3,6");
            case 7-> System.out.println(c+" is a prime number");
            case 8-> System.out.println(c+" is a multiple of 2,4,8");
            case 9-> System.out.println(c+" is a cube of 3");
            default -> System.out.println(c+" is a two digit number");
        }
        System.out.println("\nUsing && || !");
        if(a%2==0 && b%2==0 && c%2==0){
            System.out.println("all three numbers are even");
        }
        else if(a%2==0 || b%2==0 || c%2==0){
            System.out.println("atleast one of the three numbers are even");
        }
        else if(!(c%2==0)){
            System.out.println(c+" is a odd number");
        }
        else if(c%2==0){
            System.out.println(c+" is a even number");
        }
    }
    public int[] threenumber(){
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three number ");
        a=s.nextInt();b=s.nextInt();c=s.nextInt();
        int[] d = {a,b,c};
        return d;
    }
    
    public static void main(String[] args) {
        Assignment1 a1 = new Assignment1();
        int[] num = a1.threenumber();
        a1.operator(num[0], num[1]);
        a1.loops(num[0], num[1], num[2]);
        a1.condition(num[0], num[1], num[2]);
    }
}

/*

OUTPUT

Enter three number 
3 5 7
Two numbers are 3 & 5
Addition of two number is 8
Substraction of two number is -2
Multiplication of two number is 15
Division of two number is 0
Remainder of two number is 3

Using for loop and continue
Multiplication of 3
3 6 9 12 15 18 21 24 27 30 
36 39 42 45 48 51 54 57 60 

Using while loop and break
Multiplication of 5
5 10 15 20 25 30 35 40 45 50 

Using do while, multiplication of 7
7 14 21 28 35 42 49 56 63 70 

Using if..else and else..if
3 is a odd
5 is a positive number

Using switch case
7 is a multiple of 5

Using && || !
7 is a odd number

*/