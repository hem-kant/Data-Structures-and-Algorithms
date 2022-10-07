package com.hemkant.DSA;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
// HackerRank
//Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//For example, the square matrix  is shown below:
//1 2 3
//4 5 6
//9 8 9
//The left-to-right diagonal = 1+5+9=15 The right to left diagonal =3+5+9=17 Their absolute difference is 15-17=2

    static  Integer diagonalDifference(List<List<Integer>> arr)
    {
        int leftDiagonal = 0;
        int rightDiagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
            leftDiagonal += arr.get(i).get(i);
            rightDiagonal += arr.get(i).get((arr.get(i).size() - 1) - i);
        }
        return Math.abs(leftDiagonal - rightDiagonal);
    }
    public  static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> innerList = new ArrayList<>();
        innerList.add(1);
        innerList.add(2);
        innerList.add(3);
        arr.add(innerList);

        List<Integer> innerList2 = new ArrayList<>();
        innerList2.add(4);
        innerList2.add(5);
        innerList2.add(6);

        arr.add(innerList2);

        List<Integer> innerList3 = new ArrayList<>();
        innerList3.add(9);
        innerList3.add(8);
        innerList3.add(9);

        arr.add(innerList3);


        System.out.println(diagonalDifference(arr));

    }
}
