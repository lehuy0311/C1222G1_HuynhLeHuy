package case_study.model;

public class Facility {
    private int idService;
    private String nameService;
    private double areaUse;
    private int price;
    private int rentalPeopleMax;
    private String styleRental;
    public Facility(){
    }

    public Facility(int idService, String nameService, double areaUse, int price, int rentalPeopleMax, String styleRental) {
        this.idService = idService;
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.price = price;
        this.rentalPeopleMax = rentalPeopleMax;
        this.styleRental = styleRental;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRentalPeopleMax() {
        return rentalPeopleMax;
    }

    public void setRentalPeopleMax(int rentalPeopleMax) {
        this.rentalPeopleMax = rentalPeopleMax;
    }

    public String getStyleRental() {
        return styleRental;
    }

    public void setStyleRental(String styleRental) {
        this.styleRental = styleRental;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idService=" + idService +
                ", nameService='" + nameService + '\'' +
                ", areaUse=" + areaUse +
                ", price=" + price +
                ", rentalPeopleMax=" + rentalPeopleMax +
                ", styleRental='" + styleRental + '\'' +
                '}';
    }
}
