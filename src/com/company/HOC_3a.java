/*
Blocks

Problem statement
There are N floating blocks in a pond and they are arranged in a straight line. Each of these blocks has a value associated with
them which is written on top of them. After every 1 minute, blocks at the odd position get submerged underwater. You must shift
the remaining blocks to one position left to fill in emptied space. This process is repeated till only one block is left floating.
You must return the value of the last block which is left floating.
Note
The position index starts with 1 and blocks are numbered from 1 to N in the left to the right direction. It is given that N is always
greater than 1.
Example 1
Input
4
Output
4
Explanation
Initially, 1, 2, 3 and 4 numbered blocks are in the pond. After deleting the blocks at odd positions, 2 and 4 are remaining. After
deleting the blocks at odd positions, 4 remains. So, the output is 4.
Example 2
Input
7
Output
4
Explanation
Initially, 1, 2, 3, 4, 5, 6 and 7 numbered blocks are in the pond. After deleting the blocks at odd positions, 2, 4 and 6 are remaining.
After deleting the blocks at odd positions, 4 remains. So, the output is 4.
*/

/*Solution*/

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
