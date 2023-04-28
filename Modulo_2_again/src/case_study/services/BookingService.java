package case_study.services;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.services.houses.HouseService;
import case_study.services.houses.IHouseService;
import case_study.services.room.IRoomService;
import case_study.services.room.RoomService;
import case_study.services.villa.IVillaService;
import case_study.services.villa.VillaService;
import case_study.utils.*;

import java.time.LocalDate;
import java.util.*;

public class BookingService implements IBookingService{
    Set<Booking> bookings = ReadFileBooking.read();
    ICustomerService iCustomerService = new CustomerService();
    IRoomService iRoomService = new RoomService();
    IVillaService iVillaService = new VillaService();
    IHouseService iHouseService = new HouseService();
    Scanner scanner = new Scanner(System.in);



    @Override
    public void display() {
        if(bookings.size() == 0) System.out.println("There is no booking in the system!");
        else {
            TreeSet<Booking> bookingsInSortedOrder = new TreeSet<>(bookings);

            for (Booking booking: bookingsInSortedOrder) {

                System.out.println(booking);
            }
        }

    }

    @Override
    public void add() {
        boolean flag;
        // get and check customer number
        int customerNum = 0; //*
        System.out.println("Choose a customer's number to make a booking:");
        iCustomerService.display();
        do {
            try {
                System.out.println("Enter customer number here:");
                customerNum = Integer.parseInt(scanner.nextLine());
                if (!iCustomerService.findByCustomerNumber(customerNum)) {
                    throw new UserException("Please enter valid customer number from the list!");
                } else flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Customer number must be numbers only!");
                flag = false;
            } catch (UserException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        } while (!flag);

        // get and check service number
        String serviceID = "";  // *
        System.out.println("Choose a service type to make booking: \n" +
                "1 - House \n" +
                "2 - Room \n" +
                "3 or other - Villa ");
        String choice = scanner.nextLine();
        if (choice.equals("1")) {
            iHouseService.displayAllHouses();
            System.out.println("Choose a service number to make a booking:");
            do {
                try {
                    System.out.println("Enter service number here:");
                    serviceID = scanner.nextLine();
                    if (!iHouseService.checkServiceNumberForBooking(serviceID)) {
                        throw new UserException("Please enter valid service number from the list!");
                    } else flag = true;
                } catch (NumberFormatException e) {
                    System.out.println("Service number must be numbers only!");
                    flag = false;
                } catch (UserException e) {
                    System.out.println(e.getMessage());
                    flag = false;
                }
            } while (!flag);
        } else if (choice.equals("2")) {
            iRoomService.displayAllRooms();
            System.out.println("Choose a service number to make a booking:");
            do {
                try {
                    System.out.println("Enter service number here:");
                    serviceID = scanner.nextLine();
                    if (!iRoomService.checkServiceNumberForBooking(serviceID)) {
                        throw new UserException("Please enter valid service number from the list!");
                    } else flag = true;
                } catch (NumberFormatException e) {
                    System.out.println("Service number must be numbers only!");
                    flag = false;
                } catch (UserException e) {
                    System.out.println(e.getMessage());
                    flag = false;
                }
            } while (!flag);
        } else {
            iVillaService.displayAllVillas();
            System.out.println("Choose a service number to make a booking:");
            do {
                try {
                    System.out.println("Enter service number here:");
                    serviceID = scanner.nextLine();
                    if (!iVillaService.checkServiceNumberForBooking(serviceID)) {
                        throw new UserException("Please enter valid service number from the list!");
                    } else flag = true;
                } catch (NumberFormatException e) {
                    System.out.println("Service number must be numbers only!");
                    flag = false;
                } catch (UserException e) {
                    System.out.println(e.getMessage());
                    flag = false;
                }
            } while (!flag);
        }


        String startDate;
        String endDate;
        LocalDate startLocalDate;
        LocalDate endLocalDate;
        do {

            System.out.println("Enter start date here:");
            startDate = scanner.nextLine();
            while (Utils.parseStringToLocalDate(startDate) == null) {
                System.out.println("Please re-format start date as: dd-MM-yyyy: (01/01/2001)");
                startDate = scanner.nextLine();
            }
            startLocalDate = Utils.parseStringToLocalDate(startDate);


            System.out.println("Enter end date here:");
            endDate = scanner.nextLine();
            while (Utils.parseStringToLocalDate(endDate) == null) {
                System.out.println("Please re-format end date as: dd-MM-yyyy: (01/01/2001)");
                endDate = scanner.nextLine();
            }
            endLocalDate = Utils.parseStringToLocalDate(endDate);


            if (!Utils.checkOverlappedInterval(startLocalDate, endLocalDate, serviceID)
                    || !Utils.checkOverlapBetweenStartAndEndDate(startLocalDate, endLocalDate)){
                if(!Utils.checkOverlappedInterval(startLocalDate, endLocalDate, serviceID)){
                    flag = false;
                    System.out.println("This service has already been booked during this interval! Please choose another interval!");
                }
                if(!Utils.checkOverlapBetweenStartAndEndDate(startLocalDate, endLocalDate)){
                    flag = false;
                    System.out.println("StartDate and EndDate cannot be overlapped / EndDate must be after StartDate " +
                            "/ StartDate must be after Today! ");
                }
            } else flag = true;

        } while (!flag);


        System.out.println("Enter service name here:");
        String serviceName = scanner.nextLine();

        System.out.println("Enter service type here:");
        String serviceType = scanner.nextLine();

        Booking newBooking = new Booking(serviceID, startLocalDate, endLocalDate, customerNum, serviceName, serviceType);

            bookings.add(newBooking);
            WriteFileBooking.write(bookings);
            System.out.println("Booking added!");

        if (choice.equals("1")) iHouseService.updateTimesOfUsingService(serviceID);
        else if (choice.equals("2")) iRoomService.updateTimesOfUsingService(serviceID);
        else iVillaService.updateTimesOfUsingService(serviceID);

    }


}
