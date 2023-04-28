package case_study.common.read_file;

import case_study.model.Customer;
import ss10_list.ex_bonus.repository.implement.StudentRepository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadCustomer {
    public static final String CUSTOMER_FILE_PATH ="";
    public static List<Customer> readCustomer(){
        List<Customer> customerList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(CUSTOMER_FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")){
                String[] temp = line.split(",");
                Customer customer = new Customer(Integer.parseInt(temp[0]), temp[1], LocalDate.parse(temp[2]), Boolean.parseBoolean(temp[3]), Long.parseLong(temp[4]), temp[5], temp[6], temp[7], temp[8]);
                customerList.add(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return customerList;
    }

}
