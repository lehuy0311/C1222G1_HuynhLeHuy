package case_study.repository.impl;

import case_study.common.ReadFile;
import case_study.common.WriteFile;
import case_study.model.Employee;
import case_study.repository.IEmployeeRepo;

import java.io.Reader;
import java.util.ArrayList;
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
        String str = employee.writeToCSV();
        List<String> stringList = new ArrayList<>();
        stringList.add(str);
        WriteFile.writeFile(PATH, stringList);

    }

    @Override
    public int editEmployee(int id) {
        return 0;
    }

    @Override
    public int deleteEmployee(int id) {
        return 0;
    }

//    private static String writeToCSV(Employee employee){
//        return employee.getId()+","+employee.getName()+","+employee.getDayOfBirth()+","
//                +employee.getGender()+","+employee.getSoCmnd()+","+employee.getPhoneNumber()
//                +","+employee.getEmail()+","+employee.getProf()+","+employee.getLevel()+","+employee.getPayment();
//    }

}
