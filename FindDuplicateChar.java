package com.practice;

public class FindDuplicateChar
{
    public static void main(String[] args)
    {
        String str = new String("shashank");
        char[] ch = str.toCharArray();
        int count = 0;

        for (int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    System.out.println("duplicate character string are :"+ch[j]);
                    count++;
                }
            }
        }
        System.out.println("Duplicate character count :"+count);
    }
}
