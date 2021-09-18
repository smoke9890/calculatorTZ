package com.company;

public class ConversionRome {
    
    public static int romanToNumber1(String num1) {
        //Преобразовываем римские числа в арабские.
        int result1;
        result1 = switch (num1) {
            case "I":
                yield 1;
            case "II":
                yield 2;
            case "III":
                yield 3;
            case "IV":
                yield 4;
            case "V":
                yield 5;
            case "VI":
                yield 6;
            case "VII":
                yield 7;
            case "VIII":
                yield 8;
            case "IX":
                yield 9;
            case "X":
                yield 10;
            default:
                yield 0;
        };

    return result1;
    }
}
