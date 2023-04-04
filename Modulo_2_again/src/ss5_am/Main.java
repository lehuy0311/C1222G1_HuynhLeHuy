package ss5_am;

public class Main {
    public static void main(String[] args) {
        Employee newEmployee = new Employee();

        newEmployee.setName("Huỳnh Lê Huy");
        newEmployee.setPhoneNumber("0901962492");
        newEmployee.setWorkingParts("CEO");

        System.out.println(newEmployee.toString());
    }
}
