package com.company;

public class HOC_1b {
    static int uniqueAuthor(String str) {
        char []arr = str.toCharArray();
        int count = 0;
        int []freq = new int[255];
        for(int i = 0; i < str.length(); i++)
            freq[arr[i]]++;
        for(int i = 0; i < 255; i++)
        {
            if(freq[i] == 1)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String batch="HelloWorld";
        System.out.println(uniqueAuthor(batch));
    }
}
