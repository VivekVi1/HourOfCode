/*
Convert to Palindrome
Problem statement
A palindrome is a sequence of characters that has the property of reading the same in either direction. You are given a function.
Char* Convertpalindrome ( char* str );
The function accepts a string ‘str’ .Implement the function to find and return the minimum characters required to append at the end
of string ‘str’ to make it palindrome.
Assumption
String will contain only lower case English alphabets.
Length of string is greater than equal to 1.
Note
If string is already palindrome then return “NULL”.
You have to find the minimum characters required to append at the end of string to make it palindrome.
Example1
Input
abcdc
Output
ba
Explanation
If we append 'ba' at the end of the string 'abcdc', it becomes 'abcdcba' (i.e. A palindrome string).
Example2
Input
abcde
Output
dcba
Explanation
If we append 'dcba' at the end of the string 'abcde', it becomes 'abcdedcba' (i.e. A palindrome string).
*/

/*Solution*/

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
