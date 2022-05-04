package day45_Abstraction.Shape;

public class Pentagon extends Shape{
    private double radius;

    private double length;

    public Pentagon( double radius, double length) {
        super("Pentagon");
        this.radius = radius;
        this.length = length;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Invalid Radius: " + radius);
        }
        this.radius = radius;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new RuntimeException("Invalid Length: " + length);
        }
        this.length = length;
    }

    @Override
    public double area() {
        return (5 * length * radius) / 2;
    }

    @Override
    public double perimeter() {
        return 5 * length;
    }

    @Override
    public String toString() {
        return "Pentagon{" +
                super.toString() +
                "radius=" + radius +
                ", length=" + length +
                '}';
    }
}
