package day32_Constructor;

public class CarObject {
    public static void main(String[] args) {
        Car car1=new Car("Toyota");
        Car car2=new Car("Honda","Accord");
        Car car3=new Car("Lexus","RX350",2020);
        Car car4=new Car("Lexus","RX350",2020,50000);
        Car car5=new Car("Lexus","X6",2020,50000,"Black");
        System.out.println(car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);
        System.out.println("car4 = " + car4);
        System.out.println("car5 = " + car5);

    }
}
