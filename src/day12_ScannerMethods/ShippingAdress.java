package day12_ScannerMethods;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Enter your full name:");
        String fullName = input.nextLine();//Java programming


        System.out.println("Enter you building number:");
         String buildingNumber=input.next();

        input.nextLine();

        System.out.println("Enter your street name:");
        String streetName=input.nextLine();//Enter


        System.out.println("Enter  your city name: ");
        String cityName= input.nextLine();



        System.out.println("Enter your  state name:");
        String state= input.next();

        input.nextLine();

        System.out.println("enter your zip code");
        String zipCode= input.next();

        input.nextLine();

        System.out.println("Enter country name:");
        String country=input.nextLine();



        System.out.println("Full Name= " + fullName);
        System.out.println("\nBuilding Number: "+buildingNumber);
        System.out.println("\nStreet name: "+streetName);
        System.out.println("\nCity name: "+cityName);
        System.out.println("\nState: "+state);
        System.out.println("\nZip code :"+zipCode );

        input.close();

    }


}
