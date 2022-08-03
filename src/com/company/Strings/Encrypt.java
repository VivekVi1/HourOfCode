package com.company.Strings;

public class Encrypt {
    static String encryptString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            int c = 0;
            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                c++;
                j++;
            }
            sb.append(s.charAt(i));
            i = j - 1;
            sb.append(c);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "aabc";
        System.out.println(encryptString(encryptString(s)));
    }
}
