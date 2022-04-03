package day31_Constructor;

public class Pizza {
    public char size;
    public int numberOfCheeseTopping,getNumberOfPepperoniTopping;


    public Pizza(char size, int numberOfCheeseTopping, int getNumberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.getNumberOfPepperoniTopping = getNumberOfPepperoniTopping;

    }

    public double calcCost(){
        double startingPrice=(size=='S')?10:(size=='M')?12:14;
        double totalPrize=startingPrice+(numberOfCheeseTopping+getNumberOfPepperoniTopping)*2;
        return totalPrize;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", getNumberOfPepperoniTopping=" + getNumberOfPepperoniTopping +
                ", total price=$" + calcCost() +
                '}';
    }
}





/*
/*
Pizza Task:
    	Attributes:
    		size, numberOfCheeseTopping, numberOfPepperoniTopping
    		Add a constructor that can set all the fields
		Actions:
			calcCost(): returns the totalCost of the pizza
			toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */
