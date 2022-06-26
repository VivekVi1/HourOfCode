package com.company;

import java.util.HashMap;

public class HOC_2b {
    static char firstNonRepeat(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch  = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        for (int i = 0; i < str.length(); i ++){
            char c = str.charAt(i);
            if (map.get(c) == 1){
                return c;
            }
        }
        return '0';
    }
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(firstNonRepeat(str));
    }
}
