package day20_Array;

import java.util.Arrays;

public class Array2_Practice {
    public static void main(String[] args) {
       // store thr elements:10;20;50;70
        int[] numbers={10,20,50,70};//size is 4
        System.out.println(Arrays.toString(numbers));
        System.out.println("************************");

        int[] score=new int[5];
        score[1]=85;
        score[score.length-1]=95;
        score[3]=75;
        score[0]=65;
        score[2]=55;
        System.out.println(Arrays.toString(score));

        System.out.println("*******************");

        String[] months={"January","February","March","April","May","June","July","September","October",
                "November","December"};


        for (int i = 0; i <months.length ; i++) {//i represent the index number of array starting from 0

            System.out.println(months[i]);
        }



        System.out.println("*************************************");


        for (int i = months.length-1; i >=0 ; i--) {//i represent the index number of array starting from last index

            System.out.println(months[i]);
        }


    }
}
