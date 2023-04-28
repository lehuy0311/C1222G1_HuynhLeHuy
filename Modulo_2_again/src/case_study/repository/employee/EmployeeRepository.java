package case_study.repository.employee;

import case_study.models.Employee;
import case_study.repository.employee.IEmployeeRepository;
import case_study.utils.ReadFileEmployees;
import case_study.utils.WriteFileEmployees;

import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {

    private static List<Employee> employees = ReadFileEmployees.read();
    @Override
    public List<Employee> getAll() {
        return ReadFileEmployees.read();
    }

    @Override
    public void add(List<Employee> employees) {
        WriteFileEmployees.write(employees);
    }

    @Override
    public int edit(int employeeID) {
        for (int i = 0; i < employees.size(); i++) {
            if(employeeID == employees.get(i).getEmployeeID()){
                return i;
            }
        }
        return -1;
    }
}
