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
