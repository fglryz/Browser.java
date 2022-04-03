package day14_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstname= scanner.next();


        System.out.println("Enter your last name:");
        String lastname= scanner.next();
        char f=firstname.charAt(0);
        char l=lastname.charAt(0);

        String initials=""+f+"."+l;

        System.out.println("initials="+initials);


        scanner.close();
    }
}
