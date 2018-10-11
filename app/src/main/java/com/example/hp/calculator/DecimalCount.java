package com.example.hp.calculator;

/*
* Sample Input1 : 100012451021
* Sample Output1: false
*
* Sample Input2 : 1.01
* Sample Output2: true
* */

public class DecimalCount {
    public static boolean DecimalCountLength(String DISPLAYSTRING,int DISPLAYLENGTH, int STRINGLENGTH){
        int STRINGCOUNT = 0;
        for (int i=0;i<DISPLAYLENGTH;i++){
            if(DISPLAYSTRING.charAt(i) == '.' || DISPLAYSTRING.charAt(i) == '-'){

            }else{
                STRINGCOUNT = STRINGCOUNT + 1;
            }
        }

        if(STRINGCOUNT >0 && STRINGCOUNT<STRINGLENGTH){
            STRINGCOUNT =0;
            return true;
        }else{
            STRINGCOUNT =0;
            return false;
        }
    }
}
