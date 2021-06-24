package _14_sort_algorithms.bai_tap;

public class InsertionSort {
    static int[] list = {2, 5, 6, 1, 3, 14, 12};

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int j : list) {
            System.out.print(j + " ");
        }
    }
}
