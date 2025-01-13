package sort_algorithms.selection_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //SelectionSort algorithm implementation

        /*
        *Variables:
        * lastUnsortedIndex = last index of the array and is decremented each time an element is sorted
        * i = 1 - index used to traverse the array from left to right
        * largest = 0 - index of the largest element in unsorted partition - It starts at index 0
        */

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swap(intArray,largest,lastUnsortedIndex);
        }
        System.out.println(Arrays.toString(intArray));

    }

    public static void swap(int[] intArray, int i, int j){
        if (i == j) {
            return;
        }
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
