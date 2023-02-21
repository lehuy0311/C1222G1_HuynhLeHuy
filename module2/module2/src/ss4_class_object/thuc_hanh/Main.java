package ss4_class_object.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Width: ");
        double width = scanner.nextDouble();
        System.out.println("Heigth: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);

        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter: " +rectangle.getPerimeter());
        System.out.println("Area: " +rectangle.getArea());
    }
}
