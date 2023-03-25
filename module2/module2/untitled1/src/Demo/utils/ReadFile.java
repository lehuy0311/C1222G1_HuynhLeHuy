package Demo.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private  static final String PATH = "";
    public static List<Demo> read(){
        List<Demo> demoList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line ="";
            while ((line = bufferedReader.readLine()) != null){
                String[] temp = line.split(",");
                Demo demo = new Demo(temp[0], temp[1]);
                demoList.add(demo);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return demoList;
    }
}
