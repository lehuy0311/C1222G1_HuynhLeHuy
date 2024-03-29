package ss5_am;

public class Employee {

    // Tính bao đóng cho các thuộc tính được thể hiện qua AM là private
    private String name;
    private String phoneNumber;
    private String workingParts;

    //Đặt tên công ty là biến static để dùng chung cho tất cả dối tượng
    public static  String nameCompany = "ABC";
    public Employee(){
    }

    public Employee(String name, String phoneNumber, String workingParts, String nameCompany) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.workingParts = workingParts;
        this.nameCompany = nameCompany;
    }

    //Encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWorkingParts() {
        return workingParts;
    }

    public void setWorkingParts(String workingParts) {
        this.workingParts = workingParts;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", workingParts='" + workingParts + '\'' +
                ", nameCompany='" + nameCompany + '\'' +
                '}';
    }
}
