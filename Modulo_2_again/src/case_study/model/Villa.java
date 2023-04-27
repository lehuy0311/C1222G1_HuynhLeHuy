package case_study.model;

public class Villa extends Facility{
    private String standardVilla;
    private double areaPool;
    private int floor;

    public Villa(int idService, String nameService, double areaUse, int price, int rentalPeopleMax, String styleRental, String standardVilla, double areaPool, int floor) {
        super(idService, nameService, areaUse, price, rentalPeopleMax, styleRental);
        this.standardVilla = standardVilla;
        this.areaPool = areaPool;
        this.floor = floor;
    }
}
