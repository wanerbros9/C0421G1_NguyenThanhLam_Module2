package _05_java_encapsulation.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The radius of circle is: "+circle1.getRadius());
        System.out.println("The area of circle is: "+circle1.getArea());
        Circle circle2 = new Circle(7.0);
        System.out.println("The radius of circle is: "+circle2.getRadius());
        System.out.println("The area of circle is: "+circle2.getArea());
    }
}
