package com.company;

import java.util.Scanner;

public class HOC_8a {
    static int adjacentXOR(int n)
    {
        int[] arr = new int[32];
        int[] temp = new int[32];
        int t = 0, base = 1, index = 0;
        while(n != 0)
        {
            arr[index++] = n % 2;
            n = n / 2;
        }
        temp[0] = arr[0] ^ 1;
        for(int i = 1; i < index; i++)
        {
            temp[i] = arr[i] ^ arr[i-1];
        }
        for(int i = 0; i < index; i++)
        {
            t = t + (temp[i] * base);
            base = base * 2;
        }
        return t;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(adjacentXOR(n));
    }
}
