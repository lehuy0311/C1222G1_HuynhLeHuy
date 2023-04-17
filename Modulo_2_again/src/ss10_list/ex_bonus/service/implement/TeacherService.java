package ss10_list.ex_bonus.service.implement;

import ss10_list.ex_bonus.model.Teacher;
import ss10_list.ex_bonus.repository.ITeacherRepository;
import ss10_list.ex_bonus.repository.implement.TeacherRepository;
import ss10_list.ex_bonus.service.ITeacherService;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private ITeacherRepository iTeacherRepository = new TeacherRepository();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void displayAllTeachers() {
        List<Teacher> teacherList = iTeacherRepository.getAllTeachers();
        if (teacherList.isEmpty()) {
            System.out.println("There is no teacher in this system!");
        } else {
            for (Teacher teacher : teacherList) {
                System.out.print("List of Teachers: ");
                System.out.println(teacher.toString());
            }
        }
    }

    @Override
    public void addTeacher() {

        System.out.println("Enter teacher's name:");
        String name = scanner.nextLine();
        System.out.println("Enter teacher's ID:");
        int ID = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter teacher's gender: (1 =  Male, 2 = Female, 3 = Other gender)");
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
        System.out.println("Enter teacher's teaching subject:");
        String teachingSubject = scanner.nextLine();
        Teacher newTeacher = new Teacher(ID, name, dob, gender, teachingSubject);
        iTeacherRepository.addTeacher(newTeacher);
        System.out.println("Teacher added!");

    }

    @Override
    public void deleteTeacher() {
        System.out.println("Enter teacher's ID to delete:");
        int id = Integer.parseInt(scanner.nextLine());
        iTeacherRepository.deleteTeacher(id);
    }

    @Override
    public void searchByName() {
        System.out.println("Please enter teacher's name to find:");
        String teacherName = scanner.nextLine();
        List<Teacher> suggestedTeachers = iTeacherRepository.searchByName(teacherName);
        if (suggestedTeachers.isEmpty()){
            System.out.println("There is no teacher matching your search name!");
        } else {
            System.out.println(suggestedTeachers);
        }
    }
}
