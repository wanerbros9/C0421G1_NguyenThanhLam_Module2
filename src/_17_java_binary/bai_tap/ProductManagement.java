package _17_java_binary.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    public static Scanner input() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    static List<Product> products = new ArrayList<>();

    public static Object readFile(String filePath) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Object read = null;
        try {
            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);
            read = ois.readObject();
            return read;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (read != null) {
                System.out.println("Dung");
            } else {
                System.out.println("Sai");
            }
            try {
                fis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public void writeFile(String filePath, List products) {
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file, true);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void addNewProduct() {
        System.out.print("ID: ");
        int id = input().nextInt();
        System.out.print("Name: ");
        String name = input().nextLine();
        System.out.print("Price: ");
        double price = input().nextDouble();
        Product product = new Product(id, name, price);
        products.add(product);
        new ProductManagement().writeFile("src/_17_java_binary/bai_tap/product.csv", products);
    }

    public static void displayProduct() {
        List<Product> products1 = (List<Product>) new ProductManagement().readFile("src/_17_java_binary/bai_tap/product.csv");
        for (Product product : products1) {
            System.out.println(product);
        }
    }

    public static void search() {
        List<Product> products1 = (List<Product>) new ProductManagement().readFile("src/_17_java_binary/bai_tap/product.csv");
        System.out.println("ID");
        int id = input().nextInt();
        for (Product product : products1) {
            if (product.getId() == id) {
                System.out.println(product);
                break;
            }
        }
    }


    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Display product");
            System.out.println("2. Add new product");
            System.out.println("3. Search");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input().nextInt();
            switch (choice) {
                case 1:
                    displayProduct();
                    break;
                case 2:
                    addNewProduct();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Please enter again: ");
            }
        }
    }
}
