package case_study.models;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String name, double area, double price, int capacity, String guestStay, String roomStandard, double poolArea, int floor) {
        super(name, area, price, capacity, guestStay);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", roomStandard='" + roomStandard + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", floor='" + floor + '\'';
    }
}
