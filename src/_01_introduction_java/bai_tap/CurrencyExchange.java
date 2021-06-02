package _01_introduction_java.bai_tap;

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your money in USD: ");
        int CurrencyUSD = scanner.nextInt();
        int CurrencyVND = rate * CurrencyUSD;
        System.out.println("Your money in VND is: " + CurrencyVND + " VND");
    }
}
