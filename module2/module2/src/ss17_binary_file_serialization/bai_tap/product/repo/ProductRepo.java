package ss17_binary_file_serialization.bai_tap.product.repo;

import ss17_binary_file_serialization.bai_tap.product.common.ReadFile;
import ss17_binary_file_serialization.bai_tap.product.common.WriteFile;
import ss17_binary_file_serialization.bai_tap.product.model.Product;
import ss17_binary_file_serialization.bai_tap.product.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo implements IProductRepo {
    public static final String PATH = "src/ss17_binary_file_serialization/bai_tap/product/data/FileProduct.txt";

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
        List<Product> wanttedProduct = new ArrayList<>();
        for (int i =0; i < products.size(); i++) {
            if (products.get(i).getId() == id){
                wanttedProduct.add(products.get(i));
            }
        }
        return wanttedProduct;
    }

}
