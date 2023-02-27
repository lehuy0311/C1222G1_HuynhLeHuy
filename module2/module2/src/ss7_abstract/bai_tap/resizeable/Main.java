package ss7_abstract.bai_tap.resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square("red", true, 19);
        shapes[1] = new Circle("blue", false, 10);
        shapes[2] = new Rectangle("red", true, 15, 10);

        System.out.println("Trước khi resize");
        for (Shape shape : shapes) {
            System.out.println(shape + "\n");
        }

        System.out.println("Sau khi resize");
        for (Shape shape : shapes) {

            shape.resize(Math.random() * 100);
            System.out.println(shape + "\n");
        }
    }
}
