package case_study.services;

import case_study.models.Facility;

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
}
