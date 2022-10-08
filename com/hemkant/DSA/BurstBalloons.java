package com.hemkant.DSA;

import java.util.ArrayList;
import java.util.List;

public class BurstBalloons {
// You are given n balloons, indexed from 0 to n - 1. Each balloon is painted with a number on it represented by an array nums. You are asked to burst all the balloons.
//
//If you burst the ith balloon, you will get nums[i - 1] * nums[i] * nums[i + 1] coins. If i - 1 or i + 1 goes out of bounds of the array, then treat it as if there is a balloon with a 1 painted on it.
//
//Return the maximum coins you can collect by bursting the balloons wisely.
//    Example :
//
//    Input: nums = [1,5]
//    Output: 10
//  CODE is IN PROGRESS
    static int burstBalloons(List<Integer> nums)
    {
        int resp=0;
        int temp=0;
        for (int i =0;i< nums.size();i++)
        {
                int x;
                 x= i==0?1:nums.get(i-1);

                 x= i>0 && i < nums.size() ?nums.get(i+1):0;
                int y=nums.get(i);
                int z = i+1 == nums.size()? 1:nums.get(i + 1);
                System.out.println(z);
                System.out.println(x + " -->" + y + " --> " + z);
                temp = x *  y *  z;
                resp+=temp;

        }
        return resp;
    }
    public  static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(10);

        System.out.println(burstBalloons(nums));

    }
}
