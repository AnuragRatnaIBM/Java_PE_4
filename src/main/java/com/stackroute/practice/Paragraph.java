/*
3. Write a program that sets up a String variable containing a paragraph of text of your choice.
        a. Extract the words from the text and sort them into alphabetical order.
        b. Display the sorted list of words.
 */

package com.stackroute.practice;

public class Paragraph {
    public String extractWords(String inputString)
    {    String temp="";
        String[] inputStringArray=inputString.split("\\s");
        int length=inputStringArray.length;
        for(int i=0;i<length-1;i++)
        {
            for(int j=i+1;j<length;j++)
                if(inputStringArray[j].compareToIgnoreCase(inputStringArray[i])<0)
                {
                    temp=inputStringArray[j];
                    inputStringArray[j]=inputStringArray[i];
                    inputStringArray[i]=temp;
                }
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
