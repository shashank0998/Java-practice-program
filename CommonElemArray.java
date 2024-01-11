package com.practice;

public class CommonElemArray
{
    public static void main(String[] args)
    {
        int[] arr1 = {3,4,7,8,6};
        int[] arr2 = {4,3,10,1,5};

        for(int i=0;i<arr1.length;i++)
        {
            for (int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.print(arr1[i]+", ");
                }
            }
        }
    }
}
