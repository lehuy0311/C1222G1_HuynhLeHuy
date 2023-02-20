package ss2_loop.bai_tap;

import java.util.Scanner;

public class Show20Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố bạn muốn hiện:  ");
        int n = scanner.nextInt();
        int count = 0;
        int i = 2;
        while (count < n) {
            if (checkSNT(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
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