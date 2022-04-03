package day29_ArrayList_CollectionUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Max_Min_AvarageNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int max= numbers.get(0);
        int min=numbers.get(0);
        int sum=0;
        for (Integer each : numbers) {
            if(each>max){
                max=each;
            }
            if(each<min){
                min=each;
        }
            sum+=each;

    }
        double avarage=(double) sum/numbers.size();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avarage = " + avarage);
}}
