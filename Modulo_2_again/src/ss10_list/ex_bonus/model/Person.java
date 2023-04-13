package ss10_list.ex_bonus.model;

import java.util.Date;

public abstract class Person {
    private int ID;
    private String name;
    private String dob;
    private Boolean gender;

    public Person() {
    }

    public Person(int ID, String name, String dob, Boolean gender) {
        this.ID = ID;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Boolean isGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
}