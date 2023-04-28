package case_study.models;

import java.util.Objects;

public class House extends Facility{
    private String roomStandard;
    private int numOfFloors;

    public House(String serviceID,
                 String serviceName,
                 double usableArea,
                 double price,
                 int capacity,
                 case_study.models.TypeOfRenting typeOfRenting,
                 String roomStandard,
                 int numOfFloors){
        super(serviceID, serviceName, usableArea, price, capacity, typeOfRenting);
        this.roomStandard = roomStandard;
        this.numOfFloors = numOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    public String toString() {
        return "House(" +
                super.toString() +
                ", roomStandard : " + roomStandard +
                ", numOfFloors : " + numOfFloors + "), times of using ";
    }

    public String writeToCSV(){
        return super.getServiceID() + "," + super.getServiceName() + "," + super.getUsableArea() + "," + super.getPrice() + "," +
                super.getCapacity() + "," + super.getTypeOfRenting() + "," + roomStandard + "," + numOfFloors;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        return this.serviceID.equals(((House) other).serviceID);
    }
}
