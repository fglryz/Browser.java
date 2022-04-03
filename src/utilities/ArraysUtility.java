package utilities;

import java.util.Arrays;

public class ArraysUtility {
    //create print integer array in seperate line
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);

        }

    }

    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);

        }

    }

    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);

        }

    }

    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);

        }


    }

    //create method find the max number
    public static int maxNumber(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];


    }

    public static double maxNumber(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];

    }

    // create method find min number
    public static double minNumber(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];

    }

    public static int minNumber(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];

    }

    //check if the given integer is contains
    // in the given array return me boolean.contais(int[],int)
    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) {
                result = true;
            }

        }
        return result;
    }

    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
            }

        }
        return result;
    }

    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
            }

        }
        return result;
    }

    public static boolean contains(String[] array, String element) {
        boolean result = false;
        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }

        }
        return result;
    }

    //add the given integer elements to array,returns new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }

    public static String[] addElement(String[] names, String element) {
        String[] result = new String[names.length + 1];

        int i = 0;
        for (String each : names) {
            result[i++] = each;
        }
        result[names.length - 1] = element;
        return result;
    }

    public static char[] addElement(char[] array, char element) {

        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;//element need to be assigned to the last index
        return result;
    }

    //1. Create a class named one element of array, FrequencyOfElement:
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }

        }
        return count;

    }

    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }

        }
        return count;


    }

    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }

        }
        return count;


    }

    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }

        }
        return count;


    }

    public static int[] uniqueElement(int[] array) {
        int[] result = {};//new int[0]
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {//if frequency is 1 the element unique
                result = ArraysUtility.addElement(result, each);
            }

        }
        return result;

    }

    public static double[] uniqueElement(double[] array) {
        double[] result = {};//new int[0]
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {//if frequency is 1 the element unique
                result = ArraysUtility.addElement(result, each);
            }

        }
        return result;

    }

    public static char[] uniqueElement(char[] array) {
        char[] result = {};//new char[0]
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {//if frequency is 1 the element unique
                result = ArraysUtility.addElement(result, each);
            }

        }
        return result;

    }

    public static String[] uniqueElement(String[] array) {
        String[] result = {};//new int[0]
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {//if frequency is 1 the element unique
                result = ArraysUtility.addElement(result, each);
            }

        }
        return result;

    }

    public static int[] removeElement(int[] array, int index) {
        if (index < 0 || index >= array.length - 1) {
            System.err.println("Invalid index" + index);
            System.exit(0);
        }
        int[] result = {};

        for (int i = 0; i < array.length; i++) {//i : arrays index number
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }

        }
        return result;
    }

    public static double[] removeElement(double[] array, int index) {
        if (index < 0 || index >= array.length - 1) {
            System.err.println("Invalid index" + index);
            System.exit(0);
        }
        double[] result = {};

        for (int i = 0; i < array.length; i++) {//i : arrays index number
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }

        }
        return result;
    }

    public static char[] removeElement(char[] array, int index) {
        if (index < 0 || index >= array.length - 1) {
            System.err.println("Invalid index" + index);
            System.exit(0);
        }
        char[] result = {};

        for (int i = 0; i < array.length; i++) {//i : arrays index number
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }

        }
        return result;
    }

    public static String[] removeElement(String[] array, int index) {
        if (index < 0 || index >= array.length - 1) {
            System.err.println("Invalid index" + index);
            System.exit(0);
        }
        String[] result = {};

        for (int i = 0; i < array.length; i++) {//i : arrays index number
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }

        }
        return result;
    }

    //merge the given two arrays and return the new array
    public static int[] merge(int[] arr1, int[] arr2) {

        int[] result = {};
        for (int each : arr1) {
            result = addElement(result, each);
        }
        for (int each : arr2) {
            result = addElement(result, each);

        }
        return result;


    }

    public static double[] merge(double[] arr1, double[] arr2) {

        double[] result = {};
        for (double each : arr1) {
            result = addElement(result, each);
        }
        for (double each : arr2) {
            result = addElement(result, each);

        }
        return result;


    }

    public static char[] merge(char[] arr1, char[] arr2) {

        char[] result = {};
        for (char each : arr1) {
            result = addElement(result, each);
        }
        for (char each : arr2) {
            result = addElement(result, each);

        }
        return result;


    }

    public static String[] merge(String[] arr1, String[] arr2) {

        String[] result = {};
        for (String each : arr1) {
            result = addElement(result, each);
        }
        for (String each : arr2) {
            result = addElement(result, each);

        }
        return result;


    }

    //reverse the given array and return the new array
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];

        }
        return result;
    }

    public static double[] reverse(double[] array) {
        double[] result = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];

        }
        return result;
    }

    public static char[] reverse(char[] array) {
        char[] result = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];

        }
        return result;
    }

    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];

        }
        return result;
    }


    //replace the elements of the array given index with the new element
    public static int[] replaceElement(int[] array, int index, int newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }

    public static double[] replaceElement(double[] array, int index, double newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }

    public static char[] replaceElement(char[] array, int index, char newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }

    public static String[] replaceElement(String[] array, int index, String newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }


    //replace the  matching old values of  the array with new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }


        }
        return array;


    }

    public static double[] replaceAll(double[] array, double oldValue, double newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }


        }
        return array;


    }

    public static char[] replaceAll(char[] array, char oldValue, char newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }


        }
        return array;


    }

    public static String[] replaceAll(String[] array, String oldValue, String newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)) {
                array[i] = newValue;
            }


        }
        return array;


    }

    // remove the duplicates from the given array,returns new array
    public static int[] removeDuplicate(int[] array) {
        int[] result = {};
        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }
    public static double[] removeDuplicate(double[] array) {
        double[] result = {};
        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }
    public static char[] removeDuplicate(char[] array) {
        char[] result = {};
        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }
    public static String[] removeDuplicate(String[] array) {
        String[] result = {};
        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    //add an extra element to array
    public static int[] insert(int[] array, int index, int element) {
        if (index < 0 || index >= array.length) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = new int[array.length + 1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (i == index) {
                j++;
            }
            result[j] = array[i];
        }

        return result;
    }
    public static double[] insert(double[] array, int index, double element) {

        if (index < 0 || index >= array.length) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        double[] result = new double[array.length + 1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (i == index) {
                j++;
            }
            result[j] = array[i];
        }

        return result;
    }
    public static char[] insert(char[] array, int index, char element) {

        if (index < 0 || index >= array.length) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        char[] result = new char[array.length + 1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (i == index) {
                j++;
            }
            result[j] = array[i];
        }

        return result;
    }
    public static String[] insert(String[] array, int index, String element) {

        if (index < 0 || index >= array.length) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        String[] result = new String[array.length + 1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (i == index) {
                j++;
            }
            result[j] = array[i];
        }

        return result;
    }

    public static int[] swap(int[] array, int i, int j){

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
    public static double[] swap(double[] array, int i, int j){
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
    public static char[] swap(char[] array, int i, int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
    public static String[] swap(String[] array, int i, int j){
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

}
/*
Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index,
		 integer element. the method inserts the given element to the given
		 index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array

 */






