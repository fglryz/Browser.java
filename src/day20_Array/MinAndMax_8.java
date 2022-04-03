package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMax_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] number = new int[10];


        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter a number" );
            number[i] = scan.nextInt();//each user  entered input will be assigned to the indexes of the array numbers
        }
        int max=number[0];
        int min=number[0];

        for (int i = 0; i < number.length; i++) {
            if(number[i]>max){
                max=number[i];
            }
            if(number[i] < min){
                min=number[i];
            }

        }
        System.out.println("number = " + Arrays.toString(number));
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        scan.close();
    }

}
