package day27_WrapperClasses;

public class WrapperClassMethods_ValueOf {
    public static void main(String[] args) {
        String s2="123";
       int x= Integer.valueOf(s2);//integer
        int y=Integer.valueOf(s2);
        System.out.println(x);
        System.out.println("y = " + y);
        System.out.println("--------------------------------------");

        String s3="1.2";
       Double x1= Double.valueOf(s3);
       double y1=Double.valueOf(s3);
        System.out.println("y1 = " + y1);
        System.out.println("x1 = " + x1);
        System.out.println("-------------------------------");
        //isDigit();
        char ch='a';
        boolean r2=Character.isDigit(ch);
        boolean r3= Character.isLetter(ch);
        boolean r4=Character.isLetterOrDigit(ch);
        boolean r5= Character.isUpperCase(ch);
         boolean r6= Character.isLowerCase(ch);

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        System.out.println("==================================");
        String s="ab1cd2efg3hi4";
        int sum=0;
        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
            
        }
        System.out.println(sum);
        System.out.println("------------------------------------------");

        /*
        PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
         */
        






    }
}
