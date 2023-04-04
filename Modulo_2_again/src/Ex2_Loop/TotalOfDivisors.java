package Ex2_Loop;

import java.util.Scanner;

public class TotalOfDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên: ");
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        if (number > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum = sum + i;
                }
            }
            System.out.println("Tổng các ước là: " + sum);
        } else {
            System.out.println("Bạn cần nhập vào giá trị là sô nguyên " +
                    "và số đó cần phải lớn hơn 0");
        }
    }
}
