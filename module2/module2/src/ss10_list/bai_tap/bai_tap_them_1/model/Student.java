package ss10_list.bai_tap.bai_tap_them_1.model;

public class Student extends Person {
    private String classes;
    private double score;

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student() {
    }
    public Student(int id, String name, String dateOfBirth, Boolean gender, String classes, double score) {
        super(id, name, dateOfBirth, gender);
        this.classes = classes;
        this.score = score;
    }


}
