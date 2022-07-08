/*
Lowest Common Multiple (LCM)

You are given an array of positive integers, arr, of size array_length. You are asked to build set S which consists of the LCM of every
pair of adjacent elements in arr. Your task is to find the largest element in set S.
For example, for the array {1, 2, 3, 4}, set S = { lcm(1,2), lcm(2,3), lcm(3,4) } = {2, 6, 12}. The largest element is 12.
Notes
The array contains only positive integers.
Adjacent elements may NOT be circular, i.e. they may not wrap around the end of the array
Definition of LCM
A multiple of a number, num, is a number that can be divided by num. For example, the multiples of 5 are 5, 10, 15, 20, 25, and so
on. The lowest common multiple (LCM) of two numbers, a and b, is the smallest positive number that is a multiple of both a and b.
Example 1
Input
4
1 3 2 4
Output
6
Explanation
set S = {lcm(1, 3), lcm(3, 2), lcm(2, 4) } = {3, 6, 4}
Largest element = 6
Example 2
Input
5
7 3 2 9 12
Output
36
Explanation
set S = { lcm(7, 3), lcm(3, 2), lcm(2, 9), lcm(9, 12) } = {21, 6, 18, 36}
Largest element = 36
*/

/*Solution*/

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
