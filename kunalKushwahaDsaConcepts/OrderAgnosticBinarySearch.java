package kunalKushwahaDsaConcepts;

public class OrderAgnosticBinarySearch {

    public static int findElementWithBinarySearch(int[] sampleArray, int target) {

        int start = 0;
        int end = sampleArray.length - 1;
        boolean isAscendingSortedArray = sampleArray[start] < sampleArray[end];

        while (start <= end) {
            // find middle element
            // int mid = (start+end)/2 this is java specific issue that calculation may
            // exceed the space
            int mid = start + (end - start) / 2;

            if (target == sampleArray[mid]) {
                return mid;
            }
            if (isAscendingSortedArray) {
                if (target < sampleArray[mid]) {
                    end = mid - 1;
                } else if (target > sampleArray[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > sampleArray[mid]) {
                    end = mid - 1;
                } else if (target < sampleArray[mid]) {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Binary Search!!");
        int[] sampleArray = { 7, 6, 5, 4, 3, 2, 1 };
        int target = 7;
        int answer = findElementWithBinarySearch(sampleArray, target);
        System.out.println(answer);
    }
}
