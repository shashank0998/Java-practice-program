package com.practice;

public class DuplicateElementArray
{
    public static void main(String[] args)
    {
        int arr[] = new int[]{3,3,5,2,5,7,1,6,2};

        System.out.println("Duplicate element is given array");
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
