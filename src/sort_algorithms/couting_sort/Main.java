package sort_algorithms.couting_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(intArray,1,10);

        System.out.println(Arrays.toString(intArray));

    }

    public static void countingSort(int[] input, int min, int max){

        int[] countArray = new int[(max - min + 1)]; //Create array with the size of the range of values contained in the input

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++; //Input[5] - 1(min) = 4 - Element 5 should be counted on index 4 of countArray
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
