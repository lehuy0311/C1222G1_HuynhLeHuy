package Ex3_array_method;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Tính trung bình ở các vị trí lẻ trong mảng----");
        System.out.println("Nhập vào độ dài của mảng mà bạn muốn: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        int sum = 0;
        int count = 0;
        for (int j = 1; j < size; j = j + 2) {
            sum = sum + arr[j];
            count++;
        }

        float average = sum / count;
        System.out.println("Average = " + average);

    }
}
