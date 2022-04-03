package day29_ArrayList_CollectionUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice2_Employees {
    public static void main(String[] args) {
        ArrayList<String>employees=new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","David","Ahmed","Jimy","Daniel","Aeron","david","Shay"));

        employees.retainAll(Arrays.asList("Ahmed","David"));
        System.out.println("employees = " + employees);

        System.out.println("-------------------------------------");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String>list=new ArrayList<>(Arrays.asList(names));
        list.removeIf(p->p.startsWith("M"));

        names=list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));

    }
}
