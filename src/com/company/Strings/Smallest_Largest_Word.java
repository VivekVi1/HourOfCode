package com.company.Strings;

public class Smallest_Largest_Word {
    static void minMaxWordLength(String str) {
        String[] words = str.split(" ");
        String small = words[0];
        String large = words[0];

        for (int i = 0; i < words.length; i++) {
            if (small.length() > words[i].length()) {
                small = words[i];
            }
            if (large.length() < words[i].length()) {
                large = words[i];
            }
        }
        System.out.println("Smallest Word: " + small);
        System.out.println("Largest Word: " + large);
    }

    public static void main(String[] args) {
        String input = "This is a test string";
        minMaxWordLength(input);
    }
}
