package com.problem3;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start, end and increment values separated by a space");
        String[] input = scanner.nextLine().split(" ");

        int start = Integer.valueOf(input[0]);
        int end = Integer.valueOf(input[1]);
        int increment = Integer.valueOf(input[2]);

        printRange.printRange(start, end, increment);
    }
}
