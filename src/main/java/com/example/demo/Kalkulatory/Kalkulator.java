package com.example.demo.Kalkulatory;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class Kalkulator {

    @GetMapping("/dodaj/{first}/{second}")
    public String dodaj(@PathVariable double first, @PathVariable double second) {
        double result = first + second;
        return first + " + " + second + " = " + result;
    }
    @GetMapping("/odejmij/{first}/{second}")
    public String odejmij(@PathVariable double first, @PathVariable double second) {
        double result = first - second;
        return first + " - " + second + " = " + result;
    }
    @GetMapping("/pomnoz/{first}/{second}")
    public String pomnoz(@PathVariable double first, @PathVariable double second) {
        double result = first * second;
        return first + " * " + second + " = " + result;
    }
    @GetMapping("/podziel/{first}/{second}")
    public String podziel(@PathVariable double first, @PathVariable double second) {
        double result = first / second;
        return first + " / " + second + " = " + result;
    }
}
