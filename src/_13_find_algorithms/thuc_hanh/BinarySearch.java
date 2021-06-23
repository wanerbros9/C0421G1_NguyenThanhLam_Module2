package _13_find_algorithms.thuc_hanh;

public class BinarySearch {
    static int[] list = {2, 4, 10, 16, 23, 45, 66, 87};

    static int binarySearch(int[] list, int value) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (value < list[mid]) {
                high = mid - 1;
            }else if (value == list[mid]){
                return mid;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,16));
    }
}
