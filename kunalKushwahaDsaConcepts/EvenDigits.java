package kunalKushwahaDsaConcepts;

public class EvenDigits {
    public static void main(String[] args) {
        int[] sampleArray = { 1, 111, 22, 333, 44 };
        int count = 0;
        for (int i = 0; i < sampleArray.length; i++) {
            if (String.valueOf(sampleArray[i]).length() % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
