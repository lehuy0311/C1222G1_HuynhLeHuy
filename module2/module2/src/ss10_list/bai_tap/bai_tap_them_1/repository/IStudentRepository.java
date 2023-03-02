package ss10_list.bai_tap.bai_tap_them_1.repository;
import ss10_list.bai_tap.bai_tap_them_1.model.Student;
import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();
    void addStudent(Student student);
    void deleteStudent(Student student);

}
