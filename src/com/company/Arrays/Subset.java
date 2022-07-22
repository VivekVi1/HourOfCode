package com.company.Arrays;

import java.util.HashSet;

public class Subset {
    static String isSubset(long[] a1, long[] a2, long n, long m) {
        HashSet<Long> hset = new HashSet<>();

        for (int i = 0; i < n; i++) {
            hset.add(a1[i]);
        }
        for (int i = 0; i < m; i++) {
            if (!hset.contains(a2[i])) ;
            {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        long[] a1 = {11, 1, 13, 21, 3, 7};
        long[] a2 = {11, 3, 7, 1};
        long n = a1.length;
        long m = a2.length;

        System.out.println(isSubset(a1, a2, n, m));
    }
}
