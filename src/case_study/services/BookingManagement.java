package case_study.services;

import case_study.controllers.FuramaController;

import java.util.Scanner;

public class BookingManagement {
    public static Scanner input() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public void displayBookingManagement() {
        while (true) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display booking list");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            int choice = input().nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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
}
