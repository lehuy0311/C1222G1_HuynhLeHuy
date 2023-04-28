package case_study.services;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.services.houses.HouseService;
import case_study.services.houses.IHouseService;
import case_study.services.room.IRoomService;
import case_study.services.room.RoomService;
import case_study.services.villa.IVillaService;
import case_study.services.villa.VillaService;
import case_study.utils.ReadFileHouse;
import case_study.utils.ReadFileRooms;
import case_study.utils.ReadFileVilla;

import java.util.*;

public class FacilityService implements IFacilityService{
    IHouseService iHouseService = new HouseService();
    IRoomService iRoomService = new RoomService();
    IVillaService iVillaService = new VillaService();

    @Override
    public void display() {
        System.out.println("                 ****** List of Facility in the system: (Houses - Rooms - Villas) ******");
        iHouseService.displayAllHouses();
        iRoomService.displayAllRooms();
        iVillaService.displayAllVillas();
    }

    @Override
    public void displayFacilityMaintenance() {
        Map<Facility, Integer> maintenanceList = new LinkedHashMap<>();

        Map<Room, Integer> rooms = ReadFileRooms.read();
        Map<House, Integer> houses = ReadFileHouse.read();
        Map<Villa, Integer> villas = ReadFileVilla.read();

        for (Map.Entry<Room, Integer> room: rooms.entrySet()) {
            if(room.getValue() >= 5){
                maintenanceList.put(room.getKey(), room.getValue());
            }
        }

        for (Map.Entry<House, Integer> house: houses.entrySet()) {
            if(house.getValue() >= 5){
                maintenanceList.put(house.getKey(), house.getValue());
            }
        }

        for (Map.Entry<Villa, Integer> villa: villas.entrySet()) {
            if(villa.getValue() >= 5){
                maintenanceList.put(villa.getKey(), villa.getValue());
            }
        }

        if(maintenanceList.isEmpty()) System.out.println("There is no service that needs maintenance!");
        else{
            System.out.println("*****List of Services which need maintenance:");
            System.out.println(maintenanceList);
        }
    }
}
