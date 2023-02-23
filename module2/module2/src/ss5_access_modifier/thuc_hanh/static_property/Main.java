package ss5_access_modifier.thuc_hanh.static_property;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazada 3", "Huy 3" );
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Victor 6", "Hoang 6");
        System.out.println(Car.numberOfCars);
    }
}
