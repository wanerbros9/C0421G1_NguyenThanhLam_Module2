package _01_introduction_java.bai_tap;

import java.util.Scanner;

public class CharToNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int hundredsDigit = number / 100;
        int tensDigit = (number % 100) / 10;
        int unitDigit = number - hundredsDigit * 100 - tensDigit * 10;

        readHundreds(hundredsDigit);
        if (tensDigit == 1) {
            readTens(tensDigit, unitDigit);
        } else {
            readTens(tensDigit, unitDigit);
            readUnit(unitDigit);
        }
    }

    public static void readHundreds(int hundredsDigit) {
        switch (hundredsDigit) {
            case 1:
                System.out.print("One hundred ");
                break;
            case 2:
                System.out.print("Two hundred ");
                break;
            case 3:
                System.out.print("Three hundred ");
                break;
            case 4:
                System.out.print("Four hundred ");
                break;
            case 5:
                System.out.print("Five hundred ");
                break;
            case 6:
                System.out.print("Six hundred ");
                break;
            case 7:
                System.out.print("Seven hundred ");
                break;
            case 8:
                System.out.print("Eight hundred ");
                break;
            default:
                System.out.print("Nine hundred ");
                break;
        }
    }

    public static void readTens(int tensDigit, int readUnit) {
        int tensDigits = 10 + readUnit;
        if (tensDigit == 1) {
            switch (tensDigits) {
                case 10:
                    System.out.print("ten");
                    break;
                case 11:
                    System.out.print("eleven");
                    break;
                case 12:
                    System.out.print("twelve");
                    break;
                case 13:
                    System.out.print("thirteen");
                    break;
                case 14:
                    System.out.print("fourteen");
                    break;
                case 15:
                    System.out.print("fifteen");
                    break;
                case 16:
                    System.out.print("sixteen");
                    break;
                case 17:
                    System.out.print("seventeen");
                    break;
                case 18:
                    System.out.print("eighteen");
                    break;
                default:
                    System.out.print("nineteen");
                    break;
            }
        } else {
            switch (tensDigit) {
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("forty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                default:
                    System.out.print("ninety ");
                    break;
            }
        }
    }

    public static void readUnit(int unitDigit) {
        switch (unitDigit) {
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            default:
                System.out.print("nine");
                break;
        }
    }
}