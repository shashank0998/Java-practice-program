package com.practice;

import java.util.Scanner;

public class FactorialNumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number ");

        int fact = 1;
        int no=s.nextInt();
        for(int i=1;i<=no;i++)
        {
            fact = fact*i;
        }
        System.out.println("factorial of="+no+" "+fact);
    }
}
