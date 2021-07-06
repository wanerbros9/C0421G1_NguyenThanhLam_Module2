package case_study.services;

import case_study.controllers.FacilityManagement;
import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.utils.ReadAndWriteFileByByteStream;
import javafx.beans.property.ReadOnlyMapProperty;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl extends ReadAndWriteFileByByteStream implements FacilityService {
    public static Scanner input() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public static final String FILE_PATH_HOUSE = "src/case_study/data/house.csv";
    public static final String FILE_PATH_ROOM = "src/case_study/data/room.csv";
    public static final String FILE_PATH_VILLA = "src/case_study/data/villa.csv";

    public static Map<Facility, Integer> facilities = new LinkedHashMap<>();
    public static Map<Facility, Integer> houses = new LinkedHashMap<>();
    public static Map<Facility, Integer> rooms = new LinkedHashMap<>();
    public static Map<Facility, Integer> villas = new LinkedHashMap<>();

//    static {
//        House house = new House("Sand House", 100, 3000, 5, "day", "vip", 4);
//        Villa villa = new Villa("Ocean Villa", 300, 40000, 10, "week", "royal", 40, 1);
//        Room room = new Room("Game Room", 40, 5000, 2, "month", "Free breakfast");
//        facilities.put(room, 0);
//        facilities.put(house, 0);
//        facilities.put(villa, 0);
//    }

    @Override
    public void add() {
        displayAddNewService();
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        rooms = (Map<Facility, Integer>) readFileByByteStream(FILE_PATH_ROOM);
        houses = (Map<Facility, Integer>) readFileByByteStream(FILE_PATH_HOUSE);
        villas = (Map<Facility, Integer>) readFileByByteStream(FILE_PATH_VILLA);
        facilities.putAll(rooms);
        facilities.putAll(houses);
        facilities.putAll(villas);
        for (Map.Entry<Facility, Integer> facility : facilities.entrySet()) {
            if (facility != null) {
                System.out.println(facility);
            }
        }
        facilities.clear();
    }

    @Override
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
                    addNewRoom();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewVilla();
                    break;
                case 4:
                    new FacilityManagement().displayFacilityManagement();
                default:
                    System.out.println("Please enter correct number");
            }
        }
    }

    @Override
    public void addNewHouse() {
        houses = (Map<Facility, Integer>) new ReadAndWriteFileByByteStream<Facility>().readFileByByteStream(FILE_PATH_HOUSE);
        System.out.print("Enter new house name: ");
        String house = input().nextLine();
        System.out.print("Enter new area: ");
        double area = input().nextDouble();
        System.out.print("Enter new price: ");
        double price = input().nextDouble();
        System.out.print("Enter new capacity: ");
        int capacity = input().nextInt();
        System.out.print("Enter new kind of guest stay: ");
        String guestStay = input().nextLine();
        System.out.print("Enter new room standard: ");
        String roomStandard = input().nextLine();
        System.out.print("Enter new floor: ");
        int floor = input().nextInt();
        facilities.put(new House(house, area, price, capacity, guestStay, roomStandard, floor), 0);
        new ReadAndWriteFileByByteStream<House>().writeFileByByteStreamUseMap(facilities, FILE_PATH_HOUSE);
    }

    @Override
    public void addNewRoom() {
        rooms = (Map<Facility, Integer>) new ReadAndWriteFileByByteStream<Facility>().readFileByByteStream(FILE_PATH_ROOM);
        System.out.print("Enter new room name: ");
        String house = input().nextLine();
        System.out.print("Enter new area: ");
        double area = input().nextDouble();
        System.out.print("Enter new price: ");
        double price = input().nextDouble();
        System.out.print("Enter new capacity: ");
        int capacity = input().nextInt();
        System.out.print("Enter new kind of guest stay: ");
        String guestStay = input().nextLine();
        System.out.print("Enter new free service: ");
        String freeService = input().nextLine();
        facilities.put(new Room(house, area, price, capacity, guestStay, freeService), 0);
        new ReadAndWriteFileByByteStream<Room>().writeFileByByteStreamUseMap(facilities, FILE_PATH_ROOM);
    }

    @Override
    public void addNewVilla() {
        villas = (Map<Facility, Integer>) new ReadAndWriteFileByByteStream<Facility>().readFileByByteStream(FILE_PATH_VILLA);
        System.out.print("Enter new villa name: ");
        String house = input().nextLine();
        System.out.print("Enter new area: ");
        double area = input().nextDouble();
        System.out.print("Enter new price: ");
        double price = input().nextDouble();
        System.out.print("Enter new capacity: ");
        int capacity = input().nextInt();
        System.out.print("Enter new kind of guest stay: ");
        String guestStay = input().nextLine();
        System.out.print("Enter new room standard: ");
        String roomStandard = input().nextLine();
        System.out.print("Enter new area of pool: ");
        double poolArea = input().nextDouble();
        System.out.print("Enter new floor: ");
        int floor = input().nextInt();
        facilities.put(new Villa(house, area, price, capacity, guestStay, roomStandard, poolArea, floor), 0);
        new ReadAndWriteFileByByteStream<Villa>().writeFileByByteStreamUseMap(facilities, FILE_PATH_VILLA);
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
