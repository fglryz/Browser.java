package day31_Constructor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrder {
    public static void main(String[] args) {

//Create100 pizza object size-s ,cheese topping-2,pepperoni topping=3
// Create100 pizza object size-M ,cheese topping 3,pepperoni topping4
// Create100 pizza object size-M ,cheese topping 4,pepperoni topping5

        ArrayList<Pizza>pizzas=new ArrayList<>();

          for (int i = 0; i <100 ; i++) {
            Pizza small=new Pizza('S',2,'3');
            Pizza medium=new Pizza('M','3','4');
            Pizza large=new Pizza('L','4','5');

            pizzas.addAll(Arrays.asList(small,medium,large));
        }

        System.out.println("total pizzas = " + pizzas.size());
          double totalPrice=0;
        for (Pizza pizza : pizzas) {
            totalPrice+=pizza.calcCost();

        }
        System.out.println("totalPrice = " + totalPrice);







}}
