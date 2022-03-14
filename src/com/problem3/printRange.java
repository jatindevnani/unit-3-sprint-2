package com.problem3;

public class printRange {
    public static void printRange(int start, int end, int increment) {

        if(start > end || increment <= 0) {
            System.out.println("Error");
            return;
        }

        for(int i = start; i <= end; i+=increment) {
            System.out.print(i + " ");
        }
    }
}