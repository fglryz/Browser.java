package day35_Encapsulation;

public class CydeoTest {
    public static void main(String[] args) {
        CydeoStudent student1=new CydeoStudent("FAtma",'F',
                45,8,11,"SDET");

        System.out.println(student1);
        System.out.println(student1.schoolName);
        System.out.println(student1.programmingLanguage);
        System.out.println(student1.secretCode);

    }
}
