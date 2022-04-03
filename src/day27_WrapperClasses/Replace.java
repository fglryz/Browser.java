package day27_WrapperClasses;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {
        int[]arr= {1,2,3,4,5};
        arr=replaceElement(arr,3,30);
        System.out.println(Arrays.toString(arr));
    }

    //replace the elements of the array given index with the neW element
    //               {1,2,3,4,5},                      200         30
    public static int[] replaceElement(int[] array,int index,int newElement){
        if(index<0||index> array.length-1){
            System.out.println("Invalid Index"+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;

    }
    public static double[] replaceElement(double[] array,int index,double newElement){
        if(index<0||index> array.length-1){
            System.out.println("Invalid Index"+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;

    }
    public static char[] replaceElement(char[] array,int index,char newElement){
        if(index<0||index> array.length-1){
            System.out.println("Invalid Index"+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;

    }
    public static String[] replaceElement(String[] array,int index,String newElement){
        if(index<0||index> array.length-1){
            System.out.println("Invalid Index"+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;

    }



}
/*
1. Replace Task:
		1.1 public static int[] replaceElement(int[] array,int index,int newElement){
        if(index<0||index> array.length-1){
            System.out.println("Invalid Index"+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;

    }
    public static double[] replaceElement(double[] array,int index,double newElement){
        if(index<0||index> array.length-1){
            System.out.println("Invalid Index"+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;

    }
    public static char[] replaceElement(char[] array,int index,char newElement){
        if(index<0||index> array.length-1){
            System.out.println("Invalid Index"+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;

    }
    public static String[] replaceElement(String[] array,int index,String newElement){
        if(index<0||index> array.length-1){
            System.out.println("Invalid Index"+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;

    }

ger newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
				Ex:
					arr = {1,2,3,4,5};

					replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}
 */