package _16_java_io.bai_tap.copy_new_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyNewFile {

    public class ReadAndWriteFile {
        public List<String[]> readFile(String filePath) {
            List<String[]> list = new ArrayList<>();
            try {
                FileReader fileReader = new FileReader(filePath);
                BufferedReader br = new BufferedReader(fileReader);
                String line = null;
                while ((line = br.readLine()) != null && !line.equals("")) {
                    String[] element = line.split(",");
                    list.add(element);
                }
                br.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return list;
        }

        public void writeFile(String filePath, String line) {
            try {
                FileWriter fileWriter = new FileWriter(filePath, true);
                BufferedWriter bw = new BufferedWriter(fileWriter);
                bw.write(line);
                bw.newLine();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
    }
}
