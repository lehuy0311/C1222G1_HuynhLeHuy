package ss2_loop;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number 1: ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Input number 2: ");
        int number2 = Integer.parseInt(scanner.nextLine());
        int gcd = 1; // Ước chung lớn nhất
        int lcm;     // Bội chung nhỏ nhất

        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }
        }

        lcm = (number1 * number2) / gcd;

        System.out.println("GCD= " + gcd);
        System.out.println("LCM= " + lcm);

        double average = (gcd + lcm) / 2;
        System.out.println("Trug bình cộng là: " + average);
    }
}

//        Thuật toán tìm ước chung nhỏ lớn nhất
//        public static int gcdByBruteForce(int a, int b) {
//            int gcd = 1;
//            for (int i = 1; i <= a && i <= b; i++) {
//                if (a % i == 0 && b % i == 0) {
//                    gcd = i;
//                }
//            }
//        }
