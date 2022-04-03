package day18_NestedLoop;

import java.util.Scanner;

public class AdditionTwoNumbers {
    public static void main(String[] args) {
        while(true){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter firs number:");
        int num1 = scan.nextInt();
        System.out.println("Enter second  number:");
        int num2 = scan.nextInt();

        System.out.println("Addition: "+ (num1+num2));

            System.out.println("would you like to continue");

            String a=scan.next().toLowerCase();
            while( !(a.equals("yes") || a.equals("no")) ){ // if the answer is invalid
                System.err.println("Invalid Entry, Please re enter");
                a = scan.next().toLowerCase();}


            if(a.equals("no")){
                break;
            }
            scan.close();
    }

}}
