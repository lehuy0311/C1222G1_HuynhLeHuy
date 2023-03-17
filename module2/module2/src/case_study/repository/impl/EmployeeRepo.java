package case_study.repository.impl;

import case_study.common.ReadFile;
import case_study.common.WriteFile;
import case_study.model.Employee;
import case_study.repository.IEmployeeRepo;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    @Override
    public void editEmployee(int i, Employee employee, List<Employee> list) {
        List<String> stringList = new ArrayList<>();
        String str = employee.writeToCSV();
        list.set(i, employee);
        stringList.add(str);
        stringList.remove(str);
        WriteFile.writeFile(PATH, stringList);
    }


    @Override
    public void deleteEmployee(int id,  Employee employee) {
        List<String> stringList = ReadFile.readFile(PATH);
        stringList.remove(employee);
    }

}
