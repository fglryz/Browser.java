package week3;

public class DifferenceBetweenAndOrBitwise {
    public static void main(String[] args) {
        int i1=5;
        int i2=10;

        System.out.println(true|false);//true

        System.out.println(true||false);//true does not check the second part of statement
        System.out.println(i2>i1|i1>i2);//


        System.out.println(i2>i1||++i1>i2);
        System.out.println("i1="+i1);

        System.out.println(i2>i1|++i1>i2);
        System.out.println("i1="+i1);

        boolean a=i2<i1 &&++i1<i2;
        System.out.println("i1-="+i1);



    }
}
