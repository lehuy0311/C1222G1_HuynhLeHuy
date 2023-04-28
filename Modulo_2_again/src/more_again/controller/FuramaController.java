package more_again.controller;

import more_again.service.ICustomerService;
import more_again.service.IEmployeeService;
import more_again.service.impl.CustomerService;
import more_again.service.impl.EmployeeService;

import java.util.Scanner;

public class FuramaController {
    public  static Scanner scanner = new Scanner(System.in);
    public static int select =0;
    public static IEmployeeService iEmployeeService = new EmployeeService();
    public static ICustomerService iCustomerService = new CustomerService();

    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu(){
        do{
            System.out.println("--------Menu-----------" +
                    "\n 1: Employee Management" +
                    "\n 2: Customer Management" +
                    "\n 3: Facility Management" +
                    "\n 4: Booking Management" +
                    "\n 5: Promotion Management" +
                    "\n 6: Exit") ;
            System.out.println("Nhập sự lựa chọn của bạn: ");
            select = Integer.parseInt(scanner.nextLine());
            switch(select){
                case 1:
                    displayEmployeeManagement();
                    break;
                case 2:
                    displayCustomerManagement();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(7);
            }
        }while (select !=7);
    }

    public static void displayEmployeeManagement(){
        do {
            System.out.println("-----------Menu Employee Managemnet------------" +
                    "\n 1:Display list employee" +
                    "\n 2:Add employee" +
                    "\n 3:Edit employee" +
                    "\n 4:Delete employee" +
                    "\n 5:Find employee" +
                    "\n 6:Return main menu");
            System.out.println("Chọn sự lựa chọn của bạn: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    iEmployeeService.displayEmployee();
                    break;
                case 2:
                    iEmployeeService.addEmployee();
                    break;
                case 3:
                    iEmployeeService.editEmployee();
                    break;
                case 4:
                    iEmployeeService.removeEmployee();
                    break;
                case 5:
                    break;
                case 6:
                    displayMainMenu();
            }
        }while (select != 6);
    }
    public static void displayCustomerManagement(){
        do {
            System.out.println("-----------Menu Customer Management----------" +
                    "\n 1:Display list customer" +
                    "\n 2:Add new customer" +
                    "\n 3:Edit customer" +
                    "\n 4:Return main main");
            System.out.println("Nhập sự lựa chọn: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    iCustomerService.displayCustomer();
                    break;
                case 2:
                    iCustomerService.addCustomer();
                    break;
                case 3:
                    iCustomerService.editCustomer();
                    break;
                case 4:
                    displayMainMenu();
            }
        }while (select != 4);
    }

}
