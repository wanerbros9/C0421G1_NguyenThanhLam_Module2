package _07_abstract_interface.thuc_hanh.Interface_Comparable;

import _06_java_inheritance.thuc_hanh.Shape;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= " +
                getRadius() +
                ", which is a subclass of " +
                super.toString();
    }
}
