package ss10_list.fruit_management.controller;

import ss10_list.fruit_management.service.FruitService;
import ss10_list.fruit_management.service.IFruitService;

import java.util.Scanner;

public class FruitController {
    private IFruitService iFruitService = new FruitService();

    public void menuFruit() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----Menu----");
            System.out.println("1. Display list fruit");
            System.out.println("2. Add");
            System.out.println("3. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Display list fruit");
                    iFruitService.display();
                    break;
                case 2:
                    iFruitService.add();
                    break;
                case 3:
                    System.exit(0);
            }
        } while (true);

    }
}


