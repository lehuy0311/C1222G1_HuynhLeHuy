package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfOneColumn {
    // Tính tổng của 1 cột
    static float sumColumn(int A[][], int x) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i][x];
        }
        return sum;
    }

    // Tính tổng của một hàng
//        static float sumRow(int A[][],int m, int x) {
//            int sum = 0;
//            for (int i = 0; i < m; i++) {
//                sum += A[m][i];
//            }
//            return sum;
//        }

    public static void main(String[] args) {
        // khai báo số dòng và số cột của ma trận
        int m, n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = scanner.nextInt();

        // khai báo ma trận A có m dòng, n cột
        int A[][] = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        //System.out.println(Arrays.toString(A));
        System.out.println(Arrays.deepToString(A));

        System.out.println("Mời bạn nhập cột cần tính tổng: ");
        int column = scanner.nextInt();

        float sum = sumColumn(A, column-1);
        System.out.println(sum);
    }
}
