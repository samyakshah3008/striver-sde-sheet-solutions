package StepThree.Easy;

import java.util.Arrays;

public class RotateArrayByOnePlace {

    public static void main(String[] args) {
        int[] sampleArray = { 1, 2, 3, 4 };
        int temp = sampleArray[0];
        for (int i = 1; i < sampleArray.length; i++) {
            sampleArray[i - 1] = sampleArray[i];
        }
        sampleArray[sampleArray.length - 1] = temp;
        System.out.println(Arrays.toString(sampleArray));
    }

}
