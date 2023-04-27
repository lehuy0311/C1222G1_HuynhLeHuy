package case_study.model;

public class House extends Facility{
    private String standarRoom;
    private int floor;
    public House(){
    }

    public House(int idService, String nameService, double areaUse, int price, int rentalPeopleMax, String styleRental, String standarRoom, int floor) {
        super(idService, nameService, areaUse, price, rentalPeopleMax, styleRental);
        this.standarRoom = standarRoom;
        this.floor = floor;
    }

    public String getStandarRoom() {
        return standarRoom;
    }

    public void setStandarRoom(String standarRoom) {
        this.standarRoom = standarRoom;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "standarRoom='" + standarRoom + '\'' +
                ", floor=" + floor +
                '}';
    }
}
