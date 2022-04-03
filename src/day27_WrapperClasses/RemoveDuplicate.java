package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3};
       arr=removeDuplicate(arr);
        System.out.println(Arrays.toString(arr));


        System.out.println("-------------------------------");


    }
    //                                      {1,1,2,2,3,3}
    public static int[] removeDuplicate(int[]array){
        int[] result={};
        for (int each : array) {
            if(!ArraysUtility.contains(result,each)){
               result=ArraysUtility.addElement(result,each);
            }

        }

        return result;

    }
}
