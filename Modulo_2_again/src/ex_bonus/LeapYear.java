package ex_bonus;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input year");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println(leapYear(year));
    }

    public static boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }
}
