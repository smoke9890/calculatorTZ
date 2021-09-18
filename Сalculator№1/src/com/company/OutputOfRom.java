package com.company;

public class OutputOfRom {
    public static String Otvet(int payment) {
        String otvet;
        // Проверка длины римских чисел
        if (payment <= 10 & payment > 0) {
            otvet = switch (payment) {
                case 1:
                    yield "I";
                case 2:
                    yield "II";
                case 3:
                    yield "III";
                case 4:
                    yield "IV";
                case 5:
                    yield "V";
                case 6:
                    yield "VI";
                case 7:
                    yield "VII";
                case 8:
                    yield "VIII";
                case 9:
                    yield "IX";
                case 10:
                    yield "X";
                default:
                    yield "";
            };
        } else {
            if (payment > 10 & payment < 50) {
                int result1 = payment / 10;
                int result2 = payment % 10;
                String result3;
                String result4;
                result3 = switch (result1) {
                    case 1:
                        yield "X";
                    case 2:
                        yield "XX";
                    case 3:
                        yield "XXX";
                    case 4:
                        yield "XL";
                    default:
                        yield "";
                };
                result4 = switch (result2) {
                    case 1:
                        yield "I";
                    case 2:
                        yield "II";
                    case 3:
                        yield "III";
                    case 4:
                        yield "IV";
                    case 5:
                        yield "V";
                    case 6:
                        yield "VI";
                    case 7:
                        yield "VII";
                    case 8:
                        yield "VIII";
                    case 9:
                        yield "IX";
                    default:
                        yield "";
                };

                otvet = result3 + result4;
            } else {
                if (payment >= 50 & payment < 100) {
                    int result1 = payment / 10;
                    int result2 = payment % 10;
                    String result3;
                    String result4;
                    result3 = switch (result1) {
                        case 5:
                            yield "L";
                        case 6:
                            yield "LX";
                        case 7:
                            yield "LXX";
                        case 8:
                            yield "LXXX";
                        case 9:
                            yield "XC";
                        default:
                            yield "";
                    };
                    result4 = switch (result2) {
                        case 1:
                            yield "I";
                        case 2:
                            yield "II";
                        case 3:
                            yield "III";
                        case 4:
                            yield "IV";
                        case 5:
                            yield "V";
                        case 6:
                            yield "VI";
                        case 7:
                            yield "VII";
                        case 8:
                            yield "VIII";
                        case 9:
                            yield "IX";
                        default:
                            yield "";
                    };
                    otvet = result3 + result4;
                } else {
                    if (payment == 100) {
                        otvet = "C";
                    } else {
                        throw new IllegalArgumentException("в римской системе нет отрицательных чисел");
                    }

                }
            }
        }return otvet;
    }
}
