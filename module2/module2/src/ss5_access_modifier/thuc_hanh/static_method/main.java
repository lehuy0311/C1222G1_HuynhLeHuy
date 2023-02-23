package ss5_access_modifier.thuc_hanh.static_method;

public class main {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(102, "Chuong");
        Student s2 = new Student(190, "Bao");
        Student s3 = new Student(316, "Hieu");

        s1.display();
        s2.display();
        s3.display();
    }
}
