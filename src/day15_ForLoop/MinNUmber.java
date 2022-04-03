package day15_ForLoop;

import java.util.Scanner;

public class MinNUmber {
    public static void main(String[] args) {
        int min = 2147483647;

        Scanner scan = new Scanner(System.in);
        for (int i = 10; i < 15; i++) {
            System.out.print("Enter a number:");
            int num = scan.nextInt();
            if (num < min) {//if user enter number is greater than current max number.
                min = num;
            }
        }
        System.out.println("min = " + min);
    }
}
