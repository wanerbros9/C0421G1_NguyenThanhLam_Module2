package _07_abstract_interface.thuc_hanh.Interface_Comparable;

import _06_java_inheritance.thuc_hanh.Circle;

public class CircleTest {
    public static void main(String[] args) {
        _06_java_inheritance.thuc_hanh.Circle circle = new _06_java_inheritance.thuc_hanh.Circle();
        System.out.println(circle);

        circle = new _06_java_inheritance.thuc_hanh.Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo",false,3.5);
        System.out.println(circle);
    }
}
