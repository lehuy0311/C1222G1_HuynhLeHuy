package algorithm;

import java.util.Scanner;

public class PrimeDivisiableThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tìm số nguyên tố lẻ chia hết cho 3");
        System.out.println("Nhập số lớn nhất cho chương trình");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(check(n));

    }
    public static boolean check(int number){
        if (number <2){
            return false;
        }
        for (int i=2; i <=Math.sqrt(number);i++){
            if (number % i !=0 && number % 3==0){
                return true;
            }
        }
        return false;
    }
}
