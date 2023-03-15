package case_study.service.impl;

import case_study.model.Employee;
import case_study.repository.IEmployeeRepo;
import case_study.repository.impl.EmployeeRepo;
import case_study.service.service_for_all.IEmployeeService;
import javafx.scene.transform.Scale;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    private IEmployeeRepo iEmployeeRepo = new EmployeeRepo();


    @Override
    public void displayEmployee() {
        List<Employee> employeeList = iEmployeeRepo.displayEmployees();
        if (employeeList.size() == 0){
            System.out.println("no data");
        }else {
            for (Employee temp : employeeList){
                System.out.println(temp);
            }
        }
    }

    @Override
    public void addEmployee() {
        System.out.println("id employee");
        int idEmployee = Integer.parseInt(scanner.nextLine());
        System.out.println(" name employee");
        String nameEmployee = scanner.nextLine();
        System.out.println(" birth employee");
        String birthEmployee = scanner.nextLine();
        System.out.println(" gender employee");
        String genderEmployee = scanner.nextLine();
        System.out.println(" CMND employee");
        String cmndEmployee = scanner.nextLine();
        System.out.println(" number phone employee");
        String phoneEmployee = scanner.nextLine();
        System.out.println(" email employee");
        String emailEmployee = scanner.nextLine();
        System.out.println(" prof employee");
        String profEmployee = scanner.nextLine();
        System.out.println(" level employee");
        String levelEmployee = scanner.nextLine();
        System.out.println(" payment employee");
        int payEmployee = Integer.parseInt(scanner.nextLine());
        System.out.println(" birth employee");

        Employee employee = new Employee(idEmployee, nameEmployee,
                            birthEmployee, genderEmployee,cmndEmployee,
                            phoneEmployee, emailEmployee, profEmployee,
                            levelEmployee, payEmployee);

        iEmployeeRepo.addEmployee(employee);

    }

    @Override
    public void editEmployee() {

    }

    @Override
    public void deleteEmployee() {

    }
}
