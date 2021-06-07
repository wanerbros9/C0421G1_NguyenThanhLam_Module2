package _03_array_java.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int n, c, i;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập vào số phần tử của mảng");
            n = scanner.nextInt();
        } while (n <= 0);
        int arr[] = new int[n];
        System.out.println("Nhâp các phần tử của mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhập số cần xoá: ");
        int k = scanner.nextInt();

        for (c = i = 0; i < n; i++) {
            if (arr[i] != k) {
                arr[c] = arr[i];
                c++;
            }
        }
        n = c;
        System.out.print("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
