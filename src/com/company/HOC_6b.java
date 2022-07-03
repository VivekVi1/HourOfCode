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
