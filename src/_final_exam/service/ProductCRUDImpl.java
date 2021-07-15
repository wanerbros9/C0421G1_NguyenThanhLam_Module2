package _final_exam.service;

import _final_exam.controller.ProductController;
import _final_exam.model.ExportedProduct;
import _final_exam.model.ImportedProduct;
import _final_exam.model.Product;
import _final_exam.utils.ReadAndWriteFileByByteStream;
import _final_exam.utils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductCRUDImpl extends case_study.utils.ReadAndWriteFileByByteStream implements ProductCRUD {
    private static boolean check = true;

    public static Scanner input() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    private static final String FILE_PATH = "src/_final_exam/data/products.csv";
    public static List<Product> products = new ArrayList<>();

    public static List<ImportedProduct> importedProducts = new ArrayList<>();
    public static List<ExportedProduct> exportedProducts = new ArrayList<>();
    Regex regex = new Regex();

    @Override
    public void add() {
        System.out.println("1. Imported Product");
        System.out.println("2. Exported Product");
        System.out.print("Enter your choice: ");
        int choice = choiceNumber();
        switch (choice){
            case 1:
                addImport();
                break;
            case 2:
                addExport();
                break;
            case 3:
                new ProductController().displayMainMenu();
                break;
            default:
                System.out.println("Please enter correct number");
        }
    }

    @Override
    public void addImport() {
        importedProducts = (List<ImportedProduct>) new ReadAndWriteFileByByteStream<Product>().readFileByByteStream(FILE_PATH);
        int id;
        if (importedProducts == null) {
            importedProducts = new ArrayList<>();
            id = 1;
        } else {
            id = importedProducts.get(importedProducts.size() - 1).getId() + 1;
        }
        String productID = "";
        while (true) {
            System.out.println("Enter product id: ");
            productID = input().nextLine();
            if (regex.whiteSpace(productID) == true) {
                break;
            } else {
                System.out.println("You must enter product id");
            }
        }
        String productName = "";
        while (true) {
            System.out.println("Enter product name: ");
            productName = input().nextLine();
            if (regex.whiteSpace(productName) == true) {
                break;
            } else {
                System.out.println("You must enter product name");
            }
        }
        int price = 0;
        while (true) {
            System.out.println("Enter product price: ");
            price = input().nextInt();
            String str = String.valueOf(price);
            if (regex.positiveNumber(str) == true) {
                break;
            } else {
                System.out.println("Price must be positive");
            }
        }
        int amount = 0;
        while (true) {
            System.out.println("Enter product amount: ");
            amount = input().nextInt();
            String str = String.valueOf(amount);
            if (regex.positiveNumber(str) == true) {
                break;
            } else {
                System.out.println("Amount mus be positive");
            }
        }
        String companyProduct = "";
        while (true) {
            System.out.println("Enter company name: ");
            companyProduct = input().nextLine();
            if (regex.whiteSpace(companyProduct) == true) {
                break;
            } else {
                System.out.println("You must enter company name");
            }
        }
        int importedPrice = 0;
        while (true) {
            System.out.println("Enter imported price: ");
            importedPrice = input().nextInt();
            String str = String.valueOf(importedPrice);
            if (regex.positiveNumber(str) == true) {
                break;
            } else {
                System.out.println("Price must be positive");
            }
        }
        String importedCity = "";
        while (true) {
            System.out.println("Enter city name: ");
            importedCity = input().nextLine();
            if (regex.whiteSpace(importedCity) == true) {
                break;
            } else {
                System.out.println("You must enter city name");
            }
        }
        int importedTax = 0;
        while (true) {
            System.out.println("Enter tax: ");
            importedTax = input().nextInt();
            String str = String.valueOf(importedTax);
            if (regex.positiveNumber(str) == true) {
                break;
            } else {
                System.out.println("You must enter tax");
            }
        }
        ImportedProduct importedProduct = new ImportedProduct(id, productID, productName, price, amount, companyProduct, importedPrice, importedCity, importedTax);
        importedProducts.add(importedProduct);
        new case_study.utils.ReadAndWriteFileByByteStream().writeFileByByteStream(importedProducts, FILE_PATH);
    }

    @Override
    public void addExport() {
        exportedProducts = (List<ExportedProduct>) new ReadAndWriteFileByByteStream<Product>().readFileByByteStream(FILE_PATH);
        int id;
        if (exportedProducts == null) {
            exportedProducts = new ArrayList<>();
            id = 1;
        } else {
            id = exportedProducts.get(exportedProducts.size() - 1).getId() + 1;
        }
        String productID = "";
        while (true) {
            System.out.println("Enter product id: ");
            productID = input().nextLine();
            if (regex.whiteSpace(productID) == true) {
                break;
            } else {
                System.out.println("You must enter product id");
            }
        }
        String productName = "";
        while (true) {
            System.out.println("Enter product name: ");
            productName = input().nextLine();
            if (regex.whiteSpace(productName) == true) {
                break;
            } else {
                System.out.println("You must enter product name");
            }
        }
        int price = 0;
        while (true) {
            System.out.println("Enter product price: ");
            price = input().nextInt();
            String str = String.valueOf(price);
            if (regex.positiveNumber(str) == true) {
                break;
            } else {
                System.out.println("Price must be positive");
            }
        }
        int amount = 0;
        while (true) {
            System.out.println("Enter product amount: ");
            amount = input().nextInt();
            String str = String.valueOf(amount);
            if (regex.positiveNumber(str) == true) {
                break;
            } else {
                System.out.println("Amount mus be positive");
            }
        }
        String companyProduct = "";
        while (true) {
            System.out.println("Enter company name: ");
            companyProduct = input().nextLine();
            if (regex.whiteSpace(companyProduct) == true) {
                break;
            } else {
                System.out.println("You must enter company name");
            }
        }
        int exportedPrice = 0;
        while (true) {
            System.out.println("Enter exported price");
            exportedPrice = input().nextInt();
            String str = String.valueOf(exportedPrice);
            if (regex.positiveNumber(str) == true) {
                break;
            } else {
                System.out.println("You must enter exported price");
            }
        }
        String exportedCountry = "";
        while (true) {
            System.out.println("Enter exported country: ");
            exportedCountry = input().nextLine();
            if (regex.whiteSpace(exportedCountry) == true) {
                break;
            } else {
                System.out.println("You must enter exported country");
            }
        }
        ExportedProduct exportedProduct = new ExportedProduct(id, productID, productName, price, amount, companyProduct, exportedPrice, exportedCountry);
        exportedProducts.add(exportedProduct);
        new ReadAndWriteFileByByteStream<ExportedProduct>().writeFileByByteStream(exportedProducts, FILE_PATH);
    }

    @Override
    public void search() {
    }

    @Override
    public void delete() {
        System.out.println("Enter product id you want to delete: ");
        String productID = input().nextLine();
        products = (List<Product>) new ReadAndWriteFileByByteStream<Product>().readFileByByteStream(FILE_PATH);
        boolean isExist = true;
        for (Product product : products) {
            if (productID.equals(product.getProductID())) {
                isExist = false;
                System.out.println("Not found");
                break;
            }
        }
        if (isExist) {
            System.out.println("Do you want to delete");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int choice = choiceNumber();
            if (choice == 1) {
                for (Product product : products) {
                    if (productID.equals(product.getProductID())) {
                        products.remove(product);
                        break;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override
    public void display() {
        products = (List<Product>) new ReadAndWriteFileByByteStream<Product>().readFileByByteStream(FILE_PATH);
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static int choiceNumber() {
        boolean checkValid = false;
        int choice = 0;
        while (!checkValid) {
            try {
                choice = Integer.parseInt(input().nextLine());
                checkValid = true;
            } catch (NumberFormatException e) {
                System.out.print("You must enter a number: ");
            }
        }
        return choice;
    }
}
