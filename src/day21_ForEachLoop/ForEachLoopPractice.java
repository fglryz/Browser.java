package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        //First and last letter of the each elements
        String[] words={"Java programing","Cydeo School","Wooden Spoon","Early Bird"};
        for (String each : words) {
            System.out.println(each.charAt(0)+""+each.charAt(each.length()-1));


        }
        System.out.println("****************************");

}}
