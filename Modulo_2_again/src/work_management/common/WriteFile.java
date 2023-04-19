package work_management.common;

import work_management.model.Target;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeFile(String path, Target target){
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            bufferedWriter.write(target.writeToCsv());
            bufferedWriter.newLine();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                bufferedWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}
