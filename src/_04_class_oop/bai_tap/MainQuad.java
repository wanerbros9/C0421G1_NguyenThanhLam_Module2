package _04_class_oop.bai_tap;

import java.util.Scanner;

public class MainQuad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        System.out.println(equation.getCalculate());
    }
}