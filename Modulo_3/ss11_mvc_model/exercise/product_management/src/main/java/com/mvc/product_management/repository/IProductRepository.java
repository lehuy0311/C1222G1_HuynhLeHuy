package com.mvc.product_management.repository;

import com.mvc.product_management.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getProductList();
    void addNewProduct(Product product);
    void updateProduct(int id, Product product);
    void deleteProduct(int id);
    Product getProductById(int id);
    List<Product> findByName(String name);

}
