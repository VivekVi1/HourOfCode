/*
Problem statement

A company is transmitting its data to another server. To secure the data against malicious activity, they plan to reverse the data
before transmitting it. They want to know the number of data characters that do not change position even after the data stream is
reversed. The network administrator has been tasked with ensuring the smooth transmission of the data. Write an algorithm for the
network administrator to help him find the number of data characters that do not change position even after the data stream is
reversed.
Note
The input string data stream is case-sensitive and made up of English letters only. Uppercase characters and lowercase characters
are counted as different.
Example
Input
alphxxdida
Output
4
Explanation
The reversed data stream is "adidxxhpla".
The characters that do not change position after the data stream is reversed are the characters 'a' at the start and end position and
the characters 'x' in the middle positions.
*/

/*Solution*/

package com.company;

import java.util.Scanner;

public class HOC_4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder s2 = new StringBuilder(s);
        s2.reverse();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
