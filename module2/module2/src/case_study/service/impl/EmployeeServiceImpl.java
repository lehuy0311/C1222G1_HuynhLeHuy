package case_study.service.impl;

import case_study.common.ReadFile;
import case_study.model.Employee;
import case_study.repository.IEmployeeRepo;
import case_study.repository.impl.EmployeeRepo;
import case_study.service.service_for_all.IEmployeeService;

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

            Employee employee = new Employee(idEmployee, nameEmployee,
                    birthEmployee, genderEmployee, cmndEmployee,
                    phoneEmployee, emailEmployee, profEmployee,
                    levelEmployee, payEmployee);

            iEmployeeRepo.addEmployee(employee);
        }

    }

    @Override
    public void editEmployee() {
        List<Employee> employeeList = iEmployeeRepo.displayEmployees();

        System.out.println("Nhập id nhân viên mà bạn muốn chỉnh sửa: ");
        int idEmployee = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == idEmployee) {
                Employee employees = new Employee();

                System.out.println("chỉnh sửa name employee");
                String nameEmployee = scanner.nextLine();
                employees.setName(nameEmployee);

                System.out.println("chỉnh sửa birth employee");
                String birthEmployee = scanner.nextLine();
                employees.setDayOfBirth(birthEmployee);

                System.out.println("chỉnh sửa gender employee");
                String genderEmployee = scanner.nextLine();
                employees.setGender(genderEmployee);

                System.out.println("chỉnh sửa CMND employee");
                String cmndEmployee = scanner.nextLine();
                employees.setSoCmnd(cmndEmployee);

                System.out.println("chỉnh sửa number phone employee");
                String phoneEmployee = scanner.nextLine();
                employees.setPhoneNumber(phoneEmployee);

                System.out.println("chỉnh sửa email employee");
                String emailEmployee = scanner.nextLine();
                employees.setEmail(emailEmployee);

                System.out.println("chỉnh sửa prof employee");
                String profEmployee = scanner.nextLine();
                employees.setProf(profEmployee);

                System.out.println("chỉnh sửa level employee");
                String levelEmployee = scanner.nextLine();
                employees.setLevel(levelEmployee);

                System.out.println("chỉnh sửa payment employee");
                int payEmployee = Integer.parseInt(scanner.nextLine());
                employees.setPayment(payEmployee);

                Employee employee = new Employee(idEmployee, nameEmployee,
                        birthEmployee, genderEmployee, cmndEmployee,
                        phoneEmployee, emailEmployee, profEmployee,
                        levelEmployee, payEmployee);

                iEmployeeRepo.editEmployee(i, employee, employeeList);
                return;
            } else {
                System.out.println("MA ID ko ton tai");
            }
        }

//    @Override
//    public void deleteEmployee() {
//        List<Employee> list = iEmployeeRepo.displayEmployees();
//        System.out.println("Nhập id của sản phẩm cần xóa: ");
//        int id = Integer.parseInt(scanner.nextLine());
//
//        for (int i=0; i<list.size(); i++); {
//            if (list. == id) {
//                System.out.println("Bạn có chắc muốn xóa nhân viên này không? \n" +
//                        "1.Có \n" + "2.Không");
//                int number = Integer.parseInt(scanner.nextLine());
//                if (number == 1) {
//                    iEmployeeRepo.deleteEmployee(id, employee);
//                    System.out.println("Xóa thành công!");
//                } else if (number == 2) {
//                    System.out.println("Không muốn xóa thì out");
//                }
//            }
//        }
//        System.out.println("Không có sản phẩm muốn xóa");
//    }
    }
}


