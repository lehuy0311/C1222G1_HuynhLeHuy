package case_study.utils;

import case_study.models.Room;
import case_study.models.TypeOfRenting;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ReadFileRooms {
    private static final String PATH = "src/case_study/data/room.csv";

    public static Map<Room, Integer> read() {
        Map<Room, Integer> rooms = new HashMap<>();
        Room roomKey;
        int timesOfUsingValue;
        String line = "";
        String[] temp;
        BufferedReader bufferedReader = null;
        File file = new File(PATH);
        if (file.length() == 0) {
            return rooms;
        } else {
            try {
                bufferedReader = new BufferedReader(new FileReader(PATH));
                while ((line = bufferedReader.readLine()) != null) {
                    temp = line.split(",");
                    roomKey = new Room(temp[0], temp[1], Double.parseDouble(temp[2]), Double.parseDouble(temp[3]),
                            Integer.parseInt(temp[4]), Enum.valueOf(TypeOfRenting.class, temp[5]), temp[6]);
                    timesOfUsingValue = Integer.parseInt(temp[7]);
                    rooms.put(roomKey, timesOfUsingValue);
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
            return rooms;
        }
    }
}
