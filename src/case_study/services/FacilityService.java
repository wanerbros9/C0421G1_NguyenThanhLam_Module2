package case_study.services;

import case_study.models.Facility;

import java.util.Map;

public interface FacilityService extends Service {
    void displayAddNewService();

    void addNewHouse();

    void addNewRoom();

    void addNewVilla();
}