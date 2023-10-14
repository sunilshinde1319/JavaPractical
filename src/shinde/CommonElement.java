package shinde;

import java.util.HashSet;
import java.util.Set;

public class CommonElement {

    // Returns the common elements between two arrays
    public static Integer[] findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonElements = new HashSet<>();

        // Add all elements of array1 to set1
        for (int value : array1) {
            set1.add(value);
        }

        // Check each element of array2 in set1 to find common elements
        for (int value : array2) {
            if (set1.contains(value)) {
                commonElements.add(value);
            }
        }

        // Convert the set of common elements to an array
        return commonElements.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        Integer[] common = findCommonElements(array1, array2);
        for (int value : common) {
            System.out.print(value + " ");  // Expected output: 4 5
        }
    }
}

