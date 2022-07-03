package com.company;

public class HOC_6a {
    public static void main(String[] args) {
        String a = "10000001";
        String b = "01111111";
        int count = 0,result;
        float temp;
        for (int i = 0; i < 8; i++) {
            if(a.charAt(i)!=b.charAt(i)){
                count++;
            }
        }
        temp = (float)(count/8.0) * 100;
        result = (int)Math.floor(temp);
        System.out.println(result);
    }
}
