package day29_ArrayList_CollectionUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9, 10, 3, 3, 3, 3, 3, 5, 5, 5, 5, 8, 8, 8));
        System.out.println("list = " + list);

        System.out.println("---------------------------------");

        list.removeAll(Arrays.asList(3, 5, 8));
        System.out.println(list);

        System.out.println("---------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 200, 300));

        numbers.retainAll(Arrays.asList(100, 200, 300));
        System.out.println(numbers);

        System.out.println("---------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));
        jobTitles.retainAll(Arrays.asList("QA", "SDET"));
        System.out.println("jobTitles = " + jobTitles);
        System.out.println("---------------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 8, 9, 10));
        boolean r1 = nums.contains(10);
        boolean r2 = nums.containsAll(Arrays.asList(2, 5, 8));
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        System.out.println("---------------------------------");

        String[] names = {"Josh", "Jack", "Shay", "daniel", "Breanna"};


        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        System.out.println("namesList = " + namesList);//easy way to convert array to arraylist
       // namesList.addAll(Arrays.asList(names));//2.way
        System.out.println("---------------------------------");
        int[] arr={1,2,3,4,5,6,7,8,9,10};//if it is non primitive you can not convert to arraylist
        Integer[] arr1={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(arr1));
        System.out.println("list2 = " + list2);

        System.out.println("---------------------------------");

        int[] arr3={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer>list3=new ArrayList<>(convertArrayToArrayList(arr3));
        System.out.println("list3 = " + list3);


    }





    public static ArrayList<Integer>convertArrayToArrayList(int[]array){

        ArrayList<Integer>list=new ArrayList<>();
        for (int each:array) {
            list.add(each);

        }
        return list;
    }

}
