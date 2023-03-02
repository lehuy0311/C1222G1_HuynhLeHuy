package ss10_list.bai_tap.bai_tap_them_1.repository.impl;

import ss10_list.bai_tap.bai_tap_them_1.model.Student;
import ss10_list.bai_tap.bai_tap_them_1.repository.IStudentRepository;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    private static List<Student> studentList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    @Override
    public List<Student> getAll() {
        return studentList;
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    public void deleteStudent(Student student){
        studentList.remove(student);
    }
}
