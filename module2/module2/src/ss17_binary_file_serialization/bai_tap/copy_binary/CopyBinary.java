package ss17_binary_file_serialization.bai_tap.copy_binary;

import java.io.*;

public class CopyBinary {
    public static void main(String[] args) {

            if (args.length != 2) {
                System.out.println("Chỉ có 2 file đường dùng trong chương trình này," +
                        "source và target");
            }

            String sourceFile = "src/ss17_binary_file_serialization/bai_tap/copy_binary/source";
            String targetFile = "src/ss17_binary_file_serialization/bai_tap/copy_binary/target";

            try (InputStream inputStream = new FileInputStream(sourceFile);
                 OutputStream outputStream = new FileOutputStream(targetFile, true)) {
                byte[] buffer = new byte[2048];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
                System.out.println("Copy thành công!");

            } catch (FileNotFoundException e) {
                System.out.println("Không tìm thấy file!!");
            } catch (IOException e) {
                System.out.println("Lỗi trong khi copy");
            }
        }
    }