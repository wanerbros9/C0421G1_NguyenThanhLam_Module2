package _06_java_inheritance.bai_tap.CircleClass_CylinderClass;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(){
    }

    public Cylinder(double radius, String color, double height) {
        super(radius,color);
        this.height = height;
    }

    public double getVolume(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                " Volume= "+this.getVolume()+
                " Color is: "+this.getColor()+'}';

    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3,"red",9);
        System.out.println(cylinder);
    }
}
