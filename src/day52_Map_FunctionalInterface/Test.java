package day52_Map_FunctionalInterface;
//lambda:->{}
public class Test {

    public static void main(String[] args) {
        // display a number  is odd or even
        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> {
            if (n % 2 == 0) {
                System.out.println(n + " is even number = ");
            } else {
                System.out.println(n + " is odd number");
            }
        };
        oddOrEvenNumber.apply(20);

        //check is  if a person eligible  to buy cig
        MyFirstFunctionalInterface eligibleToAlcohol;
        eligibleToAlcohol = (age) -> {
            if (age >= 21) {
                System.out.println("eligible ");
            } else {
                System.out.println("not eligible ");
            }
        };
        eligibleToAlcohol.apply(20);


        //display the cube of number

        MyFirstFunctionalInterface printCube;
        printCube = (n) -> {
            System.out.println(n * n * n);
        };
        printCube.apply(3);


        //if number divisible 3 and 5
        MyFirstFunctionalInterface divisiblBy3And5 = n -> {
            if (n % 15 == 0) {
                System.out.println(n + " Divisible by 3 and 5");
            } else {
                System.out.println(n + " not Divisible by 3 and 5");
            }

        };

divisiblBy3And5.apply(25);



    }
    }





