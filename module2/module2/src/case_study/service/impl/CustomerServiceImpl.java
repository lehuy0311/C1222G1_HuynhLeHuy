package case_study.service.impl;

import case_study.model.Customer;
import case_study.model.Employee;
import case_study.repository.ICustomerRepo;
import case_study.repository.impl.CustomerRepo;
import case_study.service.service_for_all.ICustomerService;

import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    Scanner scanner = new Scanner(System.in);
    public static final String PATH = "src/case_study/data/Customer.csv";
    private ICustomerRepo iCustomerRepo = new CustomerRepo();

    @Override
    public void displayCustomer() {
        List<Customer> customerList = iCustomerRepo.displayCustomers();
        if (customerList.size() == 0) {
            System.out.println("no data");
        } else {
            for (Customer temp : customerList) {
                System.out.println(temp);
            }
        }
    }

    public boolean checkExest(int id) {
        List<Customer> customerList = iCustomerRepo.displayCustomers();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }
    @Override
    public void addCustomer() {
        List<Customer> customers = iCustomerRepo.displayCustomers();

        System.out.println("id customer");
        int idCustomer = Integer.parseInt(scanner.nextLine());

        if(checkExest(idCustomer) == true){
            System.out.println("mã id này đã tồn tại");
        }else {
            System.out.println("name customer");
            String nameCustomer = scanner.nextLine();
            System.out.println("birth customer");
            String birthCustomer = scanner.nextLine();
            System.out.println("gender customer");
            String genderCustomer = scanner.nextLine();
            System.out.println("CMND customer");
            String cmndCustomer = scanner.nextLine();
            System.out.println("number phone customer");
            String phoneCustomer = scanner.nextLine();
            System.out.println("email customer");
            String emailCustomer = scanner.nextLine();
            System.out.println("typeOfCustomer customer");
            String typeCustomer = scanner.nextLine();
            System.out.println("address customer");
            String addressCustomer = scanner.nextLine();

            Customer customer = new Customer(idCustomer, nameCustomer,
                    birthCustomer,genderCustomer,cmndCustomer,
                    phoneCustomer,emailCustomer,typeCustomer,addressCustomer);

            iCustomerRepo.addCustomer(customer);
        }
    }
}
