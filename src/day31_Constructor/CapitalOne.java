package day31_Constructor;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount();

        account1.SetInfo("Ali Veli", 123456);
        System.out.println(account1);

        account1.deposit(10000);
        account1.checkBalance();

        account1.withdraw(900);
        account1.checkBalance();
        account1.deposit(900);
        account1.checkBalance();
        System.out.println("-------------------");
        BankAccount account2=new BankAccount();
        account2.SetInfo("Hale Ali",12343678);

        account2.deposit(10000);
        account2.checkBalance();

        account2.withdraw(9000);
        account2.checkBalance();

        account2.deposit(250);
        account2.checkBalance();
    }
}
