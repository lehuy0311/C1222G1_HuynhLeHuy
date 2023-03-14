package ss17_binary_file_serialization.bai_tap.product.common;

import ss17_binary_file_serialization.bai_tap.product.model.Product;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Product> products = new ArrayList<>();

    public static List<Product> read(String path){
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
        }catch (EOFException e){
            WriteFile.write(path, products);
        }catch (Exception e){
            e.printStackTrace();
        }
        return products;
    }

}
