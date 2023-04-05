package ex_bonus;

import java.util.Scanner;
import java.util.regex.Matcher;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for check prime: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(isPrime(number));
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
