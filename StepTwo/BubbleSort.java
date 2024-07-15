package StepTwo;

import java.util.Arrays;

class bubbleSort {

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i <= arr.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                // swap check condition
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true;
                }
            }
            // condition for if no swapping is done which means that array is now already
            // sorted and we can end the program
            if (!isSwapped) {
                break;
            }

        }
        return arr;
    }

    public static void main(String args[]) {
        int[] bubbleSortArr = { 20, 40, 30, 50, 10 };
        bubbleSort(bubbleSortArr);
        System.out.println(Arrays.toString(bubbleSortArr)); // need to convert to strings because arrays cannot be
                                                            // printed to console directly
    }
}