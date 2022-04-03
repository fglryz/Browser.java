package day4_variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        //age: 38 years old

 byte age=38;

        //weight;160 pound; 160 is out of byte range
        short weight=160;

        //salary:100000$


        int salary1=100_000;

        long asset=3_333_333_333l;

        //tax=2,26
        float tax=0.26f;
        double pi=3.13;

        //#;
        char ch1='#';
        char ch2=35;
        char ch3=0;
        char ch4=4565;
        char gender='F';
        char grade='A';

        boolean isEmployeed=true;
        boolean isMarried=false;
        boolean result=100<300;
           System.out.println("isMarried = " + isMarried);
           System.out.println("isEmployeed = " + isEmployeed);
           System.out.println("result = " + result);

        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
        System.out.println("ch3 = " + ch3);
        System.out.println("ch4 = " + ch4);
        System.out.println("gender = " + gender);
        System.out.println("grade = " + grade);


    }
}
