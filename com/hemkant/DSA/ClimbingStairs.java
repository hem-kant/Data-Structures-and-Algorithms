package com.hemkant.DSA;

public class ClimbingStairs {

    public static void main(String args[])
    {
        int temp=0;
        int range =5;
        int num1 =1, num2=1;
        for (int i=0;i<(range-1);i++)
        {
            temp=num1;
            num1=num1+num2;
            num2=temp;
            System.out.println(num2);
        }
        System.out.println("Number of ways = " + num1);
    }
}
