package case_study.controllers;

import case_study.services.BookingServiceImpl;
import case_study.services.FacilityServiceImpl;

public class NewServiceManagement extends FacilityServiceImpl {
    public void displayAddNewService() {
        while (true) {
            System.out.println("1. Add New Room");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Villa");
            System.out.println("4. Return main menu");
            System.out.print("Enter your choice: ");
            int choice = choiceNumber();
            switch (choice) {
                case 1:
                    new FacilityServiceImpl().addNewRoom();
                    break;
                case 2:
                    new FacilityServiceImpl().addNewHouse();
                    break;
                case 3:
                    new FacilityServiceImpl().addNewVilla();
                    break;
                case 4:
                    new FacilityManagement().displayFacilityManagement();
                default:
                    System.out.println("Please enter correct number");
            }
        }
    }
}
