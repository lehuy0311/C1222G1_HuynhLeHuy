package more_again.common;

import more_again.models.Customer;
import more_again.models.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFilePerson {
    public static List<Employee> readEmployee(String path) {
        List<Employee> employeeList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader= new BufferedReader(new FileReader(path));
            String temp;
            if (bufferedReader.readLine() != null){
                while ((temp = bufferedReader.readLine()) != null){
                    String[] tempArr;
                    tempArr = temp.split(",");
                    employeeList.add(new Employee(Integer.parseInt(tempArr[0]), tempArr[1], tempArr[2],
                            Boolean.parseBoolean(tempArr[3]), tempArr[4], tempArr[5],
                            tempArr[6], tempArr[7], tempArr[8], tempArr[9]));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return employeeList;
    }

    public static List<Customer> readCustomer(String path) {
        List<Customer> customerList  = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader= new BufferedReader(new FileReader(path));
            String temp;
            if (bufferedReader.readLine() != null){
                while ((temp = bufferedReader.readLine()) != null){
                    String[] tempArr;
                    tempArr = temp.split(",");
                    customerList.add(new Customer(Integer.parseInt(tempArr[0]), tempArr[1],
                            tempArr[2], Boolean.parseBoolean(tempArr[3]), tempArr[4],
                            tempArr[5], tempArr[6], tempArr[7], tempArr[8]));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return customerList;
    }
}
