package ProductManager.repository;

import ProductManager.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> display();
    void add( List<Product> list);
    void delete(int i);
}
