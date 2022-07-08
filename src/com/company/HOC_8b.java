/*
Pre-Sorted integers in an array

Problem statement
You are given an array of integers, arr, of size array_length. Your task is to find the number of elements whose positions will remain
unchanged when arr is sorted in ascending order.

For example, let arr = {1, 3, 2, 4, 5}. If arr were to be sorted in ascending order, it would appear as {1, 2, 3, 4, 5}. By inspection, the
integers 1, 4 and 5 do not change position before and after sorting. Hence, in this example, there are 3 elements whose position
will remain unchanged when arr is sorted in ascending order.
Example 1
Input
1
10
Output
1
Explanation
There is only one element in arr. Hence arr is already sorted, and the position of that one element in arr is in sorted order. Thus, the
output is 1.
Example 2
Input
5
5
4
3
2
1
Output
1
Explanation
arr = {5, 4, 3, 2, 1}. When sorted, it becomes {1, 2, 3, 4, 5}. By inspection, the third element in arr, 3, does not change its order, hence
the output is 1.
*/

/*Solution*/

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
