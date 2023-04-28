package case_study.services;

import case_study.models.Customer;

public interface ICustomerService extends IServices{
    void edit();
    void add();
    boolean findByCustomerNumber(int customerNum);
    Customer findByCustomerIdAndReturnACustomer(int customerNum);
}
