package ss19_string_regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;
        do {
            System.out.println("Input address email: ");
            email = scanner.nextLine();
            if (!email.matches(CheckEmail.checkEmail())) {
                System.out.println("Input again!");
            }else {
                System.out.println("Email correct");
            }
        } while (!email.matches(CheckEmail.checkEmail()));
    }
}

