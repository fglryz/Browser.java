package day1_JavaIntr;


import day24Custommethodes_Return.Palondrime;
import day24Custommethodes_Return.RemoveDuplicatedCharacters;
import day24Custommethodes_Return.ReverseReturn;
import day28_ArrayList.StrongPassword;
import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        String str = "Java Programming language";
        StringUtility.printEachChar(str);

        System.out.println("--------------------------");
        System.out.println();
        String s1 = "Wooden Spoon";
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);
        System.out.println("______________________________");

        String word = "Civic";
        boolean polindrome=StringUtility.isPalindrome(word);

        System.out.println("polindrome = " + polindrome);

        System.out.println("================================== ");

        String[] names = {"Anna", "Java", "Python", "Racecar", "Mom", "Cydeo", "Java"};
        int count = 0;
        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }
        }
        System.out.println("count = " + count);
        System.out.println("============================ ");

        String str1="Englllaaandeee";

       String nonDup= StringUtility.removeDuplicate(str1);
        System.out.println(nonDup);

        System.out.println("+++++++++++++++++++++");
        int []arr = {10, 10, 20, 30, 40, 30, 30, 30};
        int oldValue=30;
        int newValue=2;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==oldValue){
                arr[i]=newValue;
            }

        }
        System.out.println(Arrays.toString(arr));


        System.out.println(" ++++++++++++++++++++++++++++");

String password="Acs7BA$b";

    boolean isTrue=StrongPassword.isStrongPassword(password );
        System.out.println("isTrue = " + isTrue);
        System.out.println(" ++++++++++++++++++++++++++++");
       int[] arr1 = {10, 20, 30, 40, 50};
       arr1=ArraysUtility.swap(arr1,1,4);
        System.out.println(Arrays.toString(arr1));
}}