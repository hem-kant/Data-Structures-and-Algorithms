package com.hemkant.DSA;

public class ClimbingStairs {

    public static void main(String[] args)
    {
        System.out.println("Number of ways = " + findSteps(5));
    }

    static int findSteps(int numberOfStairs)
    {
        int temp;

        int num1 =1, num2=1;
        for (int i=0;i<(numberOfStairs-1);i++)
        {
            temp=num1;
            num1=num1+num2;
            num2=temp;
            System.out.println(num2);
        }
        return  num1;
    }
}
