package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/podatki")
public class Podatki {

    enum Rodzaj{
        VAT(0.23f),
        DOCHODOWY(0.18f),
        BELKI(0.02f);

        private float wartosc;

        Rodzaj(float wartosc) {
            this.wartosc = wartosc;
        }

        public float getWartosc() {
            return wartosc;
        }
    }

    @GetMapping("/policz")
    public float policz(@RequestParam Integer wartosc, @RequestParam Rodzaj rodzaj) {
        return wartosc * rodzaj.getWartosc();
    }

    @GetMapping()
    public float rodzaj(@RequestParam Rodzaj rodzaj) {
        return rodzaj.getWartosc();
    }
}
