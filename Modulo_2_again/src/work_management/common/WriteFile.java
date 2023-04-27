package work_management.common;

import work_management.model.Target;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    public static final String TARGET_FILE_PATH = "src/work_management/data/Target.csv";
    public static void writeFile(List<Target> targetList){
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(TARGET_FILE_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Target target: targetList){
                bufferedWriter.write(target.writeToCsv());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
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
