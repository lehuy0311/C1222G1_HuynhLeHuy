package ss11_stack_queue.bai_tap.Reverse;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số luọng phần tử ");
        int input_number = Integer.parseInt(input.nextLine());
        String[] arr = new String[input_number];
        ArrayList<String> reverseString = new ArrayList<String>();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phần tử thứ [" + i + "]:");
            arr[i] = input.nextLine();
        }
        //System.out.println(Arrays.toString(arr));

        for (int i=0; i <arr.length; i++){
            stack.push(arr[i]);
        }
        System.out.println(stack);

        for (int i =0; i< arr.length; i++){
            reverseString.add(stack.pop());
        }
        System.out.println(reverseString);
    }
}
