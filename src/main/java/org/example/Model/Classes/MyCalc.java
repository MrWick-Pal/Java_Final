package org.example.Model.Classes;

import org.example.Model.Abstract.Calculator;
import org.example.Model.Interfaces.ArithmeticOperation;

public class MyCalc extends Calculator {

    @Override
    public ComplexNumber doArithmeticOperation(ArithmeticOperation arithmeticOperation, ComplexNumber a, ComplexNumber b) {
        ComplexNumber newComplexNumber = arithmeticOperation.doArithmeticOperation(a,b);
        return newComplexNumber;
    }
}