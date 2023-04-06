package ss1_introduction_to_java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input number 1: ");
                float number1 = Float.parseFloat(scanner.nextLine());
                System.out.println("Input number 2: ");
                float number2 = Float.parseFloat(scanner.nextLine());
                int choice;
                do {
                    System.out.println("----Calculator----");
                    System.out.println("1. Sum ");
                    System.out.println("2. Subtraction ");
                    System.out.println("3. Multiplication: ");
                    System.out.println("4. Divide ");
                    System.out.println("5. Exit");
                    System.out.println("Please enter your choose!:");

                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            float sum = sum(number1, number2);
                            System.out.println("Sum = : " + sum);
                            break;
                        case 2:
                            float subtraction = subtraction(number1, number2);
                            System.out.println("Subtraction = : " + subtraction);
                            break;
                        case 3:
                            float multiplication = multiplication(number1, number2);
                            System.out.println("Multiplication = : " + multiplication);
                            break;
                        case 4:
                            float divide = divide(number1, number2);
                            System.out.println("Divide = : " + divide);
                            break;
                        case 5:
                            System.exit(5);
                        default:
                    }
                } while (true);
            } catch (NumberFormatException e) {
                System.out.println("Please enter number, not String");
            }
        } while (true);
    }


    public static float sum(float number1, float number2) {
        return number1 + number2;
    }

    public static float subtraction(float number1, float number2) {
        return number1 - number2;
    }

    public static float multiplication(float number1, float number2) {
        return number1 * number2;
    }

    public static float divide(float number1, float number2) {
        return number1 / number2;
    }
}
