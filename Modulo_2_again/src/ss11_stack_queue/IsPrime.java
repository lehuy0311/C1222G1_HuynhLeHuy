package ss11_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IsPrime {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void stack(int number){
        Stack<Integer> stack = new Stack<>();
        for(int i =1; i<= number; i++){
            if(isPrime(i)){
                stack.push(i);
            }
        }
        System.out.println(stack);
    }

    public static void queue(int number){
        Queue<Integer> queue = new LinkedList<>();
        for (int i =0; i<= number;i++){
            if(isPrime(i)){
                queue.add(i);
            }
        }
        System.out.println(queue);
    }

}
