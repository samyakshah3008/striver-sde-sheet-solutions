package StepTwo;

import java.util.Arrays;

public class SelectionSort {

    public static int getMaxElementIndex(int[] arr, int startIndex, int endIndex) {
        int maxElementIndex = startIndex;
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[maxElementIndex] < arr[i]) {
                maxElementIndex = i;
            }
        }

        return maxElementIndex;
    }

    public static void swapElements(int[] arr, int highestElementIndex, int lastIndex) {

        int temp = arr[highestElementIndex];
        arr[highestElementIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with the correct index
            int lastIndex = arr.length - 1 - i;
            int highestElementIndex = getMaxElementIndex(arr, 0, lastIndex);
            swapElements(arr, highestElementIndex, lastIndex);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] selectionSortArr = { 20, 40, -30, 0, 50, 10 };
        selectionSort(selectionSortArr);
        System.out.println(Arrays.toString(selectionSortArr));
    }
}
