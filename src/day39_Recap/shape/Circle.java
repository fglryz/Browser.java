package day39_Recap.shape;

public class Circle extends Shape{

    private double radius;
    public static double pi=3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            throw new RuntimeException("invalid radius");
        }
        this.radius = radius;
    }

    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
      return  radius * radius * pi;
    }

    public String toString() {
        return "Circle{" +
                ", radius=" + radius +
                ", pi=" + pi +'\''+
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
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
perimeter(): radius * radius * pi
toString(): r, pi, area, perimeter
 */