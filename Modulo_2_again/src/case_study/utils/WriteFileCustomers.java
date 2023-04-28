package case_study.utils;

import case_study.models.Customer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileCustomers {
    public static final String PATH = "src/case_study/data/customers.csv";

    public static void write(List<Customer> customers) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(PATH));
            for (Customer customer : customers) {
                bufferedWriter.write(customer.writeToCSV());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
