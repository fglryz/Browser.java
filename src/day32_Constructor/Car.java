package day32_Constructor;

public class Car {
    public String brand,color,model;
    public int year;
    public double price;

    public Car(String brand){
        this.brand=brand;
    }
    public Car(String brand,String model){
        this(brand);
        this.model=model;
    }
    public Car(String brand,String model,int year){
        this(brand,model);
        this.year=year;


    }

    public Car(String brand, String model, int year, double price) {

        this(brand,model,year);
        this.price=price;
    }

    public Car(String brand, String model, int year, double price,String color){
        this(brand, model, year, price);
        this.color=color;

    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}








