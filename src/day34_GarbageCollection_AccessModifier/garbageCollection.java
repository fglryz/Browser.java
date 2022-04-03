package day34_GarbageCollection_AccessModifier;


import day30_CustomClass_Intro.Dog;
import day31_Constructor.Student;
import day32_Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;


public class garbageCollection {
    public static void main(String[] args) {
       /*int n=null;
        String str=null;
        String str1="";
        System.out.println(str.toUpperCase());
        System.out.println(str1.toUpperCase());

*/
        String str="Wooden Spoon";//after line 13"wooden spoon" will be eligible for garbage collection
        str=null;
        System.out.println(str);

        Car car1= new Car("Toyota");
        car1=null;
        System.out.println(car1);
        System.out.println("--------------------");

        Dog dog1=new Dog();
        dog1.name="Lucy";
        dog1=new Dog();
        dog1.name="Max";
        System.out.println(dog1);


        String language="Python";
                language="Java";
        System.out.println(language);
        System.out.println("--------------------");

        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(100);
        ArrayList<Integer>list2=list1;
        list2.addAll(Arrays.asList(200,300,400));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1==list2);

        System.out.println("--------------------");
        Student student1=new Student("Tahir",30,'M',14,'B');
        student1.grade='A';
        Student student2=student1;
        student2.name="Ahmat";
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("--------------------");

        ArrayList<String>l1=new ArrayList<>();
        l1.add("Java");

        ArrayList<String>l2=l1;

        l2.add("Python");
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);;



    }

}
