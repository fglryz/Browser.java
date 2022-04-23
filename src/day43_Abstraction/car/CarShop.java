package day43_Abstraction.car;

import day32_Constructor.Test;

public class CarShop {
    public static void main(String[] args) {
        //We can  not create object from Abstaract class because abstract class is not concrete


        Honda honda=new Honda("Accord","Black",2019,30000);
        Audi audi=new Audi("Q7","Blue",2020,45000);
        Tesla tesla=new Tesla("Model3","white",2021,60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println("-----------------------------------------------------------");

        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("Green");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

}}

