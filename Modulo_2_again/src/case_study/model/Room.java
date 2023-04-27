package case_study.model;

public class Room extends Facility {
    private String servicePlus;

    public Room() {
    }

    public Room(int idService, String nameService, double areaUse, int price, int rentalPeopleMax, String styleRental, String servicePlus) {
        super(idService, nameService, areaUse, price, rentalPeopleMax, styleRental);
        this.servicePlus = servicePlus;
    }

    public String getServicePlus() {
        return servicePlus;
    }

    public void setServicePlus(String servicePlus) {
        this.servicePlus = servicePlus;
    }

    @Override
    public String toString() {
        return "Room{" +
                "servicePlus='" + servicePlus + '\'' +
                '}';
    }
}
