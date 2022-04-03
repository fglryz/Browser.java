package day12_ScannerMethods;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // System.out.println("enter true or false:");

        //boolean result = input.nextBoolean();
        System.out.println("Enter your full name:");
        String fullName = input.nextLine();//Java programming


        System.out.println("Enter you programming language");
        String programming=input.nextLine();

        System.out.println("Enter your age: ");
        int age= input.nextInt();//24

        input.nextLine();

        System.out.println("Enter your school name:");
        String schoolName=input.nextLine();//Enter


        System.out.println("Full Name= " + fullName);
        System.out.println("Programming name: "+programming);
        System.out.println("age= "+age);
        System.out.println("School Name: "+schoolName);

input.close();
    }
}
