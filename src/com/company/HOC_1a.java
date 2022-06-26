package com.company;

import java.util.Scanner;

public class HOC_1a {
    static int fun(int[] arr, int x, int y){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x%arr[i]==0 && y%arr[i]==0){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numPlayers = new int[n];
        for (int i = 0; i < n; i++) {
            numPlayers[i] = sc.nextInt();
        }
        int health1 = sc.nextInt();
        int health2 = sc.nextInt();
        System.out.println("Winners: "+fun(numPlayers,health1,health2));
    }
}
