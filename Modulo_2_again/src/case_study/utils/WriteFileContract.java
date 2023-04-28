package case_study.utils;

import case_study.models.Contract;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteFileContract {
    private static final String PATH = "src/case_study/data/contract.csv";

    public static void write(List<Contract> contracts){
        BufferedWriter bufferedWriter = null;

        try{
            bufferedWriter = new BufferedWriter(new FileWriter(PATH));
            for (Contract contract: contracts) {
                bufferedWriter.write(contract.writeToCSV());
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
