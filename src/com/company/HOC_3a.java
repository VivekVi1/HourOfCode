package com.company;

public class HOC_3a {

    static int left(int n) {
        if(n!=0 && ((n & (n-1)) == 0)){
            int a  = (int) Math.ceil(Math.log(n) / Math.log(2));
            return (int) Math.pow(2,a);
        }
        else
        {
            int a = (int) (Math.ceil(Math.log(n) / Math.log(2)));
            return (int)Math.pow(2, a-1);
        }
    }
    public static void main(String[] args) {
        int n = 234;
        System.out.println(left(n));
    }
}
