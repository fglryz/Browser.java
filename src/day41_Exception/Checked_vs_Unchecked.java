package day41_Exception;

import day39_Recap.cydeoTask.Student;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {
        //unchecked exception
        int a=10;
        int b=0;
       // System.out.println(a/b);
        //System.out.println("WoodenSpoon");
        char[] characters={'A','B','C'};
                          // 0  1    2
        //System.out.println(characters[99]);
        Student student=null;
       // student.study();
        //System.out.println(student.getName());
        String str="Wooden Spoon";//unchecked
       //str=null;
       //System.out.println(str.toUpperCase());
        System.out.println("------------------------------");
        //checked Exception:

        System.out.println("Hello");
        //Thread.sleep(3000);//checked

        System.out.println("Cydeo");

        //FileInputStream file=new FileInputStream("path of the file");

    }

}
