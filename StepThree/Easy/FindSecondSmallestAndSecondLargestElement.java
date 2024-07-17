package StepThree.Easy;

import java.util.Arrays;

public class FindSecondSmallestAndSecondLargestElement {

    public static int[] getSmallestAndLargestElements(int[] sampleArray) {

        int largestElementIndex = 0;
        int smallestElementIndex = 0;

        for (int i = 0; i < sampleArray.length; i++) {
            if (sampleArray[i] > sampleArray[largestElementIndex]) {
                largestElementIndex = i;
            }
            if (sampleArray[i] < sampleArray[smallestElementIndex]) {
                smallestElementIndex = i;
            }
        }
        int[] newArray = {};
        for (int i = 0; i < sampleArray.length; i++) {
            if (i != smallestElementIndex && i != largestElementIndex) {
                newArray[i] = sampleArray[i];
            }
        }

        int[] answer = { sampleArray[smallestElementIndex], sampleArray[largestElementIndex] };

        return answer;

    }

    public static void getElements(int[] sampleArray, int n) {
        // brute for approach
        // if (n == 0 || n == 1) {
        // System.out.println(-1);
        // System.out.println(" ");
        // System.out.println(-1);
        // System.out.println("\n");
        // } else {
        // // brute force approach
        // Arrays.sort(sampleArray);
        // System.out.println(sampleArray[1]);
        // System.out.println(sampleArray[sampleArray.length - 2]);
        // }

        // better approach

        int[] smallAndLargeElements = getSmallestAndLargestElements(sampleArray);
        System.out.println(Arrays.toString(smallAndLargeElements));

    }

    public static void main(String[] args) {
        int[] sampleArray = { 1, 100, 200, 300, 99, 49 };
        getElements(sampleArray, sampleArray.length);

    }
}
