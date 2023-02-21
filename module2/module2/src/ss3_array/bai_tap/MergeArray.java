package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays1;
        int[] arrays2;
        int sizeOfArray1;
        int sizeOfArray2;
        int[] arrays3;
        do {
            System.out.println("Nhập kích thước mảng 1 :");
            sizeOfArray1 = scanner.nextInt();
        } while (sizeOfArray1 > 10);

        do {
            System.out.println("Nhập kích thước mảng 2 :");
            sizeOfArray2 = scanner.nextInt();
        } while (sizeOfArray2 > 10);

        arrays1 = new int[sizeOfArray1];
        arrays2 = new int[sizeOfArray2];
        arrays3 = new int[sizeOfArray2+sizeOfArray1];

        for (int i = 0; i <sizeOfArray1; i++) {
            System.out.println("Nhập vào phần tử mảng 1 vị trí thứ " + i);
            arrays1[i] = scanner.nextInt();
        }
        for (int j = 0; j < sizeOfArray2; j++) {
            System.out.println("Nhập vào phần tử mảng 2 vị trí thứ " + j);
            arrays2[j] = scanner.nextInt();
        }
        int d = 0 ;
        for (int k = 0; k < sizeOfArray1; k++) {
            arrays3[d] = arrays1[k];
            d++;
        }
        for (int k= 0; k < sizeOfArray2; k++) {
            arrays3[d] = arrays2[k];
            d++;
        }
//        for (int k = 0; k < 2*sizeOfArray1; k++) {
//            System.out.println( arrays3[k]);
//        }
            System.out.println(Arrays.toString(arrays3));
    }
}
