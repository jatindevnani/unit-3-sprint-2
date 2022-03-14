package com.problem2;
import java.util.*;
import java.lang.*;

public class StringManipulator {
    public String removeVowels(String input)
    {
        if(input == null) {
            return null;
        }

        String[] divided = input.split("");

        String ans = "";

        for(int i = 0; i < divided.length; i++) {

            if(divided[i].equals("a") || divided[i].equals("e") || divided[i].equals("i") || divided[i].equals("o") || divided[i].equals("u")) {
                continue;
            }

            ans += divided[i];
        }

        return ans;
    }

}
