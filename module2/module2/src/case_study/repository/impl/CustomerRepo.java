package case_study.repository.impl;

import case_study.common.ReadFile;
import case_study.common.WriteFile;
import case_study.model.Customer;
import case_study.repository.ICustomerRepo;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepo implements ICustomerRepo {
    public static final String PATH ="src/case_study/data/Customer.csv";

    public List<Customer> displayCustomers(){
        List<String > list = ReadFile.readFile(PATH);
        List<Customer> customers = new ArrayList<>();
        for(String str : list){
            String[] temp = str.split(",");
            Customer customer = new Customer(Integer.parseInt(temp[0]),
                    temp[1], temp[2], temp[3], temp[4],
                    temp[5], temp[6], temp[7], temp[8]);
            customers.add(customer);
        }
        return customers ;
    }
    public void addCustomer(Customer customer){
        List<String> stringList = new ArrayList<>();
        String str = customer.writeToCSV();
        stringList.add(str);
        WriteFile.writeFile(PATH, stringList);
    }
}
