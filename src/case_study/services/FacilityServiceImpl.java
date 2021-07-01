package case_study.services;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    public static Scanner input() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public static Map<Facility, Integer> facilities = new LinkedHashMap<>();

    static {
        House house = new House("Sand House",100,3000,5,"day","vip",4);
        Villa villa = new Villa("Ocean Villa",300,10000000,10,"week","royal",40,1);
        Room room = new Room("Game Room",40,5000,2,"month","Free breakfast");
        facilities.put(room, 0);
        facilities.put(house, 0);
        facilities.put(villa, 0);
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
        for (Map.Entry<Facility, Integer> facility : facilities.entrySet()) {
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
                    addNewRoom();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewVilla();
                    break;
            }
        }
    }

    @Override
    public void addNewHouse() {
        for (Facility facility : facilities.keySet()){
            if (facility.getName().equals("Game Room")){
                facilities.put(facility,facilities.get(facility)+1);
            }
        }
    }

    @Override
    public void addNewRoom() {

    }

    @Override
    public void addNewVilla() {

    }
}
