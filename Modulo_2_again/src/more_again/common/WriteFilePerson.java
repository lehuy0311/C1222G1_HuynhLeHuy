package more_again.common;

import more_again.models.Customer;
import more_again.models.Employee;

import java.io.*;

public class WriteFilePerson {
    public static void writeEmployee(String path, Employee employee){
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            bufferedWriter.write(employee.writeToCsv());
            bufferedWriter.newLine();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static void writeCustomer(String path, Customer customer){
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            bufferedWriter.write(customer.wriToCsv());
            bufferedWriter.newLine();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                bufferedWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
