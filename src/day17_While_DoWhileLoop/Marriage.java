package day17_While_DoWhileLoop;

import java.util.Scanner;

public class Marriage {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Will you marry me:");
        String answer=scanner.next().toLowerCase();// -

        while(!(answer.equals("yes")||answer.equals("no"))) {//while the age invalid
            System.out.println("Invalid entry,please re-entered");
            answer = scanner.next().toLowerCase();
        }
            if(answer.equals("yes")){
            System.out.println("Congrats");
        }
        else {
            System.out.println("Goodby");
        }


scanner.close();

            }
    }

/*
1. Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no

 */