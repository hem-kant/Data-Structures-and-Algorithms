package com.hemkant.DSA;

import java.util.ArrayList;
import java.util.List;

public class SubarrayDivision {
// HackerRank
//Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
//
//Lily decides to share a contiguous segment of the bar selected such that:
//
//The length of the segment matches Ron's birth month, and,
//The sum of the integers on the squares is equal to his birth day.
//Determine how many ways she can divide the chocolate.
//Example
//s=[2,2,1,3,2]
//d=4
//m=3

    static int subarrayDivision(List<Integer> s, int d, int m)
    {


        int counter =0;
        for (int i =0;i<s.size();i++)
        {
            if (counter ==m) break;
            for (int j=1;j<s.size();j+=m)
            {
                if (i!=j ) {
                    if (s.get(i) + s.get(j) == d) {
                        System.out.println("True " + s.get(i) + " " + s.get(j));
                        counter++;

                    }
                }
            }
        }
        return counter;
    }
    public  static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(2);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);
        int d=4;
        int m=2;

        System.out.println(subarrayDivision(s,d,m));

    }
}
