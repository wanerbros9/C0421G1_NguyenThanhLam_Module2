package _03_array_java.bai_tap;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập vào số phần tử của mảng");
            n = scanner.nextInt();
        } while (n <= 0);
        int arr[] = new int[n];
        System.out.println("Nhâp các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i=0;i< arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất là: "+min);
    }
}
