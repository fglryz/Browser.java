package week9;

public class Calculator {

    public static void main(String[] args) {
        System.out.println(add(4.3,7));
        double sum=add(5,6);
        System.out.println(sum);
        int sum1=(int )add(4,6);//explicit casting

        System.out.println(divide(4,6));

    }

    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double substract(double num1, double num2) {
        double result = num1 - num2;
        return  num1-num2;
        //return result;

    }
    public static double multiplication(double num1, double num2) {
        double result = num1 *num2;
        return  num1-num2;
        //return result;

    }
    public static double divide(double num1, double num2) {
        double result = num1 /num2;
        return  num1-num2;
        //return result;

    }






}