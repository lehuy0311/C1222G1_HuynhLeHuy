package ss12_java_collection_framework.bai_tap.controller;



import ss12_java_collection_framework.bai_tap.service.IProductService;
import ss12_java_collection_framework.bai_tap.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private IProductService iProductService = new ProductService();

    public void menuProduct() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---------------------------------------------");
            System.out.println("Mời bạn chọn chức năng");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm sản phẩm ");
            System.out.println("3. Chỉnh sửa thông tin sản phẩm theo id");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Sắp xếp theo thứ tự tăng dần");
            System.out.println("6. Sắp xếp theo thứ tự giảm dần");
            System.out.print("Mời bạn chọn ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProductService.displayAll();
                    break;
                case 2:
                    iProductService.addProduct();
                    break;
                case 3:
                    //iProductService.editProduct();
                    break;
                case 4:
                    iProductService.deleteProduct();
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        } while (choice >= 1 || choice <= 6);

    }
}
