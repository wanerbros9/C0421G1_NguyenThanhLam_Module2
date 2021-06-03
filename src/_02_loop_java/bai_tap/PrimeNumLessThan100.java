package _02_loop_java.bai_tap;

import java.util.Scanner;

public class PrimeNumLessThan100 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = scanner.nextInt();
        System.out.println("Prime number less than " + n + " is: ");
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(" "+i);
            }
        }
    }
}
