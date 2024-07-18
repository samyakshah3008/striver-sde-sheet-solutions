package StepThree.Easy;

public class CheckArraySortedAndRotated {

    public static boolean checkArraySortedAndRotated(int[] sampleArray) {

        int largestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < sampleArray.length; i++) {
            if (sampleArray[i] >= largestNumber) {
                largestNumber = sampleArray[i];
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] sampleArray = { 1, 2, 3, 4, 4, 5, 5, 2 };
        System.out.println(checkArraySortedAndRotated(sampleArray));
    }
}
