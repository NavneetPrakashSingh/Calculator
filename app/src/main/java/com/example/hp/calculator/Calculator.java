package com.example.hp.calculator;

import android.content.DialogInterface;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import com.example.hp.calculator.databinding.ActivityCalculatorBinding;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
* Flow of app : Calculator.java -> CheckInputType.java -> Operations.java -> Addition.java,Multiplication.java,..
* Please refere to Readme.md for further explaination of the app architecture
* */

public class Calculator extends AppCompatActivity {
    private ActivityCalculatorBinding binding;

    private int DISPLAYLENGTH=0;
    private int STRINGCOUNT = 0;
    private String DISPLAYSTRING="";
    private boolean CLEARDISPLAY = true;
    private int MEMORYSTRING = 0;
    private String FIRSTVALUE = "";
    private String SECONDVALUE ="";
    private static final int STRINGLENGTH = 10;
    private String CURRENT_ACTION;
    private String CURRENT_VALUE;

    Hashtable<String, String> operationMapping= new Hashtable<String, String>();
    public String finalValue="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_calculator);
        operationMapping.put("Addition","+");
        operationMapping.put("Subtraction","-");
        operationMapping.put("Multiplication","*");
        operationMapping.put("Division","/");

        binding.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValues("Addition");
            }
        });

        binding.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValues("Subtraction");
            }
        });

        binding.multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValues("Multiplication");
            }
        });

        binding.divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValues("Division");
            }
        });

        binding.zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DISPLAYSTRING = binding.editText.getText().toString();
                DISPLAYLENGTH = DISPLAYSTRING.length();
                if(DecimalCount.DecimalCountLength(DISPLAYSTRING,DISPLAYLENGTH,STRINGLENGTH)){
                    if(CLEARDISPLAY){
                        binding.editText.setText("");
                    }
                    CLEARDISPLAY = false;
                    binding.editText.setText(binding.editText.getText() + "0");
                }else{
                }
            }
        });


        binding.one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DISPLAYSTRING = binding.editText.getText().toString();
                DISPLAYLENGTH = DISPLAYSTRING.length();
                if(DecimalCount.DecimalCountLength(DISPLAYSTRING,DISPLAYLENGTH,STRINGLENGTH)){
                    if(CLEARDISPLAY){
                        binding.editText.setText("");
                    }
                    CLEARDISPLAY = false;
                    binding.editText.setText(binding.editText.getText() + "1");
                }else{

                }
            }
        });

        binding.two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DISPLAYSTRING = binding.editText.getText().toString();
                DISPLAYLENGTH = DISPLAYSTRING.length();
                if(DecimalCount.DecimalCountLength(DISPLAYSTRING,DISPLAYLENGTH,STRINGLENGTH)){
                    if(CLEARDISPLAY){
                        binding.editText.setText("");
                    }
                    CLEARDISPLAY = false;
                    binding.editText.setText(binding.editText.getText() + "2");
                }else{

                }
            }
        });

        binding.three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DISPLAYSTRING = binding.editText.getText().toString();
                DISPLAYLENGTH = DISPLAYSTRING.length();
                if(DecimalCount.DecimalCountLength(DISPLAYSTRING,DISPLAYLENGTH,STRINGLENGTH)){
                    if(CLEARDISPLAY){
                        binding.editText.setText("");
                    }
                    CLEARDISPLAY = false;
                    binding.editText.setText(binding.editText.getText() + "3");
                }else{

                }
            }
        });

        binding.four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DISPLAYSTRING = binding.editText.getText().toString();
                DISPLAYLENGTH = DISPLAYSTRING.length();
                if(DecimalCount.DecimalCountLength(DISPLAYSTRING,DISPLAYLENGTH,STRINGLENGTH)){
                    if(CLEARDISPLAY){
                        binding.editText.setText("");
                    }
                    CLEARDISPLAY = false;
                    binding.editText.setText(binding.editText.getText() + "4");
                }else{

                }
            }
        });

        binding.five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DISPLAYSTRING = binding.editText.getText().toString();
                DISPLAYLENGTH = DISPLAYSTRING.length();
                if(DecimalCount.DecimalCountLength(DISPLAYSTRING,DISPLAYLENGTH,STRINGLENGTH)){
                    if(CLEARDISPLAY){
                        binding.editText.setText("");
                    }
                    CLEARDISPLAY = false;
                    binding.editText.setText(binding.editText.getText() + "5");
                }else{

                }
            }
        });

        binding.six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DISPLAYSTRING = binding.editText.getText().toString();
                DISPLAYLENGTH = DISPLAYSTRING.length();
                if(DecimalCount.DecimalCountLength(DISPLAYSTRING,DISPLAYLENGTH,STRINGLENGTH)){
                    if(CLEARDISPLAY){
                        binding.editText.setText("");
                    }
                    CLEARDISPLAY = false;
                    binding.editText.setText(binding.editText.getText() + "6");
                }else{

                }
            }
        });

        binding.seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DISPLAYSTRING = binding.editText.getText().toString();
                DISPLAYLENGTH = DISPLAYSTRING.length();
                if(DecimalCount.DecimalCountLength(DISPLAYSTRING,DISPLAYLENGTH,STRINGLENGTH)){
                    if(CLEARDISPLAY){
                        binding.editText.setText("");
                    }
                    CLEARDISPLAY = false;
                    binding.editText.setText(binding.editText.getText() + "7");
                }else{

                }
            }
        });

        binding.eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DISPLAYSTRING = binding.editText.getText().toString();
                DISPLAYLENGTH = DISPLAYSTRING.length();
                if(DecimalCount.DecimalCountLength(DISPLAYSTRING,DISPLAYLENGTH,STRINGLENGTH)){
                    if(CLEARDISPLAY){
                        binding.editText.setText("");
                    }
                    CLEARDISPLAY = false;
                    binding.editText.setText(binding.editText.getText() + "8");
                }else{

                }
            }
        });

        binding.nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DISPLAYSTRING = binding.editText.getText().toString();
                DISPLAYLENGTH = DISPLAYSTRING.length();
                if(DecimalCount.DecimalCountLength(DISPLAYSTRING,DISPLAYLENGTH,STRINGLENGTH)){
                    if(CLEARDISPLAY){
                        binding.editText.setText("");
                    }
                    CLEARDISPLAY = false;
                    binding.editText.setText(binding.editText.getText() + "9");
                }else{

                }
            }
        });

        binding.mc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MEMORYSTRING = 0;
                binding.memoryText.setText("MEMORY :" + MEMORYSTRING);
            }
        });
        binding.mNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check for zero values and create a seperate function for it
                String memoryValue[] = binding.memoryText.getText().toString().split(":");
                MEMORYSTRING = Integer.valueOf(memoryValue[1].trim()) - Integer.parseInt(finalValue);
                binding.memoryText.setText("MEMORY :" +MEMORYSTRING);
            }
        });
        binding.mPositive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String memoryValue[] = binding.memoryText.getText().toString().split(":");
                MEMORYSTRING = Integer.valueOf(memoryValue[1].trim()) + Integer.parseInt(finalValue);
                binding.memoryText.setText("MEMORY :" +MEMORYSTRING);

            }
        });
        binding.mr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editText.setText(String.valueOf(MEMORYSTRING));
            }
        });

        binding.decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean response = AddDecimalValue.addDecimalValueFunction(binding.editText.getText().toString());
                if (response)
                    binding.editText.setText(binding.editText.getText() + ".");
                else
                    binding.editText.setText(binding.editText.getText());

            }
        });

        binding.positiveNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FIRSTVALUE = binding.editText.getText().toString();
                String finalValue = CheckInputType.checkInputDataType(FIRSTVALUE,FIRSTVALUE,"ToggleSign") ;
                binding.editText.setText(finalValue);
            }
        });



        binding.equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FIRSTVALUE = binding.editText.getText().toString();
                SECONDVALUE = binding.infoTextView.getText().toString();
                if (FIRSTVALUE.equals("") || SECONDVALUE.equals("")){
                }else{
                    finalValue = CheckInputType.checkInputDataType(SECONDVALUE,FIRSTVALUE,CURRENT_ACTION);
                    binding.infoTextView.setText(SECONDVALUE + CURRENT_VALUE + FIRSTVALUE +" = "+ finalValue);
                    binding.editText.setText(finalValue);
                    CLEARDISPLAY = true;
                    CURRENT_ACTION="NULL";
                }
            }
        });

        binding.clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClearCountString();
                CLEARDISPLAY = true;
                finalValue = "0";
                binding.editText.setText("0");
                binding.infoTextView.setText("0");
            }
        });
    }

    private void setValues(String operationType) {
        binding.infoTextView.setText(binding.editText.getText().toString());
        binding.editText.setText(finalValue);
        CLEARDISPLAY = true;
        CURRENT_VALUE =operationMapping.get(operationType);
        CURRENT_ACTION = operationType;
    }

    public void ClearCountString(){
        STRINGCOUNT = 0;
    }

    public void alertBoxDisplay(){
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Help & Documentation");
        alertDialog.setMessage("All you need to do is type the first number, then the operand, and then the second number to get the right result!Just to demonstarte that the app follows Heuristic principle of 'Help And Documentation'");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    if(item.getItemId() == R.id.action_help){
        alertBoxDisplay();
    }
     return true;
    }

}
