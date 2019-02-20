/*
        4. Write a program to transpose the given string.
        Input String : a quick brown fox jumps over the lazy dog
        Output String: a kciuq nworb xof spmuj revo eht yzal god
 */

package com.stackroute.practice;

public class TransposeString {
    public String transpose(String inputString)
    {
        String temp="";
        String [] inputStringArray=inputString.split(" ");
        int length=inputStringArray.length;
        for(int i=0;i<length;i++)
        {
            String temp2="";
            temp+=inputStringArray[i];
            for(int j=temp.length()-1;j>=0;j--)
            {
                temp2+=temp.charAt(j);
            }
            inputStringArray[i]=temp2;
            temp="";
        }
        temp="";
        for(int i=0;i<length;i++)
        {
            if(i!=length-1) {
                temp += inputStringArray[i] + " ";
            }
            else
            {
                temp += inputStringArray[i];
            }
        }
        return temp;
    }
}
