package day10_NestedIf;

public class NestefIfIntro {
    public static void main(String[] args) {
        int score=400;

       if(score>=0 &&score<=100){// if score is valid

        if(score>=60) {//if student passed the exam
            System.out.println("Passed");
        }
        else{//if student failed exam
        System.out.println("Failed");
    }
       }

        else{//if the score is not valid
           System.out.println("Invalid");
}
        System.out.println("***************************");

        int age=25;
        boolean hasId=false;
       if(hasId){//if the person id ans 21 years old

        if (age>=21){
            System.out.println("eligible to buy alcohol");
        }
        else{//if person is under 21
            System.out.println("not eligible to buy alcohol");
        }}
       else {
           System.out.println("you must have ID to buy alcohol");
       }

        System.out.println("*******************************");


       int number=-1;
       String day;

        if(number>=1&&number<=7){//if the number is valid number~
            if(number==1){
                day="Monday";
            }
            else if(number==2){
                day="Tuesday";
            }
            else if ((number==3)){
                day="Wednesday";
            }
            else if ((number==4)){
                day="Thursday";
            }else if ((number==5)){
                day="Friday";
            }
            else if (number==6){
                day="Saturday";
            }
            else {
                day="Sunday";

            }
            System.out.println("day = " + day);


    }
        else{//if the number is not valid
            System.out.println("Invalid");
        }





}}
