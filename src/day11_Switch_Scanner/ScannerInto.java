package day11_Switch_Scanner;
import java.util.Scanner;
public class ScannerInto {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter an integer:");
        int n1= input.nextInt();
        System.out.println(n1);

        System.out.println("enter a double:");
        double n2= input.nextDouble();
        System.out.println(n2);
        System.out.println("multiplication:"+(n1*n2));

input.close();//close the scanner after this scanner
       // System.out.println("enter an integer number:");
        //int n3= input.nextInt();

    }

}
