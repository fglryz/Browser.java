package day25_MethodOverloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.Arrays;

public class TestArrayUtility {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        ArraysUtility.printEachElement(arr1);

        System.out.println("======================");
        double[] arr2 = {1.2, 3.4, 6.7, 8.1};
        ArraysUtility.printEachElement(arr2);

        System.out.println("========================");

        char[] arr = {'a', 'c', 'd'};
        ArraysUtility.printEachElement(arr);

        System.out.println("========================");

        String[] arr3 = {"Lale", "Elizabeth", "David"};
        ArraysUtility.printEachElement(arr3);

        System.out.println("========================");
        int[] array = {1, 9, 67, 98, 345};
        int max = ArraysUtility.maxNumber(array);
        System.out.println("max = " + max);

        System.out.println("========================");
        double[] n1 = {2.3, 4.7, 9.0, 54.6};
        double max1 = ArraysUtility.maxNumber(n1);
        System.out.println("max1 = " + max1);
        System.out.println("========================");
        double[] n2 = {4.5, 2.3, 4.7, 9.0, 54.6};
        double min = ArraysUtility.minNumber(n2);
        System.out.println("min = " + min);
        System.out.println("========================");
        int[] n3 = {1, 9, 67, 98, 345};
        int min1 = ArraysUtility.minNumber(n3);
        System.out.println("min1 = " + min1);

        System.out.println("========================");
        int[] num = {1, 2, 5, 7, 0,};
        boolean r1 = ArraysUtility.contains(num, 5);
        System.out.println("r1 = " + r1);

        System.out.println("========================");
        int[] a = {1, 2, 2, 2, 3, 3, 4, 5, 6,};
        int[] unique = ArraysUtility.uniqueElement(a);
        System.out.println(Arrays.toString(unique));
        System.out.println("========================");
        double[] a1 = {1.1, 2.2, 2.2, 2.2, 3.1, 3.1, 4.1, 5.0, 6.0,};
        double[] unique1 = ArraysUtility.uniqueElement(a1);
        System.out.println(Arrays.toString(unique1));
        System.out.println("========================");
        String str = "level";
        boolean palindrome = StringUtility.isPalindrome(str);
        System.out.println("palindrome = " + palindrome);

    }

}
