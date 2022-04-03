package day5_Concatenation;

public class FullName {
    public static void main(String[] args) {
       String firstName="Fatma";
       String lastName="Guleryuz" ;
       int age=49;
       String jobTitle="Apple Inc";
       double salary=100000;


       String fullName=firstName+" "+ lastName;
       //Full name of the person is---
        System.out.println("Full name of the person is "+fullName);
        //----is ----years old.
        System.out.println(fullName+ " is "+age +" years old.");
        //Full name is JobTitle, works at companyName

        System.out.println(fullName +" is "+ jobTitle + " , works at the company.");


        //Full name is JobTitle, works at companyName,FullName' salary is salary.
        System.out.println(fullName +" is "+ jobTitle + " , works at the company, "+fullName+"' salary is $ "+salary);
    }}


