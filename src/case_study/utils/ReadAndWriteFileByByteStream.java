package case_study.utils;

import case_study.models.Booking;
import case_study.models.Employee;
import case_study.models.Facility;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ReadAndWriteFileByByteStream<K> {
    public Object readFileByByteStream(String filePath){
        //Khai báo đối tượng FileInputStream và ObjectInputStream trỏ tới null
        FileInputStream FIn = null;
        ObjectInputStream OIn = null;
        Object read = null;
        try {
            //Khở tạo đối tượng với địa chỉ truyền vào
            FIn = new FileInputStream(new java.io.File(filePath));
            OIn = new ObjectInputStream(FIn);
            read = OIn.readObject();
            FIn.close();
            OIn.close();
            return read;
        } catch (Exception e) {
            System.err.println(e);
        }
        return null;
    }

    public void writeFileByByteStream(List<K> list, String filePath) {
        File file = new File(filePath);
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeFileByByteStreamUseMap(Map<Facility, Integer> map, String filePath) {
        File file = new File(filePath);
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(map);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeFileByByteStreamUseTreeSet(TreeSet<Booking> treeSet, String filePath) {
        File file = new File(filePath);
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(treeSet);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
