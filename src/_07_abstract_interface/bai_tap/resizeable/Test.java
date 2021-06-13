package _07_abstract_interface.bai_tap.resizeable;

import _06_java_inheritance.thuc_hanh.Square;

public class Test {
    public static void main(String[] args) {
        double percent = Math.random()*100;
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Circle(2.4);

        System.out.println("Shape before resize: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println("Shape after resize: ");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Circle");
                shape.resize(percent);
            } else {
                System.out.println("Rectangle");
                shape.resize(percent);
            }
            System.out.println(shape);
        }
    }
}

