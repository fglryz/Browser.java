package day34_GarbageCollection_AccessModifier;

public class AccessModifiersTest {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
        //System.out.println(AccessModifiers.privateData);private is not visible in different package


        AccessModifiers.method1();
        AccessModifiers.metdod2();
        //AccessModifiers.method3();//private is not visible outside the class
    }



}
