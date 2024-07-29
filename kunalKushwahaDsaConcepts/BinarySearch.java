package kunalKushwahaDsaConcepts;

public class BinarySearch {

    public static int findElementWithBinarySearch(int[] sampleArray, int target) {
        int start = 0;
        int end = sampleArray.length - 1;

        while (start <= end) {
            // find middle element
            // int mid = (start+end)/2 this is java specific issue that calculation may
            // exceed the space
            int mid = start + (end - start) / 2;

            if (target < sampleArray[mid]) {
                end = mid - 1;
            } else if (target > sampleArray[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Binary Search!!");
        int[] sampleArray = { 1, 2, 3, 10, 30, 40, 50, 60, 80 };
        int target = 60;
        int answer = findElementWithBinarySearch(sampleArray, target);
        System.out.println(answer);
    }
}
