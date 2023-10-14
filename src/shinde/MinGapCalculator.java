package shinde;

public class MinGapCalculator {

    public static int minGap(int[] array) {
        if (array.length < 2) {
            return 0;
        }

        int minGap = Integer.MAX_VALUE;

        for (int i = 1; i < array.length; i++) {
            int gap = array[i] - array[i - 1];
            if (gap < minGap) {
                minGap = gap;
            }
        }

        return minGap;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 6, 7, 12};
        System.out.println("Minimum Gap: " + minGap(array)); // Should print 1
    }
}