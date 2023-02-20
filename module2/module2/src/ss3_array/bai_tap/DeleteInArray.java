package ss3_array.bai_tap;

import java.util.Scanner;
import java.util.Arrays;


public class DeleteInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] delete;
        int n = 0;
        do {
            System.out.println("Nhập kích thước mảng : ");
            n = scanner.nextInt();
        } while (n < 0);

        delete = new int[n];
        for (int i = 0; i < delete.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            delete[i] = scanner.nextInt();
        }
        for (int i = 0; i < delete.length; i++) {
            System.out.print(delete[i]);
        }
        System.out.println("Nhập vào số cần xóa");
        int timKiem = scanner.nextInt();
        for (int i = 0; i < delete.length; i++) {
            if (timKiem == delete[i]) {
                for (int j = i; j < delete.length - 1; j++) {
                    delete[j] = delete[j + 1];
                }
                delete[delete.length - 1] = 0;
            }

        }
        for (int i = 0; i < delete.length; i++) {
            System.out.println(delete[i]);
        }
    }
//public static void main(String[] args) {
//    int[] arr = new int[]{1,2,3,4,5};
//    int[] arr_new = new int[arr.length-1];
//    int j=3;
//    for(int i=0, k=0;i<arr.length;i++){
//        if(i!=j){
//            arr_new[k]=arr[i];
//            k++;
//        }
//    }
//    System.out.println("Before deletion :" + Arrays.toString(arr));
//    System.out.println("After deletion :" + Arrays.toString(arr_new));

}
