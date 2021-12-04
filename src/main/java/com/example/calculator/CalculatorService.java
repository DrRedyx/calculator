package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int sum(Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            throw new RuntimeException("Введено некоректное число");
        }
        return number1 + number2;
    }

    public int decrease(Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            throw new RuntimeException("Введено некоректное число");
        }
        return number1 - number2;
    }

    public int multiplication(Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            throw new RuntimeException("Введено некоректное число");
        }
        return number1 * number2;
    }

    public int division(Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            throw new RuntimeException("Введено некоректное число");
        }
        if (number2 == 0) {
            throw new RuntimeException("На ноль делить нельзя");
        }
        return number1/number2;
    }
}
