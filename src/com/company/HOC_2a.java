/*
Password checker
You are given a function:
int CheckPassword(char str[], int n);
The function accepts string ‘str’ of size ‘n’ as an argument. Implement the function which returns 1 if given string ‘str’ is a valid
password else 0.
‘str’ is a valid password if it satisfies the below conditions:
•At least 4 characters
•At least one numeric digit
•Atleast one capital letter
•Must not have space or slash(/)
•Starting character must not be a number
Assumption:
The input string will not be empty.
Example
Input
aA1_67
Output
1
*/

/*Solution*/

package com.company;

public class HOC_2a {
    static int checkPassword(char[] str, int n) {
        String temp = String.valueOf(str);
        int a = 0;
        int b = 1;
        int c = 0;
        int d = 0;
        int e = 1;
        if (temp.length() > 4) {
            a = 1;
        }
        if (!Character.isDigit(temp.charAt(0))) {
            b = 0;
        }
        for (int i = 0; i < str.length; i++) {
            if (str[i] >= '0' && str[i] <= '9') {
                c = 1;
            }
            if (str[i] >= 'A' && str[i] <= 'Z') {
                d = 1;
            }
            if (str[i] != '/' && str[i] != ' ') {
                e = 0;
            }
        }
        if (a == 1 && b == 1 && c == 1 && d == 1 && e == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String passWord = "a978 abC012";
        char[] arr = passWord.toCharArray();
        System.out.println(checkPassword(arr, arr.length));
    }
}
