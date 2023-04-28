package more_again.models;

public class Employee extends Person{

    private String prof;
    private String level;
    private String salary;

    public Employee(){
    }

    public Employee(int id, String name, String dateOfBirth,
                    Boolean gender, String soCmnd, String phone, String email,
                    String prof, String level, String salary) {
        super(id, name, dateOfBirth, gender, soCmnd, phone, email);
        this.prof = prof;
        this.level = level;
        this.salary = salary;
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+
                "prof='" + prof + '\'' +
                ", level='" + level + '\'' +
                ", salary=" + salary +
                '}';
    }
    public String writeToCsv(){
        return super.writeToCsv() + "," + prof + "," + level + "," + salary;
    }
}
