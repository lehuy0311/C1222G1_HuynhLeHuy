package ss10_list.ex_bonus.repository.implement;


import ss10_list.ex_bonus.model.Student;
import ss10_list.ex_bonus.model.Teacher;
import ss10_list.ex_bonus.repository.ITeacherRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherRepository implements ITeacherRepository {
    private static List<Teacher> teacherList = new ArrayList<>();
    static {
        teacherList.add(new Teacher(1, "Trung TVH", "23/12/3232",true, "IT" ));
        teacherList.add(new Teacher(2, "Cong NT", "23/12/3232",true, "IT" )) ;
        teacherList.add(new Teacher(3, "Hai TT", "23/12/3232",true, "IT" )) ;

    }
    private Scanner scanner = new Scanner(System.in);


    @Override
    public List<Teacher> getAllTeachers() {
        return teacherList;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public void deleteTeacher(int id) {
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getID() == id) {
                System.out.println("Are you sure to delete this teacher? - (Yes/No)");
                String cf = scanner.nextLine();
                if (cf.equals("Yes")) {
                    teacherList.remove(teacherList.get(i));
                    System.out.println("Teacher deleted!");
                    return;
                }
            }
        }
        System.out.println("Cannot find your teacher's ID!");
    }

    @Override
    public List<Teacher> searchByName(String teacherName) {
        List<Teacher> suggestedTeachers = new ArrayList<>();
        for (int i = 0; i < teacherList.size(); i++) {
            if(teacherList.get(i).getName().contains(teacherName)){
                suggestedTeachers.add(teacherList.get(i));
            }
        }
        return suggestedTeachers;
    }
}
