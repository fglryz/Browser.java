package utilities;

import java.util.Arrays;

public class StringUtility {

    //print each character of given string
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
    }

    // revers the give string and reversed string
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    //check the is the given anagram
    public static boolean anagram(String str1){//acb,bca
        char[] ch1=str1.toCharArray();
        char[] ch2=str1.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);


    }

    public static boolean isPalindrome(String word){

       return reverse(word).equalsIgnoreCase(word);
    }


    //removes the duplicate from given string,return String
    public static String removeDuplicate(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char each=str.charAt(i);
        if(!result.contains(""+each)){
            result+=each;
        }

    }
        return result;


}






}

