package day46_PolymorphismIntro;

import day38_Inheritance.BMW;
import day38_Inheritance.Car;
import day38_Inheritance.Tesla;
import day38_Inheritance.Toyota;

import java.util.ArrayList;

public class Car_Practice {
    public static void main(String[] args) {
        Car[] cars = {
                new Toyota("Highlander", 2010, 25000, "White", 255000),
                new BMW("X5", 2014, 32000, "Red", 12000),
                new Toyota("Corolla", 2011, 20000, "White", 310000),
                new BMW("M3", 2015, 33000, "Blue", 14030),
                new BMW("M5", 2017, 35000, "Black", 15000),
                new BMW("M4", 2018, 40000, "White", 19000),
                new BMW("7 Series", 2009, 30000, "Purple", 21000),
                new BMW("i3", 2011, 30000, "Black", 9000),
                new Toyota("Camry", 2018, 30000, "Red", 185000),
                new Toyota("Rav4", 2012, 23000, "Red", 285000),
                new Toyota("Avalon", 2019, 35000, "Blue", 175230),
                new Tesla("Model 3", 2015, 45000, "White", 235000),
                new Tesla("Model Y", 2017, 65000, "Black", 135000),
                new Tesla("Model X", 2016, 48000, "White", 235000),
                new Tesla("Model X", 2014, 48000, "White", 236000),
        };
        ArrayList<Toyota>toyotas=new ArrayList<>();
        ArrayList<BMW>bmws=new ArrayList<>();
        ArrayList<Tesla>teslas=new ArrayList<>();

        /*1.2 Write a program that can display all the cars that are eligible for recall

        Cars that are eligible for recall:
        Toyota: from year 2010 to 2011
        BMW: from year 1929 to 2022
        Tesla: from year 2015-2016 */
        for (Car eachCar : cars) {
            if(eachCar instanceof Toyota && eachCar.year>=2010 && eachCar.year<=2011){
                //toyotas.add((Toyota)eachCar);
                System.out.println("eachCar = " + eachCar);
            }
            if(eachCar instanceof BMW && eachCar.year>=1929 && eachCar.year<=2022){
                //bmws.add((BMW) eachCar);
                System.out.println("eachCar = " + eachCar);
            }
            if(eachCar instanceof Tesla && eachCar.year>=2015 && eachCar.year<=2016){
                //teslas.add((Tesla)eachCar);
                System.out.println("eachCar = " + eachCar);
            }
        }




        System.out.println("------------------------------------");
            // 1.3 Write a program that can display the car that has the highest mileage
    //int highestMile=0;
        Car carWithHighestMileage = cars[0],
                carWithLowestMileage =  cars[0];


        for (Car eachCar : cars) {
            if(eachCar.miles > carWithHighestMileage.miles){
                carWithHighestMileage = eachCar;
            }

            if(eachCar.miles < carWithLowestMileage.miles){
                carWithLowestMileage = eachCar;
            }

        }

        System.out.println(carWithHighestMileage);
        System.out.println(carWithLowestMileage);




    }}


