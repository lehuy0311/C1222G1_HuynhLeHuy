package ss7_abstract.bai_tap.colorable;

public class Main {
    public static void main(String[] args) {
//        Circle circle = new Circle("blue", true, 4);
//        Square square = new Square("red", false, 4);
//        Rectangle rectangle = new Rectangle("Orange", true, 9, 8);
//        Shape[] shapes = new Shape[3];
//        shapes[0] = circle;
//        shapes[1] = square;
//        shapes[2] = rectangle;
//        for (Shape i : shapes) {
//            if (i instanceof IColorable) {
//                System.out.println(i);
//            }
//        }
        Square square = new Square();
        square.howToColor();
    }
}
