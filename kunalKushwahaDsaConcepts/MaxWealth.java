package kunalKushwahaDsaConcepts;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] sample2DArray = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int maxValue = 0;
        for (int row = 0; row < sample2DArray.length; row++) {
            int rowSum = 0;
            for (int col = 0; col < sample2DArray[row].length; col++) {
                rowSum = rowSum + sample2DArray[row][col];
            }
            if (rowSum > maxValue) {
                maxValue = rowSum;
            }
        }
        System.out.println(maxValue);
    }
}
