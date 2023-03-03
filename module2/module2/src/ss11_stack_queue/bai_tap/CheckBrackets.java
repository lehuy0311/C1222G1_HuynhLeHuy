package ss11_stack_queue.bai_tap;

import java.util.Stack;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {
    public static boolean checkBracket() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng :");
        int length = Integer.parseInt(sc.nextLine());
        char[] arrayString = new char[length];

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println("Nhập kí tự thứ: " + i);
            arrayString[i] = sc.nextLine().charAt(0);
        }
        System.out.println(Arrays.toString(arrayString));
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i] == '(') {
                stack.push(arrayString[i]);
            }
            if (arrayString[i] == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Đây là biểu thức đúng --> Well");
            return true;
        } else {
            System.out.println("Đây là biểu thức sai --> Not Well ");
            return false;
        }
    }

    public static void main(String[] args) {
        checkBracket();
    }
}
