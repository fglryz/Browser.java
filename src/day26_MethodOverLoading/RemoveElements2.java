package day26_MethodOverLoading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {
    public static void main(String[] args) {
        int[] number={100,200,300,400,500};
       number= ArraysUtility.removeElement(number,3);
        System.out.println(Arrays.toString(number));
    }

    public static int[] removeElement(int[]array,int index){
        if(index<0||index>= array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);}
        int[] result={};

        for (int i = 0; i < array.length; i++) {
            if(i!=index){
                result=ArraysUtility.addElement(result,array[i]);
            }

        }
        return result;
    }
}
