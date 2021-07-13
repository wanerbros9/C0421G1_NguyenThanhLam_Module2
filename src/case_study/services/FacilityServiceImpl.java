package case_study.services;

import case_study.controllers.FacilityManagement;
import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.utils.ReadAndWriteFileByByteStream;
import case_study.utils.Regex;

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

    Regex regex = new Regex();

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
    }

    @Override
    public void addNewHouse() {
        houses = (Map<Facility, Integer>) new ReadAndWriteFileByByteStream<Facility>().readFileByByteStream(FILE_PATH_HOUSE);
        if (houses == null) {
            houses = new LinkedHashMap<>();
        }
        String house = "";
        while (true) {
            System.out.print("Enter new house name: ");
            house = input().nextLine();
            if (regex.regexNameService(house) == true) {
                break;
            } else {
                System.out.println("Please enter in SVHO-YYYY format with Y is 4 numbers");
            }
        }
        int area = 0;
        while (true) {
            System.out.print("Enter new area: ");
            area = input().nextInt();
            String str = String.valueOf(area);
            if (regex.area(str) == true) {
                break;
            } else {
                System.out.println("Usage area must be bigger than 30");
            }
        }
        double price = 0;
        while (true) {
            System.out.print("Enter new price: ");
            price = input().nextDouble();
            String str = String.valueOf(price);
            if (regex.rentalFee(str) == true) {
                break;
            } else {
                System.out.println("Price must be positive number");
            }
        }
        int capacity = 0;
        while (true) {
            System.out.print("Enter new capacity: ");
            capacity = input().nextInt();
            String str = String.valueOf(capacity);
            if (regex.numberOfPeople(str) == true) {
                break;
            } else {
                System.out.println("Capacity must be positive number");
            }
        }
        String guestStay = "";
        while (true) {
            System.out.print("Enter new kind of guest stay: ");
            guestStay = input().nextLine();
            if (regex.rentOfType(guestStay)) {
                break;
            } else {
                System.out.println("Kind of stay must be date month year format");
            }
        }
        String roomStandard = "";
        while (true) {
            System.out.print("Enter new room standard: ");
            roomStandard = input().nextLine();
            if (regex.roomStandard(roomStandard) == true) {
                break;
            } else {
                System.out.println("Room standard must follow NORMAL, VIP, LOW-YYYY");
            }
        }
        int floor = 0;
        while (true) {
            System.out.print("Enter new floor: ");
            floor = input().nextInt();
            String str = String.valueOf(floor);
            if (regex.numberOfFloor(str) == true) {
                break;
            } else {
                System.out.println("Floor number must be positive");
            }
        }
        houses.put(new House(house, area, price, capacity, guestStay, roomStandard, floor), 0);
        new ReadAndWriteFileByByteStream<House>().writeFileByByteStreamUseMap(houses, FILE_PATH_HOUSE);
    }

    @Override
    public void addNewRoom() {
        rooms = (Map<Facility, Integer>) new ReadAndWriteFileByByteStream<Facility>().readFileByByteStream(FILE_PATH_ROOM);
        if (rooms == null) {
            rooms = new LinkedHashMap<>();
        }
        String room = "";
        while (true) {
            System.out.print("Enter new room name: ");
            room = input().nextLine();
            if (regex.regexNameService(room) == true) {
                break;
            } else {
                System.out.println("Please enter in SVRO-YYYY format with Y is 4 numbers");
            }
        }
        int area = 0;
        while (true) {
            System.out.print("Enter new area: ");
            area = input().nextInt();
            String str = String.valueOf(area);
            if (regex.area(str) == true) {
                break;
            } else {
                System.out.println("Usage area must be bigger than 30");
            }
        }
        double price = 0;
        while (true) {
            System.out.print("Enter new price: ");
            price = input().nextInt();
            String str = String.valueOf(price);
            if (regex.rentalFee(str) == true) {
                break;
            } else {
                System.out.println("Price must be positive number");
            }
        }
        int capacity = 0;
        while (true) {
            System.out.print("Enter new capacity: ");
            capacity = input().nextInt();
            String str = String.valueOf(capacity);
            if (regex.numberOfPeople(str) == true) {
                break;
            } else {
                System.out.println("Capacity must be positive number");
            }
        }
        String guestStay = "";
        while (true) {
            System.out.print("Enter new kind of guest stay: ");
            guestStay = input().nextLine();
            if (regex.rentOfType(guestStay) == true) {
                break;
            } else {
                System.out.println("Kind of stay must be date month year format");
            }
        }
        System.out.print("Enter new free service: ");
        String freeService = input().nextLine();
        rooms.put(new Room(room, area, price, capacity, guestStay, freeService), 0);
        new ReadAndWriteFileByByteStream<Room>().writeFileByByteStreamUseMap(rooms, FILE_PATH_ROOM);
    }

    @Override
    public void addNewVilla() {
        villas = (Map<Facility, Integer>) new ReadAndWriteFileByByteStream<Facility>().readFileByByteStream(FILE_PATH_VILLA);
        if (villas == null) {
            villas = new LinkedHashMap<>();
        }
        String villa = "";
        while (true) {
            System.out.print("Enter new villa name: ");
            villa = input().nextLine();
            if (regex.regexNameService(villa) == true) {
                break;
            } else {
                System.out.println("Please enter in SVVL-YYYY format with Y is 4 numbers");
            }
        }
        int area = 0;
        while (true) {
            System.out.print("Enter new area: ");
            area = input().nextInt();
            String str = String.valueOf(area);
            if (regex.area(str) == true) {
                break;
            } else {
                System.out.println("Usage area must be bigger than 30");
            }
        }
        double price = 0;
        while (true) {
            System.out.print("Enter new price: ");
            price = input().nextDouble();
            String str = String.valueOf(price);
            if (regex.rentalFee(str) == true) {
                break;
            } else {
                System.out.println("Price must be positive number");
            }
        }
        int capacity = 0;
        while (true) {
            System.out.print("Enter new capacity: ");
            capacity = input().nextInt();
            String str = String.valueOf(capacity);
            if (regex.numberOfPeople(str) == true) {
                break;
            } else {
                System.out.println("Capacity must be positive number");
            }
        }
        String guestStay = "";
        while (true) {
            System.out.print("Enter new kind of guest stay: ");
            guestStay = input().nextLine();
            if (regex.rentOfType(guestStay) == true) {
                break;
            } else {
                System.out.println("Kind of stay must be date month year format");
            }
        }
        String roomStandard = "";
        while (true) {
            System.out.print("Enter new villa standard: ");
            roomStandard = input().nextLine();
            if (regex.roomStandard(roomStandard) == true) {
                break;
            } else {
                System.out.println("Room standard must follow NORMAL, VIP, LOW-YYYY");
            }
        }
        int poolArea;
        while (true) {
            System.out.print("Enter new area of pool: ");
            poolArea = input().nextInt();
            String str = String.valueOf(poolArea);
            if (regex.area(str) == true) {
                break;
            } else {
                System.out.println("Pool area must be larger than 30");
            }
        }
        int floor = 0;
        while (true) {
            System.out.print("Enter new floor: ");
            floor = input().nextInt();
            String str = String.valueOf(floor);
            if (regex.numberOfFloor(str) == true) {
                break;
            } else {
                System.out.println("Floor number must be positive");
            }
        }
        villas.put(new Villa(villa, area, price, capacity, guestStay, roomStandard, poolArea, floor), 0);
        new ReadAndWriteFileByByteStream<Villa>().writeFileByByteStreamUseMap(villas, FILE_PATH_VILLA);
    }

    protected static int choiceNumber() {
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
