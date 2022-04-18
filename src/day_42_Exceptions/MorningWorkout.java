package day_42_Exceptions;

public class MorningWorkout {
    public static void main(String[] args) {
        System.out.println("-------------------Start push up------------------");

        for (int i = 1; i <= 30; i++) {
            System.out.print("\rPush up  "+i);
            sleep(1.5);

        }
        System.out.println("\n---------push up 1 completed-------------------");


        for (int i = 1; i <= 20; i++) {

            System.out.print("\rPull up  "+i);
            sleep(2.5);
        }
        System.out.println("\n---------push up 1 completed-------------------");
    }
    public static void sleep(double second){

        try {
            Thread.sleep((long)(second*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}