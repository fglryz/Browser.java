package day17_While_DoWhileLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your first number");
        int num1=scanner.nextInt();
        System.out.println("enter your second number");
        int num2=scanner.nextInt();
        System.out.println("enter a math operator");
        char ch=scanner.next().charAt(0);//

        while(!(ch=='+'||ch=='-')){
            System.out.println("invalid Operator,please re -entered");
            ch=scanner.next().charAt(0);
        }

        System.out.println((ch=='+')? num1+num2 :num1-num2);
        //+,-


    }
}
