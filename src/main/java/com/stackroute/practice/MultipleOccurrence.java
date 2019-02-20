/*
6. Write a program to find out the multiple occurrences of the given word in a string using Matcher
methods.
Input : She sells seashells by the seashore
Given word: se
Output :
Found at: 4 - 6

Found at: 10 - 12
Found at: 27 – 29
 */

package com.stackroute.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurrence {
    public String Occurrence(String inputString)
    {
        String temp="";
        String regexValue="se";
        Pattern pattern=Pattern.compile(regexValue);
        Matcher matcher=pattern.matcher(inputString);
        while (matcher.find())
        {
            temp+=matcher.start()+"-"+matcher.end()+" ";
        }
        return temp.trim();

    }
}
