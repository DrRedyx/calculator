package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/decrease")
    public String decrease(@RequestParam("number1") String num1, @RequestParam("number2") String num2) {
        return calculatorService.decrease(num1, num2);
    }
    @GetMapping(path = "/division")
    public String division(@RequestParam("number1") String num1, @RequestParam("number2") String num2) {
        return calculatorService.division(num1, num2);
    }

}
