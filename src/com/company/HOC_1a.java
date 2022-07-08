/*
Problem statement

In a gaming hub, N number of players were playing the same type of game. All players got stuck at the pillar level in the game, each
with a different score. The owner of the gaming hub announced that players can pass that level if they can break two pillars. Both
pillars have their own health points. The trick is to break one pillar at a time that if the player's current score is multiplied up to a
certain point then it should be equal to the pillar's health. The same trick is to be used for the other pillar. If there is no number that
can be multiplied with the player's score to make the score equal to the pillar's health, then that player loses. A player can only
break one pillar at a time and if the player is not able to break both the pillars then they will not be able to clear the level.
Write an algorithm to find the total number of players who will clear that level of the game.
Example
Input
5
15 5 3 7 9
135 90
Output
4
Explanation
Scores 15, 5, 3, 9 can be multiplied by another number to equal 135 and 90 which will break the pillar.
So, the output is 4.
*/

/*Solution*/

package com.company;

import java.util.Scanner;


public class HOC_1a {
    static int fun(int[] arr, int x, int y) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x % arr[i] == 0 && y % arr[i] == 0) {
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
        System.out.println("Winners: " + fun(numPlayers, health1, health2));
    }
}
