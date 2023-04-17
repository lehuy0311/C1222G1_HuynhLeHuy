package ss10_list.ex_bonus.service.implement;

import ss10_list.ex_bonus.model.Student;
import ss10_list.ex_bonus.repository.IStudentRepository;
import ss10_list.ex_bonus.repository.implement.StudentRepository;
import ss10_list.ex_bonus.service.IStudentService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void displayAllStudents() {
        List<Student> studentList = iStudentRepository.getAllStudents();
        if (studentList.isEmpty()) {
            System.out.println("There is no student in this system!");
        } else {
            for (Student student : studentList) {
                //System.out.print("List of Students: ");
                System.out.println(student.toString());
            }
        }
    }

    @Override
    public void addStudent() {

        System.out.println("Enter student's name:");
        String name = scanner.nextLine();
        System.out.println("Enter student's ID:");
        int ID = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter student's class:");
        String classes = scanner.nextLine();
        System.out.println("Enter student's gender: (1 =  Male, 2 = Female, 3 = Other gender)");
        Boolean gender;
        int tempGender = Integer.parseInt(scanner.nextLine());
        if (tempGender == 1) {
            gender = true;
        } else if (tempGender == 2) {
            gender = false;
        } else {
            gender = null;
        }
        System.out.println("Enter student's birthday:");
        String dob = scanner.nextLine();
        System.out.println("Enter student's grade:");
        double grade = Integer.parseInt(scanner.nextLine());

        Student newStudent = new Student(classes, grade, ID, name, gender, dob);
        iStudentRepository.addStudent(newStudent);
        System.out.println("Student added!");

    }

    @Override
    public void deleteStudent() {
        System.out.println("Enter student's ID to delete:");
        int id = Integer.parseInt(scanner.nextLine());
        iStudentRepository.deleteStudent(id);
    }

    @Override
    public void searchByName() {
        System.out.println("Please enter student's name to find:");
        String studentName = scanner.nextLine();
        List<Student> suggestedStudents = iStudentRepository.searchByName(studentName);
        if (suggestedStudents.isEmpty()){
            System.out.println("There is no student matching your search name!");
        } else {
            System.out.println(suggestedStudents);
        }
    }
}
