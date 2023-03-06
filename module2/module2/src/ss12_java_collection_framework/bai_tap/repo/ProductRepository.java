package ss12_java_collection_framework.bai_tap.repo;

import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {

    private static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1 ,"Truyện",10000));
        productList.add(new Product(2 ,"Bút",10000));
        productList.add(new Product(3 ,"Vở",10000));

    }
    private Scanner scanner = new Scanner(System.in);
    @Override
    public List<Product> getAll() {
        return productList;
    }
    public void addProduct(Product product){
        productList.add(product);
    }
    public void deleteProduct(Product product){
        productList.remove(product);
    }
    public void findProduct(int id){
    }
    public void findProduct(){

    }

    @Override
    public void editProduct(int id) {
        productList.contains(id);
    }

}
