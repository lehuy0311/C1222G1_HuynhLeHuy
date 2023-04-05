package ex_bonus;

import java.util.Arrays;
import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn tìm ước: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Các ước số của " + number);
        check(number);

    }

    public static void check(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                //System.out.println(i);
                count++;
            }
        }

        int[] arr = new int[count];
        int flag = 0;
        for (int j = 1; j <= number; j++) {
            if (number % j == 0) {
                System.out.println(j);
                arr[flag] = j;
                flag++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

}

