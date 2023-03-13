package ss19_string_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Classes {
    public static boolean checkClass(String className){
        String regex= "^[CAP][0-9]{4}[GHIKLM]$";
        return className.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        do {
            System.out.print("Mời bạn nhập tên lớp: ");
            String className = scanner.nextLine();
            isValid  = checkClass(className);
            System.out.println(isValid);

            if (isValid){
                System.out.println("Tên lớp hợp lệ");
            } else {
                System.out.println("Tên lớp không hợp lệ");
                System.out.println("Mời bạn nhập lại tên lớp");
            }
        } while (!isValid);
    }

}
