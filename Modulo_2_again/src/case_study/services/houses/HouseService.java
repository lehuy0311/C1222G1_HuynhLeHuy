package case_study.services.houses;

import case_study.models.House;
import case_study.models.TypeOfRenting;
import case_study.repository.house.HouseRepository;
import case_study.repository.house.IHouseRepository;
import case_study.utils.UserException;
import case_study.utils.Utils;
import case_study.utils.WriteFileHouse;

import java.util.*;

public class HouseService implements IHouseService{
    private static Scanner scanner = new Scanner(System.in);
    private static IHouseRepository iHouseRepository = new HouseRepository();
    private static Map<House, Integer> houses = iHouseRepository.getAll();
    @Override
    public void displayAllHouses() {
        if(houses.isEmpty()) System.out.println("There is no house in the system!");
        else {
            System.out.println("**List of Houses:**");
            for (Map.Entry<House, Integer> entry: houses.entrySet()) {
                System.out.println(entry);
            }
        }
    }

    @Override
    public void addNewHouse() {
        // service ID
        System.out.println("Enter your house's service ID here: (SVHO-1234)");
        String serviceID = scanner.nextLine();
        while (!Utils.validateServiceID(serviceID, "HO")){
            System.out.println("Please re-enter your house's service ID here: (SVHO-1234)");
            serviceID = scanner.nextLine();
        }

        //service name
        System.out.println("Enter your house's service name here: (Xxxxx...)");
        String serviceName = scanner.nextLine();
        while (!Utils.validateName(serviceName)){
            System.out.println("Please re-enter your house's service name here: (Xxxxx...)");
            serviceName = scanner.nextLine();
        }

        //usable area
        boolean flag;
        double area = 0;
        do{
            try{
                System.out.println("Enter your house's area here: ( > 30.0 )");
                area = Double.parseDouble(scanner.nextLine());
                if(area <= 30.0) throw new UserException("Your input area should be greater than 30.0!");
                flag = true;
            } catch (NumberFormatException e){
                System.out.println("Your input area should be a decimal number!");
                flag = false;
            } catch (UserException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        } while (!flag);

        //price
        double price = 0;
        do{
            try{
                System.out.println("Enter your house's price:");
                price = Double.parseDouble(scanner.nextLine());
                if(price < 0) throw new UserException("Your input price should be a decimal number greater than or equal to 0!");
                flag = true;
            } catch (NumberFormatException e){
                System.out.println("Your input price should be a decimal number!");
                flag = false;
            } catch (UserException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        } while (!flag);

        //capacity
        int capacity = 0;
        do{
            try {
                System.out.println("Enter your house's capacity here:");
                capacity = Integer.parseInt(scanner.nextLine());
                if(capacity <= 0 || capacity >= 20) throw new UserException("Capacity should be from 1 to 19!");
                flag = true;
            } catch (NumberFormatException e){
                System.out.println("Your input capacity should be an integer!");
                flag = false;
            } catch (UserException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        // type of renting
        System.out.println("Enter type of renting for your house:");
        System.out.println("Choose a number: \n" +
                "1 - YEAR,\n" +
                "2 - MONTH,\n" +
                "3 - DAY,\n" +
                "4 or Other - HOUR");
        TypeOfRenting typeOfRenting;
        String temp = scanner.nextLine();
        if (temp.equals("1")) typeOfRenting = TypeOfRenting.YEAR;
        else if (temp.equals("2")) typeOfRenting = TypeOfRenting.MONTH;
        else if (temp.equals("3")) typeOfRenting = TypeOfRenting.DAY;
        else typeOfRenting = TypeOfRenting.HOUR;

        //standard
        System.out.println("Enter your house's standard: (Xxxxx...)");
        String standard = scanner.nextLine();
        while (!Utils.validateName(standard)){
            System.out.println("Please re-enter your house's standard: (Xxxxx...)");
            standard = scanner.nextLine();
        }

        //numOfFloors
        int numOfFloors = 0;
        do{
            try{
                System.out.println("Enter number of floors for your house:");
                numOfFloors = Integer.parseInt(scanner.nextLine());
                if(numOfFloors <= 0) throw new UserException("Number of floors should be an integer greater than 0!");
                flag = true;
            } catch (NumberFormatException e){
                System.out.println("Number of floors should be an integer!");
                flag = false;
            } catch (UserException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        } while (!flag);

        House house = new House(serviceID,serviceName, area, price,capacity, typeOfRenting, standard, numOfFloors);
        if(houses.containsKey(house)) System.out.println("This House already exists in the system!");
        else {
            houses.put(house, 0);
            iHouseRepository.add(houses);
            System.out.println("House added!");
        }
    }

    @Override
    public boolean checkServiceNumberForBooking(String serviceNum) {
        Set<House> houseSet = houses.keySet();
        for (House house: houseSet) {
            if(house.serviceID.equals(serviceNum)) return true;
        }
        return false;
    }

    @Override
    public void updateTimesOfUsingService(String serviceNum) {
        Set<House> houseSet = houses.keySet();
        House updatedHouse = null;
        // find House Object with provided serviceNum
        for (House house: houseSet) {
            if(house.serviceID.equals(serviceNum)){
                updatedHouse = house;
                break;
            }
        }
        // get the using times then add back to the map with increased times by 1
        int usingTimes = houses.get(updatedHouse);
        houses.put(updatedHouse, usingTimes + 1);
        WriteFileHouse.write(houses);
    }


}
