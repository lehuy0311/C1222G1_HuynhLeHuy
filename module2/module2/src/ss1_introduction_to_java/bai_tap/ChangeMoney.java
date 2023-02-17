package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usd;
        do {
            System.out.println("Enter a money $ : ");
            usd = input.nextInt();
        } while (usd <= 0);
        int total = usd * 23000;
        System.out.println("Total: " + total + " VND");
    }
}
