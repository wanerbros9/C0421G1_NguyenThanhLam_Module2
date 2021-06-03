package _02_loop_java.bai_tap;

public class DifferentGeometry {
    public static void main(String[] args) {
        for (int i =1;i<=3;i++){
            for (int j=1;j<=7;j++){
                System.out.print("*");
            }System.out.print("\n");
        }
        System.out.print("\n");
        for (int i=0;i<=5;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i =5;i>=0;i--){
            for (int j =0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
