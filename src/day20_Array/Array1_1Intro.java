package day20_Array;

import java.util.Arrays;

public class Array1_1Intro {
    public static void main(String[] args) {
        //create a variable that is capable enough to contain 5 names

        String myGroup[]=new String[5];
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikeal";

        System.out.println(Arrays.toString(myGroup));//["gunay","Neira","suat","hulya","Mikael"]

        System.out.println("****************************");

        String[] days={"monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(Arrays.toString(days));

        int number=5;
        if(number<1||number>7){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);

        System.out.println("************************");


        String[] months={"January","February","March","April","May","June","July","September","October",
                "November","December"};


        for (int i = 0; i <months.length ; i++) {//i represent the index number of array starting from 0

            System.out.println(months[i]);
        }



        System.out.println("*************************************");


        for (int i = months.length-1; i >=0 ; i--) {//i represent the index number of array starting from last index

            System.out.println(months[i]);
        }

    }
}
