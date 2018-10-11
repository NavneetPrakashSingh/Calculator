package com.example.hp.calculator;

/*
* Sample Input1 : subtractionFunciton(5,2)
* Sample Output1 : 3
* */

public class Subtraction {
    public static double subtractionFunction(double firstInput, double secondInput){
        return firstInput-secondInput;
    }

    public static double subtractionFunction(long firstInput, double secondInput){
        return firstInput-secondInput;
    }

    public static double subtractionFunction(double firstInput, long secondInput){
        return firstInput- secondInput;
    }

    public static long subtractionFunction(long firstInput, long secondInput){
        return firstInput-secondInput;
    }
}
