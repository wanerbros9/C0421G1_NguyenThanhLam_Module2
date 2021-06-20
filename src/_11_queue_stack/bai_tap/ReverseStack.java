package _11_queue_stack.bai_tap;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void IntegerStack() {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter element array: ");
        int number = scanner.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Element at " + i + " : ");
            arr[i] = scanner.nextInt();
            stack1.push(arr[i]);
        }
//        System.out.println("Your Array: " + Arrays.toString(arr));
        System.out.println("Stack: " + stack1);

        for (int i = number; i > 0; i--) {
            int numberPop = stack1.pop();
            stack2.push(numberPop);
        }
        System.out.println("Reversed Stack: " + stack2);
    }

    private static void StringStack() {
        Scanner scanner = new Scanner(System.in);
        Stack<String> wStack = new Stack<>();
        System.out.print("Enter your word: ");
        String inputWord = scanner.nextLine();
        String[] mWord = inputWord.split(",", inputWord.length());
        for (String string : mWord) {
            wStack.push(string);
        }
        String outPut = "";
        for (int i = mWord.length-1; i > 0; i--){
            mWord[i] = wStack.pop();

        }
        outPut += mWord;
        System.out.println(outPut.toString());
    }

    public static void main(String[] args) {
//        IntegerStack();
        StringStack();
    }
}
