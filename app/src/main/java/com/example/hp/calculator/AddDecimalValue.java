package com.example.hp.calculator;

/*
* Sample Input : 1.05
* Sample Output: true
* */

public class AddDecimalValue {
    public static boolean addDecimalValueFunction(String inputValue){
        if (inputValue.indexOf('.') != -1)
            return false;
        else
            return true;
    }

}
