package more_again.models;

public class Customer extends Person{
    private String type;
    private String address;

    public Customer(int id, String name, String dateOfBirth,
                    Boolean gender, String soCmnd, String phone,
                    String email, String type, String address) {
        super(id, name, dateOfBirth, gender, soCmnd, phone, email);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String wriToCsv(){
        return super.writeToCsv() + "," + type + "," + address;
    }
}
