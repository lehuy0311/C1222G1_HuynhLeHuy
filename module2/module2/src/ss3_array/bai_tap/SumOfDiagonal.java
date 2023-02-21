package ss3_array.bai_tap;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfDiagonal {
    static float sum(int A[][], int n) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập kích thước của mảng: ");
            n = scanner.nextInt();
        }while (n > 10);

        int A[][] = new int[n][n];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(A));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        float sum = sum(A, n);

        System.out.println("tổng đường chéo ma trận vuông là :" + sum);
    }
}
