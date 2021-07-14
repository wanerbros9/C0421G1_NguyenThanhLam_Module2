package _final_exam.controller;

import _final_exam.model.Product;
import _final_exam.service.ProductCRUDImpl;

import java.util.Scanner;

public class ProductController {
    public static Scanner input() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public void displayMainMenu() {
        while (true) {
            System.out.println("-----Product Management-----");
            System.out.println("1. Add new imported product");
            System.out.println("2. Add new exported product");
            System.out.println("3. Delete product");
            System.out.println("4. Display product list");
            System.out.println("5. Search product");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = choiceNumber();
            switch (choice) {
                case 1:
                    new ProductCRUDImpl().addImport();
                    break;
                case 2:
                    new ProductCRUDImpl().addExport();
                    break;
                case 3:
                    new ProductCRUDImpl().delete();
                    break;
                case 4:
                    new ProductCRUDImpl().display();
                    break;
                case 5:
                    new ProductCRUDImpl().search();
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Please enter correct number");
            }
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
