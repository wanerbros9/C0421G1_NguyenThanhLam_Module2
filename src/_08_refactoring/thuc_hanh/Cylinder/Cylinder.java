package _08_refactoring.thuc_hanh.Cylinder;

public class Cylinder {
    public static double getVolume(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = baseArea * height + 2 * perimeter;
        return volume;
    }

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }

    private static double getPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }
}
