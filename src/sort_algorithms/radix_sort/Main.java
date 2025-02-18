package sort_algorithms.radix_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] radixSort = { 4725, 4586, 1330, 8792, 1594, 5729 };

        radixSort(radixSort,10,4);

        System.out.println(Arrays.toString(radixSort));
    }

    public static void radixSort(int[] input, int radix, int width){
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }

    }

    public static void radixSingleSort(int[] input, int position, int radix){
        int numItems = input.length;
        int[] countArray = new int[radix];

        for (int value: input) {
            countArray[getDigit(position,value,radix)]++;
        }
        //Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[ j - 1 ];
        }

        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >=0; tempIndex--) {
            temp[--countArray[getDigit( position, input[tempIndex], radix )]] =
                input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getDigit(int position, int value, int radix){
        return value / (int) Math.pow(radix,position) % radix; // Math wizardry to get the value of the element at it's given position (1's, 10's, 100's etc...)
    }
}
