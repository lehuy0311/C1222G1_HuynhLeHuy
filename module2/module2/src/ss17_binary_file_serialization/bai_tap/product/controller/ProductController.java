package ss17_binary_file_serialization.bai_tap.product.controller;

import java.util.Scanner;

public class ProductController {
    private IProductService iProductService = new ProductService();

    public void menuOfProducts() {
        String choice;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("==========================================================");
            System.out.println("--PRODUCT MANAGEMENT--");
            System.out.println("Choose a number to run its function");
            System.out.println("1. Add a new product");
            System.out.println("2. Display product's list");
            System.out.println("3. Find Products");
            System.out.println("4. Exit");
            System.out.println("Enter a number: ");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    iProductService.add();
                    break;
                case "2":
                    iProductService.displayAll();
                    break;
                case "3":
                    iProductService.find();
                    break;
                case "4":
                    return;
            }
        } while (!choice.equals("4"));
    }
}
