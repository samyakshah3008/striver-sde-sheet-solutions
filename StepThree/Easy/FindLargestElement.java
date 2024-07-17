package StepThree.Easy;

public class FindLargestElement {

    public static int findLargest(int[] arr) {
        int largestElementIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[largestElementIndex]) {
                largestElementIndex = i;
            }
        }
        System.out.println(arr[largestElementIndex]);
        return arr[largestElementIndex];
    }

    public static void main(String[] args) {
        int[] sampleArray = { 1, 100, 200, 1000, 500 };

        // findLargest(sampleArray); // approach 1 which is best, recursive approach,
        // where time complexity is big oh of n and space complexity is big oh of 1

        // Arrays.sort(sampleArray);
        // System.out.println(sampleArray[sampleArray.length - 1]); // approach 2 -
        // brute force where time complexity is big oh of nlogn and space complexity is
        // big oh of n

    }
}
