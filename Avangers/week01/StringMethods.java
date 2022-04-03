package week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in );
        String str=input.next();
        System.out.println(firstTwoChars(str));

        firstTwoChars2(str);
        System.out.println(firstTWoChar4(str));
        System.out.println(firstTWoChar4(str));


    }
    public static  String firstTwoChars(String str){
       // str=str.toUpperCase().substring(0,2);
        return str=str.toUpperCase().substring(0,2);

    }

    public static void firstTwoChars2(String str){
        str=str.toUpperCase().substring(0,2);
    }

    public static String firstTWoChar3(String str){
        str=str.toUpperCase();
        String s=""+str.charAt(0)+str.charAt(1);
        return s;
    }

    public static String firstTWoChar4(String str){
    char[]  charArr=str.toCharArray();
        ArrayList<Character>list=new ArrayList<>();
        for(Character each:charArr){
            list.add(each);
        }
        String s=""+list.get(0)+list.get(1);
        return  s.toUpperCase();
}





    }







