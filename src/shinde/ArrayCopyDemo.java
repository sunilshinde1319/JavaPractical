package shinde;

public class ArrayCopyDemo {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        
        // Create a new array with the same length as the original array
        int[] copiedArray = new int[originalArray.length];
        
        // Copy elements from originalArray to copiedArray
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }
        
        System.out.print("Old/original Array : ");
        
        for (int value : originalArray) {
            System.out.print(value + " ");  // Expected output: 1 2 3 4 5
        }
        System.out.println();
        // Print copied array
        System.out.print("New/ Copied  Array : ");
        
        for (int value : copiedArray) {
            System.out.print(value + " ");  // Expected output: 1 2 3 4 5
        }
    }
}
