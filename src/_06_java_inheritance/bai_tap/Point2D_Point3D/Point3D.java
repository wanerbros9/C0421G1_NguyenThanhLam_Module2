package _06_java_inheritance.bai_tap.Point2D_Point3D;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z;

    public Point3D(){
    }

    public Point3D(float x,float y,float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] array = {super.getX(),super.getY(),this.z};
        return array;
    }

    @Override
    public String toString() {
        return "Point3D " + Arrays.toString(getXYZ());
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(4,6,1);
//        System.out.println(point3D);
        point3D.setXYZ(6,5,7);
        System.out.println(point3D);
    }
}
