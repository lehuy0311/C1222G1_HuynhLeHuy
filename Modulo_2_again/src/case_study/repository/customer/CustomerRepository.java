package case_study.repository.customer;

import case_study.models.Customer;
import case_study.utils.ReadFileCustomers;
import case_study.utils.WriteFileCustomers;

import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    public static List<Customer> customers = ReadFileCustomers.read();

    @Override
    public List<Customer> getAll() {
        return customers;
    }

    @Override
    public void add(List<Customer> customers) {
        WriteFileCustomers.write(customers);
    }

    @Override
    public int edit(int customerID) {
        for (int i = 0; i < customers.size(); i++) {
            if(customerID == customers.get(i).getCustomerID()){
                return i;
            }
        }
        return -1;
    }
}
