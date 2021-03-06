package case_study.controllers;

import case_study.controllers.FuramaController;
import case_study.services.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeManagement {
    public static Scanner input() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public void displayEmployeeManagement() {
        while (true) {
            System.out.println("-----Furama Resort-----");
            System.out.println("1. Display list employee");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            System.out.print("Enter your choice: ");
            int choice = choiceNumber();
            switch (choice) {
                case 1:
                    new EmployeeServiceImpl().display();
                    break;
                case 2:
                    new EmployeeServiceImpl().add();
                    break;
                case 3:
                    new EmployeeServiceImpl().edit();
                    break;
                case 4:
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
