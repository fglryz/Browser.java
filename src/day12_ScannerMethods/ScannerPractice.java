package day12_ScannerMethods;
//import java.util.*;//wils important:import everything from the memory

import java.util.Scanner;//regular import=import one class

public class ScannerPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write an  number between 1 to 7 :");
        int num = input.nextInt();
        String result = "";//temporary

        if (num >= 1 && num <= 7) {
            result = (num == 1) ? "Monday" : (num == 2) ? "Tuesday" : (num == 3
            ) ? "Wednesday" : (num == 4) ? "Thursday" : (num == 5) ? "Friday" : (num == 6) ? "Saturday" : "Sunday";

        } else {
            result = "Invalid";
        }
        System.out.println(result);
        input.close();
    }
}
