package day30_CustomClass_Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setInfo("BMW", "X5",
                "White", 15000,
                2020);
        System.out.println("car1 = " + car1);

        Car car2 = new Car();
        car2.setInfo("Mercedes",
                "GLC", "Black",
                20500, 2021);
        System.out.println("car2 = " + car2);

        Car car3 = new Car();
        car3.setInfo("Audi", "0", "Black", 40000, 2019);
        System.out.println("car3 = " + car3);

        //Car[] cars={car1,car2,car3};
        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2, car3));
        for (Car each : carsList) {
            System.out.println(each.brand + ": $" + each.price);

        }
        System.out.println("------------------------");

        carsList.removeIf(p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008);
        carsList.removeIf(p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);


/*
BMW:2005~2008
Toyota;1995~1997
 */

    }

}
