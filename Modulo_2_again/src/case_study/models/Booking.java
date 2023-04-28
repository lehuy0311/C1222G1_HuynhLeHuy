package case_study.models;

import case_study.utils.Utils;

import java.time.LocalDate;


public class Booking  implements Comparable{
    private String bookingID;
    private LocalDate startDate;
    private LocalDate endDate;
    private int customerID;
    private String serviceName;
    private String typeOfService;

    public Booking(String bookingID, LocalDate startDate, LocalDate endDate, int customerID, String serviceName, String typeOfService) {
        this.bookingID = bookingID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerID = customerID;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID = " + bookingID +
                ", startDate = " + Utils.parseLocalDateToString(startDate) +
                ", endDate = " + Utils.parseLocalDateToString(endDate) +
                ", customerID = " + customerID +
                ", serviceName = " + serviceName +
                ", typeOfService = " + typeOfService +
                '}';
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Booking) {
            return (this.bookingID.equals(((Booking) other).bookingID))
                && (this.startDate.equals(((Booking) other).startDate) || this.endDate.equals(((Booking) other).endDate));
        } else return false;
    }

    public String writeToCSV() {
        return bookingID + "," + Utils.parseLocalDateToString(startDate) + "," + Utils.parseLocalDateToString(endDate) + ","
                + customerID + "," + serviceName + "," + typeOfService;

    }


    @Override
    public int compareTo(Object o) {
        if (((Booking) o).startDate.isAfter(this.startDate)) {
            return -1;
        } else if (((Booking) o).startDate.isBefore(this.startDate)) {
            return 1;
        } else if(((Booking) o).startDate.isEqual(this.startDate)){
            return -1;
        } else return 0;

    }
}
