package _06_java_inheritance.bai_tap.Point2D_Point3D;

import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {getX(), getY()};
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D "+ Arrays.toString(getXY());
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,4);
        System.out.println(point2D);
    }
}
