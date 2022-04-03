package day11_Switch_Scanner;

public class NumbersToWords {
    public static void main(String[] args) {
        int num=4;
        String word="";

        String number=(num>=0&&num<=9)? (num==0)?"Zero":num==1?"one"  :num==2?"two"  :num==3?"three"  :num==4?"four"
                :num==5?"five"  :num==6?"six"
    :num==7?"seven" :num==8?"eight" : "nine" :"Invalid Number";

        System.out.println(number);




    }
}
/*
 Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary

 */
