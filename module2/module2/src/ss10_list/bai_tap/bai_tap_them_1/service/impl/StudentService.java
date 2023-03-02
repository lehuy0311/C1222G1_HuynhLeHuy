package ss10_list.bai_tap.bai_tap_them_1.service.impl;
import java.util.List;
import java.util.Scanner;

import ss10_list.bai_tap.bai_tap_them_1.model.Student;
import ss10_list.bai_tap.bai_tap_them_1.repository.IStudentRepository;
import ss10_list.bai_tap.bai_tap_them_1.repository.impl.StudentRepository;
import ss10_list.bai_tap.bai_tap_them_1.service.IStudentService;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public void displayAll() {
        List<Student> studentList = iStudentRepository.getAll();
        if (studentList.isEmpty()){
            System.out.println("Chưa có học viên nào!");
        }else {
            for (Student student : studentList){
                System.out.println(student.toString());
            }
        }
    }
    public void addStudent(){
        Scanner input = new Scanner(System.in);
        System.out.println("ID: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Tên: ");
        String name = input.nextLine();
        System.out.println("Ngày sinh: ");
        String birth = input.nextLine();
        System.out.println("Giới tính: ");
        Boolean gender;
        int temp = Integer.parseInt(input.nextLine());
        if(temp == 1){
            gender = true;
        }else if(temp == 2){
            gender = false;
        }else {
            gender = null;
        }
        System.out.println("Lớp: ");
        String classes = input.nextLine();
        System.out.println("Nhập điểm: ");
        Double score = Double.parseDouble(input.nextLine());

        Student student1 = new Student(id, name, birth, gender, classes, score);

        iStudentRepository.addStudent(student1);
        System.out.println("Thêm thành công");

    }

    @Override
    public void deleteStudent() {

    }

}
