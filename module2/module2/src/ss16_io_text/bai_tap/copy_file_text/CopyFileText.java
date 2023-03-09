package ss16_io_text.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public List<String> readFile(String path){
        ArrayList<String> list = new ArrayList<>();
        try{
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                list.add(line);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void writeFile(String targetPath, String sourcePath){
        try{
            File file = new File(targetPath);
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String e: readFile(sourcePath)) {
                bufferedWriter.write(e);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        copyFileText.readFile("src/ss16_io_text/bai_tap/copy_file_text/source");
        copyFileText.writeFile("src/ss16_io_text/bai_tap/copy_file_text/target","src/ss16_io_text/bai_tap/copy_file_text/source");
    }
}