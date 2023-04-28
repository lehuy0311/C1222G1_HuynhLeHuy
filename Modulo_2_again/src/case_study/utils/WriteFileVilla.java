package case_study.utils;

import case_study.models.Villa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteFileVilla {
    private static final String PATH = "src/case_study/data/villa.csv";

    public static void write(Map<Villa, Integer> villas){
        BufferedWriter bufferedWriter = null;

        try{
            bufferedWriter = new BufferedWriter(new FileWriter(PATH));
            for (Map.Entry<Villa, Integer> entry : villas.entrySet()) {
                bufferedWriter.write(entry.getKey().writeToCSV() + "," + entry.getValue());
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
