package case_study.controllers;

import case_study.services.*;
import case_study.services.houses.HouseService;
import case_study.services.houses.IHouseService;
import case_study.services.room.IRoomService;
import case_study.services.room.RoomService;
import case_study.services.villa.IVillaService;
import case_study.services.villa.VillaService;

import java.util.Scanner;

public class FurumaController {
    private static final Scanner scanner = new Scanner(System.in);
    private static String input = "";
    private static IEmployeeService employeeService = new EmployeeService();
    private static ICustomerService customerService = new CustomerService();
    private static IRoomService iRoomService = new RoomService();
    private static IVillaService iVillaService = new VillaService();
    private static IHouseService iHouseService = new HouseService();

    private static IFacilityService iFacilityService = new FacilityService();
    private static IBookingService iBookingService = new BookingService();
    private static IContractService iContractService = new ContractService();
    private static IPromotionService iPromotionService = new PromotionService();
    public static void main(String[] args) {

        displayMainMenu();
    }
    public static void displayMainMenu(){

        do{
            System.out.println("====================================");
            System.out.println("***** Welcome to Furuma Management System: *****");
            System.out.println("Please choose a number to run its function:");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.print("Choose your number here:");
            input = scanner.nextLine();
            switch (input){
                case "1": displayEmployeeManagementMenu(); break;
                case "2": displayCustomerManagementMenu(); break;
                case "3": displayFacilityManagementMenu(); break;
                case "4": displayBookingManagementMenu(); break;
                case "5": displayPromotionManagementMenu(); break;
                case "6": System.out.println("Thank you! See you later!"); return;
            }
        } while(!input.equals("6"));
    }


    public static void displayEmployeeManagementMenu(){
        do {
            System.out.println("===================================");
            System.out.println("**** Employee Management *****");
            System.out.println("1. Display list of employees:");
            System.out.println("2. Add new employee:");
            System.out.println("3. Edit employee:");
            System.out.println("4. Return main menu:");
            System.out.print("Choose your number here:");
            input = scanner.nextLine();
            switch (input){
                case "1": employeeService.display(); break;
                case "2": employeeService.add(); break;
                case "3": employeeService.edit(); break;
                case "4":
                    displayMainMenu();
                    return;
            }
        } while (!input.equals("4"));
    }


    public static void displayCustomerManagementMenu(){
        do {
            System.out.println("===================================");
            System.out.println("**** Customer Management *****");
            System.out.println("1. Display list of customers:");
            System.out.println("2. Add new customer:");
            System.out.println("3. Edit customer:");
            System.out.println("4. Return main menu:");
            System.out.print("Choose your number here:");
            input = scanner.nextLine();
            switch (input){
                case "1": customerService.display(); break;
                case "2": customerService.add(); break;
                case "3": customerService.edit(); break;
                case "4":
                    displayMainMenu();
                    return;
            }
        } while (!input.equals("4"));
    }


    public static void displayFacilityManagementMenu(){
        do {
            System.out.println("===================================");
            System.out.println("**** Facility Management *****");
            System.out.println("1. Display list of facility:");
            System.out.println("2. Add new facility:");
            System.out.println("3. Display facility maintenance list:");
            System.out.println("4. Return main menu:");
            System.out.print("Choose your number here:");
            input = scanner.nextLine();
            switch (input){
                case "1": iFacilityService.display(); break;
                case "2": displayAddNewFacilityMenu(); break;
                case "3": iFacilityService.displayFacilityMaintenance(); break;
                case "4":
                    displayMainMenu();
                    return;
            }
        } while (!input.equals("4"));
    }


    public static void displayBookingManagementMenu(){
        do {
            System.out.println("===================================");
            System.out.println("**** Booking Management *****");
            System.out.println("1. Add new booking:");
            System.out.println("2. Display list of bookings:");
            System.out.println("3. Create new contract:");
            System.out.println("4. Display list of contracts:");
            System.out.println("5. Edit contract:");
            System.out.println("6. Return main menu:");
            System.out.print("Choose your number here:");
            input = scanner.nextLine();
            switch (input){
                case "1": iBookingService.add(); break;
                case "2": iBookingService.display(); break;
                case "3": iContractService.add(); break;
                case "4": iContractService.display(); break;
                case "5": iContractService.edit(); break;
                case "6":
                    displayMainMenu();
                    return;
            }
        } while (!input.equals("6"));
    }


    public static void displayPromotionManagementMenu(){
        do {
            System.out.println("===================================");
            System.out.println("**** Promotion Management *****");
            System.out.println("1. Display list of customers using service:");
            System.out.println("2. Display list of customers getting vouchers:");
            System.out.println("3. Return main menu:");
            System.out.print("Choose your number here:");
            input = scanner.nextLine();
            switch (input){
                case "1": iPromotionService.displayCustomersUsingService(); break;
                case "2": System.out.println("Sorry! This function has not been built yet :> !"); break;
                case "3":
                    displayMainMenu();
                    return;
            }
        } while (!input.equals("3"));
    }

    public static void displayAddNewFacilityMenu(){
        do {
            System.out.println("===================================");
            System.out.println("**** Add New Facility *****");
            System.out.println("1. Add New Villa:");
            System.out.println("2. Add New Room:");
            System.out.println("3. Add New House:");
            System.out.println("4. Back to Facility Management Menu:");
            System.out.print("Choose your number here:");
            input = scanner.nextLine();
            switch (input){
                case "1": iVillaService.addNewVilla(); break;
                case "2": iRoomService.addNewRoom(); break;
                case "3": iHouseService.addNewHouse(); break;
                case "4":
                    displayFacilityManagementMenu();
                    return;
            }
        } while (!input.equals("4"));
    }




}

