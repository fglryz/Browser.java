package day37_Inheritance.phoneTask;

public class Phone {//parent class:only contains the common features of the all subclasses
    public  String brand,model,size,color;
    public double price;

    public static boolean hasBattery=true;

    public Phone(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;

    }

    public void call(long phoneNumber){
        System.out.println(brand+" "+model+" is calling");
    }

    public void text(long phoneNumber){
        System.out.println(brand+ " "+model+" is texting");
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=$" + price +
                ", has battery" + hasBattery +
                '}';
    }
}
