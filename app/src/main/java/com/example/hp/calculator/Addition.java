package com.example.hp.calculator;

/*
* Sample Input :(1,2)
* Sample Output:(3)
* */
public class Addition {
    public static double additionFunction(double firstInput, double secondInput){
        return firstInput+secondInput;
    }

    public static double additionFunction(long firstInput, double secondInput){
        return firstInput+secondInput;
    }

    public static double additionFunction(double firstInput, long secondInput){
        return firstInput+ secondInput;
    }

    public static long additionFunction(long firstInput, long secondInput){
        return firstInput+secondInput;
    }
}
