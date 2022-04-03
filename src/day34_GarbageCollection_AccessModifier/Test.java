package day34_GarbageCollection_AccessModifier;
import static day34_GarbageCollection_AccessModifier.Circle.*;

import static  utilities.MathUtility.*;

public class Test {
    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);


        System.out.println("-------------------------");
        //find sum of 10,20      100,200

       int r1= sum(10,20);
       int r2= subtract(100,200);
       int r3=max(2000,50000);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("-------------------");

    }
}
