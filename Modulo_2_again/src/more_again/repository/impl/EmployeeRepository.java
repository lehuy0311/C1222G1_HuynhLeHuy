package more_again.repository.impl;

import more_again.common.ReadFilePerson;
import more_again.common.WriteFilePerson;
import more_again.models.Employee;
import more_again.repository.IEmployeeRepository;

import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    public static final String EMPLOYEE_PATH ="src/more_again/data/Employee.csv";
    public static List<Employee> employeeList = ReadFilePerson.readEmployee(EMPLOYEE_PATH);

    public void displayEmployee(){
        employeeList = ReadFilePerson.readEmployee(EMPLOYEE_PATH);
        if(employeeList.size() == 0){
            System.out.println("No data");
        }else {
            for (Employee employee : employeeList){
                System.out.println(employee.writeToCsv());
            }
        }
    }

    public void addEmployee(Employee employee){
        employeeList = ReadFilePerson.readEmployee(EMPLOYEE_PATH);
        employeeList.add(employee);
        WriteFilePerson.writeEmployee(EMPLOYEE_PATH, employee);
    }

    public void editEmployee(int index, Employee employee){
        employeeList = ReadFilePerson.readEmployee(EMPLOYEE_PATH);
        employeeList.set(index, employee);
        WriteFilePerson.writeEmployee(EMPLOYEE_PATH, employee);
    }
    public void deleteEmployee(Employee employee){
        employeeList = ReadFilePerson.readEmployee(EMPLOYEE_PATH);
        employeeList.remove(employee);
        WriteFilePerson.writeEmployee(EMPLOYEE_PATH, employee);
    }



}
