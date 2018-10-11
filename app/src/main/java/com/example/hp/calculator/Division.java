package com.example.hp.calculator;

/*
* Sample Input1: divisionFunction(6,2)
* Sample Output1: 3
* */

public class Division {
    public static double divisionFunction(double firstInput, double secondInput){
        return firstInput/secondInput;
    }

    public static double divisionFunction(long firstInput, double secondInput){
        return firstInput/secondInput;
    }

    public static double divisionFunction(double firstInput, long secondInput){
        return firstInput/ secondInput;
    }

    public static long divisionFunction(long firstInput, long secondInput){
        return firstInput/secondInput;
    }
}
