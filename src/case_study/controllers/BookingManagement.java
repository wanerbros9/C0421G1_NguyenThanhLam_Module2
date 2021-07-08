package case_study.controllers;

import case_study.controllers.FuramaController;
import case_study.services.BookingServiceImpl;
import case_study.services.ContractServiceImpl;

import java.util.Scanner;

public class BookingManagement {
    public static Scanner input() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public void displayBookingManagement() {
        while (true) {
            System.out.println("-----Furama Resort-----");
            System.out.println("1. Add new booking");
            System.out.println("2. Display booking list");
            System.out.println("3. Create new contract");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            System.out.print("Enter your choice: ");
            int choice = choiceNumber();
            switch (choice) {
                case 1:
                    new BookingServiceImpl().add();
                    break;
                case 2:
                    new BookingServiceImpl().display();
                    break;
                case 3:
                    new ContractServiceImpl().add();
                    break;
                case 4:
                    new ContractServiceImpl().display();
                    break;
                case 5:
                    break;
                case 6:
                    new FuramaController().displayMainMenu();
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
