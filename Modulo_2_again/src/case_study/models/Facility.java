package case_study.models;

public abstract class Facility {
    public String serviceID;
    public String serviceName;
    public double usableArea;
    public double price;
    public int capacity;
    public TypeOfRenting TypeOfRenting;

    public Facility(){}



    public Facility(String serviceID, String serviceName, double usableArea, double price, int capacity, case_study.models.TypeOfRenting typeOfRenting) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.price = price;
        this.capacity = capacity;
        TypeOfRenting = typeOfRenting;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public case_study.models.TypeOfRenting getTypeOfRenting() {
        return TypeOfRenting;
    }

    public void setTypeOfRenting(case_study.models.TypeOfRenting typeOfRenting) {
        TypeOfRenting = typeOfRenting;
    }

    @Override
    public String toString() {
        return "serviceID : " + serviceID +
                ", serviceName : " + serviceName +
                ", usableArea : " + usableArea +
                ", price : " + price +
                ", capacity : " + capacity +
                ", TypeOfRenting : " + TypeOfRenting;
    }



}


