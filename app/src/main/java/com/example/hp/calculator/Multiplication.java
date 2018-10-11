package com.example.hp.calculator;

/*
* Sample Input1 : multiplicationFunction(1,2)
* Sample Output1 : 2
* */

public class Multiplication {
    public static double multiplicationFunction(double firstInput, double secondInput){
        return firstInput*secondInput;
    }

    public static double multiplicationFunction(long firstInput, double secondInput){
        return firstInput*secondInput;
    }

    public static double multiplicationFunction(double firstInput, long secondInput){
        return firstInput* secondInput;
    }

    public static long multiplicationFunction(long firstInput, long secondInput){
        return firstInput*secondInput;
    }
}
