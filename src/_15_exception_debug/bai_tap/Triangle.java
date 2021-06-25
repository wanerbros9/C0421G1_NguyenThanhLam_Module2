package _15_exception_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    private static Exception e;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập cạnh b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập cạnh c: ");
        int c = scanner.nextInt();

        try {
            if ((a < 0 || b < 0 || c < 0) || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
                throw (e);
            } else {
                System.out.println("La 2 canh mot tam giac");
            }
        } catch (Exception e) {
            System.out.println("Khong phai 3 canh cua 1 tam giac");
        }
    }
}
