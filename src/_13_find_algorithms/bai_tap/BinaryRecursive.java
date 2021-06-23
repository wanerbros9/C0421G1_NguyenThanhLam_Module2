package _13_find_algorithms.bai_tap;

public class BinaryRecursive {
    static int binaryRecursive(int[] list, int value, int high, int low) {
        if (high >= low) {
            int mid = (high + low) / 2;
            if (value < list[mid]) {
                return binaryRecursive(list, value, mid-1, low);
            } else if (value > list[mid]) {
                return binaryRecursive(list, value, high, mid+1);
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {22,45,67,89,94,98,99};
        System.out.println(binaryRecursive(list,94,6,0));
    }
}
