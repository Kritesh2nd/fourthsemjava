package Question3;
public class NewClass implements Drawable, Measurable{
    @Override
    public void draw(){
        System.out.println("This is draw method");
    }
    @Override
    public void getArea() {
        System.out.println("This is getArea method");
    }
    @Override
    public void getPerimeter() {
        System.out.println("This is getArea method");
    }
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        nc.draw();
        nc.getArea();
        nc.getPerimeter();
    }
}
