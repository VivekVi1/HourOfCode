package com.company.Strings;

public class RemoveString {
    static String removeChars(String string1, String string2) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < string1.length(); i++) {
            char c = string1.charAt(i);
            if (!string2.contains(String.valueOf(c))) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String string1 = "computer";
        String string2 = "cat";

        System.out.println(removeChars(string1, string2));
    }
}
