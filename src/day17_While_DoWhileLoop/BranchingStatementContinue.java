package day17_While_DoWhileLoop;

public class BranchingStatementContinue {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
                 if(i=='C'){
                     continue;
                 }
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println(".............................");

        for (int i = 1; i <= 10; i++) {
            if(i%2!=0){
                continue;
            }
            System.out.print(i + " ");
    }
        System.out.println();
        System.out.println(".............................");

        for (int i = 1; i <= 10; i++) {
            if(i%2==0){
                continue;
            }
            System.out.print(i + " ");

}}}
