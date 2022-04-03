package day6_PrimitiveTypeCasting;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println( 10+20);//30, addition
        System.out.println(100-50);//50,subtraction

        System.out.println(10*5);//50, multiplication

        System.out.println(100.0/3);//division
        System.out.println(10.0/4);//2.5
        System.out.println(10/4.0);
        System.out.println(10d/4);

        int a=100;
        double b=a/6;//16.0
        //  double b=16;
        System.out.println(a+":"+b);
        
        double c=a/6.0;//16.66666....
        //  integer/double=double
        System.out.println(c);
        System.out.println(100D);








    }
}
/*
+:addition
-:substaract
*:Multiplication
/:Division

integer/integer====>integer
decimal/integer======>decimal
integer/decimal=======>decimal
decimal/decimal=====>decimal

  in math:
  10/4=2.5

  in Java;
  10/4=2
  10.0/4=2.5
%:Remainder


 */
