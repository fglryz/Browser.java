package day25_MethodOverloading;

public class Reverse {

    public static String[] reverse(String[]names){
        for (String each : names) {
            String reversed = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);
            }
        }
        return names;
    }

    public static int[] reverse(int[]numbers){
        for (int i = 0; i < numbers.length/2; i++) {
            int reverse = numbers[i];
            numbers[i] = numbers[numbers.length-(1+i)];
            numbers[numbers.length-(1+i)] = reverse;
        }
        return numbers;
        }


        
    }
    

/*
Task 4:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
 */