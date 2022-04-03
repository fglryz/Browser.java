package day8_IfStatement;

public class Logicaloperators {
    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA"; //True

        System.out.println(name+" is eligible to vote "+isEligible);



        System.out.println("******************************");


        String name2="Josh";
        int creditScore=720;
        int age2=23;
        int income=40000;

        boolean isEligible2 = creditScore>=700 && age>=21&&income>=60000;

        System.out.println(name2+" is  eligible to loan  "+isEligible2);

        System.out.println("***********************************");

        String name3="Shay";
        int age3=21;
        char gender='F';
        boolean isEligible3=age3>=18 && (gender=='M'|| gender=='F');

        System.out.println(name3+" is eligible to register: "+isEligible3);


        System.out.println("*******************************************");

        String name4="James";

        String countryOfBirth="USA";
        boolean marriedToUSCitizen=false;

        boolean isEligible4=countryOfBirth =="USA"||marriedToUSCitizen==true;

        System.out.println(name + " is  eligible to apply for US citizen "+countryOfBirth);
        System.out.println("********************************");

        String student="Anna";
        double gpa=3.5;
        int familyIncome=40000;
        boolean isEligible5=gpa>=3.5||familyIncome<=60000;
        System.out.println(student +" is eligible for schoolarship "+isEligible5);

        System.out.println("*****************************************************");
        boolean result2=true;
        System.out.println("result2 = " + result2);
        boolean result3=!result2;
        System.out.println("result3 = " + result3);

        System.out.println("***********************************");

        int score=85;
        boolean passed= score>=60;
        boolean fail=!passed;
        System.out.println("fail = " + fail);
        System.out.println("passed = " + passed);







    }


    }











