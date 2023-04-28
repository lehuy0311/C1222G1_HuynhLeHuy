package case_study.services;

import case_study.models.*;
import case_study.repository.customer.CustomerRepository;
import case_study.repository.customer.ICustomerRepository;
import case_study.utils.UserException;
import case_study.utils.Utils;
import case_study.utils.WriteFileCustomers;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    ICustomerRepository iCustomerRepository = new CustomerRepository();
    List<Customer> customers = iCustomerRepository.getAll();

    Scanner scanner = new Scanner(System.in);

    public void add() {
        Customer newCustomer = getInfoAndReturnACustomer(true);
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getID() == newCustomer.getID() || customers.get(i).getCustomerID() == newCustomer.getCustomerID()) {
                System.out.println("You cannot use this ID / customer number because it already exists in the system!");
                return;
            }
        }
        customers.add(newCustomer);
        iCustomerRepository.add(customers);
        System.out.println("Customer added!");
    }

    @Override
    public boolean findByCustomerNumber(int customerNum) {
        for (Customer customer : customers) {
            if (customer.getCustomerID() == customerNum) return true;
        }
        return false;
    }

    @Override
    public Customer findByCustomerIdAndReturnACustomer(int customerNum) {
        for (int i = 0; i < customers.size(); i++) {
            if(customerNum == customers.get(i).getCustomerID()) return customers.get(i);
        }
        return null;
    }

    @Override
    public void display() {
        if (customers.size() == 0) System.out.println("There is no customer in the system! Please add some!");
        else {
            System.out.println("List of Customers:");
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }
    }

    @Override
    public void edit() {
        Customer editedCustomer;
        Customer temp;
        int index;
        int searchCustomerNumber = 0;
        int oldCustomerNum;
        boolean flag;

        do{
            try{
                System.out.println("Please enter customer number here to edit:");
                searchCustomerNumber = Integer.parseInt(scanner.nextLine());
                flag = true;
            } catch (NumberFormatException e){
                System.out.println("Numbers only!");
                flag = false;
            }
        }while (!flag);


        if (iCustomerRepository.edit(searchCustomerNumber) == -1) {
            System.out.println("There is no customer matching that ID!");
        } else {
            index = iCustomerRepository.edit(searchCustomerNumber);
            editedCustomer = customers.get(index);
            oldCustomerNum = editedCustomer.getCustomerID();
            System.out.println("Customer Info: " + editedCustomer);
            temp = getInfoAndReturnACustomer(false);
            for (int i = 0; i < customers.size(); i++) {
                if (customers.get(i).getID() == temp.getID() || customers.get(i).getCustomerID() == temp.getCustomerID()) {
                    System.out.println("You cannot use this ID / customer number because it already exists in the system!");
                    return;
                }
            }
            editedCustomer = temp;
            editedCustomer.setCustomerID(oldCustomerNum);
            customers.set(index, editedCustomer);
            WriteFileCustomers.write(customers);
            System.out.println("Customer edited!");
        }
    }

    private Customer getInfoAndReturnACustomer(boolean isAll) {
        boolean flag;

        int ID = 0;
        do{
            try {
                System.out.println("Enter customer's ID here:");
                 ID = Integer.parseInt(scanner.nextLine());
                 flag = true;
            } catch (NumberFormatException e){
                System.out.println("Customer's ID must be numbers!");
                flag = false;
            }
        }while (!flag);


        System.out.println("Enter customer's name here:");
        String name = scanner.nextLine();
        while (!Utils.validateName(name)){
            System.out.println("Please re-enter your name here: (Xxxx....)");
            name = scanner.nextLine();
        }

        // LocalTime - DOB
        LocalDate now = LocalDate.now();
        System.out.println("Enter customer's DOB here:");
        String DOB = scanner.nextLine();
        while (Utils.parseStringToLocalDate(DOB) == null
                || Period.between(Utils.parseStringToLocalDate(DOB), now).getYears() < 18
                || Period.between(Utils.parseStringToLocalDate(DOB), now).getYears() > 100){
            System.out.println("Age should be from 18 to 100!");
            DOB = scanner.nextLine();
        }
       // System.out.println(Period.between(Utils.parseStringToLocalDate(DOB), now).getYears());
        LocalDate finalDOB = Utils.parseStringToLocalDate(DOB);


        System.out.println("Enter customer's gender here: \n" +
                "1 - MALE \n" +
                "2 - FEMALE \n" +
                "3 or Other - Other Gender");
        String tempGender = scanner.nextLine();
        Boolean gender;
        if (tempGender.equals("1")) gender = true;
        else if (tempGender.equals("2")) gender = false;
        else gender = null;

        System.out.println("Enter customer's phone number here:");
        String phoneNumber = scanner.nextLine();
        while (!Utils.validatePhoneNumber(phoneNumber)){
            System.out.println("Please re-enter customer's phone number here: (0909090909)");
            phoneNumber = scanner.nextLine();
        }

        System.out.println("Enter customer's email here:");
        String email = scanner.nextLine();
        while (!Utils.validateEmail(email)){
            System.out.println("Please re-enter employee's email here: (abb@gmail.com)");
            email = scanner.nextLine();
        }

        // customer number
        int customerID = -1;
        if(isAll){

            do{
                try {
                    System.out.println("Enter customer number here:");
                    customerID = Integer.parseInt(scanner.nextLine());
                    if(customerID < 0) throw new UserException("ID cannot be a negative number!");
                    flag = true;
                } catch (NumberFormatException e){
                    System.out.println("Customer number must be numbers!");
                    flag = false;
                } catch (UserException e) {
                    System.out.println(e.getMessage());
                }
            } while (!flag);

        }

        // customer's address
        System.out.println("Enter customer's address here:");
        String address = scanner.nextLine();

        System.out.println("Enter customer's type here: \n" +
                "1 - DIAMOND,\n" +
                "2 - PLATINUM,\n" +
                "3 - GOLD,\n" +
                "4 - SILVER,\n" +
                "5 or Other - MEMBER");
        CustomerType customerType;
        String tempCustomerType = scanner.nextLine();
        if (tempCustomerType.equals("1")) customerType = CustomerType.DIAMOND;
        else if (tempCustomerType.equals("2")) customerType = CustomerType.PLATINUM;
        else if (tempCustomerType.equals("3")) customerType = CustomerType.GOLD;
        else if (tempCustomerType.equals("4")) customerType = CustomerType.SILVER;
        else customerType = CustomerType.MEMBER;

        Customer customer = new Customer(ID, name, finalDOB, gender, phoneNumber, email, customerID, address, customerType);
        return customer;
    }
}
