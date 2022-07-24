package com.company.Arrays;

import java.util.Scanner;

public class PalindromicArray {
    static int palinArray(int[] a, int n) {
        String b = "";
        for (int i = 0; i < n; i++) {
            String c = String.valueOf(a[i]);
            for (int j = c.length() - 1; j >= 0; j--) {
                b += String.valueOf(c.charAt(j));
            }
            if (!c.equals(b)) {
                return 0;
            }
            b = "";
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(palinArray(arr, n));
    }
}
