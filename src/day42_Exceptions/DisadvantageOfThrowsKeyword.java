package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {


    public static void main(String[] args)  {
        System.out.println("Hello");
       // sleep(2.5);//throws
        System.out.println("Hello World");
        System.out.println("-----------------------");
        System.out.println("Hello");
        MorningWorkout.sleep(2.5);
        System.out.println("Cydeo");

    }
    public static void sleep(double second) throws InterruptedException {
        Thread.sleep((long) (second*1000));
    }




    }



