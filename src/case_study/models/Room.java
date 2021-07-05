package case_study.models;

public class Room extends Facility{
    private String includeService;

    public Room() {
    }

    public Room(String name, double area, double price, int capacity, String guestStay, String includeService) {
        super(name, area, price, capacity, guestStay);
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
        return super.toString() +
                ", includeService='" + includeService + '\'';
    }
}
