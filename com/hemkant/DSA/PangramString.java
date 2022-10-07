package com.hemkant.DSA;

import java.util.ArrayList;
import java.util.List;

public class PangramString {
// HackerRank
// A pangram is a string that contains every letter of the alphabet.
//Given a sentence determine whether it is a pangram in the English alphabet.
//Ignore case. Return either pangram or not pangram as appropriate.
//Example:- "We promptly judged antique ivory buckles for the next prize"
//output:- pangram
//Example:- "de promptly judged antique ivory buckles for the next prize"
//output:- not panagram
    static String pangramString(String s)
    {
        String[] alph={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t",
                        "u","v","w","x","y","z"};
        int counter =0;
        for (int j=0;j< alph.length;j++) {
            for (int i = 0; i < s.length(); i++) {


                if (alph[j].charAt(0)==Character.toLowerCase(s.charAt(i))) {
                    System.out.println(s.charAt(i));
                    counter++;
                    break;

                }
            }
        }
        System.out.println("Counter Value " + counter);
        return counter== alph.length?"pangram":"not pangram";
    }
    public  static void main(String[] args) {

        String value="We promptly judged antique ivory buckles for the next prize";
        System.out.println(pangramString(value));

    }
}
