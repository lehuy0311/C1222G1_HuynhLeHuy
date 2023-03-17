package case_study.repository;

import case_study.model.Customer;
import case_study.model.Employee;

import java.util.List;

public interface ICustomerRepo {
    List<Customer> displayCustomers();
    void addCustomer(Customer customer);

}
