package mvc.common;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
    public static final String BUG_FILE_PATH = "src/mvc/data/bugs.csv";
    public void ReadFile(){
        try {
            FileReader fileReader = new FileReader(BUG_FILE_PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line="";
            String

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



    }
}
