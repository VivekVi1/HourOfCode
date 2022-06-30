package com.company;

import java.util.Scanner;

public class HOC_4b {
    static int maxOfThree(int x, int y, int z) {
        int max;
        if (x > y && x > z) {
            max = x;
        } else if (y > x && y > z) {
            max = y;
        } else {
            max = z;
        }
        return max;
    }

    static int minOfThree(int x, int y, int z) {
        int min;
        if (x < y && x < z) {
            min = x;
        } else if (y < x && y < z) {
            min = y;
        } else {
            min = z;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        String s1 = String.valueOf(n1);
        String s2 = String.valueOf(n2);
        String s3 = String.valueOf(n3);

        int key1 = minOfThree(Integer.parseInt(String.valueOf(s1.charAt(0))), Integer.parseInt(String.valueOf(s2.charAt(0))), Integer.parseInt(String.valueOf(s3.charAt(0))));
        int key2 = maxOfThree(Integer.parseInt(String.valueOf(s1.charAt(1))), Integer.parseInt(String.valueOf(s2.charAt(1))), Integer.parseInt(String.valueOf(s3.charAt(1))));
        int key3 = minOfThree(Integer.parseInt(String.valueOf(s1.charAt(2))), Integer.parseInt(String.valueOf(s2.charAt(2))), Integer.parseInt(String.valueOf(s3.charAt(2))));
        int key4 = maxOfThree(Integer.parseInt(String.valueOf(s1.charAt(3))), Integer.parseInt(String.valueOf(s2.charAt(3))), Integer.parseInt(String.valueOf(s3.charAt(3))));

        System.out.println(String.valueOf(key1) + String.valueOf(key2) + String.valueOf(key3) + String.valueOf(key4));
    }
}
