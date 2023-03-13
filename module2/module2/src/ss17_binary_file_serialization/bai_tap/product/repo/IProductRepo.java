package ss17_binary_file_serialization.bai_tap.product.repo;

import ss17_binary_file_serialization.bai_tap.product.model.Product;
import ss16_io_text.bai_tap.read_file.ReadFile;


import java.util.List;

public interface IProductRepo {
    List<Product> getAll();
    void add(String path, List<Product> products);

    List<Product> find(int id);
}
