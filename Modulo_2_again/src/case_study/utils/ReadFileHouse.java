package case_study.utils;

import case_study.models.House;
import case_study.models.TypeOfRenting;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ReadFileHouse {
    private static final String PATH = "src/case_study/data/house.csv";

    public static Map<House, Integer> read() {
        Map<House, Integer> houses = new HashMap<>();
        House houseKey;
        int timesOfUsingValue;
        String line = "";
        String[] temp;
        BufferedReader bufferedReader = null;
        File file = new File(PATH);
        if (file.length() == 0) {
            return houses;
        } else {
            try {
                bufferedReader = new BufferedReader(new FileReader(PATH));
                while ((line = bufferedReader.readLine()) != null) {
                    temp = line.split(",");
                    houseKey = new House(temp[0], temp[1], Double.parseDouble(temp[2]), Double.parseDouble(temp[3]),
                            Integer.parseInt(temp[4]), Enum.valueOf(TypeOfRenting.class, temp[5]), temp[6], Integer.parseInt(temp[7]));
                    timesOfUsingValue = Integer.parseInt(temp[8]);
                    houses.put(houseKey, timesOfUsingValue);
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
            return houses;
        }
    }
}