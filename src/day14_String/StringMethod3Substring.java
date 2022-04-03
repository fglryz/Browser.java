package day14_String;

public class StringMethod3Substring {
    public static void main(String[] args) {
        //substring()

        String word = "Cydeo School";
        String band = word.substring(0, 4 + 1);
        System.out.println(band);

        String str1 = word.substring(6);
        System.out.println(str1);
        System.out.println("****************************");

        String word2 = "Java Programming Language";

        String s1 = word2.substring(0, word2.indexOf(" "));//Java
        String s2=word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));//Programming
        String s3=word2.substring(word2.lastIndexOf(" ")+1 );
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("******************************");

        String word3 = "Python C# Ruby";
        String s4 = word3.substring(0, word3.indexOf(" "));//Python
        String s5=word3.substring(word3.indexOf(" ")+1, word3.lastIndexOf(" "));//c#
        String s6=word3.substring(word3.lastIndexOf(" ")+1 );//Ruby

        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);

        System.out.println("*********************************");










        /*
        Write a program that can gte the domain of the email. ( Assume that a
valid email is given)
Ex:
email = Cydeo.School@gmail.com
output:
gmail
email = "School.Cydeo@yahoo.com
output:
yahoo
         */

    }
}
