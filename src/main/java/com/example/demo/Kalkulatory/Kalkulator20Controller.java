package com.example.demo.Kalkulatory;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc20")
public class Kalkulator20Controller {

    @PostMapping("/policz")
    public String policz(@RequestBody Obliczenie ob) {
        String result = "";

        Operation operacja = ob.getOperacja();
        float a = ob.getA();
        float b = ob.getB();

        switch (operacja) {
            case DODAJ: {
                result = a + " + " + b + " = " + operacja.oblicz(a, b);
            } break;
            case POMNOZ: {
                result = a + " * " + b + " = " + operacja.oblicz(a, b);
            } break;
            case ODEJMIJ: {
                result = a + " - " + b + " = " + operacja.oblicz(a, b);
            } break;
            case PODZIEL: {
                result = a + " / " + b + " = " + operacja.oblicz(a, b);
            } break;
            case POTEGUJ: {
                result = a + "^" + b + " = " + operacja.oblicz(a,b);
            } break;
        }

        return result;
    }
}
