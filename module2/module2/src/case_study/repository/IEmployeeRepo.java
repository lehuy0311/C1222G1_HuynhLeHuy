package case_study.repository;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeRepo {
    public List<Employee> displayEmployees();
    void addEmployee(Employee employee);
    void editEmployee(int id, Employee employee, List<Employee> employees);
    int deleteEmployee(int id);

}