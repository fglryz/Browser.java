package day14_String;

public class stirngMethods {
    public static void main(String[] args) {
        String word="Cydeo";
        char thirdChar=word.charAt(3);
        System.out.println("thirdChar=" +thirdChar);

/*
        char tenthChar=word.charAt(9);
        System.out.println("tentchar="+tenthChar);
*/
        System.out.println("***************************");

        String s1 = "Batch 25 is the best batch. Java Programming Language.";
        int totalChars=s1.length();
        System.out.println("Total Chars=" +totalChars);

        char lastChar=s1.charAt(s1.length()-1);//last index number
        System.out.println(lastChar);

        System.out.println("-----------------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase(); //"WOODEN SPOON"

        System.out.println(str);
        // Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();

        System.out.println(sentence);


        System.out.println();








    }
}
