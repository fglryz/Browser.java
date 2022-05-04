package day45_Abstraction.Shape;

public class Triangle extends Shape{
    private double length, length2, length3;
    private double height;

    public Triangle(double length, double length2, double length3, double height) {
        super("Triangle");
        setLength(length);
        setLength2(length2);
        setLength3(length3);
        setHeight(height);
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

    public double getLength2() {
        return length2;
    }

    public void setLength2(double length2) {
        if (length2 <= 0) {
            throw new RuntimeException("Invalid length2: " + length2);
        }
        this.length2 = length2;
    }

    public double getLength3() {
        return length3;
    }

    public void setLength3(double length3) {
        if (length3 <= 0) {
            throw new RuntimeException("Invalid length3: " + length3);
        }
        this.length3 = length3;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new RuntimeException("Invalid height: " + height);
        }
        this.height = height;
    }


    @Override
    public double area() {
        double height = (length + length2 + length3) / 2;
        return Math.sqrt(height * (height - length) * (height - length2) * (height - length3));
    }

    @Override
    public double perimeter() {
        return length + length2 + length3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                super.toString() +
                "length=" + length +
                ", length2=" + length2 +
                ", length3=" + length3 +
                ", height=" + height +
                '}';
    }
}
