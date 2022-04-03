package day26_MethodOverLoading;

import utilities.ArraysUtility;

public class ReverseArray2 {
    public static int[] reverse(int[] array){
        int[] result={};

        for (int i = 0; i < array.length; i++) {
           result= ArraysUtility.addElement(result,array[i]);

        }
        return result;


    }
}
