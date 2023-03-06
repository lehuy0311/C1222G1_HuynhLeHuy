//package ss10_list.bai_tap.bai_tap_them_1.controller;
//
//import ss10_list.bai_tap.bai_tap_them_1.service.IStudentService;
//import ss10_list.bai_tap.bai_tap_them_1.service.ITeacherService;
//import ss10_list.bai_tap.bai_tap_them_1.service.impl.StudentService;
//import ss10_list.bai_tap.bai_tap_them_1.service.impl.TeacherService;
//
//import java.util.Scanner;
//
//public class TeacherController {
//    ITeacherService iTeacherService = new TeacherService();
//
//    public void menuTeacher() {
//        int choice;
//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.println("---------------------------------------------");
//            System.out.println("Mời bạn chọn chức năng");
//            System.out.println("1. Hiển thị danh sách");
//            System.out.println("2. Thêm giảng viên ");
//            System.out.println("3. Chỉnh sửa thông tin giảng viên");
//            System.out.println("4. Xóa giảng viên");
//            System.out.println("5. Thoát");
//            System.out.print("Mời bạn chọn ");
//            choice = Integer.parseInt(scanner.nextLine());
//            switch (choice) {
//                case 1:
//                    iTeacherService.displayAllTeacher();
//                    break;
//                case 2:
//                    iTeacherService.addTeacher();
//                    break;
//                case 3:
//                    break;
//                case 4:
//                    iTeacherService.deleteTeacher();
//                    break;
//                case 5:
//                    return;
//            }
//        } while (choice >= 1 || choice <=5);
//
//    }
//
//}
