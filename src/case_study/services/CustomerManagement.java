package case_study.services;

import case_study.controllers.FuramaController;

import java.util.Scanner;

public class CustomerManagement {
    public static Scanner input() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public void displayCustomerManagement() {
        while (true) {
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            int choice = input().nextInt();
            switch (choice) {
                case 1:
                    new CustomerServiceImpl().display();
                    break;
                case 2:
                    new CustomerServiceImpl().add();
                    break;
                case 3:
                    new CustomerServiceImpl().edit();
                    break;
                case 4:
                    new FuramaController().displayMainMenu();
                    break;
                default:
                    System.out.println("Please enter correct number");
            }
        }
    }
}
