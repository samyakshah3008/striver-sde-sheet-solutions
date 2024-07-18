package StepThree.Easy;

import java.util.Arrays;

public class FindSecondSmallestAndSecondLargestElement {

    public static int[] getLargestAndSecondLargestElements(int[] sampleArray) {

        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < sampleArray.length; i++) {
            if (sampleArray[i] > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = sampleArray[i];
            } else {
                if (sampleArray[i] > secondLargestNumber && sampleArray[i] < largestNumber) {
                    secondLargestNumber = sampleArray[i];
                }
            }
        }

        System.out.println(largestNumber);
        System.out.println(secondLargestNumber);

        return sampleArray;

    }

    public static int[] getSmallestAndSecondSmallestElements(int[] sampleArray) {

        int smallestNumber = Integer.MAX_VALUE;
        int secondSmallestNumber = Integer.MAX_VALUE;

        for (int i = 0; i < sampleArray.length; i++) {
            if (sampleArray[i] < smallestNumber) {
                secondSmallestNumber = smallestNumber;
                smallestNumber = sampleArray[i];
            } else {
                if (sampleArray[i] < secondSmallestNumber && sampleArray[i] > smallestNumber) {
                    secondSmallestNumber = sampleArray[i];
                }
            }
        }

        System.out.println(smallestNumber);
        System.out.println(secondSmallestNumber);

        return sampleArray;

    }

    public static void getElements(int[] sampleArray, int n) {
        // brute for approach
        if (n == 0 || n == 1) {
            System.out.println(-1);
            System.out.println(" ");
            System.out.println(-1);
            System.out.println("\n");
        } else {
            // brute force approach and better approach.
            Arrays.sort(sampleArray);
            System.out.println(Arrays.toString(sampleArray));
            int largestNumber = sampleArray[sampleArray.length - 1];
            int smallestNumber = sampleArray[0];
            int secondLargestNumber = Integer.MIN_VALUE;
            int secondSmallestNumber = Integer.MAX_VALUE;
            for (int i = sampleArray.length - 2; i >= 0; i--) {
                if (sampleArray[i] != largestNumber && sampleArray[i] > secondLargestNumber) {
                    secondLargestNumber = sampleArray[i];
                }
            }

            for (int i = 1; i < sampleArray.length; i++) {
                if (sampleArray[i] != smallestNumber && sampleArray[i] < secondSmallestNumber) {
                    secondSmallestNumber = sampleArray[i];
                }
            }

            System.out.println(secondLargestNumber);
            System.out.println(secondSmallestNumber);

            System.out.println(sampleArray[1]);
            System.out.println(sampleArray[sampleArray.length - 2]);
        }

        // int[] smallAndLargeElements = getSmallestAndLargestElements(sampleArray);
        // System.out.println(Arrays.toString(smallAndLargeElements));

    }

    public static void main(String[] args) {
        int[] sampleArray = { 1, 1, 2, 4, 7, 7, 5 };
        // getElements(sampleArray, sampleArray.length);
        getLargestAndSecondLargestElements(sampleArray);
        getSmallestAndSecondSmallestElements(sampleArray);

    }
}
