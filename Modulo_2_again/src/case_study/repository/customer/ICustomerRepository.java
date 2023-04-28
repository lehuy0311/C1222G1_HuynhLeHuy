package case_study.repository.customer;

import case_study.models.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAll();

    void add(List<Customer> customers);

    int edit(int customerID);
}
