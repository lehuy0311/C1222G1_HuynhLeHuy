package ss10_list.fruit_management.service;

import ss10_list.fruit_management.model.Fruit;
import ss10_list.fruit_management.repository.FruitRepository;

import java.util.Scanner;

public class FruitService implements IFruitService {
    FruitRepository fruitRepository = new FruitRepository();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        fruitRepository.display();
    }

    @Override
    public void add() {
        System.out.println("Add fruit");
        System.out.println("Inpur name: ");
        String name = scanner.nextLine();
        System.out.println("Input type: ");
        String type = scanner.nextLine();
        System.out.println("Input date Product: ");
        String dateProduct = scanner.nextLine();
        System.out.println("Input expiry: ");
        String expiry = scanner.nextLine();
        System.out.println("Source: ");
        String source = scanner.nextLine();
        System.out.println("Input price: ");
        String price = scanner.nextLine();
        Fruit fruit1 = new Fruit(name, type, dateProduct, expiry, source, price);
        fruitRepository.add(fruit1);
    }
}