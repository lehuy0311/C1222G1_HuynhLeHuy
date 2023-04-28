package case_study.services.room;

import case_study.models.Room;
import case_study.models.TypeOfRenting;
import case_study.repository.room.IRoomRepository;
import case_study.repository.room.RoomRepository;
import case_study.utils.UserException;
import case_study.utils.Utils;
import case_study.utils.WriteFileRooms;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RoomService implements IRoomService{
    private static Scanner scanner = new Scanner(System.in);
    private static IRoomRepository iRoomRepository = new RoomRepository();
    private static Map<Room, Integer> rooms = iRoomRepository.getAll();
    @Override
    public void displayAllRooms() {
        if(rooms.isEmpty()) System.out.println("There is no room in the system!");
        else {
            System.out.println("**List of Rooms:**");
            for (Map.Entry<Room, Integer> entry: rooms.entrySet()) {
                System.out.println(entry);
            }
        }
    }

    @Override
    public void addNewRoom() {
        System.out.println("Enter your room's service ID here: (SVRO-1234)");
        String serviceID = scanner.nextLine();
        while (!Utils.validateServiceID(serviceID, "RO")){
                System.out.println("Please re-enter your room's service ID here: (SVRO-1234)");
                serviceID = scanner.nextLine();
        }


        System.out.println("Enter your room's service name here: (Xxxxx...)");
        String serviceName = scanner.nextLine();
        while (!Utils.validateName(serviceName)){
            System.out.println("Please re-enter your room's service name here: (Xxxxx...)");
            serviceName = scanner.nextLine();
        }


        boolean flag;
        double area = 0;
        do{
            try{
                System.out.println("Enter your room's area here: ( > 30.0 )");
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
                System.out.println("Enter your room's price:");
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
                System.out.println("Enter your room's capacity here:");
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


        System.out.println("Enter type of renting for your room:");
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


        System.out.println("Enter your room's complimentary service");
        String complimentary = scanner.nextLine();

        Room room = new Room(serviceID,serviceName, area, price,capacity, typeOfRenting, complimentary);
        if(rooms.containsKey(room)) System.out.println("This room already exists in the system!");
        else {
            rooms.put(room, 0);
            iRoomRepository.add(rooms);
            System.out.println("Room added!");
        }
    }

    @Override
    public boolean checkServiceNumberForBooking(String serviceNum) {
        Set<Room> roomSet = rooms.keySet();
        for (Room room: roomSet) {
            if(room.serviceID.equals(serviceNum)) return true;
        }
        return false;
    }

    @Override
    public void updateTimesOfUsingService(String serviceNum) {
        Set<Room> roomSet = rooms.keySet();
        Room updatedRoom = null;
        // find Room Object with provided serviceNum
        for (Room room: roomSet) {
            if(room.serviceID.equals(serviceNum)){
                updatedRoom = room;
                break;
            }
        }
        // get the using times then add back to the map with increased times by 1
        int usingTimes = rooms.get(updatedRoom);
        rooms.put(updatedRoom, usingTimes + 1);
        WriteFileRooms.write(rooms);
    }
}
