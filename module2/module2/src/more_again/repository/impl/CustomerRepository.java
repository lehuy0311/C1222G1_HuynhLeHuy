package more_again.repository.impl;

import more_again.common.WriteFilePerson;
import more_again.models.Customer;
import more_again.common.ReadFilePerson;
import more_again.models.Employee;
import more_again.repository.ICustomerRepository;

import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    public static final String CUSTOMER_PATH ="src/more_again/data/Customer.csv";
    public static List<Customer> customerList = ReadFilePerson.readCustomer(CUSTOMER_PATH);

    public void displayCustomer(){
        customerList = ReadFilePerson.readCustomer(CUSTOMER_PATH);
        if(customerList.size() == 0){
            System.out.println("No data");
        }else {
            for (Customer customer : customerList){
                System.out.println(customer.writeToCsv());
            }
        }
    }
    public void addCustomer(Customer customer){
        customerList = ReadFilePerson.readCustomer(CUSTOMER_PATH);
        customerList.add(customer);
        WriteFilePerson.writeCustomer(CUSTOMER_PATH, customer);
    }

    public void editCustomer(int index, Customer customer){
        customerList = ReadFilePerson.readCustomer(CUSTOMER_PATH);
        customerList.remove(customer);
        WriteFilePerson.writeCustomer(CUSTOMER_PATH, customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {

    }


}
