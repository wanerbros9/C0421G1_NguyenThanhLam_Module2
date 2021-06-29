package case_study.models;

public class Room extends Villa{
    private String includeService;

    public Room() {
    }

    public Room(String name, double area, double price, int capacity, String guestStay, String roomStandard, double poolArea, int floor, String includeService) {
        super(name, area, price, capacity, guestStay, roomStandard, poolArea, floor);
        this.includeService = includeService;
    }

    public String getIncludeService() {
        return includeService;
    }

    public void setIncludeService(String includeService) {
        this.includeService = includeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "includeService='" + includeService + '\'' +
                '}';
    }
}
