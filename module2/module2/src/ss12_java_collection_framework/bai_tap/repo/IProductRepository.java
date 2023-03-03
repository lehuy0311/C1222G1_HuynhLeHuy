package ss12_java_collection_framework.bai_tap.repo;

import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();
    void addProduct(Product Product);
    void deleteProduct(Product product);
}
