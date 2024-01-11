package com.practice;

public class PrimeNumber
{
    public static void main(String[] args)
    {
       /* // Declare and initialize the variable 'num' with the value 29.
        int num = 29;

        // Declare and initialize a boolean variable 'flag' to false.
        boolean flag = false;

        // Start a for loop with the loop variable 'i' starting from 2, and continuing until 'num/2'.
        for(int i =2;i<=num/2;++i)
        {
            // Check if 'num' is divisible evenly by 'i'.
            if(num%i==0)
            {
                // If divisible, set 'flag' to true and break out of the loop.
                flag = true;
                break;
            }
        }
        // Check the value of 'flag'.
        if(!flag)
        {
            // If 'flag' is false, print that 'num' is a prime number.
            System.out.println(num+"is a prime number");
        }
        else
        {
            // If 'flag' is true, print that 'num' is not a prime number.
            System.out.println(num+"is not prime number");
        }*/

        int no=7;
        int temp=0;

        for(int i=2;i<=no-1;i++)
        {
            if(no%i==0)
            {
                temp = temp+1;
            }
        }
        if(temp==0)
        {
            System.out.println(no +" is prime number");
        }
        else
        {
            System.out.println(no +"not prime number");
        }
    }
}
