package com.hemkant.DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SockMerchant {
// HackerRank
//There is a large pile of socks that must be paired by color.
//Given an array of integers representing the color of each sock, determine
//how many pairs of socks with matching colors there are.
//Example
//n=7
//ar=[1,2,1,2,1,3,2]




    static  Integer sockMerchant(List<Integer> arr)
    {
        HashSet<Integer> findNotPaired = new HashSet<>();
        int pairs = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(!findNotPaired.add(arr.get(i))) {
                findNotPaired.remove(arr.get(i));
                pairs++;
            }
        }
        return pairs;
    }
    public  static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(20);
        number.add(10);
        number.add(10);
        number.add(30);
        number.add(50);
        number.add(10);
        number.add(20);

        System.out.println(sockMerchant(number));

    }
}
