package com.hemkant.DSA;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
// HackerRank
//There is a collection of input strings and a collection of query strings.
//For each query string, determine how many times it occurs in the list of input strings.
//Return an array of the results.
//Example
//String strings = ["ab","ab","abc"]
//String queries = ["ab","abc","bc"]
//There are 2 instances of "ab",1  of "abc" and 0 of "bc".
//to return array result=[2,1,0]

    static List<Integer> matchingStrings(List<String> strings, List<String> queries)
    {
        List<Integer> occurrence = new ArrayList<>();

        for (int i =0; i<queries.size();i++)
        {
            int occ = 0;
            for (int j=0;j<strings.size();j++)
            {
                if (queries.get(i)== strings.get(j))
                {
                    occ++;
                }
            }
            occurrence.add(occ);
        }
        return occurrence;
    }
    public  static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("ab");
        strings.add("ab");
        strings.add("abc");


        List<String>  query = new ArrayList<>();
        query.add("ab");
        query.add("abc");
        query.add("bc");

        System.out.println(matchingStrings(strings,query));

    }
}
