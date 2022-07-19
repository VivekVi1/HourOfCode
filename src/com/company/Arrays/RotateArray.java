package com.company.Arrays;

public class RotateArray {
    static void rotateArr(int[] arr, int n, int d) {
        int passes = 1;
        int rotations = d % n;

        while (passes <= rotations) {
            int last = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = last;
            passes++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateArr(arr, arr.length, 2);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
