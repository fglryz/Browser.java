package week5;

public class Palindrome {
    public static void main(String[] args) {

        String word="madam";


        if((""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0)).equals(word)){
            System.out.println("palindrome");
        }else{

            System.out.println("not");}

        System.out.println(word.charAt(word.length()-5));

        System.out.println(word.charAt(word.length()-4));
        System.out.println(word.charAt(word.length()-3));
        System.out.println(word.charAt(word.length()-2));
        System.out.println(word.charAt(word.length()-1));

        String reverseWord=" ";
        reverseWord+=word.charAt(4);
        reverseWord+=word.charAt(3);
        reverseWord+=word.charAt(2);
        reverseWord+=word.charAt(1);
        reverseWord+=word.charAt(0);
        if(word.equals(reverseWord)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not");
        }
    }
}
