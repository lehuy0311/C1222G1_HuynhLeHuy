package case_study.common;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    public static void writeFile(String path, List<String> stringList, boolean append) {
        File file = new File(path);
        BufferedWriter bw = null;
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            bw = new BufferedWriter(fileWriter);
            for (String line : stringList) {
                bw.write((line));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.flush();
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
