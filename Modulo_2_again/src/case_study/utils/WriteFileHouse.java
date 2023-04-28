package case_study.utils;

import case_study.models.House;

import java.io.*;
import java.util.Map;

public class WriteFileHouse {
    private static final String PATH = "src/case_study/data/house.csv";

    public static void write(Map<House, Integer> houses){
        BufferedWriter bufferedWriter = null;

        try{
            bufferedWriter = new BufferedWriter(new FileWriter(PATH));
            for (Map.Entry<House, Integer> entry : houses.entrySet()) {
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