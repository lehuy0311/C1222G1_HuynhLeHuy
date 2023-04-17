package ss11_stack_queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IsPrime isPrime = new IsPrime();
        Scanner scanner = new Scanner(System.in);
        int number;
        int choice;
        do{
            System.out.println("--------Liệt kê các số nguyên tố nhỏ hơn n------------");
            System.out.println(" Bạn muốn sử dụng stack hay quece để kiểm tra?");
            System.out.println("1. Sử dụng stack");
            System.out.println("2. Sử dụng queue");
            System.out.println("3. Thoát");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập vào số n: ");
                    number = Integer.parseInt(scanner.nextLine());
                    IsPrime.stack(number);
                    break;
                case 2:
                    System.out.println("Nhập vào số n: ");
                    number = Integer.parseInt(scanner.nextLine());
                    IsPrime.queue(number);
                    break;
                case 3:
                    System.exit(0);
            }
        }while (true);

    }
}
