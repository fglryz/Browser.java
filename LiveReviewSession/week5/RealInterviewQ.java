package week5;

import java.util.Scanner;

public class RealInterviewQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please put a valid email address: test@example.com");
        String email = input.next();

        boolean atSign=email.contains("@")&&email.charAt(0)!=('@');
        boolean atDot=email.contains(".")&&email.lastIndexOf(".")>email.lastIndexOf("@");

        if(atSign&&atDot){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
