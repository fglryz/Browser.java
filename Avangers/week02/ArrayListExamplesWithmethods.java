package week02;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExamplesWithmethods {
    public static void main(String[] args) {
        ArrayList<String>cities=new ArrayList<>();

        // contains(): returns boolean
        System.out.println(cities.contains("Istanbul"));

        // remove(index)  -- the element will be deleted at the given index
        System.out.println(cities.remove(0)); // returns the element which is removed
        // remove(Object) --- removes the matching object
        System.out.println("cities removed = " + cities.remove("Istanbul"));
        System.out.println("cities removed = " + cities.remove("Istanbul"));


        // Bulk Operations
        // adding array element in one shot

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.addAll(Arrays.asList(123,234,345,456,123,234));

        System.out.println("before removeAll: "+arrayList);
        // removeAll: to remove multiple elements

        arrayList.removeAll(Arrays.asList(123,345));
        System.out.println("after removeAll: "+arrayList);

        //retainAll(): if you want to retain multiple elements

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Serdar","Ceyhun","Ahmet","Metin","Zehra","Mike","Serdar","Ceyhun"));
        System.out.println("Names before RetainAll"+names);
        names.retainAll(Arrays.asList("Serdar","Ceyhun"));
        System.out.println("Names after RetainAll"+names);

        names.addAll(Arrays.asList("Serdar","Ceyhun","Ahmet","Metin","Zehra","Mike","Serdar","Ceyhun"));

        // removeIf() : removes element according to a condition
        names.removeIf(each->each.length()>5); // each is predicate that holds place of each Arraylist element
        System.out.println(names);

        // clear()  : removes all the objects from the list
        names.clear();

        // isEmpty(): returns true if the arraylist contains NO element
        System.out.println("is Name empty : "+names.isEmpty());

    }

    }

