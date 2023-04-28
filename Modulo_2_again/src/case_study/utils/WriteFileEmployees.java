package case_study.utils;

import case_study.models.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileEmployees {
    private static final String PATH = "src/case_study/data/employee.csv";
    public static void write(List<Employee> employees){
        BufferedWriter bufferedWriter = null;

        try{
            bufferedWriter = new BufferedWriter(new FileWriter(PATH));
            for (Employee employee: employees) {
                bufferedWriter.write(employee.writeToCSV());
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
