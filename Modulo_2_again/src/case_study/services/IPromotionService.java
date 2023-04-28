package case_study.services;

import case_study.models.Customer;

import java.util.List;

public interface IPromotionService {
    void displayCustomersUsingService();
    List<Customer> displayCustomersGettingVouchers();
}
