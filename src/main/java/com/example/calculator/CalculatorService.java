package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String sum(String number1, String number2) {
        if (number1 == null || number2 == null) {
            throw new RuntimeException("Введено некоректное число");
        }
        int num1 = Integer.valueOf(number1);
        int num2 = Integer.valueOf(number2);
        return number1 + "+" + number2 + "=" + (number1 + number2);
    }

    public String decrease(String number1, String number2) {
        if (number1 == null || number2 == null) {
            throw new RuntimeException("Введено некоректное число");
        }
        int num1 = Integer.valueOf(number1);
        int num2 = Integer.valueOf(number2);
        return number1 + "-" + number2 + "=" + (num1 - num2);
    }

    public String multiplication(String number1, String number2) {
        if (number1 == null || number2 == null) {
            throw new RuntimeException("Введено некоректное число");
        }
        int num1 = Integer.valueOf(number1);
        int num2 = Integer.valueOf(number2);
        return number1 + "*" + number2 + "=" + (num1 * num2);
    }

    public String division(String number1, String number2) {
        if (number1 == null || number2 == null) {
            throw new RuntimeException("Введено некоректное число");
        }
        if (number2 == "0") {
            throw new RuntimeException("На ноль делить нельзя");
        }
        int num1 = Integer.valueOf(number1);
        int num2 = Integer.valueOf(number2);
        return number1 + "/" + number2 + "=" + (num1/num2);
    }
}
