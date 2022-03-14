package com.problem1;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        InterfaceThree intThree = new ClassTwo();

        //This prints the overridden toString() method
        System.out.println(intThree);

        //Calling methodOne
        intThree.methodOne();

        //Calling methodTwo
        intThree.methodTwo();

        //Calling methodThree
        intThree.methodThree();

        //Assigning classTwo to InterfaceOne
        InterfaceOne interfaceOne = new ClassTwo();

        //Calling methodOne on interfaceOne
        interfaceOne.methodOne();

        //Down casting
        ClassTwo classTwoObject = (ClassTwo) interfaceOne; //DOWN CASTING
        classTwoObject.methodTwo();
        classTwoObject.methodThree();
    }
}
