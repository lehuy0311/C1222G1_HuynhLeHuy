package ss15_exception.bai_tap;
import java.util.Scanner;

public class Main {

    public void check() throws IllegalTriangleException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài cạnh tam giác thứ 1: ");
        int side1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào độ dài cạnh tam giác thứ 2: ");
        int side2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào độ dài cạnh tam giác thứ 3:  ");
        int side3 = Integer.parseInt(scanner.nextLine());

        if (side1<=0 || side2<=0 || side3<=0 ||
                side1+side2<=side3 ||
                side2+side3<=side1 ||
                side3+side1<=side2){
            throw new IllegalTriangleException("Độ dài các cạnh không ổn.");
        } else {
            System.out.println("Độ dài 3 cạnh tam giác là: "+side1+" "+side2+ " "+side3);
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Bắt đầu chương trình");
        boolean flag = true;
        do {
            flag = false;
            try {
                main.check();
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                System.out.println("Xin mời hập lại!!");
                flag = true;
            }
        }while (flag);
    }
}
