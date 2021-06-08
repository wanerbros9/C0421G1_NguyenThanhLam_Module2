package _04_class_oop.bai_tap;

public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,10,"yellow");
        Fan fan2 = new Fan(2,false,5,"blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
