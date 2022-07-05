package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class HOC_7b {
    static boolean isPerfectSquare(int num) {
        int n = (int) Math.sqrt(num);
        return (n * n == num);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (isPerfectSquare(5 * list.get(i) * list.get(i) - 4) || isPerfectSquare(5 * list.get(i) * list.get(i) + 4)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
