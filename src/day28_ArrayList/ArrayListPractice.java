package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);


        for (int i = 0; i < list.size(); i++) {//i is index number
            list.set(i, list.get(i)*2);
        }
        System.out.println(list);
        System.out.println("-------------------------------");

        ArrayList<String>employees=new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);

        employees.remove(1);
        System.out.println(employees);
        employees.remove(employees.size()-1);
        System.out.println(employees);
        employees.remove("Ali");
        System.out.println(employees);
        boolean r2=employees.remove("Neira");
        System.out.println(employees);
       boolean r1= employees.remove("Hulya");
        System.out.println(employees);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
    }
}
/*
{1,2,3,4,5,6}
{2,4,6,8,12}
 */