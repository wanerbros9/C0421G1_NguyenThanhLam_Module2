package _16_java_io.thuc_hanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePatch) {
        try {
            File file = new File("G:\\Github\\C0421G1_NguyenThanhLam_Module2\\src\\_16_java_io\\thuc_hanh\\file.txt");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Sum = " + sum);
        } catch (Exception e) {
            System.err.println("File không tồn tại or nội dung lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText("G:\\Github\\C0421G1_NguyenThanhLam_Module2\\src\\_16_java_io\\thuc_hanh\\file.txt");
    }
}
