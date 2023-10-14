package shinde;

import java.util.Arrays;

public class ArrayRemoval {

    // Removes all occurrences of the specified element from the array and returns a new array
    public static int[] removeAllOccurrences(int[] array, int elementToRemove) {
        // Calculate the number of occurrences of the element to remove
        int count = 0;
        for (int value : array) {
            if (value == elementToRemove) {
                count++;
            }
        }

        // If no occurrences found, return the original array
        if (count == 0) {
            return array;
        }

        // Create a new array with the adjusted size
        int[] result = new int[array.length - count];
        int index = 0;
        for (int value : array) {
            if (value != elementToRemove) {
                result[index++] = value;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 2};
        int elementToRemove = 2;

        int[] updatedArray = removeAllOccurrences(array, elementToRemove);
        System.out.println(Arrays.toString(updatedArray));  // Expected output: [1, 3, 4, 5]
    }
}

