package day6_PrimitiveTypeCasting;

public class BirthDAy {
    public static void main(String[] args) {
        String name="John";
        int birthDate=25;
        String birthMonth="April";
        int birthYear=1995;
        

        System.out.println(name+" was born on "+birthMonth+"/"+birthDate+"/"+birthYear+".");
        System.out.println("-----------------------------------");

        //My favourite book is "book name"

        String book="Java";
        System.out.println("My favourite book is \""  + book+"\"");
    }

}
/*

Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.
 */
