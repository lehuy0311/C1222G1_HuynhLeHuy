package ss4_class_object.bai_tap.fan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 = new Fan(2, true, 5, "red");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }
}
