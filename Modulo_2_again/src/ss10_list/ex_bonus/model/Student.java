package ss10_list.ex_bonus.model;

public class Student extends Person {
    private String classes;

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    private double grade;

    public Student(String classes, double grade, int ID, String name, Boolean gender, String dob){
        super(ID, name, dob, gender);
        this.classes = classes;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student(" +
                " name = " + getName() +
                ", classes = '" + classes + '\'' +
                ", DOB = " + getDob() +
                ", ID = " + getID() +
                ", grade = " + grade +
                ", gender = " + isGender() +
                ')';
    }
}