package com.company.Strings;

public class RemoveAlphabet {
    static String removeSpecialCharacter(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                sb.append(c);
            }
        }
        if(sb.length()==0){
            return "-1";
        }else{
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        String S = "{{{}}> *& ^%*)";
        System.out.println(removeSpecialCharacter(S));
    }
}
