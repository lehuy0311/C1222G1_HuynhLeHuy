package more_again.repository;

import more_again.models.Employee;

public interface IEmployeeRepository {
    void displayEmployee();
    void addEmployee(Employee employee);
    void editEmployee(int index, Employee employee);
    void deleteEmployee(Employee employee);
}
