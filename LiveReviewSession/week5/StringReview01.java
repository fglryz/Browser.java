package week5;

public class StringReview01 {
    public static void main(String[] args) {
        String str1 = "Java";//literal way of creating
        // string object is create in Heap memory there is a special place called "String"
        String str2 = "Java";//literal

        System.out.println(str1==str2);//true: the reason:both str1 and str2 references are pointing
        // same object in the memory.



        String str3=new String("Java");// over here we are creating new object.so
        System.out.println(str1==str3);//false because str1 and str3 are pointing a different objects.
//What does equals()methos do?it is checking the value of object.
        System.out.println(str1.equals(str3));

        String str4=new String("JAVA");

        System.out.println(str2.equalsIgnoreCase(str4));
        System.out.println(str1.equals(str4));


    }
}
