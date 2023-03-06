package ss14_sort_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        int x;
        int key;
        for (int i = 0; i < arr.length; i++) {
            x = arr[i];
            key = i;
            while (key >0 && x < arr[key -1]){
                arr[key] = arr[key-1];
                key --;
            }
            arr[key] = x;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Nhập số lượng phần tử cho mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử cho mảng: ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng đã đưuọc sắp xếp lại là: ");
        System.out.println(Arrays.toString(insertionSort(arr)));

    }

}
