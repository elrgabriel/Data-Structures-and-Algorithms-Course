package arrays_and_big_o.array_review;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[7]; //int[7] defines the size of the immutable array, which is 7.

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        int index = 7;
        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] == 7) {
                index = i;
                break;
            }
        }
        System.out.println("index = " + index);
    }
}
