package com.problem2;
import java.util.*;
import java.lang.*;

public class StringManipulator {
    public String removeVowels(String input)
    {
        if(input == null) {
            return null;
        }

        String ansString = "";

        String[] charArr = input.split("");

        for(int i = 0; i < charArr.length; i++) {
            if(charArr[i] != "a" && charArr[i] != "e" && charArr[i] != "i" && charArr[i] != "o" && charArr[i] != "u") {
                String newString = ansString + charArr[i];
                ansString = newString;
            }
        }

        return ansString;
    }

}
