package com.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculatorController {
    private final calculatorService calculator = new calculatorService();

    @GetMapping("/calculator")
    public String greating() {
        return " Добро пожаловать в калькулятор ";
    }

    @GetMapping("/calculator/plus")
    public String add(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calculator.add(num1, num2);
    }

    @GetMapping("/calculator/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + calculator.minus(num1, num2);
    }

    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + calculator.multiply(num1, num2);
    }

    @GetMapping("/calculator/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return "Делить на 0 нельзя";
        }
        return num1 + " / " + num2 + " = " + calculator.divide(num1, num2);
    }
}
