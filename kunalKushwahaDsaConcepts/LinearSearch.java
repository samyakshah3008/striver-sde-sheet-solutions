package kunalKushwahaDsaConcepts;

public class LinearSearch {

    public static int linearSearch(int[] arr, int elementToSearch) {

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {

            int element = arr[i];

            if (element == elementToSearch) {
                return i;
            }

        }

        return -1;
    }

    public static boolean linearSearchString(String sampleString, char target) {

        if (sampleString.length() == 0) {
            return false;
        }

        for (int i = 0; i < sampleString.length(); i++) {
            if (sampleString.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Linear search. ");

        int[] sampleArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int elementToSearch = 17;

        String sampleString = "Samyak";
        char toSearchCharacter = 'a';

        boolean ansString = linearSearchString(sampleString, toSearchCharacter);
        System.out.println(ansString);

        int ans = linearSearch(sampleArray, elementToSearch);
        System.out.println(ans);
    }
}
