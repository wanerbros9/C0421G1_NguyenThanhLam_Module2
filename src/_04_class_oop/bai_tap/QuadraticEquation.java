package _04_class_oop.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return (Math.pow(this.a, 2)) - (4 * this.a * this.c);
    }

    public double getX1() {
        return (-this.b + Math.sqrt(this.getDiscriminant()) / (2 * this.a));
    }

    public double getX2() {
        return (-this.b - Math.sqrt(this.getDiscriminant()) / (2 * this.a));
    }

    public String getCalculate() {
        if (this.getDiscriminant() > 0) {
            return "x1 is: " + getX1() + "\n" +
                    "x2 is: " + getX2();
        } else if (this.getDiscriminant() == 0) {
            return "Only one result x = " + (-this.b / 2 * this.a);
        } else {
            return "No result";
        }
    }
}
