package ProductManager.controller;

import ProductManager.service.IProductService;
import ProductManager.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static IProductService iProductService = new ProductService();

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("------Product Manager-----------");
            System.out.println("1.Display");
            System.out.println("2.Add");
            System.out.println("3.Delete");
            System.out.println("4.Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProductService.getAll();
                    break;
                case 2:
                    iProductService.add();
                    break;
                case 3:
                    iProductService.delete();
                    break;
            }
        } while (choice > 0 && choice < 4);

    }
}
