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
            bufferedReader = new BufferedReader(new FileReader(PATH));
            String line ="";
            while ((line = bufferedReader.readLine()) != null){
                String[] temp = line.split(",");
                Target target = new Target(Integer.parseInt(temp[0]), temp[1],temp[2], temp[3],temp[4]);
                targetList.add(target);
            }
        } catch (FileNotFoundException e) {
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
