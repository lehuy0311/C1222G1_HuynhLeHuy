package ss17_binary_file_serialization.bai_tap.product.controller;

import ss17_binary_file_serialization.bai_tap.product.service.ProductService;
import ss17_binary_file_serialization.bai_tap.product.service.IProductService;



import java.util.Scanner;

public class ProductController {
    private IProductService iProductService = new ProductService();

    public void menuOfProducts() {
        String choice;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("--Quản lí sản phẩm--");
            System.out.println("1. Hiển thị sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Tìm sản phẩm theo id");
            System.out.println("4. Thoát");
            System.out.println("Chọn lựa chọn bạn muốn ");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    iProductService.displayAll();
                    break;
                case "2":
                    iProductService.add();
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
