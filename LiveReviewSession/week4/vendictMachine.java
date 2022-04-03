package week4;

public class vendictMachine {
    public static void main(String[] args) {

        boolean drink = true;
        String drinkItem = "tea";
        String snackItem = "candy";


        if (drink) {
            if (drinkItem == "tea") {
                System.out.println("tea is selected");
            } else {
                System.out.println("coke is selected");
            }
        } else {

            if (snackItem == "chips") {
                System.out.println("chips is selected");
            } else {
                System.out.println("candy is selected");
            }

        }

        System.out.println("*******************");

    }
}
/*
add new class VendingNestedIf
add main method

selection = "drink" or can be "snack"
drinkItem = "tea" , "coke"
snackItem = "chips" , "candy"

when selection is "drink":
"drink option is selected"

    when drinkItem is "tea":
        "tea is selected"
    when drinkItem is "coke":
        "coke is selected"
when selection is "snack"
"snack option is selected"

    when snackItem is "chips":
        "chips item is selected"
    when snackItem is "candy":
        "candy item is selected"
 */