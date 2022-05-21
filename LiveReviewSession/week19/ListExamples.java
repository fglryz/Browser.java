package week19;

import java.util.*;

public class ListExamples {
    public static void main(String[] args) {


        List<String> listOne = new ArrayList<>(); // polymorphic way
        ArrayList<String> arrayList = new ArrayList<>();// not polymorphic way

        List<String> listTwo = new Stack<>();

        listOne.add("Mike");
        listOne.add("Oscar");
        listOne.addAll(Arrays.asList("Selena","Cemal","Nihal","Selena","Oscar"));
        System.out.println("listOne = " + listOne);

        listTwo.addAll(listOne);
        System.out.println("listTwo = " + listTwo);

         /*
        Stack Methods
        peek() ---> brings you the element which last LIFO: Last in First Out
        pop() ---> brings you the element which last LIFO: Last in First Out and DELETES the element
        push() ---> similar to add method
         */

        String str1 = ((Stack<String>) listTwo).peek(); // since it is created in polymormphic way I have to cast to STack
        System.out.println("str = " + str1);

        str1 = ((Stack<String>) listTwo).pop(); // since it is created in polymormphic way I have to cast to STack
        System.out.println("str = " + str1);

        System.out.println("listTwo after pop method = " + listTwo);

        ((Stack<String>) listTwo).push("Oscar");
        System.out.println("listTwo after push method = " + listTwo);


        // Collections Utility class comes with useful methods: such as sorting
        Collections.sort(listTwo);    //comparable interface does not work with null values
        System.out.println("listTwo after sorting= " + listTwo);
        // listOne.add(null); comparable interface does not work with null values
        Collections.sort(listOne);
        System.out.println("listOne = " + listOne);


        List<Integer> listThree = new Stack<>();
        listThree.addAll(Arrays.asList(45,55,2,89,34,1000,-56,564,987));
        System.out.println("listThree before sorting= " + listThree);
        Collections.sort(listThree);
        System.out.println("listThree after sorting = " + listThree);

// ***** Likewise TreeSet does not accept null value since internally using Sorting
        // Any collection framework which has some type sorting  -----> DOES NOT ACCEPT NULL Values
        for (int i = 0; i < listThree.size();) {
            int x= ((Stack<Integer>) listThree).pop();
            System.out.println("Next number "+ x);


            List<Integer>list4=new LinkedList<>();
            list4.add(10);
            list4.addAll(Arrays.asList(20,30,50,70));
            ((LinkedList<Integer>) list4).addFirst(1);

            ((LinkedList<Integer>) list4).addLast(100);
            System.out.println("list4 = " + list4);
            System.out.println("list4 = " + list4);

            //since we can cast the link to linklist it allows to use Deque method such ad poo()
           int y= ((LinkedList<Integer>) list4).poll();
            System.out.println("y = " + y);
            System.out.println("list4 = " + list4);


            /*
            addFirst
            addLast
            pool()
             */

        }
    }
}