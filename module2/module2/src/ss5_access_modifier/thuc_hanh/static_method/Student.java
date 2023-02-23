package ss5_access_modifier.thuc_hanh.static_method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    static void change(){
        college ="CodeGym";
    }

    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
