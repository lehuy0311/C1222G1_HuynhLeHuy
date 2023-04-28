package case_study.models;

public class Contract {
    private int contractID;
    private String bookingID;
    private int customerID;
    private double deposit;
    private double total;

    public Contract(int contractID, String bookingID, int customerID, double deposit, double total) {
        this.contractID = contractID;
        this.bookingID = bookingID;
        this.customerID = customerID;
        this.deposit = deposit;
        this.total = total;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractID=" + contractID +
                ", bookingID=" + bookingID +
                ", customerID=" + customerID +
                ", deposit=" + deposit +
                ", total=" + total +
                '}';
    }

    public String writeToCSV(){
        return contractID + "," + bookingID + "," + customerID + "," + deposit + "," + total;
    }
}
