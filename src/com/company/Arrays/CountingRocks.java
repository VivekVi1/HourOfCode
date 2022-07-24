package com.company.Arrays;

import java.util.ArrayList;

public class CountingRocks {
    static ArrayList<Integer> findRocks(int[] arr, int n, int[][] ranges, int r) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            int count = 0;
            int low = ranges[i][0];
            int high = ranges[i][1];

            for (int j = 0; j < n; j++) {
                if (arr[j] >= low && arr[j] <= high) {
                    count++;
                }
            }
            list.add(count);
        }
        return list;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int[] arr = {400, 567, 890, 765, 987};
        int[][] ranges = {{300, 380}, {800, 1000}};

        ArrayList<Integer> result = new ArrayList<>();
        result = findRocks(arr, n, ranges, r);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
