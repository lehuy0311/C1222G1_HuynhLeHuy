package ss3_array.bai_tap;

import java.util.Scanner;

public class NumberOfCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi ");
        String string1 = scanner.nextLine();
        char character;
        System.out.println("nhập kí tự cần đếm");
        character = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) == character) {
                count++;
            }
        }
        System.out.println(count);
    }
}
