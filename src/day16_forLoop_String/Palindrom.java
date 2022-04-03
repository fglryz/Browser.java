package day16_forLoop_String;

public class Palindrom {
    public static void main(String[] args) {


        String word="racecar";
        String reversed="";

        for(int i=word.length()-1;i>=0;i--){
           reversed+= word.charAt(i);


            }
        boolean ispalindrome=word.equalsIgnoreCase(reversed);
        System.out.println("ispalindrome = " + ispalindrome);;
        }

    }

