package case_study.services;

import case_study.controllers.FuramaController;
import case_study.models.Facility;

import java.util.Scanner;

public class FacilityManagement {
    public static Scanner input() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public void displayFacilityManagement() {
        while (true) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            int choice = input().nextInt();
            switch (choice) {
                case 1:
                    new FacilityServiceImpl().display();
                    break;
                case 2:
                    break;
                case 3:
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
