package ss10_list.fruit_management.repository;

import ss10_list.fruit_management.model.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitRepository implements IFruitRepository {
    public static final List<Fruit> fruitList = new ArrayList<>();

    static {
        fruitList.add(new Fruit("Quýt", "tạm", "01/01/2006", "01/01/2020", "Viet Nam", "Free"));
        fruitList.add(new Fruit("Cam", "ngon", "02/02/2000", "02/02/2020", "China", "10$"));
        fruitList.add(new Fruit("Bưởi", "tuyệt", "01/01/2000", "01/01/2023", "Japan", "20$"));
    }

    @Override
    public void display() {
        for (Fruit fruit : fruitList) {
            System.out.println(fruit.toString());
        }
    }

    @Override
    public void add(Fruit fruit) {
        fruitList.add(fruit);
    }
}