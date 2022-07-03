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
