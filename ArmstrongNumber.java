package com.practice;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        int n = 153,temp,armstrong=0;
        int original = n;

        while(n>0)
        {
            temp = n % 10;
            temp = (int) Math.pow(temp,3);
            armstrong = armstrong + temp;
            n = n/10;
        }
        if(armstrong == original)
        {
            System.out.println(armstrong+" Is Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}
