package case_study.services.houses;

public interface IHouseService {
    void displayAllHouses();
    void addNewHouse();

    boolean checkServiceNumberForBooking(String serviceNum);

    void updateTimesOfUsingService(String serviceNum);
}
