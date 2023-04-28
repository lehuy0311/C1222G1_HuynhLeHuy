package case_study.utils;

import case_study.models.Contract;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileContract {
    private static final String PATH = "src/case_study/data/contract.csv";

    public static List<Contract> read(){
        List<Contract> contracts = new ArrayList<>();
        String line;
        Contract contract;
        String[] temp;
        BufferedReader bufferedReader = null;
        File file = new File(PATH);
        if(file.length() == 0) return contracts;
        else {
            try{
                bufferedReader = new BufferedReader(new FileReader(PATH));
                while ((line = bufferedReader.readLine()) != null){
                    temp = line.split(",");
                    contract =  new Contract(Integer.parseInt(temp[0]), temp[1], Integer.parseInt(temp[2]),
                           Double.parseDouble(temp[3]), Double.parseDouble(temp[4]));
                    contracts.add(contract);
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
            return contracts;
        }
    }
}
