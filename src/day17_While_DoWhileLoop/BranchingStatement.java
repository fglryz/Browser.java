package day17_While_DoWhileLoop;

import java.util.Scanner;

public class BranchingStatement {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {
            if (i == 'F') {
                break;//exist the loop
            }
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("....................");

        Scanner scanner=new Scanner(System.in);

        while(true){
            System.out.println("enter a  number");
            int num=scanner.nextInt();

            if(num<0){
                break;
            }
        }

        System.out.println();
        System.out.println("....................");




    }


}

