package case_study.utils;

import case_study.models.Room;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteFileRooms {
    private static final String PATH = "src/case_study/data/room.csv";
    
    public static void write(Map<Room, Integer> rooms){
        BufferedWriter bufferedWriter = null;

        try{
            bufferedWriter = new BufferedWriter(new FileWriter(PATH));
            for (Map.Entry<Room, Integer> entry : rooms.entrySet()) {
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
