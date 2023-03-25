package ProductManager.repository;

import ProductManager.common.ReadFile;
import ProductManager.common.WriteFile;
import ProductManager.model.Product;

import java.util.List;

public class ProductRepository implements IProductRepository{
    @Override
    public List<Product> display() {
        return ReadFile.read();
    }

    @Override
    public void add(List<Product> list) {
        WriteFile.write(list);
    }

    @Override
    public void delete(int i) {
        List<Product> products = display();
        products.remove(i);
        WriteFile.write(products);

    }
}
