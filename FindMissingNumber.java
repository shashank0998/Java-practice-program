package com.practice;

public class FindMissingNumber
{
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,6,7};

        int no = a.length+1;

        int totalSum = no * (no+1)/2;

        int sum = 0;
        for(int i=0;i<a.length;i++)
        {
            sum = sum+a[i];
        }
        System.out.println("missing number of :"+(totalSum-sum));
    }
}
