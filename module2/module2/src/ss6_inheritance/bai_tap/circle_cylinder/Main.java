package ss6_inheritance.bai_tap.circle_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(9 , "red");
        System.out.println(circle.toString());
        System.out.println("Diện tích hình tròn là: " + circle.getArea());

        Cylinder cylinder = new Cylinder(4,"blue", 10);
        System.out.println(cylinder.toString());
        System.out.println("Th tích hình trụ tròn là: " + cylinder.getVolume());


    }
}
