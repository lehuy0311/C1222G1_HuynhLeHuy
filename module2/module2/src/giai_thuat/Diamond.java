package giai_thuat;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        int h;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao của hình thoi mà bạn mốn: ");
        h = scanner.nextInt();

        for (int i = 1; i < h; i++) {
            for (int j = 1; j < h - i; j++) {
                System.out.print(" ");
            }
            System.out.print(i + " ");
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            if (i != 0) {
                System.out.print("" + i);
            }
            System.out.println();
        }
//        for (int i = h - 2; i > 0; i--) {
//            for (int j = 0; j < h - i - 1; j++) {
//                System.out.print(" ");
//            }
//            System.out.print(i);
//            for (int j = 0; j < 2 * i - 1; j++) {
//                System.out.print(" ");
//            }
//            if (i != 0) {
//                System.out.print(" " + i);
//            }
//            System.out.println();
//        }
        }
}
