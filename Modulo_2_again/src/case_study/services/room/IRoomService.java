package case_study.services.room;

public interface IRoomService {
    void displayAllRooms();
    void addNewRoom();
    boolean checkServiceNumberForBooking(String serviceNum);
    void updateTimesOfUsingService(String serviceNum);
}
