package case_study.models;

import java.io.Serializable;

public class House extends Facility implements Serializable {
    private String roomStandard;
    private int floor;

    public House() {
    }

    public House(String name, double area, double price, int capacity, String guestStay, String roomStandard, int floor) {
        super(name, area, price, capacity, guestStay);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
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
                ", floor='" + floor + '\'';
    }
}
