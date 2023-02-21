package ss3_array.bai_tap;

import java.util.Scanner;

public class NumberOfCharacter {

    static int NumberOfCharacter(String string1, Character character) {
        int count = 0;
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi ");
        String string1 = scanner.nextLine();
        char character;
        System.out.println("Nhập kí tự cần đếm");
        character = scanner.next().charAt(0);
//        int count = 0;
//        for (int i = 0; i < string1.length(); i++) {
//            if (string1.charAt(i) == character) {
//                count++;
//            }
//        }
        //NumberOfCharacter(string1, character)
        System.out.println(NumberOfCharacter(string1, character));
    }
}
