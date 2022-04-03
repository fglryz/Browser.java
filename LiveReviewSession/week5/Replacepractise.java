package week5;

public class Replacepractise {


    public static void main(String[] args) {

        String word = "github";

        System.out.println(word.replace("hub","lab")); // actually an object is created
        // but not assigned to a reference (so we an unreferenced object) Garbage collector cleans that object
// JAVA Memory Usage Topic

        System.out.println("word = " + word);

        System.out.println(word.replace('i','o'));

        String searchResult="1-48 over 6,000 result for java";
        String result=searchResult.replace("1,48 over "," ").replace("results for java"," ");
        System.out.println(result);

        String expectedResult="6000";
        if(expectedResult.equals(searchResult)){
            System.out.println("Pass");
        }
        else {
            System.out.println("fail");

        }



    }}
