package case_study.common;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static List<String> readFile(String path){
        FileReader fileReader = null;
        List<String> stringList = new ArrayList<>();
        String line = null;
        try {
            fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null){
                stringList.add(line);
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException();
        }catch (IOException e){
            throw new RuntimeException();
        }
        return stringList;
    }
}
