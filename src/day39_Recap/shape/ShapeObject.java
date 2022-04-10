package day39_Recap.shape;

public class ShapeObject {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(3,2);
        System.out.println(rectangle);

        System.out.println("area=" + rectangle.area());
        System.out.println( "Rectangle "+rectangle.perimeter());

        System.out.println("==============================");

       Square square=new Square(5);
        System.out.println(square);
        square.setSide(15);
        System.out.println("area=" + square.area());
        System.out.println( "Rectangle "+square.perimeter());

        System.out.println("==============================");

        Circle circle=new Circle(4);
        System.out.println(circle);
        System.out.println("area=" + circle.area());
        System.out.println( "Rectangle "+circle.perimeter());


    }
}
