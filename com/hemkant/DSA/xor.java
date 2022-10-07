package com.hemkant.DSA;

import java.util.ArrayList;
import java.util.List;

public class xor {
// HackerRank
//Given two strings consisting of digits 0 and 1 only, find the XOR of the two strings.
//To know more about XOR https://en.wikipedia.org/wiki/Exclusive_or
//Sample Input
//10101
//00101
//Sample Output
//10000


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
