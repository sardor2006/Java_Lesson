package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int w = 1;
        do {
            if (w % 2 == 1)
                System.out.println("Toq sonlar: " + w);
            w++;
        }
        while (w <= 20);
    }}