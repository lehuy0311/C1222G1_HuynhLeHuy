package case_study.services.villa;

public interface IVillaService {
    void displayAllVillas();
    void addNewVilla();
    boolean checkServiceNumberForBooking(String serviceNum);

    void updateTimesOfUsingService(String serviceNum);
}
