package ss17_binary_file_serialization.bai_tap.product.common;

import ss17_binary_file_serialization.bai_tap.product.model.Product;

import java.io.*;
import java.util.List;

public class WriteFile {
    public static void write(String path, List<Product> products){
       try {
           FileOutputStream fileOutputStream = new FileOutputStream(path);
           ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
           objectOutputStream.writeObject(products);
           objectOutputStream.close();
           fileOutputStream.close();
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}
