package ProductManager.common;

import ProductManager.model.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static final String PATH ="src/ProductManager/data/Product.csv";
    public static List<Product> read(){
        List<Product> productList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line ="";
            while ((line = bufferedReader.readLine()) != null){
                String[] temp = line.split(",");
                Product product = new Product(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3]);
                productList.add(product);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productList;
    }
}
