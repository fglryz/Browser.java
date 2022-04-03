package day5_Concatenation;

import java.sql.SQLOutput;

public class Calculator {
    public static void main(String[] args) {

        int firstNumber=100;
        int secondNumber=50;
        int sum=firstNumber+secondNumber;
         int sub=firstNumber-secondNumber;
         int mult=firstNumber*secondNumber;
        //100+5=150
        System.out.println(firstNumber+"+"+secondNumber+"="+sum);
        System.out.println(sum);

        //100-50=50
        System.out.println(firstNumber+"-"+secondNumber+"="+sub);
        System.out.println (sub);

        //100*50=5000
        System.out.println(firstNumber+"*"+secondNumber+"="+mult);
        System.out.println(mult);
    }
}
