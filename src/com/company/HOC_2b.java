package com.company;

import java.util.HashMap;
import java.util.Map;

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
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return '0';
    }
    public static void main(String[] args) {
        String str = "ASDSA";
        System.out.println(firstNonRepeat(str));
    }
}
