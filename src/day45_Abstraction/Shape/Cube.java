package day45_Abstraction.Shape;

public class Cube extends Shape implements  Volume {
    private double length;

    public Cube(double length) {
        super("Cube");
        setLength(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new RuntimeException("Invalid length: " + length);
        }
        this.length = length;
    }

    @Override
    public double area() {
        return 6 * (length * length);
    }

    @Override
    public double perimeter() {
        return 12*length;
    }

    @Override
    public double volume() {
        return Math.pow(length,3);
    }

    @Override
    public String toString() {
        return "Cube{" +
                super.toString() +
                "volume=" + volume() + " cm3" +
                ", length=" + length +
                '}';
    }
}
