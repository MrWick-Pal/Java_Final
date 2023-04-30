package org.example.View;

import lombok.Data;
import org.example.Model.Interfaces.CalcInterface;

@Data
public class ConsoleView implements CalcInterface {
    @Override
    public void calcMenu() {
        System.out.println("КАЛЬКУЛЯТОР КОМПЛЕКСНЫХ ЧИСЕЛ");
        System.out.println("    1. Сложение ");
        System.out.println("    2. Вычитание ");
        System.out.println("    3. Умножение ");
        System.out.println("    4. Деление ");
        System.out.println("    5. Закрыть калькулятор ");
        System.out.print("Введите цифру из меню: ");
    }
    public void viewOnConsole(Object object){
        System.out.println(object);
    }
}
