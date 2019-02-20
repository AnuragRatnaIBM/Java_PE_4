/*
5. Write a program with the implementation of Regular Expression to find the presence of the name
Harry in a string.
Input: This is Harry.
Output: Is Harry here ? true
Input : This is Henry.
Output: Is Harry here ? False

 */

package com.stackroute.practice;

public class RegexHarry {
    public boolean contains(String inputString)
    {
        return inputString.matches(".*\\bHarry\\b.*");
    }
}
