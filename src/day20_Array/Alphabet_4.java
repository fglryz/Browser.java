package day20_Array;

import java.util.Arrays;

public class Alphabet_4 {
    public static void main(String[] args) {
        //26 characters

        char[] alphabets = new char[26];
       char ch = 'Z';

        for (int i = 0; i < alphabets.length; i++, ch--) {
            alphabets[i] = ch;
        }
       /* for (char i = 0,j='Z'; i < alphabets.length ; i++,j--) {
            alphabets[i]=j;

        }*/


        System.out.println(Arrays.toString(alphabets));//print whole array
        //System.out.println(alphabets[0]);//printing element of array

    }

}
