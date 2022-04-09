package day38_Inheritance.carTask.method_Overriding;

public class Shape {
    public String name;
    public double area,perimeter;

    public Shape(String name, double area, double perimeter) {
        this.name = name;
        this.area = area;
        this.perimeter = perimeter;
    }

    public void area(){

    }
    public void perimeter(){

    }

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + area + '\'' +
                "perimeter='" + perimeter + '\'' +

                '}';
    }
}
