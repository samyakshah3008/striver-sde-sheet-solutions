package StepThree.Easy;

import java.util.Arrays;

public class RotateArrayByDPlace {

    public static void main(String[] args) {

        // brute force approach
        int[] sampleArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int rotateByDPlace = 18;

        rotateByDPlace = rotateByDPlace % sampleArray.length; // this makes it better solution
        System.out.println(rotateByDPlace);
        int[] temp = new int[rotateByDPlace];

        for (int i = 0; i < rotateByDPlace; i++) {
            temp[i] = sampleArray[i];
        }

        for (int i = 0; i < sampleArray.length - rotateByDPlace; i++) {
            sampleArray[i] = sampleArray[i + rotateByDPlace];
        }

        for (int i = 0; i < temp.length; i++) {
            sampleArray[sampleArray.length - 1 - i] = temp[temp.length - 1 - i];
        }

        System.out.println(Arrays.toString(sampleArray));

    }

}
