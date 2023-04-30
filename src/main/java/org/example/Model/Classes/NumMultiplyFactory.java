package org.example.Model.Classes;

import org.example.Model.Interfaces.ArithmeticOperation;
import org.example.Model.Interfaces.ArithmeticOperationFactory;

public class NumMultiplyFactory implements ArithmeticOperationFactory {
    @Override
    public ArithmeticOperation createOperation() {
        return new NumMultiply();
    }
}