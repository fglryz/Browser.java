package utilities;

import day34_GarbageCollection_AccessModifier.AccessModifiers;

public class AccessModofierTest1 {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
       // System.out.println(AccessModifiers.defaultData);//It is not seen as it is in the different package
        //System.out.println(AccessModifiers.privateData);private is not visible outside the class



        AccessModifiers.method1();
        //AccessModifiers.method2();
        //AccessModifiers.method3();

    }
}
