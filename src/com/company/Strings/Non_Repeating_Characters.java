package com.company.Strings;

import java.util.HashMap;

public class Non_Repeating_Characters {
    static char nonrepeatingCharacter(String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int freq = map.get(ch);
                map.put(ch, freq + 1);
            }
        }
        for (int i = 0; i < S.length(); i++) {
            if (map.get(S.charAt(i)) == 1) {
                return S.charAt(i);
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String S = "pfgasggjkjcgrnkejyvqrahchvxvnqthehgqsekroimgjnyyxdguuwdduewqbwynlydxuljvulusekwsembdjqpgmfhpbjvospxswpowyl";
        System.out.println(nonrepeatingCharacter(S));
    }
}
