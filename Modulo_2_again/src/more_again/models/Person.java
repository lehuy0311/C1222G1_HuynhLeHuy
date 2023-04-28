package more_again.models;

import java.time.LocalDate;

public class Person {
    private int id;
    private String name;
    private String dateOfBirth;
    private Boolean gender;
    private String soCmnd;
    private String phone;
    private String email;

    public Person() {
    }

    public Person(int id, String name, String dateOfBirth, Boolean gender,
                  String soCmnd, String phone, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.soCmnd = soCmnd;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getSoCmnd() {
        return soCmnd;
    }

    public void setSoCmnd(String soCmnd) {
        this.soCmnd = soCmnd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender=" + gender +
                ", soCmnd='" + soCmnd + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public String writeToCsv(){
        return id + "," + name + "," + dateOfBirth + "," + gender + "," + soCmnd + "," + phone + "," + email;
    }
}
