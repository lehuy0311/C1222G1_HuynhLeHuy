package case_study.service.impl;

import case_study.common.ReadFile;
import case_study.model.Employee;
import case_study.repository.IEmployeeRepo;
import case_study.repository.impl.EmployeeRepo;
import case_study.service.service_for_all.IEmployeeService;
import javafx.scene.transform.Scale;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    public static final String PATH = "src/case_study/data/Employees.csv";
    private IEmployeeRepo iEmployeeRepo = new EmployeeRepo();


    @Override
    public void displayEmployee() {
        List<Employee> employeeList = iEmployeeRepo.displayEmployees();
        if (employeeList.size() == 0) {
            System.out.println("no data");
        } else {
            for (Employee temp : employeeList) {
                System.out.println(temp);
            }
        }
    }

    public boolean checkExest(int id) {
        List<Employee> employees = iEmployeeRepo.displayEmployees();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addEmployee() {
        List<Employee> employees = iEmployeeRepo.displayEmployees();


        System.out.println("id employee");
        int idEmployee = Integer.parseInt(scanner.nextLine());

        if (checkExest(idEmployee) == true) {
            System.out.println("Mã id này đã tồn tại");
        } else {

            System.out.println("name employee");
            String nameEmployee = scanner.nextLine();
            System.out.println("birth employee");
            String birthEmployee = scanner.nextLine();
            System.out.println("gender employee");
            String genderEmployee = scanner.nextLine();
            System.out.println("CMND employee");
            String cmndEmployee = scanner.nextLine();
            System.out.println("number phone employee");
            String phoneEmployee = scanner.nextLine();
            System.out.println("email employee");
            String emailEmployee = scanner.nextLine();
            System.out.println("prof employee");
            String profEmployee = scanner.nextLine();
            System.out.println("level employee");
            String levelEmployee = scanner.nextLine();
            System.out.println("payment employee");
            int payEmployee = Integer.parseInt(scanner.nextLine());
            System.out.println("birth employee");

            Employee employee = new Employee(idEmployee, nameEmployee,
                    birthEmployee, genderEmployee, cmndEmployee,
                    phoneEmployee, emailEmployee, profEmployee,
                    levelEmployee, payEmployee);

            iEmployeeRepo.addEmployee(employee);
        }

    }

    @Override
    public void editEmployee() {
        System.out.println("Nhập id nhân viên mà bạn muốn chinh suar: ");
        int idEmployee = Integer.parseInt(scanner.nextLine());

        List<Employee> employees = iEmployeeRepo.displayEmployees();

        for (int i = 0; i < employees.size(); i++) {
            if (checkExest(idEmployee)) {
                System.out.println("chỉnh sửa name employee");
                String nameEmployee = scanner.nextLine();
                System.out.println("chỉnh sửa birth employee");
                String birthEmployee = scanner.nextLine();
                System.out.println("chỉnh sửa gender employee");
                String genderEmployee = scanner.nextLine();
                System.out.println("chỉnh sửa CMND employee");
                String cmndEmployee = scanner.nextLine();
                System.out.println("chỉnh sửa number phone employee");
                String phoneEmployee = scanner.nextLine();
                System.out.println("chỉnh sửa email employee");
                String emailEmployee = scanner.nextLine();
                System.out.println("chỉnh sửa prof employee");
                String profEmployee = scanner.nextLine();
                System.out.println("chỉnh sửa level employee");
                String levelEmployee = scanner.nextLine();
                System.out.println("chỉnh sửa payment employee");
                int payEmployee = Integer.parseInt(scanner.nextLine());
                System.out.println("chỉnh sửa birth employee");

                Employee employee = new Employee(idEmployee, nameEmployee,
                        birthEmployee, genderEmployee, cmndEmployee,
                        phoneEmployee, emailEmployee, profEmployee,
                        levelEmployee, payEmployee);

                iEmployeeRepo.editEmployee(i, employee, employees);
                return;
            } else {
                System.out.println("Mã id này không tồn tại.");
            }

        }
//        @Override
//        public void deleteEmployee () {
//            return 0;
//        }

    }
}

