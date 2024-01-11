package com.practice;

import java.util.Scanner;

public class RemoveVowels
{
    public static void main(String[] args)
    {
        String a = "aeiouapple";

        char result;
        char NotVowels;
        char c[] = a.toCharArray();

        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='a' || c[i] == 'e' || c[i] == 'o' || c[i] == 'u' || c[i] == 'i')
            {
                result = c[i];
            }
            else
            {
                NotVowels = c[i];
                System.out.println(NotVowels);
            }
        }
    }
}
