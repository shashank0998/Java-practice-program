package com.practice;

public class SecondLargestNum
{
    public static void main(String[] args)
    {
        int a[]={6,8,4,2,7,5,1,3};
        int temp;

        for(int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second largest number:-"+a[1]);
    }
}
