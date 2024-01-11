package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArraysToArraysList
{
    public static void main(String[] args)
    {
        String [] colors = {"red","blue","green"};
        List list = Arrays.asList(colors);
        System.out.println(list);

        System.out.println("*************************");

        List<String> l =new ArrayList<>();
        Collections.addAll(l,colors);
        System.out.println(l);

    }
}
