package com.example.hp.calculator;

/*
* function overloading to determine the type of opeartion used depending upon the user selection
* Sample Input1 : performOperation(5,2,Addition)
* Sample Output1 : 7
* */

public class Operations {
    static double floatResultValue=0;
    static long IntResultValue = 0;
    public static String performOperation(Double firstInput, Double secondInput,String operation){

        if(operation == "ToggleSign"){
            floatResultValue = ToggleSign.toggleSignFunction(firstInput);
            return String.valueOf(floatResultValue);
        }else if(operation == "Addition"){
            floatResultValue = Addition.additionFunction(firstInput,secondInput);
            return String.valueOf(floatResultValue);
        }else if(operation == "Subtraction"){
            floatResultValue = Subtraction.subtractionFunction(firstInput,secondInput);
            return String.valueOf(floatResultValue);
        }else if(operation == "Multiplication"){
            floatResultValue = Multiplication.multiplicationFunction(firstInput,secondInput);
            return String.valueOf(floatResultValue);
        }else if(operation == "Division"){
            floatResultValue = Division.divisionFunction(firstInput,secondInput);
            return String.valueOf(floatResultValue);
        }

       return "";
    }

    public static String performOperation(Long firstInput, Long secondInput,String operation){

        if(operation == "ToggleSign"){
            IntResultValue = ToggleSign.toggleSignFunction(firstInput);
            return String.valueOf(IntResultValue);
        }else if(operation == "Addition"){
            IntResultValue = Addition.additionFunction(firstInput,secondInput);
            return String.valueOf(IntResultValue);
        }else if(operation == "Subtraction"){
            IntResultValue = Subtraction.subtractionFunction(firstInput,secondInput);
            return String.valueOf(IntResultValue);
        }else if(operation == "Multiplication"){
            IntResultValue = Multiplication.multiplicationFunction(firstInput,secondInput);
            return String.valueOf(IntResultValue);
        }else if(operation == "Division"){
            if(secondInput == 0)
                return "Cannot Divide By Zero";
            else
                IntResultValue = Division.divisionFunction(firstInput,secondInput);
            return String.valueOf(IntResultValue);
        }
        return "";
    }

    public static String performOperation(Long firstInput, Double secondInput,String operation){

        if(operation == "ToggleSign"){
            floatResultValue = ToggleSign.toggleSignFunction(firstInput);
            return String.valueOf(floatResultValue);
        }else if(operation == "Addition"){
            floatResultValue = Addition.additionFunction(firstInput,secondInput);
            return String.valueOf(floatResultValue);
        }else if(operation == "Subtraction"){
            floatResultValue = Subtraction.subtractionFunction(firstInput,secondInput);
            return String.valueOf(floatResultValue);
        }else if(operation == "Multiplication"){
            floatResultValue = Multiplication.multiplicationFunction(firstInput,secondInput);
            return String.valueOf(floatResultValue);
        }else if(operation == "Division"){
            floatResultValue = Division.divisionFunction(firstInput,secondInput);
            return String.valueOf(floatResultValue);
        }

        return "";
    }

    public static String performOperation(Double firstInput, Long secondInput,String operation){

        if(operation == "ToggleSign"){
            floatResultValue = ToggleSign.toggleSignFunction(firstInput);
            return String.valueOf(floatResultValue);
        }else if(operation == "Addition"){
            floatResultValue = Addition.additionFunction(firstInput,secondInput);
            return String.valueOf(floatResultValue);
        }else if(operation == "Subtraction"){
            floatResultValue = Subtraction.subtractionFunction(firstInput,secondInput);
            return String.valueOf(floatResultValue);
        }else if(operation == "Multiplication"){
            floatResultValue = Multiplication.multiplicationFunction(firstInput,secondInput);
            return String.valueOf(floatResultValue);
        }else if(operation == "Division"){
            floatResultValue = Division.divisionFunction(firstInput,secondInput);
            return String.valueOf(floatResultValue);
        }
        return "";
    }
}
