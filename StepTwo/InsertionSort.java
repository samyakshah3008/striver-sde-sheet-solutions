package StepTwo;

import java.util.Arrays;

public class InsertionSort {

    public static void swapElements(int[] arr, int highestElementIndex, int lastIndex) {

        int temp = arr[highestElementIndex];
        arr[highestElementIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swapElements(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] insertionSortArr = { 20, 40, -30, 0, 50, 10 };
        insertionSort(insertionSortArr);
        System.out.println(Arrays.toString(insertionSortArr));
    }

}
