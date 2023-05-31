package com.mvc.product_management.repository;

import com.mvc.product_management.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private static List<Product> productList;
    static {
        productList = new ArrayList<>();
        productList.add(new Product(1,"Note","vip", "2000000"));
        productList.add(new Product(2,"Book","old", "2000000"));
        productList.add(new Product(3,"Laptop","vip", "20000000"));
        productList.add(new Product(4,"Pen","new", "200000"));
    }
    @Override
    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public void addNewProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void updateProduct(int id, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.set(i, product);
            }
        }
    }

    @Override
    public void deleteProduct(int id) {
        for (Product product1 : productList){
            if (product1.getId() == id){
                productList.remove(product1);
            }
        }
    }

    @Override
    public Product getProductById(int id) {
        for (Product product1 : productList){
            if (product1.getId() == id){
                return product1;
            }
        }
        return null;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> products = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().equals(name)){
                products.add(product);
            }
        }
        return products;
    }
}
