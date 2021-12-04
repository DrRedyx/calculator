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
    public String decrease(@RequestParam("number1") int num1, @RequestParam("number2") int num2) {
        int decrease = calculatorService.decrease(num1, num2);
        return num1 + "-" + num2 + "=" + decrease;

    }
    @GetMapping(path = "/division")
    public String division(@RequestParam("number1") int num1, @RequestParam("number2") int num2) {
        int division = calculatorService.division(num1, num2);
        return num1 + "/" + num2 + "=" + division;
    }
    @GetMapping(path = "/sum")
    public String sum(@RequestParam("number1") int num1, @RequestParam("number2") int num2) {
        int decrease = calculatorService.sum(num1, num2);
        return num1 + "+" + num2 + "=" + decrease;
    }

}
