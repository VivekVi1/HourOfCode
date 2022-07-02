package com.company;


public class HOC_5a {
    static boolean isPalindrome(String s) {
        StringBuilder revStr = new StringBuilder(s);
        revStr.reverse();
        return s.compareTo(revStr.toString()) == 0;
    }

    static String minCharacters(String s) {
        StringBuilder req = new StringBuilder();
        while (!isPalindrome(s)) {
            req.append(s.charAt(0));
            s = s.substring(1);
        }
        return req.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "abcdc";
        System.out.println(minCharacters(s));
    }
}
