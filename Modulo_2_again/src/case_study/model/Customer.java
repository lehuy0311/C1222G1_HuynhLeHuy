package case_study.model;

import java.time.LocalDate;

public class Customer extends Person {
    private String typeOfCustomer;
    private String address;

    public Customer(int id, String name, LocalDate dayOfBirth,
                    Boolean gender, long identity, String phoneNumber,
                    String email, String typeOfCustomer, String address) {
        super(id, name, dayOfBirth, gender,identity, phoneNumber, email);
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }
    public Customer(){
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String writeToCSV(){
        return super.getId()+","+super.getName()+","+super.getDayOfBirth()+","
                +super.getGender()+","+super.getIdentity()+","+super.getPhoneNumber()+","
                +super.getEmail()+","+this.getTypeOfCustomer()+","+this.getAddress();
    }
}
