package work_management.common;

import work_management.model.Target;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static final String PATH = "src/work_management/data/Target.csv";
    public static List<Target> readFile(String path){
        List<Target> targetList = new ArrayList<>();
        BufferedReader bufferedReader =  null;
        try {
            FileReader fileReader = new FileReader(PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";

            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] temp = line.split(",");
                Target target = new Target(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], temp[4]);
                targetList.add(target);
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
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
