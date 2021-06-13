package _07_abstract_interface.bai_tap.colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(5);
        shape[1] = new Rectangle(4, 6);
        shape[2] = new Circle(2.4);
        for (Shape shapes :shape){
            if (shapes != null){
                ((Colorable)shapes).howToColor();
            }else {
                System.out.println((Object) null);
            }
        }
    }
}
