package com.example.weekend1hwcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultDisplay, calculationDisplay;
    Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine;
    Button btnEqual, btnDot, btnClear, btnPlus, btnMinus, btnMultiply, btnDivision;
    Button btnLog, btnLn, btnPercentage, btnSqrt, btnSin, btnCos, btnTan, btnPie;
    boolean isCalculated, lastNumeric;

    String temp = "";
    double result = 0;
    int lastOp = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultDisplay = findViewById(R.id.resultDisplay);
        calculationDisplay = findViewById(R.id.calculationDisplay);
        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnEqual = findViewById(R.id.btnEqual);
        btnDot = findViewById(R.id.btnDot);
        btnClear = findViewById(R.id.btnClear);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivision = findViewById(R.id.btnDivision);
        btnLog = findViewById(R.id.btnLog);
        btnLn = findViewById(R.id.btnLn);
        btnPercentage = findViewById(R.id.btnPercentage);
        btnSqrt = findViewById(R.id.btnSqrt);
        btnSin = findViewById(R.id.btnSin);
        btnCos = findViewById(R.id.btnCos);
        btnTan = findViewById(R.id.btnTan);
        btnPie = findViewById(R.id.btnPie);
    }

    public void onClick(View view) {

        switch(view.getId()){
            case R.id.btnZero:
                if(calculationDisplay.getText().toString().isEmpty() || calculationDisplay.getText().toString().equals("0"))
                    calculationDisplay.setText("0");
                else {

                    calculationDisplay.append("0");
                }

                temp += "0";
                break;

            case R.id.btnOne:
                if(calculationDisplay.getText().toString().equals("0"))
                    calculationDisplay.setText("1");
                else
                    calculationDisplay.append("1");

                temp += "1";
                break;

            case R.id.btnTwo:
                if(calculationDisplay.getText().toString().equals("0"))
                    calculationDisplay.setText("2");
                else
                    calculationDisplay.append("2");

                temp += "2";
                break;

            case R.id.btnThree:
                if(calculationDisplay.getText().toString().equals("0"))
                    calculationDisplay.setText("3");
                else
                    calculationDisplay.append("3");

                temp += "3";
                break;

            case R.id.btnFour:
                if(calculationDisplay.getText().toString().equals("0"))
                    calculationDisplay.setText("4");
                else
                    calculationDisplay.append("4");

                temp += "4";
                break;

            case R.id.btnFive:
                if(calculationDisplay.getText().toString().equals("0"))
                    calculationDisplay.setText("5");
                else
                    calculationDisplay.append("5");

                temp += "5";
                break;

            case R.id.btnSix:
                if(calculationDisplay.getText().toString().equals("0"))
                    calculationDisplay.setText("6");
                else
                    calculationDisplay.append("6");

                temp += "6";
                break;

            case R.id.btnSeven:
                if(calculationDisplay.getText().toString().equals("0"))
                    calculationDisplay.setText("7");
                else
                    calculationDisplay.append("7");

                temp += "7";
                break;

            case R.id.btnEight:
                if(calculationDisplay.getText().toString().equals("0"))
                    calculationDisplay.setText("8");
                else
                    calculationDisplay.append("8");

                temp += "8";
                break;

            case R.id.btnNine:
                if(calculationDisplay.getText().toString().equals("0"))
                    calculationDisplay.setText("9");
                else
                    calculationDisplay.append("9");

                temp += "9";
                break;

            case R.id.btnPlus:
                if(!calculationDisplay.getText().toString().isEmpty()) {
                    calculationDisplay.append("+");
                    if(!temp.isEmpty())
                        result += Double.parseDouble(temp);
                    temp = "";
                    lastOp = 1;
                }
                break;

            case R.id.btnMinus:
                if(!calculationDisplay.getText().toString().isEmpty()){
                    calculationDisplay.append("-");
                    if(!temp.isEmpty())
                    {
                        if(result == 0)
                            result = Double.parseDouble(temp);
                        else if(result > 0)
                            result = result - Double.parseDouble(temp);
                        else if(result < 0)
                            result += Double.parseDouble(temp);
                        temp = "";
                        lastOp = 2;
                    }
                }
                break;

            case R.id.btnMultiply:
                if(!calculationDisplay.getText().toString().isEmpty()) {
                    calculationDisplay.append("*");
                    if(!temp.isEmpty() && result != 0)
                        result *= Double.parseDouble(temp);
                    else
                        result = Double.parseDouble(temp);
                    temp = "";
                    lastOp = 3;
                }
                break;

            case R.id.btnDivision:
                if(!calculationDisplay.getText().toString().isEmpty()) {
                    calculationDisplay.append("/");
                    if(!temp.isEmpty() && result != 0) {
                        result /= Double.parseDouble(temp);
                    } else
                        result = Double.parseDouble(temp);
                    temp = "";
                    lastOp = 4;
                }
                break;

            case R.id.btnLn:
                calculationDisplay.setText("ln ");
                lastOp = 5;
                temp = "";

                break;

            case R.id.btnLog:
                calculationDisplay.setText("log ");
                lastOp = 6;
                temp = "";

                break;

            case R.id.btnDot:
                calculationDisplay.append(".");
                //lastOp = 7;
                temp += ".";

                break;

            case R.id.btnPercentage:
                calculationDisplay.append("%");
                lastOp = 7;
                break;

            case R.id.btnSqrt:
                calculationDisplay.setText("√");
                lastOp = 8;
                temp = "";
                break;

            case R.id.btnSin:
                calculationDisplay.setText("sin ");
                lastOp = 9;
                temp = "";
                break;

            case R.id.btnCos:
                calculationDisplay.setText("cos ");
                lastOp = 10;
                temp = "";
                break;

            case R.id.btnTan:
                calculationDisplay.setText("tan ");
                lastOp = 11;
                temp = "";
                break;

            case R.id.btnPie:
                calculationDisplay.append("π");
                lastOp = 12;
                break;

            case R.id.btnEqual:
                //1 is a plus or addition
                if(lastOp == 1) {
                    result += Double.parseDouble(temp);
                } else if(lastOp == 2) {
                    if (result == 0)
                        result = Double.parseDouble(temp);
                    else if (result > 0)
                        result = result - Double.parseDouble(temp);
                    else if (result < 0)
                        result += Double.parseDouble(temp);
                } else if(lastOp == 3){
                    result *= Double.parseDouble(temp);
                } else if(lastOp == 4){
                    result /= Double.parseDouble(temp);
                } else if(lastOp == 5){
                    result = Math.log(Double.parseDouble(temp));
                } else if(lastOp == 6){
                    result = Math.log10(Double.parseDouble(temp));
                } else if(lastOp == 7){
                    result = Double.parseDouble(temp) / 100;
                } else if(lastOp == 8){
                    result = Math.sqrt(Integer.parseInt(temp));
                } else if(lastOp == 9){
                    result = Math.sin(Double.parseDouble(temp));
                } else if(lastOp == 10){
                    result = Math.cos(Double.parseDouble(temp));
                } else if(lastOp == 11){
                    result = Math.tan(Double.parseDouble(temp));
                } else if(lastOp == 12){
                    result = Math.PI * Double.parseDouble(temp);
                }

                resultDisplay.setText(result + "");
                calculationDisplay.setText(result + "");
                temp = "";
                break;

            case R.id.btnClear:
                calculationDisplay.setText("0");
                resultDisplay.setText("0");
                temp = "";
                result = 0;
                break;
        }
    }


}
