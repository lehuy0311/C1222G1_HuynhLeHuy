package electric_management.common;

import electric_management.model.Bill;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static final String BILL_FILE_PATH ="src/electric_management/data/Bill.csv";
    public static List<Bill> readFile(){
        List<Bill> billList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(BILL_FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line ="";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")){
                String[] temp = line.split(",");
                Bill bill = new Bill(temp[0], temp[1],temp[2],Double.parseDouble(temp[4]));
                billList.add(bill);
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
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return billList;
    }
}
