package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HOC_7a {
    static int lcm(int n1, int n2) {
        int lcm = Math.max(n1, n2);
        int result = 0;
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                result = lcm;
                break;
            }
            ++lcm;
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            newList.add(lcm(list.get(i), list.get(i + 1)));
        }
        System.out.println(Collections.max(newList));
    }
}
