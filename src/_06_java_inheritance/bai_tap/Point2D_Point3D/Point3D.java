package _06_java_inheritance.bai_tap.Point2D_Point3D;

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
        super.getX();
        super.getY();
        this.z = z;
    }

    public float[] getXYZ(){
        float[] array = {super.getX(),super.getY(),this.z};
        return array;
    }

    
}
