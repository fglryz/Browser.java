package day_41;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
    public static void main(String[] args) {
        System.out.println("Test1 started");

        try {
            System.out.println(9/0);
            System.out.println("Try block");

        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException  was occurred");

        }

        System.out.println("Test1 finished");
        System.out.println("-----------------------------------");

        System.out.println("Test2 started");
        int[] numbers = {1, 2, 3, 4, 5};
        try {

            System.out.println(numbers[200]);

        }catch(RuntimeException e){
            e.printStackTrace();
           // System.out.println(e.getMessage());

        }
        System.out.println("Test2 finished");


        System.out.println("--------------------------------");

        System.out.println("Test3 started");

        try{
            System.out.println("Cydeo".substring(2,0));


        }catch(RuntimeException e){
           e.printStackTrace();
            //System.out.println(e.getMessage());

        }
        System.out.println("Test 3 finished");
        System.out.println("--------------------------------");

        System.out.println("Hello");

        try {
            Thread.sleep(3000);//checked
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        System.out.println("Cydeo");
        System.out.println("--------------------------------");
        try {
            FileInputStream file=new FileInputStream("Fie path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}