package case_study.models;

import case_study.utils.Utils;

import java.time.LocalDate;
import java.util.Date;

public abstract class Person {
    private int ID;
    private String name;
    private LocalDate DOB;
    private Boolean gender;
    private String phoneNumber;
    private String email;
    public Person(){

    }

    public Person(int ID, String name, LocalDate DOB, Boolean gender, String phoneNumber, String email){
        this.ID = ID;
        this.name = name;
        this.DOB = DOB;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID=" + ID +
                ", name='" + name + '\'' +
                ", DOB='" + Utils.parseLocalDateToString(DOB) + '\'' +
                ", gender=" + gender +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'';
    }
}
