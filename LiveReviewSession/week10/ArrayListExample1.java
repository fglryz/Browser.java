package week10;

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        // to show auto-boxing
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) { // 0,1,2,3.. ---> primitives
            // How can I out primitives into Arraylist: with the help of autoboxing
            arr.add(i);

        }
            


    String str = "123";

        System.out.println(str+1); // 1231

    int num = Integer.parseInt(str);  // turns the value to primitive data type
        System.out.println(num+1); // 124

    String price = "$27.16";
    price = price.substring(1);

    double priceInDouble = Double.parseDouble(price);
    Double priceInWrapDouble = Double.valueOf(price);

        System.out.println(priceInDouble);

// Differenence between Integer.parseInt(str) and Integer.valueOf(str)

    Integer num2 = Integer.valueOf(str);
        System.out.println(num2+1); // 124

    char ch = 'a';

    boolean isDigit = Character.isDigit(ch);
        System.out.println("isDigit = " + isDigit);
    boolean isLetter = Character.isLetter(ch);
        System.out.println("isLetter = " + isLetter);


    String strTwo = "a1b2c3";

    // sum of the integers inside strTwo

    int sumOfDigits = 0;

        for(char each : strTwo.toCharArray()){
        if(Character.isDigit(each)){
            sumOfDigits+= Integer.parseInt(each+"");
        }
    }

        System.out.println("sumOfDigits = " + sumOfDigits);

    String strThree = "abcd1234!@#$efghi6789#$%^ABCD";

}
}
