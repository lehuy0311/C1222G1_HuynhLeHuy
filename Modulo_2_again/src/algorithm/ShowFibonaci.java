package algorithm;

public class ShowFibonaci {
    public static void main(String[] args) {
        System.out.println("Show fibonaci");
        for (int i = 0; fibonaci(i) < 100; i++) {
            System.out.println(fibonaci(i) + " ");
        }
    }

    public static int fibonaci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonaci(n - 1) + fibonaci(n - 2);
        }
    }
}
