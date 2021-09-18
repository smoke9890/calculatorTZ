package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number1;
        int number2;
        String operation;
        String testNumber;
        int solution;

        Scanner scanner = new Scanner(System.in);
        ConversionRome cr = new ConversionRome();
        CalculatorOperations co = new CalculatorOperations();
        OutputOfRom or = new OutputOfRom();

        // Создаем массив из римских чисел!
        String[] rome = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
        System.out.println("Введите выражение, состоящее из двух целых чисел от 1 до 10 или римских от I до X, и знака операции(+,-,*,/), (напр. 1 + 2 или I + II): ");
        String text = scanner.nextLine();
        String[] blocks = text.split(" ");
        // Проверяем, введеный нами массив на возможные ошибки!
        if (blocks.length<3) {
            throw new IllegalArgumentException("строка не является математической операцией");
        }else {if(blocks.length>3){
            throw new IllegalArgumentException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        }
        try {
            // проверяем, входит ли строка blocks[0] в массив строк массива "rome"
            boolean flag1 = false;
            boolean flag2 = false;
            for (int i = 0; i < rome.length; i++) {
                if (rome[i].equals(blocks[0])) {
                    flag1 = true;

                }
                if (rome[i].equals(blocks[2])) {
                    flag2 = true;
                }

            }
            //flag1 = true и flag2 = true , значит будем иметь дело с римскими обозначениями
            if (flag1 & flag2) {
                number1 = cr.romanToNumber1(blocks[0]);
                number2 = cr.romanToNumber1(blocks[2]);
                operation = blocks[1];
                testNumber = blocks[0];

            } else {
                if (flag1 == false & flag2 == false) {
                    number1 = Integer.parseInt(blocks[0]);
                    number2 = Integer.parseInt(blocks[2]);
                    operation = blocks[1];
                    testNumber = blocks[0];
                } else {
                    throw new IllegalArgumentException();

                }
            }
        } catch (RuntimeException e) {
            throw new IllegalArgumentException("т.к. используются одновременно разные системы счисления");
        }
        //Проверяем, удовлетворяют ли значения нашему диапозону.
        if ((number1 > 10 || number1 < 0) || (number2 > 10 || number2 < 0)) {
            throw new IllegalArgumentException("один из операнда выходит за граница допустимого!");
        }
        //Проверяем, вывод каких чисел нам нужен.
        boolean pro = false;
        for (int i = 0; i < rome.length; i++) {
            if (rome[i].equals(testNumber)) {
                pro = true;

            }
        }
        if (pro){
            solution=co.operations(number1,number2,operation);
            System.out.println("Результатом вашей операции будет римская цифра: "+or.Otvet(solution));
        }else {
            System.out.println("Результатом вашей операции будет цифра: "+co.operations(number1,number2,operation));
        }

    }
}
