package ss2_loop.bai_tap;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input) {
            case 1:
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 16; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("Choose 1 of 3 options below: ");
                System.out.println("1.Botton-left");
                System.out.println("2.Top-left");
                System.out.println("3.Exit");

                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j < i; j++) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                        break;
                    case 2:
                        for (int x = 7; x >= 1; x--) {
                            for (int y = 1; y <= x; y++) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                        break;
                }
                break;
            case 3:
                for (int a = 7; a >= 1; a--) {
                    for (int b = 1; b <= a; b++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
        }
    }
}
