package ss17_binary_file_serialization.bai_tap.product.repo;

import ss16_io_text.bai_tap.read_file.ReadFile;
import ss17_binary_file_serialization.bai_tap.product.model.Product;

import java.util.List;

public class ProductRepo implements IProductRepo {
    public static final String PATH = "";

    @Override
    public List<Product> getAll() {
        return ReadFile.read(PATH);
    }

    @Override
    public void add(String path, List<Product> products) {
        WriteFile.write(path, products);
    }

    @Override
    public List<Product> find(int id) {
        List<Product> products = ReadFile.read(PATH);

    }
    return
}
