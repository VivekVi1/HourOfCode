/*
Problem statement
Base number
The alphabetical order of letters is their base number. i.e , base number of A=1,B=2,C=3,D=4 and so on.
Implement the given function
Static string decodemessage(string msg){ }

The function accepts a string ‘msg’ as its argument. ‘msg’ contains an encoded message, where encoded characters are separated
with a space. Implement the function to find and return the decoded message that has been encoded as follows:
Each letter was converted to its base number
A space is converted to an underscore( _ )
number is preceded by the number symbol ( # )
Note
[1] Return all letters in upper case
[2] Return space in decoded message only when underscore symbol ( _ ) appears in ‘msg’
[3] If ‘msg’ is empty or “NULL” return “NULL”.
Example
Input
2 1 4 _ 3 1 20 @ # 459
Output
BAD CAT @459
Explanation
Encoded Decoded
2       B
1       A
4       D
_
3       C
1       A
20      T
_
@       @
# 459   459
Thus output is BAD CAT @459
*/

/*Solution*/

package com.company;

import java.util.Scanner;

public class HOC_5b {
    static void decode(char[] s){
        int flag = 0 , num ;
        for(int i = 0 ; i<s.length; i++)
        {
            if(s[i]=='#')
            {
                flag = 1 ;
                continue ;
            }
            if(s[i] == '_') System.out.printf(" ") ;
            else if(s[i] == ' ') continue ;
            else if((flag == 0)&&(s[i]>='0'&&s[i]<='9'))
            {
                num = 0;
                while(s[i] >= '0' && s[i] <= '9')
                {
                    num = num*10 + (s[i]-'0') ;
                    i++ ;
                }
                i-- ;
                System.out.printf("%c",(char)(num+64));
            }

            else if((flag == 1)&&(s[i]>='0'&&s[i]<='9'))
            {
                num = 0 ;
                while(i<s.length && s[i]>='0'&& s[i]<='9')
                {
                    num = num*10 + (s[i]-'0') ;
                    i++ ;
                }
                i-- ;
                flag = 0 ;
                System.out.printf("%d",num );
            }
            else
            {
                System.out.printf("%c",s[i] );
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        decode(ch);
    }
}
