package case_study.utils;

import case_study.models.Customer;
import case_study.models.CustomerType;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadFileCustomers {
    public static final String PATH = "src/case_study/data/customers.csv";

    public static List<Customer> read(){
        List<Customer> customers = new LinkedList<>();
        Customer customer;
        String[] temp;
        String line = "";
        BufferedReader bufferedReader = null;
        File file = new File(PATH);
        if(file.length() == 0){
            return customers;
        } else {
            try{
                bufferedReader = new BufferedReader(new FileReader(PATH));
                while ((line = bufferedReader.readLine()) != null){
                    temp = line.split(",");
                    customer = new Customer(Integer.parseInt(temp[0]), temp[1], Utils.parseStringToLocalDate(temp[2]),
                            Boolean.parseBoolean(temp[3]), temp[4], temp[5],
                            Integer.parseInt(temp[6]), temp[7], Enum.valueOf(CustomerType.class, temp[8]));
                    customers.add(customer);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return customers;
        }
    }
}
