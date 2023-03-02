package ss10_list.bai_tap.bai_tap_them_1.controller;

import ss10_list.bai_tap.bai_tap_them_1.service.IStudentService;
import ss10_list.bai_tap.bai_tap_them_1.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    //DI
    private IStudentService iStudentService = new StudentService();

    public void menuStudent() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---------------------------------------------");
            System.out.println("Mời bạn chọn chức năng");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm học viên ");
            System.out.println("3. Chỉnh sửa thông tin học viên");
            System.out.println("4. Xóa học viên");
            System.out.println("5.");
            System.out.println("6.");
            System.out.print("Mời bạn chọn ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.displayAll();
                    break;
                case 2:
                    iStudentService.addStudent();
                    break;
                case 3:
                    break;
                case 4:
                    iStudentService.deleteStudent();
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        } while (choice >= 1 || choice <= 6);

    }
}
