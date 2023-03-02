package ss11_stack_queue.bai_tap.Reverse;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số luọng phần tử ");
        int input_number = Integer.parseInt(input.nextLine());
        int[] arr = new int[input_number];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phần tử thứ [" + i + "]:");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
//        for (int i=0; i<stack.size(); i++){
//            System.out.println("element "+i+" of the stack is: "+stack.get(i));
//        }
        for (int i =0; i<arr.length; i++){
            arr[i]=stack.pop();
        }

        System.out.println("Mảng đã bị đảo ngược là: ");
        System.out.println(Arrays.toString(arr));
    }
}
