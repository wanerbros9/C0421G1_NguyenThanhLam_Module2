package _11_queue_stack.bai_tap;

import javax.swing.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        java.util.TreeMap<String, Integer> myTreeMap = new java.util.TreeMap<>();
        String list = "Nguyen Thanh Lam";
        String[] array = list.toLowerCase().split("");
        System.out.println(Arrays.toString(array));
    }
}
