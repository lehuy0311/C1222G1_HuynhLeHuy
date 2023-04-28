package more_again.services.impl;

import more_again.common.ReadFilePerson;
import more_again.models.Employee;
import more_again.repository.IEmployeeRepository;
import more_again.repository.impl.EmployeeRepository;
import more_again.services.IEmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    private Scanner scanner = new Scanner(System.in);
    public static final String EMPLOYEE_PATH ="src/more_again/data/Employee.csv";

    @Override
    public void displayEmployee() {
        iEmployeeRepository.displayEmployee();
    }

    @Override
    public void addEmployee() {
        List<Employee> employeeList = ReadFilePerson.readEmployee(EMPLOYEE_PATH);
        System.out.println("Nhập id nhân viên: ");
        try{
            int id = Integer.parseInt(scanner.nextLine());
            boolean flag = true;
            for(int i =0; i<employeeList.size(); i++){
                if (id == employeeList.get(i).getId()){
                    flag = false;
                    break;
                }
            }
            if (flag = true){
                System.out.println("Nhập tên employee");
                String name = scanner.nextLine();
                System.out.println("Nhập ngày sinh");
                String dateOfBirth = scanner.nextLine();
                System.out.println("Nhập giới tính");
                String temp = scanner.nextLine();
                Boolean gender;
                if (temp.equals("Nam ")){
                    gender = true;
                }else if (temp.equals("Nữ")){
                    gender = false;
                }else {
                    gender = null;
                }
                System.out.println("Nhập cmnd");
                String cmnd = scanner.nextLine();
                System.out.println("Nhập số điện thoại");
                String phone = scanner.nextLine();
                System.out.println("Nhập email");
                String email = scanner.nextLine();
                System.out.println("Trình độ học vấn");
                String prof=scanner.nextLine();
                System.out.println("Vị trí đang làm");
                String level = scanner.nextLine();
                System.out.println("Mức lương");
                String salary=scanner.nextLine();

                Employee employee = new Employee(id, name,
                        dateOfBirth, gender, cmnd, phone,
                        email, prof, level, salary);
                iEmployeeRepository.addEmployee(employee);
            }else {
                System.out.println("ID đã tôồn tại!!");
            }

        }catch (NumberFormatException e){
            System.out.println("Mời bạn hập lại số");
        }catch (Exception e){
            System.out.println("Mời nhập lại!!");
        }
    }

    @Override
    public void editEmployee() {
        List<Employee> employeeList = ReadFilePerson.readEmployee(EMPLOYEE_PATH);
        System.out.println("Nhập iD employee");
        int id;
        int index;
        try{
            id = Integer.parseInt(scanner.nextLine());
            boolean flag = false;
            index =-1;
            for (int i = 0; i<employeeList.size(); i++){
                if (id == employeeList.get(i).getId()){
                    index = i;
                    flag = true;
                    break;
                }
            }
            if (flag == true){
                System.out.println("Đã tìm thấy Id");

                System.out.println("Nhập tên employee");
                String name = scanner.nextLine();
                System.out.println("Nhập ngày sinh");
                String dateOfBirth = scanner.nextLine();
                System.out.println("Nhập giới tính");
                String temp = scanner.nextLine();
                Boolean gender;
                if (temp.equals("Nam ")){
                    gender = true;
                }else if (temp.equals("Nữ")){
                    gender = false;
                }else {
                    gender = null;
                }
                System.out.println("Nhập cmnd");
                String cmnd = scanner.nextLine();
                System.out.println("Nhập số điện thoại");
                String phone = scanner.nextLine();
                System.out.println("Nhập email");
                String email = scanner.nextLine();
                System.out.println("Trình độ học vấn");
                String prof=scanner.nextLine();
                System.out.println("Vị trí đang làm");
                String level = scanner.nextLine();
                System.out.println("Mức lương");
                String salary=scanner.nextLine();

                Employee employee = new Employee(id, name,
                        dateOfBirth, gender, cmnd, phone,
                        email, prof, level, salary);

                iEmployeeRepository.editEmployee(index, employee);

            }else {
                System.out.println("ID no find");
                editEmployee();
            }
        }catch (NumberFormatException e){
            System.out.println("Mời nhập lại!!");
            editEmployee();
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    @Override
    public void removeEmployee() {

    }
}
