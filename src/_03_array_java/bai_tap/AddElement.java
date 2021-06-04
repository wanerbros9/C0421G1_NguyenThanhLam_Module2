package _03_array_java.bai_tap;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr={10,4,6,8,7,0,0,0,0,0};
        int i=0;
        System.out.println("Enter your number you want to push in: ");
        int number = scanner.nextInt();
        System.out.println("Enter the position you want to push: ");
        int index = scanner.nextInt();
        if (index<arr.length){
            for (i = arr.length-2;i>=index;i--){
                arr[i+1]=arr[i];
            }
            arr[index]=number;
            for (int element:arr){
                System.out.print(element+" ");
            }
        }else {
            System.out.println("Wrong");
        }
    }
}
