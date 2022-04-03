package day12_ScannerMethods;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("enter your GPA:");
        double gpa=input.nextDouble();


        input.nextLine();

        System.out.println("Enter your school name:");
        String schoolName=input.nextLine();


        System.out.println("Age:" + age);
        System.out.println("Full Name:" + fullName);
        System.out.println("GPA:" + gpa);
        System.out.println("School name:" + schoolName);

        input.close();



    }
}
/*
Ask user age full name
nextint  nextline

 */