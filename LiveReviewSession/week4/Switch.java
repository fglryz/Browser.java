package week4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String result="";
        int numberOfBedrooms = scanner.nextInt();
        int startingPrice = 0;


        //WRITE YOUR CODE HERE:
        switch(numberOfBedrooms){
            case 0:
                result=("Studio apartment selected\"\n" +
                        "startingPrice -> 1454");
                break;

            case 1:
                result=("One Bedroom Selected\nStarting Price: 1725");
                break;

            case 2:
                result=("Two Bedroom Selected\nStarting Price: 12899");

                break;



            default:
                result=("5  Bedrooms currently available");


        }
        System.out.println(result);


    }
}
