package day29_ArrayList_CollectionUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1_Remove {
    public static void main(String[] args) {

        String[] countries={"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"};
        //convert array to arraylist
        ArrayList<String>list=new ArrayList<>(Arrays.asList(countries));
        list.removeIf(p->p.length()>=10);
        //converting arraylist to back to array
         countries= list.toArray(new String[0]);
        System.out.println(Arrays.toString(countries));

        System.out.println("------------------------------------");


    }
}
/*
1.create an array of string called countries
2.write a program that can remove all the country names that have length of 10 or greater
 */