package _07_abstract_interface.thuc_hanh.Interface_Comparable;

import _06_java_inheritance.thuc_hanh.ComparableCircle;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        _06_java_inheritance.thuc_hanh.ComparableCircle[] circles = new _06_java_inheritance.thuc_hanh.ComparableCircle[3];
        circles[0] = new _06_java_inheritance.thuc_hanh.ComparableCircle(3.6);
        circles[1] = new _06_java_inheritance.thuc_hanh.ComparableCircle();
        circles[2] = new _06_java_inheritance.thuc_hanh.ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (_06_java_inheritance.thuc_hanh.ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
