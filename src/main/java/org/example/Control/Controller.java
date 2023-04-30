package org.example.Control;

import org.example.Model.Classes.*;
import org.example.Model.Interfaces.ArithmeticOperation;
import org.example.Model.Interfaces.ArithmeticOperationFactory;
import org.example.View.ConsoleView;
import java.util.Scanner;

public class Controller {
    public Controller() {
        CalcLog calcLog = new CalcLog();
        ConsoleView consoleView = new ConsoleView();
        MyCalc myCalc = new MyCalc();
        Scanner scanner = new Scanner(System.in);
        ArithmeticOperationFactory arithmeticOperationFactory;
        int userInput = 0;
        while (userInput != 5) {
            System.out.println();
            consoleView.calcMenu();
            calcLog.getLogger().info("Меню запущено");
            userInput = Integer.parseInt(scanner.nextLine());
            switch (userInput) {
                case 1 -> {
                    calcLog.getLogger().info("Выбрано сложение");
                    arithmeticOperationFactory = new NumSumFactory();
                    ArithmeticOperation arithmeticOperation = arithmeticOperationFactory.createOperation();
                    ComplexNumber complexNumber = myCalc.doArithmeticOperation(
                            arithmeticOperation, new ComplexNumber(scanner), new ComplexNumber(scanner));
                    System.out.print("Результат: ");
                    consoleView.viewOnConsole(complexNumber);
                    calcLog.getLogger().info("Суммирование успешно");
                }
                case 2 -> {
                    calcLog.getLogger().info("Выбрано вычитание");
                    arithmeticOperationFactory = new NumDifferenceFactory();
                    ArithmeticOperation arithmeticOperation = arithmeticOperationFactory.createOperation();
                    ComplexNumber complexNumber = myCalc.doArithmeticOperation(
                            arithmeticOperation, new ComplexNumber(scanner), new ComplexNumber(scanner));
                    System.out.print("Результат: ");
                    consoleView.viewOnConsole(complexNumber);
                    calcLog.getLogger().info("Вычитание успешно");
                }
                case 3 -> {
                    calcLog.getLogger().info("Выбрано умножение");
                    arithmeticOperationFactory = new NumMultiplyFactory();
                    ArithmeticOperation arithmeticOperation = arithmeticOperationFactory.createOperation();
                    ComplexNumber complexNumber = myCalc.doArithmeticOperation(
                            arithmeticOperation, new ComplexNumber(scanner), new ComplexNumber(scanner));
                    System.out.print("Результат: ");
                    consoleView.viewOnConsole(complexNumber);
                    calcLog.getLogger().info("Умножение успешно");
                }
                case 4 -> {
                    calcLog.getLogger().info("Выбрано деление");
                    arithmeticOperationFactory = new NumDivideFactory();
                    ArithmeticOperation arithmeticOperation = arithmeticOperationFactory.createOperation();
                    ComplexNumber complexNumber = myCalc.doArithmeticOperation(
                            arithmeticOperation, new ComplexNumber(scanner), new ComplexNumber(scanner));
                    System.out.print("Результат: ");
                    consoleView.viewOnConsole(complexNumber);
                    calcLog.getLogger().info("Деление успешно");
                }
            }
        }
        scanner.close();
        calcLog.getLogger().info("Приложение завершено");
    }
}