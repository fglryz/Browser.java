package day23_CustomMethod_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {
        // oddOrEven();//method demand additional information to complete task
        oddOrEven(5);
        System.out.println("----------------------------");
        ageOfPerson(1972);
        System.out.println("---------------------");
        printNumbers(10,20);
        System.out.println();
        System.out.println("-------------------------");

           eligibleToVote(40,false);
    }
//create a function that check if a number is odd or even
    public static void oddOrEven(int number) {
        if(number%2==0){
        System.out.println(number + " is even number");
    }
        else{
        System.out.println(number + " is odd number");
    }

}


//create  a function that can display the age of person
    public  static  void ageOfPerson(int birthYear){

        int age=2022-birthYear;
        System.out.println("Your  age is "+age);


    }

    //create a function that can print all the numbers between X andY

    public static void printNumbers(int x,int y){
        for (int i = x; i <y ; i++) {
            System.out.print(i+" ");
        }



    }

public static void eligibleToVote(int age,boolean isUsCitizen){
        if(age>=18&&isUsCitizen){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible");
        }
}



}



