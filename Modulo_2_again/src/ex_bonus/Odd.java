package ex_bonus;

import java.util.Scanner;

public class Odd {
    public static boolean isOdd(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (isOdd(number) == true) {
            System.out.println("Is Odd");
        } else {
            System.out.println("Is Not Odd");
        }
    }
}
