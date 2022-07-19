package com.company.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abba";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String revStr = sb.toString();
        if (str.equals(revStr)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
