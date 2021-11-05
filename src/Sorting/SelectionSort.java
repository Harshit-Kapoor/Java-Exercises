package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String args[]) {
        int arr[] = {2,4,3,6,4,6,74,3,2,-1,57,-34,7,85,4,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMax(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    private static int getMax(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
