package ss10_list.ex_bonus.repository.implement;

import ss10_list.ex_bonus.model.Student;
import ss10_list.ex_bonus.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student("C1222G1",12, 102, "Huy",true, "03/11/2001" ));
        studentList.add(new Student("C1222G1",12, 190, "Duc",true, "03/11/2001" ));
        studentList.add(new Student("C1222G1",12, 316, "Hung",true, "03/11/2001" ));
    }
    private Scanner scanner = new Scanner(System.in);


    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void deleteStudent(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getID() == id) {
                System.out.println("Are you sure to delete this student? - (Yes/No)");
                String cf = scanner.nextLine();
                if (cf.equals("Yes")) {
                    studentList.remove(studentList.get(i));
                    System.out.println("Student deleted!");
                    return;
                    // use 'return' to end the function
                }
            }
        }
        // remember not to use if - else in loop .. consider this case to know more abt it
        System.out.println("Cannot find your student's ID!");
    }

    @Override
    public List<Student> searchByName(String studentName) {
        List<Student> suggestedStudents = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getName().contains(studentName)){
                suggestedStudents.add(studentList.get(i));
            }
        }
        return suggestedStudents;
    }
}