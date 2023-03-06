package ss12_java_collection_framework.bai_tap.service;


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
        List<Product> list = iProductRepository.getAll();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id của sản phẩm cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : list){
            if (product.getId() == id){
                System.out.println("Bạn có chắc muốn xóa sản phẩm không? \n"+
                        "1.Có \n" + "2.Không");
                int number = Integer.parseInt(scanner.nextLine());
                if(number == 1){
                    iProductRepository.deleteProduct(product);
                    System.out.println("Xóa thành công");
                }else if (number == 2){
                    System.out.println("Không muốn xóa thì out");
                }
            }
            return;
        }
        System.out.println("Không có sản phẩm muốn xóa");
    }

    @Override
    public void editProduct() {
        List<Product> list = iProductRepository.getAll();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào id sản phẩm bạn muốn chỉnh sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        iProductRepository.editProduct(id);
        for (Product product : list){
            if (product.getId() == id){
                System.out.println("Nhập tên mới của sản phẩm: ");
                String newName = scanner.nextLine();
                product.setName(newName);
                System.out.println("Nhập giá tiền mới của sản phẩm: ");
                int newPrice = Integer.parseInt(scanner.nextLine());
                product.setPrice(newPrice);
                System.out.println("Chỉnh sửa thành công!");
                return;
            }
        }
        System.out.println("Không tồn tại sản phẩm này");
    }

    @Override
    public void findProduct() {
        List<Product> list = iProductRepository.getAll();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id của sản phẩm cần tìm: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : list){
            if (product.getId() == id){
                System.out.println(product);
            }else {
                System.out.println("Không có sản phẩm cần tìm");
            }
            return;
        }
    }
}
