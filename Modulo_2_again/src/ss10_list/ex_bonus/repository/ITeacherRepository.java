package ss10_list.ex_bonus.repository;

import ss10_list.ex_bonus.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> getAllTeachers();

    void addTeacher(Teacher teacher);

    void deleteTeacher(int id);
    List<Teacher> searchByName(String teacherName);
}
