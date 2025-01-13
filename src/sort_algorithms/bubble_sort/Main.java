package sort_algorithms.bubble_sort;
import java.util.Arrays;

//Implementation of BubbleSort algorithm in ascending order bubbling the large numbers to the end of the array.

public class Main {
    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        System.out.println(Arrays.toString(intArray));

        /*
        * Outer Loop that splits the array on unsorted/sorted regions by keeping track of the last unsorted index,
        * starting at the last index of the array. At each iteration the lastUnsortedIndex will be decremented to
        * indicate the new lastUnsortedIndex.
        * The previous index stored in the lastUnsortedIndex will be occupied by the sorted value
        */
        for (
                int lastUnsortedIndex = intArray.length - 1;
                lastUnsortedIndex > 0;
                lastUnsortedIndex--
        ) {
            /*
            * Inner loop traverses the array until current lastUnsortedIndex, swapping values when necessary at each
            * iteration.
            */
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }
        System.out.println(Arrays.toString(intArray));
    }

    // Swaps the position of 2 values on a given array based on their index.
    public static void swap(int[] array, int i, int j){

        if (i == j) {         //If variables are equal, do nothing.
        return;
        }
        int temp = array[i]; // Store array value at index i in a temporary variable.
        array[i] = array[j]; // Changes the value at index i to the value contained in index j
        array[j] = temp;     // Changes the value at index j to the value that war previously contained at index i
    }

    /*
    * Bubble sort is also a Stable Sort algorithm, which means when comparing 2 equal elements, these elements positions
    * are not changed. This happens because of the if block in the swap method, that checks when elements are equal to
    * each other, and when they are the code stops and goes for the next iteration.
    */

}
