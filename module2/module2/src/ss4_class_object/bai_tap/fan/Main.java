package ss4_class_object.bai_tap.fan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        FanController fan1 = new FanController(3, true, 10, "yellow");
        FanController fan2 = new FanController(2, true, 5, "red");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }
}
