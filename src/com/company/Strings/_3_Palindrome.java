package com.company.Strings;

import java.util.Scanner;

public class _3_Palindrome {
    static boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString().equals(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String s1,s2,s3;
        int l=input.length();
        for(int i=1;i<l-1;i++)
        {
            s1=input.substring(0,i);
            if(isPalindrome(s1))
                for(int j=1;j<l-i;j++)
                {
                    s2=input.substring(i,j);
                    s3=input.substring(i+j,l-i-j);
                    if(isPalindrome(s2)&&isPalindrome(s3))
                    {
                        System.out.println(s1);
                        System.out.println(s2);
                        System.out.println(s3);
                    }
                }
        }
        System.out.println("Impossible");
    }
}
