package org.example.Model.Abstract;

import org.example.Model.Classes.ComplexNumber;
import org.example.Model.Interfaces.ArithmeticOperation;

public abstract class Calculator {
    public abstract ComplexNumber doArithmeticOperation(ArithmeticOperation arithmeticOperation, ComplexNumber a, ComplexNumber b);
}