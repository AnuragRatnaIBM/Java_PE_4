/*1. Write a java program to count the total number of occurrences of a given character in a string
        without using any loop?
        For Example- Java is java again java again count number of occurrence of a in the given string
*/

package com.stackroute.practice;

public class CountOccurrences
{
    public int occurrences(String inputString)
    {
        return inputString.length() - inputString.replace("a", "").length();
    }
}
