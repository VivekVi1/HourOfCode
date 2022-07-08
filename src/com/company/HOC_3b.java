/*
Mirror sentence
Problem statement

You are given a string S containing a sentence.
Write a program to reverse the order of occurrence of words in the sentence.
Note
You need to ensure that all words are followed by a single " " in your output
Example 1
Input
Hello world
Output
world Hello
Explanation
The order of occurrence has been reversed while keeping the individual words the same.
Example 2
Input
Coding is awesome
Output
awesome is Coding
Explanation
The order of occurrence has been reversed while keeping the individual words the same.
*/

/*Solution*/

package com.company;

import java.util.Scanner;

public class HOC_3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i] + " ");
        }
        String revStr = sb.toString();
        System.out.println(revStr.substring(0, revStr.length() - 1));
    }
}
