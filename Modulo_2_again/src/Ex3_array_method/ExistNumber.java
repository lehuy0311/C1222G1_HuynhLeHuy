package Ex3_array_method;

import java.util.Scanner;

public class ExistNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tìm sự tồn tại của một số nguyên trong mảng");
        System.out.println("Nhập vào 1 số random mà bạn muốn: ");
        int number = Integer.parseInt(scanner.nextLine());

        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                position = i;
            }
        }

        if (position == -1) {
            System.out.println("không tồn tại trong mảng");
        } else {
            System.out.println("Vị trí của số đó là: " + position);
        }
    }
}
