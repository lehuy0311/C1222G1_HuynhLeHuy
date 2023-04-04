package ss4_class_object;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setName("Huỳnh Lê Huy");
        doctor.setAge(22);
        doctor.setAddress("12 Tây Sơn");
        doctor.setEmail("lehuy0311@gmail.com");
        doctor.setPhoneNumber("0901962492");
        doctor.setPosition("CEO");

        System.out.println(doctor.toString());
    }
}
