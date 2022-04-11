package utilities;

import day40_FinalKeyWord.ProtectedAccessModifiers;

public class AccessModifierTest4 extends ProtectedAccessModifiers {
    public static void main(String[] args) {
       // System.out.println(AccessModifierTest4.name1);
        System.out.println(AccessModifierTest4.name2);

       // AccessModifierTest4.method1;
        AccessModifierTest4.method2();
    }
}
