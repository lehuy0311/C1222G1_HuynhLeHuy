package case_study.services.villa;

import case_study.models.TypeOfRenting;
import case_study.models.Villa;
import case_study.repository.villa.IVillaRepository;
import case_study.repository.villa.VillaRepository;
import case_study.utils.UserException;
import case_study.utils.Utils;
import case_study.utils.WriteFileVilla;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class VillaService implements IVillaService{
    private static Scanner scanner = new Scanner(System.in);
    private static IVillaRepository iVillaRepository = new VillaRepository();
    private static Map<Villa, Integer> villas = iVillaRepository.getAll();

    @Override
    public void displayAllVillas() {
        if(villas.isEmpty()) System.out.println("There is no villa in the system!");
        else {
            System.out.println("**List of Villas:**");
            for (Map.Entry<Villa, Integer> entry: villas.entrySet()) {
                System.out.println(entry);
            }
        }
    }

    @Override
    public void addNewVilla() {
        System.out.println("Enter your villa's service ID here: (SVVL-1234)");
        String serviceID = scanner.nextLine();
        while (!Utils.validateServiceID(serviceID, "VL")){
                System.out.println("Please re-enter your villa's service ID here: (SVVL-1234)");
                serviceID = scanner.nextLine();
        }


        System.out.println("Enter your villa's service name here: (Xxxxx...)");
        String serviceName = scanner.nextLine();
        while (!Utils.validateName(serviceName)){
            System.out.println("Please re-enter your villa's service name here: (Xxxxx...)");
            serviceName = scanner.nextLine();
        }

        boolean flag;
        double area = 0;
        do{
            try{
                System.out.println("Enter your villa's area here: ( > 30.0 )");
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


        double price = 0;
        do{
            try{
                System.out.println("Enter your villa's price:");
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


        int capacity = 0;
        do{
            try {
                System.out.println("Enter your villa's capacity here:");
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


        System.out.println("Enter type of renting for your villa:");
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

        System.out.println("Enter your villa's standard: (Xxxxx...)");
        String standard = scanner.nextLine();
        while (!Utils.validateName(standard)){
            System.out.println("Please re-enter your villa's standard: (Xxxxx...)");
            standard = scanner.nextLine();
        }


        double poolArea = 0;
        do{
            try{
                System.out.println("Enter your villa's pool area here: ( > 30.0 )");
                poolArea = Double.parseDouble(scanner.nextLine());
                if(poolArea <= 30.0) throw new UserException("Your input pool area should be greater than 30.0!");
                flag = true;
            } catch (NumberFormatException e){
                System.out.println("Your input area should be a decimal number!");
                flag = false;
            } catch (UserException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        } while (!flag);


        int numOfFloors = 0;
        do{
            try{
                System.out.println("Enter number of floors for your villa:");
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


        Villa villa = new Villa(serviceID,serviceName, area, price,capacity, typeOfRenting, standard, poolArea, numOfFloors);
        if(villas.containsKey(villa)) System.out.println("This villa already exists in the system!");
        else {
            villas.put(villa, 0);
            iVillaRepository.add(villas);
            System.out.println("Villa added!");
        }
    }

    @Override
    public boolean checkServiceNumberForBooking(String serviceNum) {
        Set<Villa> villaSet = villas.keySet();
        for (Villa villa: villaSet) {
            if(villa.serviceID.equals(serviceNum)) return true;
        }
        return false;
    }

    @Override
    public void updateTimesOfUsingService(String serviceNum) {
        Set<Villa> villaSet = villas.keySet();
        Villa updatedVilla = null;
        // find Villa Object with provided serviceNum
        for (Villa villa: villaSet) {
            if(villa.serviceID.equals(serviceNum)){
                updatedVilla = villa;
                break;
            }
        }
        // get the using times then add back to the map with increased times by 1
        int usingTimes = villas.get(updatedVilla);
        villas.put(updatedVilla, usingTimes + 1);
        WriteFileVilla.write(villas);
    }
}
