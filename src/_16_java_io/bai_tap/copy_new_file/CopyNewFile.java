package _16_java_io.bai_tap.copy_new_file;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyNewFile {

    private static String readFile(String filePath) {
        List<String> list = new ArrayList<>();
        BufferedReader br = null;
        try {
            File file = new File(filePath);
            if ((!file.exists())) {
                throw new FileNotFoundException();
            }
            br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String result = "";
        for (String string : list) {
            result += string + "\n";
        }
        return result;
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

    public static void main(String[] args) {
        CopyNewFile copyNewFile = new CopyNewFile();
        System.out.println(copyNewFile.readFile("src/_16_java_io/bai_tap/copy_new_file/src.csv"));
        copyNewFile.writeFile("src/_16_java_io/bai_tap/copy_new_file/copy.csv",readFile("src/_16_java_io/bai_tap/copy_new_file/src.csv"));
    }
}
