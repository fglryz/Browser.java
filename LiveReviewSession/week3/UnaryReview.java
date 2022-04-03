package week3;

public class UnaryReview {
    public static void main(String[] args) {

        int a=20;
        System.out.println("a++="+ a++);
        System.out.println("+a="+a);

        int c=20;
        System.out.println(++c+1);
        int b=20;
        System.out.println("++b="+ ++b);
        boolean isMarried=false;
        System.out.println( "isMarried="+!isMarried
        );
        int y = 12;

        if(y++>12){  // post-increament operator :
            System.out.println("Y in the IF statement part : "+ y);
        }else{
            System.out.println("Y value in the ELSE statement"+ y); // 13
        }


    }
}
