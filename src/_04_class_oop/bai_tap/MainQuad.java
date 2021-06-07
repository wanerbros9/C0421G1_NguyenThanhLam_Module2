package _04_class_oop.bai_tap;

public class MainQuad {
    public static void main(String[] args) {
        QuadraticEquation equation1 = new QuadraticEquation(8,-6,1);
        QuadraticEquation equation2 = new QuadraticEquation(1,-4,4);
        QuadraticEquation equation3 = new QuadraticEquation(1,3,8);
//        equation1.calculate();
        equation2.calculate();
//        equation3.calculate();
    }
}