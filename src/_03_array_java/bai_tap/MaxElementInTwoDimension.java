package _03_array_java.bai_tap;

import java.util.Scanner;

public class MaxElementInTwoDimension {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input row: ");
        int row = scanner.nextInt();
        System.out.println("Input col: ");
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Input element at [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max number is: "+max);
    }
}
