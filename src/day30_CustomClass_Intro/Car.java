package day30_CustomClass_Intro;

public class Car {

    public String brand;
    public String model;
    public String color;
    public double price;
    public int year;


    public void setInfo(String carBrand, String carModel, String carColor, int carPrice, int carYear) {
        brand = carBrand;
        model = carModel;
        price = carPrice;
        year = carYear;
        color = carColor;

    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
    public void drive() {
        System.out.println("Driving "+ brand+" "+model);
    }
    public void start() {

        System.out.println("Starting "+ brand+" "+model);
    }
    public void stop() {
        System.out.println("Stopping "+ brand+" "+model);
    }





}
//brand,model,color,year.price
//drive(),start(),stop(),to String.setInfo