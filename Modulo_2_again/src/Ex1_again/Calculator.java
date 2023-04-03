package Ex1_again;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input number 1: ");
                int number1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Input number 2: ");
                int number2 = Integer.parseInt(scanner.nextLine());
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


    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    public static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    public static int divide(int number1, int number2) {
        return number1 / number2;
    }
}
