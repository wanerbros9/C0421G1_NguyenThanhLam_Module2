package _11_queue_stack.bai_tap;

import javax.swing.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        TreeMap<String, Integer> myTreeMap = new TreeMap<>();
        String list = "Nguyen Thanh Lam";
        String[] array = list.toLowerCase().split("");
        System.out.println(Arrays.toString(array));
    }
}
