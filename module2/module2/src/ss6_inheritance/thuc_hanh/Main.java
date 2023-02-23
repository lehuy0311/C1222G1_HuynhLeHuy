package ss6_inheritance.thuc_hanh;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
        System.out.println("------------------------------------------------");

        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(3.5);
        System.out.println(circle1);

        Circle circle2 = new Circle("yellow", false, 5);
        System.out.println(circle2);
        System.out.println("------------------------------------------------");

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(2.3 , 5.8);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle("orange", true, 2.5, 3.8);
        System.out.println(rectangle2);
        System.out.println("------------------------------------------------");

        Square square = new Square();
        System.out.println(square);

        Square square1 = new Square(4);
        System.out.println(square1);

        Square square2 = new Square(9, "red", true);
        System.out.println(square2);
    }
}
