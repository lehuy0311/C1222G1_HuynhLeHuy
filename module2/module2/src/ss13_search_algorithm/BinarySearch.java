package ss13_search_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int left, int right, int value) {
        int mid = (left + right) / 2;
        if (arr[mid] == value) {
            return mid;
        } else if (value > arr[mid]) {
            return binarySearch(arr, left = mid + 1, right, value);
        } else if (value < arr[mid]) {
            return binarySearch(arr, left, right = mid - 1, value);
        }
        return -1;
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

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Mảng đã đưuọc sắp xếp lại là: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Nhập số bạn cần tìm: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(binarySearch(arr, 0, n, number));
    }
}