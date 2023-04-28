package case_study.models;

import case_study.utils.Utils;

import java.time.LocalDate;

public class Employee extends Person{
    private int employeeID;
    private EducationBackground educationBackground;
    private Title title;
    private double salary;
    public Employee(){}

    public Employee(int ID, String name, LocalDate DOB, Boolean gender, String phoneNumber, String email,
                    int employeeID, EducationBackground educationBackground, Title title, double salary){
        super(ID, name, DOB, gender, phoneNumber, email);
        this.employeeID = employeeID;
        this.educationBackground = educationBackground;
        this.title = title;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public EducationBackground getEducationBackground() {
        return educationBackground;
    }

    public void setEducationBackground(EducationBackground educationBackground) {
        this.educationBackground = educationBackground;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                ", employeeID=" + employeeID +
                ", educationBackground=" + educationBackground +
                ", title=" + title +
                ", salary=" + salary +
                '}';
    }

    public String writeToCSV(){
        return super.getID() + "," + super.getName() + "," + Utils.parseLocalDateToString(super.getDOB()) + "," + super.getGender() + "," +
                super.getPhoneNumber() + "," + super.getEmail() + "," +
                employeeID + "," + educationBackground + "," + title + "," + salary;
    }


}

