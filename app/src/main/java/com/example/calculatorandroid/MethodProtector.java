package com.example.calculatorandroid;

import java.util.ArrayList;

public class MethodProtector
{
    public Double Count(String input, Double operator)
    {
        return operator * 10 + Double.parseDouble(input);
    }

    public ArrayList<String> Switch(double inputOperator, double inputOperation, String signOperation, String Operation)
    {

        ArrayList<String> outputData = new ArrayList<>(0);

        if(Operation=="-")
        {

            outputData.add(String.valueOf(0));
            outputData.add(String.valueOf(inputOperation - inputOperator));
            outputData.add(signOperation);
        }
        else if(Operation=="+")
        {
            outputData.add(String.valueOf(0));
            outputData.add(String.valueOf(inputOperation + inputOperator));
            outputData.add(signOperation);
        }
        else if(Operation=="*")
        {
            outputData.add(String.valueOf(inputOperation * inputOperator));
            outputData.add(String.valueOf(0));
            outputData.add(signOperation);
        }
        else if(Operation=="/")
        {
            outputData.add(String.valueOf(inputOperation / inputOperator));
            outputData.add(String.valueOf(0));
            outputData.add(signOperation);
        }
        else if(Operation=="/")
        {
            outputData.add(String.valueOf(inputOperation));
            outputData.add(String.valueOf(0));
            outputData.add(signOperation);
        }
        else if(Operation=="")
        {
                outputData.add(String.valueOf(inputOperation));
                outputData.add(String.valueOf(inputOperator));
                outputData.add(signOperation);
        }

        /*double x = inputOperator;
        inputOperator = inputOperation;
        inputOperation = x;
        outputData.add(String.valueOf(inputOperator));
        outputData.add(String.valueOf(inputOperation));
        outputData.add(signOperation);*/
        return outputData;
    }
}
