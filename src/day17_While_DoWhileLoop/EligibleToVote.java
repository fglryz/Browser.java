package day17_While_DoWhileLoop;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your age");
        int age=scanner.nextInt();// -20// valid age:1~120

        while(!(age>=1&&age<=120)){//while the age invalid
            System.out.println("Invalid entry,please re-entered");
            System.out.println("enter your age");
            age=scanner.nextInt();
        }

        System.out.println("are you Us Citizen? yes/no");
        String answer=scanner.next().toLowerCase();

          while(!(answer.equals("yes")||answer.equals("no"))) {

              System.out.println("Invalid entry,please re-entered");
              System.out.println("are you Us Citizen? yes/no");

          }
          if(age>=18&&answer.equals("yes")){
              System.out.println("you are eligible");
          }
          else{
              System.out.println("not  eligible");
          }




    }
}
