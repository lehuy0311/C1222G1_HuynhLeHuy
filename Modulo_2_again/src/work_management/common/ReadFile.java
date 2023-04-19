package work_management.common;

import work_management.model.Target;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static final String PATH = "src/work_management/data/Target.csv";
    public static List<Target> readFile(String path){
        List<Target> targetList = new ArrayList<>();
        BufferedReader bufferedReader =  null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String temp;
            if(bufferedReader.readLine() != null){
                while ((temp = bufferedReader.readLine()) != null){
                    String[] tempArr;
                    tempArr = temp.split(",");
                    targetList.add(new Target(Integer.parseInt(tempArr[0]),
                            tempArr[1], tempArr[2], tempArr[3] ,tempArr[4] ));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return targetList;
    }

}
