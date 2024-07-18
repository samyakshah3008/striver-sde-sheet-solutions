package StepThree.Easy;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] sampleArray = { 1, 2, 3, 3, 3, 3, 4, 4 };
        int i = 0;
        for (int j = 1; j < sampleArray.length; j++) {
            if (sampleArray[j] != sampleArray[i]) {
                sampleArray[i + 1] = sampleArray[j];
                i++;
            }
        }
        System.out.println(i + 1);

    }

}
