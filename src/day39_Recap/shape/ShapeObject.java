package day39_Recap.shape;

public class ShapeObject {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(3,2);
        System.out.println(rectangle);
        rectangle.setLength(10);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle);
        System.out.println(rectangle.getName());


        System.out.println("==============================");

       Square square=new Square(5);
        System.out.println(square);
        square.setSide(15);


        System.out.println("==============================");

        Circle circle=new Circle(4);
        System.out.println(circle);
        circle.setRadius(9.5);
        System.out.println(circle.getRadius());
        System.out.println(circle);
        System.out.println(circle.getName());





    }
}
