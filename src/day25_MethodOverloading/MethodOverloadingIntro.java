package day25_MethodOverloading;

import java.util.Arrays;

public class MethodOverloadingIntro {
    public static void main(String[] args) {
         int[] intArray={5,6,0,-1,3,4};
        Arrays.sort(intArray);
         double[] doubleArray={10.5,11.5,5.5,4.5};
         Arrays.sort(doubleArray);
         char [] charArray={'E','B','G','D','A'};
         Arrays.sort(charArray);

        System.out.println("-----------------------------");
       // sumOf10,20);
        int sum1=sumOfNumbers(10,20);
        //sum of 10,20,30
        int sum2=sumOfNumbers(10,20,30);
        //sum of10.2,5.6
        double sum3=sumOfNumbers(10.2,5.6);
        double sum4=sumOfNumbers(1.4,5.6,6.8,5.7);


    }

    public static double sumOfNumbers(double num1, double num2) {
        return num1 + num2;
    }
    public static int sumOfNumbers(int num1, int num2) {return num1 + num2;}
    public static double sumOfNumbers(double num1, double num2,double num3) {return num1 + num2+num3;}

    public static int sumOfNumbers(int num1, int num2,int num3) {return num1+num2+ num3;}

    public static int sumOfNumbers(int num1, int num2,int num3,int num4)
    {return sumOfNumbers(num1, num2, num3)+num4;}

    public static double sumOfNumbers(double num1, double num2,double num3,double num4)
    {return sumOfNumbers(num1, num2, num3)+num4;
}}
/*
 1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
 */
