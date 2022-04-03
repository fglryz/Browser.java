package day32_Constructor;

public class ConstractorCall {
    public ConstractorCall() {
        System.out.println("Default Constructor");
    }
    public ConstractorCall(int a){
        this();
            System.out.println(" Constructor with int argument");

}

    public ConstractorCall(String str) {
        this();

        System.out.println(" Constructor with String argument");
    }

    public static void main(String[] args) {
        ConstractorCall obj1=new ConstractorCall();

        System.out.println("------------------------------");
        ConstractorCall obj2=new ConstractorCall(10);
        System.out.println("------------------------------");
        ConstractorCall obj3=new ConstractorCall("JAva");
    }
    }





