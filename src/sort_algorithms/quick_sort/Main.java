package sort_algorithms.quick_sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        quickSort(intArray,0, intArray.length);
        System.out.println(Arrays.toString(intArray));
    }

    public static void quickSort(int[] input, int start, int end){
        if (end - start < 2) { //If array has 1 element, return
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex); // Recursively sort left partition
        quickSort(input, pivotIndex+1, end); // Recursively sort right partition
    }

    public static int partition(int[] input, int start, int end){
        //This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            //NOTE: empty loop body
            while (i < j && input[--j] >= pivot); // Move j left until finding an element smaller than the pivot
            if (i < j) {
                input[i] = input[j]; // Move the smaller element to pivot's original position
            }
            //NOTE: empty loop body
            while(i < j && input[++i] <= pivot);// Move i right until finding an element greater than the pivot
            if (i < j) {
                input[j] = input[i]; // Move the larger element to the right partition
            }
        }

        input[j] = pivot; // Assign pivot to its correct position
        return j; //Return pivotIndex to be used in quickSort method
    }
}
