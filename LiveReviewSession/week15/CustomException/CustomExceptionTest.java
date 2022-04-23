package week15.CustomException;

public class CustomExceptionTest {
    public static void main(String[] args) {

        int minutes=30;
        System.out.println("Class is going on fo "+minutes+ " minutes");
        if(minutes>50){
            throw new RuntimeException("It is break time");
        }
        System.out.println("Lets continue tha class "+(50-minutes)+ " minutes");


        double balance=395.50;
        double itemPrice=500.0;
        System.out.println("I have "+balance+ " Euros in my account the item is "+ itemPrice);
        if(itemPrice>balance){
            throw  new InsufficientBalanceException("Transaction declined due to insufficient balance hold");
        }

    }




}
