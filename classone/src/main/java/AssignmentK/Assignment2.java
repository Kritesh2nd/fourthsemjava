package AssignmentK;
import java.util.Scanner;
public class Assignment2 {
    public void areaOfRectangle(){
        Scanner sc = new Scanner(System.in);
        int l=5,b=10;
        System.out.println("Enter length and breath ");
        l=sc.nextInt();b=sc.nextInt();
        System.out.println("Area of rectangle is "+(l*b));
    }
    public void doubleToInt(){
        double d=100.235f;
        int i=(int)d;
        System.out.println("Double value "+(String.format("%.3f",d))+" to int value "+i);
    }
    public void squareOf(){
        float n = 3.9f;
        float square = n*n;
        System.out.println("Square of "+n+" is "+(String.format("%.2f",square)));
    }
    public void perimeterOfTriangle(){
        int a=2,b=3,c=5;
        System.out.println("Perimiter of a triangle is "+(a+b+c));
    }
    public void description(){
        Scanner sc = new Scanner(System.in);
        String name="Kritesh",interest="Coding";
        int rollnum=4;
        System.out.println("Enter your name ");
        name=sc.nextLine();
        System.out.println("Enter your id ");
        rollnum=sc.nextInt();
        System.out.println("Enter your field of intrest is ");
        interest=sc.nextLine();
        interest=sc.nextLine();
        System.out.print("Hey, my name is "+name+" and my roll number is "+rollnum+". ");
        System.out.println("My field of interest is "+interest+".");
    }
    public void quantityDiscount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many apple will you buy?");
        int q=sc.nextInt();
        float totalcost=q*100;
        if(q*100>1000){totalcost=(float) (totalcost-(0.1*totalcost));}
        System.out.println("Total cost is "+totalcost);
    }
    public void test(){
        int a=11,b=100;
        int c = a*b;
        float d=(float) (c*0.1);
        float e=(float) c-d;
        System.out.println(c+" "+d+" "+e);
    }
    public void gradingSystem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks ");
        int marks=sc.nextInt();
        String grade="";
        if(marks<25){grade="F";}
        else if(marks<=45){grade="E";}
        else if(marks<=50){grade="D";}
        else if(marks<=60){grade="C";}
        else if(marks<=80){grade="B";}
        else if(marks<=100){grade="A";}
        if(marks>=0&&marks<=100){System.out.println("You got "+grade+" in your test.");}
        else{System.out.println("Invalid marks.");gradingSystem();}
        
    }
    public void highestCommonFactor(){
        Scanner sc = new Scanner(System.in);
        int n1=24,n2=36,count1=0,count2=0,a,b,c=0,d=0;
        int[] arr1 = new int[100];
        int[] arr2 = new int[100];
        int[] arr3 = new int[100];
        int arrlen = arr1.length;
        System.out.println("Enter two number ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(a=1;a<=n1;a++){
            if(n1%a==0){
                arr1[count1]=a;
                count1++;
            }
        }
        for(a=1;a<=n2;a++){
            if(n2%a==0){
                arr2[count2]=a;
                count2++;
            }
        }
        for(a=0;a<arrlen;a++){
            for(b=0;b<arrlen;b++){
                if(arr1[a]==arr2[b]&&arr1[a]!=0){
                    arr3[c]=arr1[a];
                    c++;
                }
            }
        }
        for(a=0;a<arrlen;a++){
            if(arr3[a]>d){
                d=arr3[a];
            }
        }
        System.out.println("Highest Common Factor is "+d);
    }
    public void factorialOf(){
        Scanner sc = new Scanner(System.in);
        int a,b=1,n=10;
        System.out.println("Enter a number ");
        n=sc.nextInt();
        for(a=1;a<=n;a++){b=b*a;}
        System.out.println("factorial of "+n+" is"+b);
    }
    public static void main(String[] args) {
        Assignment2 a2 = new Assignment2();
        a2.areaOfRectangle();
        a2.doubleToInt();
        a2.squareOf();
        a2.perimeterOfTriangle();
        a2.description();
        a2.quantityDiscount();
        a2.gradingSystem();
        a2.highestCommonFactor();
        a2.factorialOf();
    }
}
