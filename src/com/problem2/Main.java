package com.problem2;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a valid String:");
        String input = scanner.nextLine();

        StringManipulator vowelRemover = new StringManipulator();

        String stringWithoutVowels = vowelRemover.removeVowels(input);
        System.out.println(stringWithoutVowels);
    }
}


