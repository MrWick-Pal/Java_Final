package org.example.Model.Classes;

import org.example.Model.Interfaces.ArithmeticOperation;
import org.example.Model.Interfaces.ArithmeticOperationFactory;

public class NumDifferenceFactory implements ArithmeticOperationFactory {
    @Override
    public ArithmeticOperation createOperation() {
        return new NumDifference();
    }
}