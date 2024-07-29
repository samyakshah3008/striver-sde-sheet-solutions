package StepThree.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToEnd {

    public static int[] moveZeros(int[] sampleArray) {

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < sampleArray.length; i++) {
            if (sampleArray[i] != 0) {
                if (sampleArray[i] != 0)
                    temp.add(sampleArray[i]);

            }
        }

        for (int i = 0; i < temp.size(); i++) {
            sampleArray[i] = temp.get(i);
        }

        for (int i = temp.size(); i < sampleArray.length; i++) {
            sampleArray[i] = 0;
        }

        return sampleArray;

    }

    public static int[] moveZerosOptimal(int[] sampleArray) {
        int j = -1;
        for (int k = 0; k < sampleArray.length; k++) {
            if (sampleArray[k] == 0) {
                j = k;
                break;
            }
        }

        for (int i = j + 1; i < sampleArray.length; i++) {
            if (sampleArray[i] != 0) {
                int temp = sampleArray[i];
                sampleArray[i] = sampleArray[j];
                sampleArray[j] = temp;
                j++;
            }
        }
        return sampleArray;
    }

    public static void main(String[] args) {
        int[] sampleArray = { 1, 2, 3, 4, 0, 0, 7, 8 };
        // int[] ans = moveZeros(sampleArray);
        int[] ans = moveZerosOptimal(sampleArray);
        System.out.println(Arrays.toString(ans));
        // brute force approach:

    }
}
