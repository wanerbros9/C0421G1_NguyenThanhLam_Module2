package _07_abstract_interface.bai_tap.colorable;

import _07_abstract_interface.bai_tap.resizeable.Circle;

public class CircleTest {
    public static void main(String[] args) {
        _07_abstract_interface.bai_tap.resizeable.Circle circle = new _07_abstract_interface.bai_tap.resizeable.Circle();
        System.out.println(circle);

        circle = new _07_abstract_interface.bai_tap.resizeable.Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
