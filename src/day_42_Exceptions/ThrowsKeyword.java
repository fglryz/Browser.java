package day_42_Exceptions;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("------------Test 1--------------");
        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");
        System.out.println("--------Test 1 completed------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("EU8");
        System.out.println("--------Test 2 completed------------");
    }
}
