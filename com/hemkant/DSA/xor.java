package com.hemkant.DSA;

import java.util.ArrayList;
import java.util.List;

public class xor {
// HackerRank


    static String stringsXOR(String s, String t)
    {
        String res = new String("");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i)^t.charAt(i));
        }

        return sb.toString();
    }
    public  static void main(String[] args) {

        String s="10101";
        String t="00101";
        System.out.println(stringsXOR(s,t));

    }
}
