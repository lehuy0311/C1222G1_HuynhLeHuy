package case_study.services;

import case_study.models.Booking;
import case_study.models.Customer;
import case_study.utils.ReadFileBooking;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PromotionService implements IPromotionService{
    private Set<Booking> bookings = ReadFileBooking.read();
    private ICustomerService iCustomerService = new CustomerService();
    @Override
    public void displayCustomersUsingService() {
        List<Customer> customers = new ArrayList<>();
        Customer customer;
        for (Booking booking : bookings) {
            customer = iCustomerService.findByCustomerIdAndReturnACustomer(booking.getCustomerID());
            if(!customers.contains(customer)) customers.add(customer);
        }
        System.out.println("***List of Customers Using Service:");
        for (Customer tempCustomer : customers) {
            System.out.println(tempCustomer);
        }
    }

    @Override
    public List<Customer> displayCustomersGettingVouchers() {
        return null;
    }
}
