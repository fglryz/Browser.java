package week11;

public class TestLovalVsInstance {
    public static void main(String[] args) {
        LovalVSInstance obj=new LovalVSInstance();
        System.out.println("---------coming from the method");
        obj.showDiffrenece(4);
        System.out.println("---------coming from the variable");
        System.out.println(obj.a);
        obj.a=1;
        System.out.println(obj.a);


    }
}
