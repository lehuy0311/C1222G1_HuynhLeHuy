package case_study.models;

public class Room extends Facility{
    private String complimentaryService;

    public Room(String serviceID,
         String serviceName,
         double usableArea,
         double price,
         int capacity,
         case_study.models.TypeOfRenting typeOfRenting,
         String complimentaryService){
        super(serviceID,serviceName, usableArea, price,capacity, typeOfRenting);
        this.complimentaryService = complimentaryService;
    }

    public String getComplimentaryService() {
        return complimentaryService;
    }

    public void setComplimentaryService(String complimentaryService) {
        this.complimentaryService = complimentaryService;
    }

    @Override
    public String toString() {
        return "Room(" +
                super.toString() +
                ", complimentaryService : " + complimentaryService + "), times of using ";
    }

    public String writeToCSV(){
        return super.getServiceID() + "," + super.getServiceName() + "," + super.getUsableArea() + "," + super.getPrice() + "," +
                super.getCapacity() + "," + super.getTypeOfRenting() + "," + complimentaryService;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        return this.serviceID.equals(((Room) other).serviceID);
    }
}
