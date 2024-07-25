package kunalKushwahaDsaConcepts;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] sampleArray = {
                { 23, 4, 1, 12 },
                { 1, 2, 3, 13 },
                { 3, 4, 5, 14 },
                { 5, 6, 3, 11 }
        };

        int targetElement = 11;
        int minElement = sampleArray[0][0];
        int maxElement = sampleArray[0][0];

        for (int row = 0; row < sampleArray.length; row++) {
            for (int col = 0; col < sampleArray[row].length; col++) {
                if (sampleArray[row][col] == targetElement) {
                    System.out.println(row);
                    System.out.println(col);
                    int[][] answerIndex = new int[row][col];
                }
                if (sampleArray[row][col] < minElement) {
                    minElement = sampleArray[row][col];
                }
                if (sampleArray[row][col] > maxElement) {
                    maxElement = sampleArray[row][col];
                }
            }
        }

        System.out.println(minElement);
        System.out.println(maxElement);
    }
}
