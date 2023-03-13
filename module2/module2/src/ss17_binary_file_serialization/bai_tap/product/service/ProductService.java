package ss17_binary_file_serialization.bai_tap.product.service;

import ss17_binary_file_serialization.bai_tap.product.model.Product;
import ss17_binary_file_serialization.bai_tap.product.repo.IProductRepo;
import ss17_binary_file_serialization.bai_tap.product.repo.ProductRepo;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private final IProductRepo iProductRepo  = new ProductRepo();
    public static final String PATH = "";

    @Override
    public void displayAll() {
        List<Product> products = iProductRepo.getAll();
        for (Product product : products){
            System.out.println(product);
        }
    }
    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn hập ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá tiền: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập nhà saản xuất:");
        String producer = scanner.nextLine();
        System.out.println("Mô tả về sản phẩm: ");
        String descrip = scanner.nextLine();
        Product newProduct = new Product(id, name, price, producer, descrip);
        List<Product> products = iProductRepo.getAll();
        products.add(newProduct);
        iProductRepo.add(PATH, products);
    }

    @Override
    public void find() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm mà bạn muốn tìm: ");
        int idProduct = Integer.parseInt(input.nextLine());
        List<Product> wanttedProduct = iProductRepo.find(idProduct);
        if(wanttedProduct.isEmpty()){
            System.out.println("Không tìm thấy sản phẩm!");
        }else {
            System.out.println(wanttedProduct);
        }
    }
}
