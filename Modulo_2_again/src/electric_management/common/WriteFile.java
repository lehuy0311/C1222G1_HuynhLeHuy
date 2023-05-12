package electric_management.common;

import electric_management.model.Bill;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    public static final String BILL_FILE_PATH ="src/electric_management/data/Bill.csv";
    public static void writeFile(List<Bill> billList){
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(BILL_FILE_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Bill bill: billList){
                bufferedWriter.write(bill.writeToCsv());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
