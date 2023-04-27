package case_study.model;

import java.time.LocalDate;

public class Employee extends Person {
    private String prof;
    private String level;
    private int payment;
    public Employee(){
    }

    public Employee(int id, String name, LocalDate dayOfBirth, Boolean gender, long identity, String phoneNumber, String email, String prof, String level, int payment) {
        super(id, name, dayOfBirth, gender, identity, phoneNumber, email);
        this.prof = prof;
        this.level = level;
        this.payment = payment;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "prof='" + prof + '\'' +
                ", level='" + level + '\'' +
                ", payment=" + payment +
                '}';
    }
    public String writeToCSV(){
        return super.getId()+","+super.getName()+","+super.getDayOfBirth()+","
                +super.getGender()+","+super.getIdentity()+","+super.getPhoneNumber()+","
                +super.getEmail()+","+this.getProf()+","+this.getLevel()+","+this.getPayment();
    }

}
