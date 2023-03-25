package ProductManager.service;

import ProductManager.model.Product;
import ProductManager.repository.IProductRepository;
import ProductManager.repository.ProductRepository;

import javax.jws.Oneway;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{
    private static Scanner scanner = new Scanner(System.in);
    private static IProductRepository iProductRepository = new ProductRepository();
    @Override
    public void getAll() {
        List<Product> list = iProductRepository.display();
        for (Product element : list){
            System.out.println(element);
        }
    }

    @Override
    public void add() {
        List<Product> products = iProductRepository.display();
        System.out.println("Id sp");
        int id = Integer.parseInt(scanner.nextLine());
        if (check(id) == false){
            System.out.println("Name sp");
            String name = scanner.nextLine();
            System.out.println("Price sp");
            String price = scanner.nextLine();
            System.out.println("Date sp");
            String date = scanner.nextLine();
            Product product = new Product(id, name, price, date);
            products.add(product);
            iProductRepository.add( products);
            System.out.println("Add success");
        }else {
            System.out.println("ID exist");
        }
    }

    @Override
    public void delete() {
        List<Product> productList = iProductRepository.display();
        System.out.println("ID sp");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i =0; i < productList.size(); i++){
            if(productList.get(i).getId() == (id)){
                iProductRepository.delete(i);
                System.out.println("Delete success");
                return;
            }else {
                System.out.println("Id not exist");
            }
        }

    }

    public boolean check(int id){
        List<Product> list = iProductRepository.display();
        for (Product element : list){
            if(element.getId() == id){
                return true;
            }
        }
        return false;
    }
}
