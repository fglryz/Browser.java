package day15_ForLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        int max = -2147483648;

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number:");
            int num = scan.nextInt();
            if (num > max) {//if user enter number is greater than current max number.
                max = num;
            }
        }
        System.out.println("max = " + max);

        System.out.println();

        System.out.println("************************************");



    }



}
//Write a program that asks user to enter a number for 5 times.return the max number.
