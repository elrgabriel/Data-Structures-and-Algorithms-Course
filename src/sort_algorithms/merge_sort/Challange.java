package sort_algorithms.merge_sort;

/*
 Sort Algorithms - Challenge 1
 - Modify the MergeSort algorithm so that it sorts integers in DESCENDING order
 - Use the usual example array
 */


import java.util.Arrays;

public class Challange {



    public static void descendingMergeSort(int[] input, int start, int end){
        if (end - start < 2) { //If array length is 1 break recursion.
            return;
        }

        int mid = (start + end) / 2; //Midpoint of the array to make the partition
        descendingMergeSort(input, start, mid); // When this recursive call is resolved, the input array will already be broken in multiple 1 element arrays
        descendingMergeSort(input,mid,end);
        descendingMerge(input, start, mid, end);

    }

    public static void descendingMerge(int[] input, int start, int mid, int end){
        if (input[mid - 1] >= input[mid]) { // Checks if the last element in the left array is <= than the first element in the right array, if true that means both arrays are sorted and the recursive call may end.
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++]; // ++ is post-increment, so it will be updated after the elements are assigned to temp
        }
        System.arraycopy(input, i, input, start + tempIndex, mid - i); //Handles leftover elements in the left array when necessary.
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
