package day8_IfStatement;

public class EvenlyDivisble {
    public static void main(String[] args) {

        int number = 100;
        boolean isdivisibleBy2 = number % 2 == 0;// if the remainder of a number divided by 2 is zero, then it's evenly divisible by 2
        boolean isdivisibleBy3 = number % 3 == 0;
        boolean isdivisibleBy5 = number % 5 == 0;

        System.out.println(number + " isdivisibleBy2: " + isdivisibleBy2);
        System.out.println(number + " isdivisibleBy3: " + isdivisibleBy3);
        System.out.println(number + " isdivisibleBy5: " + isdivisibleBy5);

        System.out.println("************************");
        int year = 200;
        boolean isLeapYear = year % 4 == 0;
        System.out.println(year + " is leap yaer:" + isLeapYear);



       /* 2. Create a class called EvenlyDivisible,and write a program that can check if a number is evenly divisible by 2, 3, 5
        Ex:
        number = 65;
        output:
        65 is divisible by 2: false
        65 is divisible by 3: false
        65 is divisible by 5: true
                */


    }
}


