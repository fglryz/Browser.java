package day29_ArrayList_CollectionUtility;

import utilities.StringUtility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethods {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
       /* for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2!=0){
                list.remove(i);
            }
            
        }*/
        System.out.println("list = " + list);
        list.removeIf(p->p<5);//Lambda expression
        System.out.println("list = " + list);

        System.out.println("---------------------------");

        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(each->each%2==0);
        System.out.println(list2);
        System.out.println("---------------------------");

       ArrayList<String> list3=new ArrayList<>();
       list3.addAll(Arrays.asList("Java","Python","JavaScript","C++","Java","Java","C#"));
       list3.removeIf(each->each.startsWith("J"));
        System.out.println("list3 = " + list3);
        System.out.println("---------------------------");

        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Racecar","level","Eye","Java","Python"));
        names.removeIf(each-> !StringUtility.isPalindrome(each));
        System.out.println("names = " + names);

    }
}
