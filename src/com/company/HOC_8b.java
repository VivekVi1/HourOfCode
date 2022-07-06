package com.company;

import java.util.*;

public class HOC_8b {
    static int cntElements(int[] arr, int n) {
        int[] copy_arr = new int[n];

        for (int i = 0; i < n; i++)
            copy_arr[i] = arr[i];

        int count = 0;

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {

            if (arr[i] == copy_arr[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int n = arr.length;

        System.out.println(cntElements(arr, n));

    }
}
