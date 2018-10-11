package com.example.hp.calculator;

import android.util.Log;

import java.lang.reflect.Method;
import java.text.DecimalFormat;

/*
*checkInputData checks if the input entered contains a decimal or not
*Sample Input1 : checkInputdata(5,6,addition)
* Sample Output1 : 11
*
* Sample Input2 : checkInputdata(7,0,multiply)
* Sample Output2 : 0
* */

public class CheckInputType {

    public static String checkInputDataType(String firstInput, String secondInput,String operation){
        if(firstInput.indexOf(".") != -1 && secondInput.indexOf(".") != -1){
            double firstFloatValue = Double.parseDouble(firstInput);
            double secondFloatValue= Double.parseDouble(secondInput);
            String currentOperation = Operations.performOperation(firstFloatValue,secondFloatValue,operation);
            return String.valueOf(currentOperation);
        }
        else if(firstInput.indexOf(".") == -1 && secondInput.indexOf(".") != -1){
            long firstIntValue = Long.parseLong(firstInput);
            double secondFloatValue= Float.valueOf(secondInput);
            String currentOperation = Operations.performOperation(firstIntValue,secondFloatValue,operation);
            return String.valueOf(currentOperation);
        }
        else if(firstInput.indexOf(".") != -1 && secondInput.indexOf(".") == -1){
            double firstFloatValue = Float.valueOf(firstInput);
            long secondIntValue= Long.parseLong(secondInput);
            String currentOperation = Operations.performOperation(firstFloatValue,secondIntValue,operation);
            return String.valueOf(currentOperation);
        }
        else if(firstInput.indexOf(".") == -1 && secondInput.indexOf(".") == -1){
            long firstIntValue = Long.parseLong(firstInput);
            long secondIntValue= Long.parseLong(secondInput);
            String currentOperation = Operations.performOperation(firstIntValue,secondIntValue,operation);
            return String.valueOf(currentOperation);
        }

        return "null";
    }
}
