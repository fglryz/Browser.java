package day25_MethodOverloading;

public class SumOfNumbers {
    public static void main(String[] args) {
        double sum= sumOf2Numbers(5.2,9.3);
        System.out.println(sum);
        System.out.println(sumOf2Numbers(5,8));
        int sum2=sumOf3Numbers(4,6,9);
        System.out.println(sum2);
        int sum3=sumOf4Numbers(4,0,9,1);
        System.out.println(sum3);
    }

    public static double sumOf2Numbers(double num1, double num2) {
       return num1 + num2;

    }
    public static int sumOf2Numbers(int num1, int num2) {
        return num1 + num2;



    }
    public static int sumOf3Numbers(int num1, int num2,int num3) {
        return num1 + num2 + num3;
    }
        public static int sumOf4Numbers(int num1, int num2,int num3,int num4) {
            return num1 + num2+num3+num4;

    }








    }
/*
Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers

 */