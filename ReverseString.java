package com.practice;

public class ReverseString
{
    public static void main(String[] args)
    {
        String str = "java";

        // 1. Using StringBuffer class
        StringBuffer sbf = new StringBuffer(str);
        System.out.println("reverse String :="+sbf.reverse());

        // 2. using iterative method
        char[] strArray = str.toCharArray();
        for(int i=strArray.length-1;i>=0;i--)
        {
            System.out.print(strArray[i]);
        }
        System.out.println();
        System.out.println(recursiveMethod(str));

    }

    // 3.   using recursive method
    static String recursiveMethod(String str)
    {
        if((null == str) || (str.length()<=1))
        {
            return str;
        }
        return recursiveMethod(str.substring(1))+str.charAt(0);
    }
}
