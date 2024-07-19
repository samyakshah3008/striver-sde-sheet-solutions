package StepThree.Easy;

public class LinearSearch {

    public static void main(String[] args) {
        int[] sampleArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int userInputNum = 5;

        for (int i = 0; i < sampleArray.length; i++) {
            if (sampleArray[i] == userInputNum) {
                System.out.println(i);
            }
        }
        System.out.println(-1);
    }

}
