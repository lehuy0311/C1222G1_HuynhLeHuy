package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays1;
        int[] arrays2;
        int n;
        int m;
        int[] arrays3;
        do {
            System.out.println("Nhập kích thước mảng 1 :");
            n = scanner.nextInt();
        } while (n > 10);

        do {
            System.out.println("Nhập kích thước mảng 2 :");
            m = scanner.nextInt();
        } while (m > 10);

        arrays1 = new int[n];
        arrays2 = new int[m];
        arrays3 = new int[m+n];

        for (int i = 0; i <n; i++) {
            System.out.println("Nhập vào phần tử mảng 1 vị trí thứ " + i);
            arrays1[i] = scanner.nextInt();
        }
        for (int j = 0; j < m; j++) {
            System.out.println("Nhập vào phần tử mảng 2 vị trí thứ " + j);
            arrays2[j] = scanner.nextInt();
        }
        int d = 0 ;
        for (int k = 0; k < n; k++) {
            arrays3[d] = arrays1[k];
            d++;
        }
        for (int k= 0; k < m; k++) {
            arrays3[d] = arrays2[k];
            d++;
        }
//        for (int k = 0; k < 2*n; k++) {
//            System.out.println( arrays3[k]);
//        }
            System.out.println(Arrays.toString(arrays3));
    }
}
