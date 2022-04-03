package day9_IfStatement;

public class LeapYear {
    public static void main(String[] args) {

        int year=2000;
        boolean leapYear=year%4==0;


        if(leapYear){
            System.out.println("year "+year+" is a leap");
        }
        if(!leapYear){
            System.out.println("year "+year+" is Not a leap");
        }
        System.out.println("*************************");

        if(leapYear){
            System.out.println("year "+year+" is a leap");
        }else
        {System.out.println("year "+year+" is Not a leap");

    }
}}
