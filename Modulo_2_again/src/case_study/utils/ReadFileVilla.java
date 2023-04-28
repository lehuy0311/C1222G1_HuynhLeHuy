package case_study.utils;

import case_study.models.TypeOfRenting;
import case_study.models.Villa;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ReadFileVilla {
    private static final String PATH = "src/case_study/data/villa.csv";

    public static Map<Villa, Integer> read() {
        Map<Villa, Integer> villas = new HashMap<>();
        Villa villaKey;
        int timesOfUsingValue;
        String line = "";
        String[] temp;
        BufferedReader bufferedReader = null;
        File file = new File(PATH);
        if (file.length() == 0) {
            return villas;
        } else {
            try {
                bufferedReader = new BufferedReader(new FileReader(PATH));
                while ((line = bufferedReader.readLine()) != null) {
                    temp = line.split(",");
                    villaKey = new Villa(temp[0],temp[1], Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), Integer.parseInt(temp[4]),
                            Enum.valueOf(TypeOfRenting.class, temp[5]), temp[6], Double.parseDouble(temp[7]), Integer.parseInt(temp[8]));
                    timesOfUsingValue = Integer.parseInt(temp[9]);
                    villas.put(villaKey, timesOfUsingValue);
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
            return villas;
        }
    }
}