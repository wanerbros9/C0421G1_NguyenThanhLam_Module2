package _11_queue_stack.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static boolean check(String str) {
        Stack<Character> stack = new Stack<>();
        char left;
        for (int i = 0; i < str.length(); i++) {
            left = str.charAt(i);
            if (left == '(') {
                stack.push(left);
            } else if (left == ')') {
                if (stack.isEmpty()) {
                    return false;
                }else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap bieu thuc can check: ");
        String str = scanner.nextLine();
        System.out.println(check(str));
    }
}
