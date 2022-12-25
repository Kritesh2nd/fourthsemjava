package Question4;
public class SubClass extends SuperClass{
    int data2;
    
    public SubClass(int data1, int data2) {
        setData1(data1);
        setData2(data2);
    }
    private void setData2(int data2){
        this.data2 = data2;
    }
    public int getData2(){
        return this.data2;
    }
    private void setData1(int data1){
        this.data1 = data1;
    }
    public int getData1(){
        return this.data1;
    }
    public String checkCondition(){
        if(data1==10 && data2==15){
            return "Condition True";
        }
        else{
            return "Condition False";
        }
    }
    public static void main(String[] args) {
        SubClass sub = new SubClass(11,14);
        System.out.println(sub.getData1()+" "+sub.getData2());
        System.out.println(sub.checkCondition());
        sub.setData1(10);
        sub.setData2(15);
        System.out.println(sub.getData1()+" "+sub.getData2());
        System.out.println(sub.checkCondition());
        
        
    }
}
