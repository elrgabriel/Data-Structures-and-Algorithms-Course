package sort_algorithms.sort_with_jdk;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println(recursiveFibonacci(i) + " ");
        }


    }

    public static void fibonacci(int n){
        int num1 = 0;
        int num2 = 1;


        for (int i = 0; i < n; i++) {
            System.out.println(num1 + " ");

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        }

        public static int recursiveFibonacci(int n){
            if (n <= 1) {
                return n;
            }
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }


}
