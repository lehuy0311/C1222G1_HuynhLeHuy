package case_study.repository.impl;

import case_study.common.ReadFile;
import case_study.common.WriteFile;
import case_study.model.Employee;
import case_study.repository.IEmployeeRepo;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepo implements IEmployeeRepo {

    public static final String PATH ="src/case_study/data/Employees.csv";

    public List<Employee> displayEmployees(){
        List<String > list = ReadFile.readFile(PATH);
        List<Employee> employees = new ArrayList<>();
        for(String str : list){
            String[] temp = str.split(",");
            Employee employee = new Employee(Integer.parseInt(temp[0]), temp[1], temp[2],
                    temp[3], temp[4], temp[5],
                    temp[6], temp[7], temp[8],
                    Integer.parseInt(temp[9]));
            employees.add(employee);
        }
        return employees;
    }
    public List<Employee> getAllEmployee(){
        List<String> stringList = ReadFile.readFile("");
        List<Employee> employees = new ArrayList<>();
        for (String str : stringList){
            String[] temp =  str.split(",");
            Employee employee = new Employee();
            employees.add(employee);
        }
        return employees;
    }
    public void addEmployee(Employee employee){
        List<String> stringList = new ArrayList<>();
        String str = employee.writeToCSV();
        stringList.add(str);
        WriteFile.writeFile(PATH, stringList);
    }

//    @Override
//    public void editEmployee(int i, Employee employee, List<Employee> list) {
//        List<String> stringList = new ArrayList<>();
//        String str = employee.writeToCSV();
//        list.set(i, employee);
//        stringList.add(str);
//        //stringList.remove(str);
//        WriteFile.writeFile(PATH, stringList);
//    }

    public void  editEmployee(){
        Scanner scanner = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();


        System.out.println("Mời bạn lựa chọn mã ID nhân viên cần chỉnh sửa");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (idEdit == employeeList.get(i).getId()) {

                System.out.print("Mời bạn tên nhân viên:");
                String name = scanner.nextLine();

                System.out.print("Mời bạn ngày sinh nhân viên:");
                String dayOfBirth = scanner.nextLine();

                System.out.print("Mời bạn giới tính nhân viên:");
                String gender = scanner.nextLine();

                System.out.print("Mời bạn nhập số CMND nhân viên:");
                String soCMND = scanner.nextLine();

                System.out.print("Mời bạn nhập số điện thoại nhân viên:");
                String phoneNumber = scanner.nextLine();

                System.out.print("Mời bạn nhập email nhân viên:");
                String enmail = scanner.nextLine();

                System.out.print("Mời bạn nhập trình độ nhân viên:");
                String prof = scanner.nextLine();

                System.out.print("Mời bạn nhập vị trí của nhân viên:");
                String level = scanner.nextLine();

                System.out.print("Mời bạn nhập lương nhân viên:");
                int payment = Integer.parseInt((scanner.nextLine()));
                employeeList.get(i).setName(name);
                employeeList.get(i).setDayOfBirth(dayOfBirth);
                employeeList.get(i).setGender(gender);
                employeeList.get(i).setSoCmnd(soCMND);
                employeeList.get(i).setPhoneNumber(phoneNumber);
                employeeList.get(i).setEmail(enmail);
                employeeList.get(i).setProf(prof);
                employeeList.get(i).setLevel(level);
                employeeList.get(i).setPayment(payment);

                Employee employee = new Employee(idEdit, name,dayOfBirth,gender,soCMND,phoneNumber,enmail,prof,level,payment);
                break;
            }
        }

    }

    @Override
    public void deleteEmployee(int id,  Employee employee) {
        List<String> stringList = ReadFile.readFile(PATH);
        stringList.remove(employee);
    }

}
