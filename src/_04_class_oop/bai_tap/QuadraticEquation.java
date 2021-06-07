package _04_class_oop.bai_tap;

public class QuadraticEquation {
    private double a, b, c;
    private double discriminant;
    private double x1, x2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = b * b - 4 * a * c;
    }

    public void calculate() {
        if (this.discriminant > 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.print("x1 = " + x1 + ", x2 = " + x2);
        } else if (this.discriminant == 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Only one result x = " + x1);
        } else {
            System.out.println("No result");
        }
    }
}
