package more_again.repository;

import more_again.models.Customer;

public interface ICustomerRepository {
    void displayCustomer();
    void addCustomer(Customer customer);
    void editCustomer(int index, Customer customer);
    void deleteCustomer(Customer customer);
}
