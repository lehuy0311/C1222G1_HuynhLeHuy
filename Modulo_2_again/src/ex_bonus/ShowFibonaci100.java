package ex_bonus;

public class ShowFibonaci100 {
    public static void main(String[] args) {
        System.out.println("In ra dãy fibonaci nhỏ hơn 100: ");
        for (int i = 0; fibonaci(i) < 100; i++) {
            System.out.println(fibonaci(i) + " ");
        }

//        for (int i =0; i<100;i++){
//            if (fibonaci(i)<100){
//                System.out.println(fibonaci(i));
//            }
//            return;
//        }

    }

    public static int fibonaci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonaci(n - 1) + fibonaci(n - 2);
        }
    }
}
