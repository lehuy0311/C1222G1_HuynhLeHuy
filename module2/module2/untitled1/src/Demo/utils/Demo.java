package Demo.utils;

public class Demo {
    private String id;
    private String name;

    public Demo(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String writeToCsv(){
        return id+","+name;
    }
}
