package week15.CustomException;

public class InsufficientBalanceException extends RuntimeException{
    public  InsufficientBalanceException(){}
    public InsufficientBalanceException(String message){
        super(message);

    }
}
