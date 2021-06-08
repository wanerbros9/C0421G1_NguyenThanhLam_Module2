package _04_class_oop.bai_tap;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(){
    }

    public Fan(int speed, boolean on,double radius,String color){
        this.speed=speed;
        this.on = on;
        this.radius=radius;
        this.color=color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed() +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public String speed(){
        if (this.speed==this.SLOW){
            return "SLOW";
        }else if (this.speed==this.MEDIUM){
            return "MEDIUM";
        }else if (this.speed==this.FAST){
            return "FAST";
        }else {
            return "Invalid";
        }
    }
}
