package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char grade='B';
        String result="";

        switch (grade){

            case 'A':
                result="Excellent";
                break;
            case 'B':
                result="Great Job";
                break;
            case 'C':
                result="Good";
                break;
            case 'D':
                result="Passed";
                break;
            case 'F':
                result="Failed";
                break;
            default:
                result="Invalid";
                break;

        }
        System.out.println(result);
    }
}
