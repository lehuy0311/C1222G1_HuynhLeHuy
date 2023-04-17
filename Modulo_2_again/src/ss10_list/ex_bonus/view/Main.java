package ss10_list.ex_bonus.view;

import ss10_list.ex_bonus.controller.StudentController;
import ss10_list.ex_bonus.controller.TeacherController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("========================================================");
        System.out.println("WELCOME TO OUR MANAGEMENT SYSTEM:");
        System.out.println("Choose a number to run its function:");
        System.out.println("1. Student Management");
        System.out.println("2. Teacher Management");
        System.out.print("Your chosen function:");
        input = Integer.parseInt(scanner.nextLine());
        if (input == 1) {
            StudentController studentController = new StudentController();
            studentController.menuStudent();
        } else if (input == 2) {
            TeacherController teacherController = new TeacherController();
            teacherController.menuTeacher();
        } else {
            System.out.println("Please choose a valid function!");
        }

    }
}
