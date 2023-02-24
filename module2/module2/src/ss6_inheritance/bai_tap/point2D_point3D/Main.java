package ss6_inheritance.bai_tap.point2D_point3D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(1.5f,3.2f);
        System.out.println(point2D);
        System.out.println("---------------------------------");

        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(4.2f, 2.1f, 5.2f);
        System.out.println(point3D);
    }
}
