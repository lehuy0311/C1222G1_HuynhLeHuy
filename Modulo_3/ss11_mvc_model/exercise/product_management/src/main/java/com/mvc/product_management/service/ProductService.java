package com.mvc.product_management.service;

import com.mvc.product_management.model.Product;
import com.mvc.product_management.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService{
    private ProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> getProductList() {
        return productRepository.getProductList();
    }

    @Override
    public void addNewProduct(Product product) {
        productRepository.addNewProduct(product);
    }

    @Override
    public void updateProduct(int id, Product product) {
        productRepository.updateProduct(id, product);
    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteProduct(id);
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.getProductById(id);
    }

    @Override
    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }
}
