package ss10_list.ex_bonus.repository;

import ss10_list.ex_bonus.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAllStudents();

    void addStudent(Student student);

    void deleteStudent(int id);

    List<Student> searchByName(String studentName);
}
