package sort_algorithms.insertion_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        /*
        *Variables:
        * firstUnsortedIndex = 1 - First index of the unsorted partition
        * i = 0 - index used to traverse the sorted partition from right to left
        * newElement = 1 - the index of the first value we want to insert in the sorted partition - array[firstUnsortedIndex]
        */

        // For loop traverses the unsorted partition of the array to pick the next newValue to be sorted
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newValue = intArray[firstUnsortedIndex];
            int i;
            /* Loop traverses the array from right to left
            i > 0 checks if we hit the front of the array.
            intArray[i - 1] > newValue checks if the next element in the sorted partition is greater than the newValue,
            we want to continue to iterate while that condition is true.
            */
            for (i = firstUnsortedIndex - 1; i > 0 && intArray[i - 1] > newValue; i-- ) {
                intArray[i] = intArray[i - 1]; // shifts element to the right
            }
            intArray[i] = newValue; // inserts newElement in the correct position
            System.out.println(Arrays.toString(intArray));
        }
    }

    public static void insertElement(int[] array, int i, int value){
        array[i] = value;
    }
    public static void pushElementToRight(int[] array, int i){
        array[i + 1] = array[i];
    }
}
