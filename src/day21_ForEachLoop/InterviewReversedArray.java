package day21_ForEachLoop;

import java.util.Arrays;

public class InterviewReversedArray {
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50,};
        //             0  1  2  3  4
        int[] reversed = new int[number.length];//to make sure that the array has enough
        // capacity for all the  elements of the first array

        for (int i = number.length - 1,j=0; i >= 0; i--,j++) {
            reversed[j] = number[i];
        }

            System.out.println(Arrays.toString(reversed));


        }}

       /* reversed[0] = number[number.length - 1];
        reversed[1] = number[2];
        reversed[2] = number[1];
        reversed[3] = number[0];

*/



