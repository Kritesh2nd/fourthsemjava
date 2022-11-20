package AssignmentK;
public class Student {
    public Student(String name){
        System.out.println("Your name is "+name);
    }
    public Student(){
        System.out.println("Your name is Unknown");
    }
    public static void main(String[] args) {
        Student s = new Student("Swastika");
        Student k = new Student();
    }
}
