package com.company.Arrays;


public class SecondSmallest {
    static long[] minAnd2ndMin(long a[], long n) {
        long[] ans = new long[2];
        long firstMin = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] < firstMin) {
                firstMin = a[i];
            }
        }
        long secondMin = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (secondMin > a[i] && a[i] != firstMin) {
                secondMin = a[i];
            }
        }
        ans[0] = (secondMin == Long.MAX_VALUE) ? -1 : firstMin;

        ans[1] = (secondMin == Long.MAX_VALUE) ? -1 : secondMin;
        return ans;
    }

    public static void main(String[] args) {
        long[] arr = {2, 4, 3, 5, 6};
        System.out.println(minAnd2ndMin(arr, arr.length)[0]);
        System.out.println(minAnd2ndMin(arr, arr.length)[1]);
    }
}
