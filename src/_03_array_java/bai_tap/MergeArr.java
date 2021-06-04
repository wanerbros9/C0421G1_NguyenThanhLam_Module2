package _03_array_java.bai_tap;

public class MergeArr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr = new int[arr1.length+arr2.length];
        for (int i=0;i< arr1.length;i++){
            arr[i]=arr1[i];
        }
        for (int j=0;j< arr2.length;j++){
            arr[arr1.length+j] = arr2[j];
        }
        for (int array : arr)
        System.out.println(array+" ");
    }
}
