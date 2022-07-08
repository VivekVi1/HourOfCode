/*
Hands of the clock
Problem statement
You are given a string input time = 'AB:CD' where AB denotes the hours from 00 to 12 and CD denotes the minutes from 00 to 59, in
a 12-hour format.
Your task is to write a program to calculate the smallest angle between the hour hand and the minute hand of a clock, for the given
time.
Note
Return your answer with up to 1 decimal place
Example 1
Input
09:06
Output
123.0
Explanation
123.0 degrees is the smallest angle formed between the hour hand and the minute hand at 09:06 a.m or 09:06 p.m
Example 2
Input
01:56
Output
82.0
Explanation
82.0 degrees is the smallest angle formed between the hour hand and minute hand at 01:56 a.m. or 01:56 p.m
*/

/*Solution*/

package com.company;

import java.util.Scanner;

public class HOC_6b {
    static float clockAngle(String time) {
        String[] s = time.split(":");
        float hours = Integer.parseInt(s[0]);
        float min = Integer.parseInt(s[1]);

        float hrDeg = (hours % 12 + min / 60) * 30;
        float minDeg = min * 6;

        float angle = Math.abs(hrDeg - minDeg);
        if (angle > 180) {
            angle = 360 - angle;
        }
        return angle;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(clockAngle(str));
    }
}
