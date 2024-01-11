package com.practice;

import java.util.Random;

public class RandomNumber
{
    public static void main(String[] args) {

        int number;
        Random random = new Random();
        number = random.nextInt(10);
        System.out.println("generated number is :"+number);
    }
}
