package case_study.repository.employee;

import case_study.models.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getAll();

    void add(List<Employee> employees);

    int edit(int employeeID);

}
