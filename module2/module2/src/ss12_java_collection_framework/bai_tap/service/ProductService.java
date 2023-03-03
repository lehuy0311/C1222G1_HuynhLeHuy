package ss12_java_collection_framework.bai_tap.service;


import ss10_list.bai_tap.bai_tap_them_1.model.Student;
import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.repo.IProductRepository;
import ss12_java_collection_framework.bai_tap.repo.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{
    private IProductRepository iProductRepository = new ProductRepository();


    @Override
    public void displayAll() {
        List<Product> productList = iProductRepository.getAll();
        if (productList.isEmpty()){
            System.out.println("Chưa có sản phẩm nào!");
        }else {
            for (Product product : productList){
                System.out.println(product.toString());
            }
        }
    }

    @Override
    public void addProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("ID: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Tên: ");
        String name = input.nextLine();
        System.out.println("Giá tiền: ");
        int price = Integer.parseInt(input.nextLine());

        Product newProduct = new Product(id, name, price);

        iProductRepository.addProduct(newProduct);
        System.out.println("Thêm thành công");

    }

    @Override
    public void deleteProduct() {

    }
}
