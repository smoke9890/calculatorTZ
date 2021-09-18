package com.company;

public class CalculatorOperations {
    public static int operations(int number1, int number2, String operation){
        int result = 0;
        // делаем операции над нашими числами.
        switch (operation){
            case "+": result = number1 + number2; break;
            case "-": result = number1 - number2; break;
            case "*": result = number1 * number2; break;
            case "/": result = number1 / number2; break;
            default:throw  new IllegalArgumentException("Не верный знак операции");
        }
        return result;
    }
}
