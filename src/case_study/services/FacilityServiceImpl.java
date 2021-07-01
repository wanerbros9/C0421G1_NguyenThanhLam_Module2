package case_study.services;

import case_study.models.Facility;
import case_study.models.House;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    public static Scanner input() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public static Map<String, Integer> facilities = new LinkedHashMap<>();

    static {
        House house = new House("House",100,3000,5,"day","Vip",4);
        facilities.put("Room", 0);
        facilities.put("House", 0);
        facilities.put("Villa", 0);
    }


    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        for (Map.Entry<String, Integer> facility : facilities.entrySet()) {
            if (facility != null) {
                System.out.println(facility);
            }
        }
    }

    @Override
    public void displayAddNewService() {
        while (true){
            System.out.println("1. Add New Room");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Villa");
            System.out.print("Enter your choice: ");
            int choice = input().nextInt();
            switch (choice){
                case 1:
                    addRoom();
                    break;
                case 2:
                    addHouse();
                    break;
                case 3:
                    addVilla();
                    break;
            }
        }
    }

    @Override
    public void addHouse() {

    }

    @Override
    public void addRoom() {

    }

    @Override
    public void addVilla() {

    }
}
