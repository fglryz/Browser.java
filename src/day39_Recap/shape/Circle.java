package day39_Recap.shape;

public class Circle {

    private double radius;
    public static double pi=3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.out.println("Invalid radius"+radius);
            System.exit(1);
        }
        this.radius = radius;
    }
}
/*
Circle extends Shape:
variables:
radius
pi (static)
Encapsulate the field
Add a constructor to set the filed
area(): radius * radius * pi
perimeter(): 2 * radius * pi
toString(): r, pi, area, perimeter
 */