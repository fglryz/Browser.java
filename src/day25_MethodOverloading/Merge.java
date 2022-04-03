package day25_MethodOverloading;

public class Merge {
    public static void main(String[] args) {


    }


    public static int[] merge(int[] arr1, int[] aar2) {
        int[] result = new int[arr1.length + aar2.length];
        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }
        for (int each : aar2) {
            result[i++] = each;

        }
            return result;
    }


    public static double[] merge(double[] arr1, double[] aar2) {
        double[] result = new double[arr1.length + aar2.length];
        int i = 0;
        for (double each : arr1) {
            result[i++] = each;
        }
        for (double each : aar2) {
            result[i++] = each;

        }
        return  result;
    }


    public static char[] merge(char[] arr1, char[] aar2) {
        char[] result = new char[arr1.length + aar2.length];
        int i = 0;
        for (char each : arr1) {
            result[i++] = each;
        }
        for (char each : aar2) {
            result[i++] = each;

        }
        return result;
      
    }

    public static String[] merge(String[] arr1, String[] aar2) {
        String[] result = new String[arr1.length + aar2.length];
        int i = 0;
        for (String each : arr1) {
            result[i++] = each;
        }
        for (String each : aar2) {
            result[i++] = each;

        }
        return result;

    }

}



/*
Task1:
	1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.

 */