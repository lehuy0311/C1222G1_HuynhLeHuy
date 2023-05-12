package mvc.model;

public class Bug {
    private String id;
    private String name;
    private String description;
    private String time;
    private String angry;

    public Bug(String id, String name, String description, String time, String angry) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.time = time;
        this.angry = angry;
    }
    public Bug(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAngry() {
        return angry;
    }

    public void setAngry(String angry) {
        this.angry = angry;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", time='" + time + '\'' +
                ", angry='" + angry + '\'' +
                '}';
    }
    public String writeToCsv(){
        return id+","+name+","+description+","+time+","+angry;
    }
}
