package _07_abstract_interface.bai_tap.resizeable;

import _06_java_inheritance.thuc_hanh.Square;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Circle(5);
        shapes[3] = new Rectangle(4, 6);
        shapes[4] = new Circle(2.4);

        System.out.println("Shape before resize: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println("Shape after resize: ");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Circle");
                ((Circle) shape).resize(Math.random() * 100);
                System.out.println(shape);
            } else if (shape instanceof Rectangle) {
                System.out.println("Rectangle");
                ((Rectangle) shape).resize(Math.random() * 100);
                System.out.println(shape);
            }
        }
    }
}

