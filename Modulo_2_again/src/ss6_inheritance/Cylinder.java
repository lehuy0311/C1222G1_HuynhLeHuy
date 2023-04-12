package ss6_inheritance;

public class Cylinder extends Circle {
    // Cylinder kế thừa Circle
    private double height;

    //overloading
    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color); // kế thừa từ Circle
        this.height = height; // height được thêm mới
        // height không đưuọc kế thừa
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    //Ghi đè phương thức thể hiện trong các class có mối quan hệ kế thừa
    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", which is a subclass of " + super.toString();
    }
}
