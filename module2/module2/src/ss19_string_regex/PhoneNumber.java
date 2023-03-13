package ss19_string_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static boolean checkPhoneNumber(String phone){
        String regex = "^[0-9]{2}-0[0-9]{9}$";
        return phone.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        do {
            System.out.print("Mời bạn số điện thoại: ");
            String phone = scanner.nextLine();
            isValid  = checkPhoneNumber(phone);
            System.out.println(isValid);

            if (isValid){
                System.out.println("Số điện thoại hợp lệ");
            } else {
                System.out.println("Số điện thoại không hợp lệ");
                System.out.println("Mời bạn nhập lại số điện thoại");
            }
        } while (!isValid);
    }

}