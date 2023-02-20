package ss2_loop.bai_tap;

import java.util.Scanner;

public class ShowPrime100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Các số nguyên tố nhỏ hơn 100 là:  ");
        for (int i = 2; i < 100; i++) {
            if (checkSNT(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean checkSNT(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
