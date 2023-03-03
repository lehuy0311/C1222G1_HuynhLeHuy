package ss11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public void convertBinary(int num) {
        int binary[] = new int[40];
        int index = 0;
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

    public static void main(String[] args) {
        Binary obj = new Binary();
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Nhập vào số thập phân: ");
        int num = in.nextInt();
        System.out.println("Giá trị nhị phân là: ");
        obj.convertBinary(num);
    }
}
