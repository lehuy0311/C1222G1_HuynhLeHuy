package algorithm;

import java.util.Scanner;

public class SumOfPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số nhỏ nhất và" +
                "số lớn nhất để tính tổng");
        System.out.println("Nhập số nhỏ nhất");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lớn nhất");
        int m = Integer.parseInt(scanner.nextLine());

        int sum =0;
        Boolean flag = true;
        //int[] arr = new int[m-n+1];
        for (int i = n; i<=m;i++){
            for (int j=2; j<=Math.sqrt(i);j++){
                if (i%j ==0){
                    flag = false;
                    break;
                }else flag = true;
            }if(flag == true){
                sum = sum +i;
            }
        }
        System.out.println("Sum =" + sum);

    }
}
