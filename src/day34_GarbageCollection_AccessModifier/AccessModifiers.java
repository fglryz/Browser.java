package day34_GarbageCollection_AccessModifier;

public class AccessModifiers {

    public static int publicData=100;
    static int defaultData=200;//access modifier;default
    private static int privateData=300;




    public  static void method1(){
        System.out.println("Public");
    }
    static void metdod2(){
        System.out.println("Default");
    }
    private  static void method3(){
        System.out.println("Private");
    }


    public static void main(String[] args) {
        System.out.println("publicData = " + publicData);
        System.out.println("defaultData = " + defaultData);
        System.out.println("privateData = " + privateData);
    }
}
