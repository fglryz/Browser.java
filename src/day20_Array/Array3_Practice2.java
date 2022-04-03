package day20_Array;

import java.util.Arrays;

public class Array3_Practice2 {
    public static void main(String[] args) {

char[] letters=new char[26];

       /* for (int i = 0,j='A'; i < letters.length ; i++,j++) {
            letters[i]=(char) j;

        }*/

       for (char i = 'A',j=0; i <='Z'&&j<letters.length; i++,j++) {

               letters[j]=i;
        }
/*char ch='A';
        for (int i = 0; i < letters.length ; i++) {
            letters[i]=ch;
            ch++;

        }*/
        System.out.println(Arrays.toString(letters));

        System.out.println("*******************");

        char[] letters2=new char[26];
        char ch='Z';

        for (int i = 0; i < letters2.length ; i++,ch--) {
            letters2[i]=ch;
    }


        System.out.println(Arrays.toString(letters2));
}}
