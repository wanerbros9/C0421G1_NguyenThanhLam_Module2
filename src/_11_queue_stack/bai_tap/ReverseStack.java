package _11_queue_stack.bai_tap;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void IntegerStack() {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter array elements : ");
        n = Scanner.next
        int[] arr = new int[];

        Stack<Integer> intStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Element you want to push: ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("Your number at " + i + " : ");
            int number = scanner.nextInt();
            intStack.push(number);
        }
        System.out.println(intStack);

        for (int i = 0; i > 0; i--) {
            int numPop = intStack.pop();
            intStack.push(numPop);
        }
        System.out.println(intStack);
    }

    private static void StringStack() {
        Stack<String> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String inputWord = scanner.nextLine();
    }

    public static void main(String[] args) {
        IntegerStack();
        StringStack();
    }
}
