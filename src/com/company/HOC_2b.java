/*
First Non Repeat
Problem Statement
Implement the following function:
def FirstNonRepeat(str):
The function accepts a string ‘str’ of length n as its argument. Find the first non repeating character in the given string ‘str’ and
return that character. If there is no non repeating character then return ‘0’/
Note
Consider first character from the left of the string
Assumption
The string contains only lowercase letters, without space
The string is not null
Example
Input
asdas
Output
d
Explanation
In string ‘asdas’, first non repeating character is ‘d’ which is returned.
*/

/*Solution*/

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
