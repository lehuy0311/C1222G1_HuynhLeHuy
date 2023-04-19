package work_management.model;

public class Target implements Comparable<Target> {
    private int id;
    private String name;
    private String date;
    private String money;
    private String description;

    public Target(){
    }

    public Target(int id, String name, String date, String money, String description) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.money = money;
        this.description = description;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Target{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", money='" + money + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int compareTo(Target o) {
        return this.getName().compareTo(o.getName());
    }
    public String writeToCsv(){
        return id + "," + name + "," + date + "," + money + "," + description;
    }
}
