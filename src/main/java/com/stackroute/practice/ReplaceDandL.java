/*
 2. Write a program to replace all d with f and all l with t in the given String
        Input: daily dry
        Output: faity fry
        Original string: daily dry
        New String: faity fry
 */

package com.stackroute.practice;

public class ReplaceDandL {
    public String replace(String inputString)
    {
      return inputString.replace("d","f").replace("l","t");
    }
}
