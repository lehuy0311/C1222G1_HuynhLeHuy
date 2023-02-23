package ss5_access_modifier.bai_tap.write_only_class;

public class Student {
    private String name = "Huy";
    private String classes = "19TCLC_JP1";
    public Student(){
    }

//    public Student(String name, String classes) {
//        this.name = name;
//        this.classes = classes;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
