package case_study.models;

import case_study.utils.Utils;

import java.time.LocalDate;

public class Customer extends Person{
    private int customerID;
    private String address;
    private CustomerType customerType;

    public Customer(int ID, String name, LocalDate DOB, Boolean gender, String phoneNumber, String email,
                    int customerID, String address, CustomerType customerType){
        super(ID, name, DOB, gender, phoneNumber, email);
        this.customerID = customerID;
        this.address = address;
        this.customerType = customerType;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }


    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                ", customerID=" + customerID +
                ", address='" + address + '\'' +
                ", customerType=" + customerType +
                '}';
    }

    public String writeToCSV(){
        return super.getID() + "," + super.getName() + "," + Utils.parseLocalDateToString(super.getDOB()) + "," + super.getGender() + "," +
                super.getPhoneNumber() + "," + super.getEmail() + "," +
                customerID + "," + address + "," + customerType;
    }
}


