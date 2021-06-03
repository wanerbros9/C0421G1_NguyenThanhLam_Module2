package _02_loop_java.bai_tap;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int countPrime = 0;
        int run = 1;
        while (true) {
            int count = 0;
            for (int i = 1; i <= run; i++) {
                if (run % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(run);
                countPrime++;
            }
            if (countPrime == 20) {
                break;
            }
            run++;
        }
    }
}
