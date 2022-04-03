package day27_WrapperClasses;

public class WrapperClassMethods_Parse {

    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);//int
        System.out.println(num + 1);
        System.out.println(str + 1);

        System.out.println("=====================================");
        String str2 = "10.5";
        double num2 = Double.parseDouble(str2);
        System.out.println(num2 + 1);

        System.out.println("=======================================");
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(" int min = " + min);
        System.out.println("int max = " + max);


        long max1 = Long.MAX_VALUE;
        long min1 = Long.MIN_VALUE;
        System.out.println(" long min1 = " + min1);
        System.out.println("long max1 = " + max1);
        System.out.println("=======================================");
        String s1="true";
        boolean r1=Boolean.parseBoolean(s1);
        System.out.println(r1);


    }
}
