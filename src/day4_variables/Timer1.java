package day4_variables;

import java.util.Scanner;

public class Timer1 {

    public static void main(String[] args) throws InterruptedException{
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number of minutes");
        int minutes= scanner.nextInt();
        scanner.close();

        for(int i =minutes; i>0;i--){
            for (int z=59;z>=0;z--){

                System.out.println("\r+(i-1)+minutes and"+z+" second left");
                Thread.sleep(1000);
            }
        }
        System.out.println("\n\n");
        System.out.println("\t\t\t*************************************");
        System.out.println("\t\\t\t*                                  *");
        System.out.println("\t\t\t* Time is up, Take your seat please *");
        System.out.println("\t\t\t*                                   *");
        System.out.println("\t\t\t*************************************");



    }
}
