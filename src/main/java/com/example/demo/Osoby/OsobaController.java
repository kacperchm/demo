package com.example.demo.Osoby;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/osoby")
public class OsobaController {

    @Autowired
    private OsobaService osobaService;


    @GetMapping
    public List<Osoba> getPeople() {
        return osobaService.list();
    }

    @GetMapping("/{pesel}")
    public Osoba get(@PathVariable String pesel) {
        return osobaService.get(pesel);
    }

    @PostMapping
    public Osoba create(@RequestBody Osoba osoba) {
        return  osobaService.create(osoba);
    }

    @PutMapping
    public Osoba update(@RequestBody Osoba osoba) {
        return osobaService.update(osoba);
    }

    @DeleteMapping("/{pesel}")
    public void delete(@PathVariable String pesel) {
        osobaService.delete(pesel);
    }
}
