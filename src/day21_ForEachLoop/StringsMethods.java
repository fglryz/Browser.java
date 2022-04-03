package day21_ForEachLoop;

import java.util.Arrays;

public class StringsMethods {
    public static void main(String[] args) {
        String str="Java";
         char[] chars=str.toCharArray();
        System.out.println(Arrays.toString(chars));
        for (char each:str.toCharArray()) {
            System.out.println(each);

        }
        System.out.println("**************************");
        
        String sentence="Wooden Spoon";
        String[] words=sentence.split(" ");
        System.out.println("Arrays.toString(words) = " + Arrays.toString(words));

        System.out.println( "**********************");
        
        String email="WoodenSpoon@cydeo.com";
         String[] arr=email.split("@");
        System.out.println(Arrays.toString(arr));
        System.out.println("********************************");
        String s="Today is nice. Today is Monday. Today we learned Java";

        String[] sentence1= s.split("\\. ");
        System.out.println(Arrays.toString(sentence1));


        
    }
}
