package case_study.common;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    public static void writeFile(String path, List<String> strings) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String line : strings) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
