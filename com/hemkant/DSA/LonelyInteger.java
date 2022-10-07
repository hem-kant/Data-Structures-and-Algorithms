package com.hemkant.DSA;

import java.util.ArrayList;
import java.util.List;

public class LonelyInteger {
// HackerRank
//Given an array of integers, where all elements but one occur twice, find the unique element.
//Example
//a=[1,2,3,4,3,2,1]
//output =4


    static  Integer lonelyInteger(List<Integer> numbers)
    {
        int sizeOfList=numbers.size();

        int res=0;
        for (int i=0; i<sizeOfList;i++)
        {
            int result=0;
            for (int j=0;j<sizeOfList;j++)
            {
                if (i!=j)
                {
                    if (numbers.get(i)==numbers.get(j))
                        result++;
                }
            }
            if (result == 0)
                res = numbers.get(i);

        }
        return res;
    }
    public  static void main(String[] args) {
        List<Integer> strings = new ArrayList<>();
        strings.add(1);
        strings.add(2);
        strings.add(3);
        strings.add(4);
        strings.add(3);
        strings.add(2);
        strings.add(1);

        System.out.println(lonelyInteger(strings));

    }
}
