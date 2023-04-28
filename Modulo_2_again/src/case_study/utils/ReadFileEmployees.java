package case_study.utils;

import case_study.models.EducationBackground;
import case_study.models.Employee;
import case_study.models.Title;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileEmployees {
    private static final String PATH = "src/case_study/data/employee.csv";

    public static List<Employee> read() {

        List<Employee> employees = new ArrayList<>();
        String line = "";
        BufferedReader bufferedReader = null;
        String[] temp;
        Employee employee;
        File file = new File(PATH);
        if (file.length() == 0) {
            return employees;
        } else {
            try {
                bufferedReader = new BufferedReader(new FileReader(PATH));
                while ((line = bufferedReader.readLine()) != null) {
                    temp = line.split(",");
                    employee = new Employee(Integer.parseInt(temp[0]), temp[1], Utils.parseStringToLocalDate(temp[2]), Boolean.parseBoolean(temp[3]),
                            temp[4], temp[5], Integer.parseInt(temp[6]),
                            Enum.valueOf(EducationBackground.class, temp[7]),
                            Enum.valueOf(Title.class, temp[8]), Double.parseDouble(temp[9]));
                    employees.add(employee);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return employees;
        }
    }
}
